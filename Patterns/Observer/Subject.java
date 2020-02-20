import java.util.ArrayList;
import java.util.List;

class Subject {
    private int state;
    private List<Observer> list = new ArrayList<>();

    int isState() {
        return state;
    }

    void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    void attach(Observer obs){
        list.add(obs);
    }

    private void notifyAllObservers() {
        for(Observer pair : list){
            pair.update();
        }
    }
}
