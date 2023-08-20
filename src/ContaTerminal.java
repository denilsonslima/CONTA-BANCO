import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, informe o número da conta!");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, informe o número da agência!");
        String numeroAgencia = sc.nextLine();
        System.out.println("Por favor, informe seu nome!");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, informe o seu saldo!");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!\n", nomeCliente, numeroAgencia, numeroConta, saldo);
        sc.close();
    }
}
