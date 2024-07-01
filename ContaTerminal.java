
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

         
        System.out.println("Digite o número da agência: ");
        int agencia = ler.nextInt();

        System.out.println("\nDigite o número da conta: ");
        int conta = ler.nextInt();
        
        System.out.println("\nDigite o seu nome: ");
        String nomeCliente = ler.next();
        
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! \nA Sua agência é: " + agencia + "\nA Sua conta é: " + conta);

        Random saldo = new Random();
        System.out.println("O seu saldo é de: R$ " + saldo.nextInt(10000) + ".00 reais");    
    }
}