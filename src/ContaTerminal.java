import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int numconta;
        String agencia;
        String nomecliente;
        float saldo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero da agencia: ");
        agencia = sc.nextLine();
        System.out.println("digite o seu nome completo: ");
        nomecliente= sc.nextLine();
        System.out.println("digite o numero da conta: ");
        numconta= sc.nextInt();
 System.out.println("Olá "+ nomecliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +" , conta " + numconta +" e seu saldo "+saldo +" já está disponível para saque");

    }
}
