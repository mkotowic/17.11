public class Loops2 {
    public static void main(String[] args) {


        for (int i=0; i<10; i++) {

            for (int j=0; j<10; j++) {
                System.out.println("i = " + i + "j = " + j);
                if (i == 5 && j == 5) {
                    break;
                }
            }

        }
    }
}
