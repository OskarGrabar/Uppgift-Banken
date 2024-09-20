import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int saldo = 0;

        Scanner input = new Scanner(System.in);
        int val;
        boolean run = true;

        while (run) {
            System.out.println("1. Se saldo, 2. Sätt in pengar, 3. Ta ut pengar, 4. Avsluta");

            val = input.nextInt();

            switch (val) {
                case 1:
                    System.out.println("Aktuell saldo : " + saldo + " kr.");
                    break;

                case 2:
                System.out.println("test2");
                    break;

                case 3:
                System.out.println("test3");
                    break;

                case 4:
                System.out.println("test4");
                    break;

                default:
                System.out.println("test5");
                    break;
            }
        }
    }
}
