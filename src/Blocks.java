public class Blocks {
    public static void main(String[] args) {

        int x = 5;

        {         //początek bloku
            int y = 10;
            y = y + x;

            System.out.println("y= " + y );

        }          // koniec bloku   y było zdefiniowane tylko w bloku
        System.out.printf("x= " + x);
        System.out.printf("y= " + x);


    }
}
