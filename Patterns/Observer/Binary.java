public class Binary extends Observer{
    Binary(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println(Integer.toBinaryString(subject.isState()));
    }
}
