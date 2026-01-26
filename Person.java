class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Harshita", 20);

        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);
    }
}
