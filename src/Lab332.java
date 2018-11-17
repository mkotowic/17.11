public class Lab332 {
    public static void main(String[] args) {


        int Year = 2018;


        for (int m = 1; m <= 12; m++)

        {    int count = -1;
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    count = 31;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    break;


            }
                for (int i = 1; i <= 31; i++) {
                    System.out.println("data " + i + "." + m + "." + Year);

                }
            }
        }
    }

