import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Informe seu nome completo: ");
        String nome = scanner.next();

        System.out.println("Digite sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ". Obrigado por criar uma conta em nosso banco. Sua Agência é: " + agencia + ", conta: " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}