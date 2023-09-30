import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        int trys = 0;
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Insira um numero: ");
            int input = scanner.nextInt();
            int random = 10;
//            int random = new Random().nextInt();
            trys += 1;
            System.out.printf("%da tentativa%n", trys);
            
            if (input > random) {
                System.out.println("maior");
            } else if (input < random) {
                System.out.println("menor");
            } else {
                System.out.println("ganhou");
                break;
            }
        }
        
        if (trys < 5) return;
        
        System.out.print("Voce perdeu");
    }
}

