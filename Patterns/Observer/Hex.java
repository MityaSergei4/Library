public class Hex extends Observer{
    Hex(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println(Integer.toOctalString(subject.isState()));
    }
}
