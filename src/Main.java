public class Main {
    public static void main(String[] args) {

        Object[] pole = new Object[10];
        pole[0]= new Wolf("васbkb", 10);
        pole[5]= new Rabbit("пет", 5);


        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i]);
        }



    }
}