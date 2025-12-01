package MoneyChanger;

class Person {
    protected String name;

    public Person() {
        this.name = "Anonymous";
    }
    public Person(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Anonymous";
        } else {
            this.name = name;
        }
    }

}





