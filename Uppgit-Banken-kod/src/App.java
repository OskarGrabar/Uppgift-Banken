import java.util.Scanner;

public class App {
    
    static int saldo = 0;

    public static void main(String[] args) throws Exception {
        
        

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
                sättIn(input);
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

    public static int sättIn (Scanner scanner){
        System.out.println("Ange summan du vill sätt in :");
        saldo = scanner.nextInt();
        System.out.println("Du har nu " + saldo + " kr på din account");
        return saldo;
    }
}
