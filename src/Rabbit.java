public class Rabbit implements Animals {

    private String name;
    private int age;

    public Rabbit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\ud83d\udc07";
    }

    @Override
    public void eat() {

    }

    @Override
    public void sex() {

    }

    @Override
    public void dead() {

    }

    @Override
    public void walk() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
