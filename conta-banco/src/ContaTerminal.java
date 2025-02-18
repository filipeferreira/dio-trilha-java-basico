import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite a agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
                .replace("[Nome Cliente]", nomeCliente)
                        .replace("[Agencia]", agencia)
                        .replace("[Numero]", String.valueOf(conta))
                        .replace("[Saldo]", String.valueOf(saldo)));


    }
}
