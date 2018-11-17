public class Loops {
    public static void main(String[] args) {


        final String FORBIDEN = "dwa";
        String[] strings = {"raz", "dwa", "trzy", "cztery", "pięć", "dwa"};
        int i = 0;

        System.out.println("-----------------------------START");
        while (i < strings.length) {

            System.out.println(strings[i]);

            if (strings[i].equals(FORBIDEN)) {
                i++;
                continue;

            }
            System.out.println(strings[i]);
            i++;

        }

        System.out.println("------------------------------KONIEC");
    }
}