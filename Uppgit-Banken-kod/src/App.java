import java.util.Scanner;

public class App {
    
    static int saldo = 0;

    public static void main(String[] args) throws Exception {
        
        

        Scanner input = new Scanner(System.in);
        int val;
        boolean run = true;

        while (run) {
            System.out.println("1. Se saldo, 2. Sätt in pengar, 3. Ta ut pengar, 4. Avsluta");

            val = Failsafe(input);

            switch (val) {
                case 1:
                    System.out.println("Aktuell saldo : " + saldo + " kr.");
                    break;

                case 2:
                sättIn(input);
                    break;

                case 3:
                taUt(input);
                    break;

                case 4:
                System.out.println("Hej då!");
                run = false;    
                    break;

                default:
                System.out.println("Skriv endast siffrorna 1-4!");
                    break;
            }
        }
    }

    public static int sättIn (Scanner scanner){
        System.out.println("Ange summan du vill sätta in :");
        saldo += Failsafe(scanner);
        System.out.println("Du har nu " + saldo + " kr i ditt konto.");
        return saldo;
    }

    public static int taUt (Scanner scanner){
        System.out.println("Ange summan du vill ta ut :");
        int avdrag = Failsafe(scanner);
        saldo -= avdrag;

        if (saldo < 0){
            System.out.println("Otillräcklig mängd på kontot!");
            saldo += avdrag;
            System.out.println("Försök igen!");
        }

        System.out.println("Du har nu " + saldo + " kr i ditt konto.");
        return saldo;
    }

    public static int Failsafe(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Skriv bara siffror tack!");
            scanner.next();  
        }
        return scanner.nextInt();
    }
}
