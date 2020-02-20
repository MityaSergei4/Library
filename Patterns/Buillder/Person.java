class Person {

    private String name;
    private int age;

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name){
            newPerson.name = name;
            return this;
        }

        public Builder withAge(int age){
            newPerson.age = age;
            return this;
        }

        public Person build(){
            return newPerson;
        }

        @Override
        public String toString(){
            return newPerson.name + " " + newPerson.age;
        }
    }
}