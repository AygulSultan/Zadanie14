public class Person {
    private String name;
    private String dasignation;

    public String getName() {
        return name;
    }

    public Person(String name, String dasignation) {
        this.name = name;
        this.dasignation = dasignation;
    }

    public void lean() {
        System.out.println(name + "is leaning");
    }

    public void wolk() {
        System.out.println(name + "is wolking");

    }

    public void eat() {
        System.out.println(name + "is eating");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDasignation() {
        return dasignation;
    }

    public void setDasignation(String dasignation) {
        this.dasignation = dasignation;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}



