public class Solution {
    public static void main(String[] args) {
        Person.Builder person = new Person.Builder().withName("Alex").withAge(18);
        System.out.println(person.toString());
    }
}

