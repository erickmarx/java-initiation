import java.util.Scanner;

public class Desafio_Conta_Bancaria {
    //consultar saldo
    //receber valor
    //transferir valor
    
    private static double valorConta = 0;
    private static int valueInput = 0;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (valueInput != 4) {
            System.out.print("""
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada: """);
            
            valueInput = scanner.nextInt();
            
            switch (valueInput) {
                case 1:
                    consultar();
                    break;
                case 2:
                    receber();
                    break;
                case 3:
                    transferir();
                    break;
            }
        }
    }
    
    public static void consultar() {
        System.out.printf("Saldo: %f%n\n", valorConta);
    }
    
    public static void receber() {
        System.out.print("Digite o valor a receber: ");
        double adicionarValor = scanner.nextDouble();
        valorConta += adicionarValor;
        System.out.printf("Novo saldo: %d", valorConta);
    }
    
    public static void transferir() {
        System.out.print("Digite o valor a transferir: ");
        double transferirValor = scanner.nextDouble();
        valorConta += transferirValor;
        System.out.printf("Novo saldo: %d", valorConta);
    }
}


