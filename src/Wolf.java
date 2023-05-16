public class Wolf implements Animals{
    private String name;

    private int age;

    public Wolf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC3a";
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

