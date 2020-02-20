public class Solution {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Eatable eat = factory.getType(Types.CHOCOLATE);
        eat.eat();
    }
}

