import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja cadastrar uma nova conta?");
        System.out.println("true para Sim | false para Não");
        boolean customerAnswer = sc.nextBoolean();

        if (customerAnswer) {
            Customer customer1 = new Customer("00000000000","Default",1, false);
            Account account1 = new Account(9999,9999,0.00, customer1);
        }else {
            System.out.println("Que pena! Te vejo numa próxima.");
        }





    }
}