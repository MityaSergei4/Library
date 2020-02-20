public class Solution{
    public static void main(String[] args){
        Subject subject = new Subject();
        new Binary(subject);
        new Hex(subject);

        subject.setState(100);
    }
}