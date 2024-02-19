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
            Scanner a = new Scanner(System.in);

            Customer customer1 = new Customer("00000000000","Default",1, false);
            Account account1 = new Account(9999,9999,0.00, customer1);

            System.out.println("Que ótimo! Informe o seu nome:");
            customer1.setName(a.nextLine());

            System.out.println("Boas-vindas " + customer1.getName() + ". Vamos seguir o seu cadastro.");

            System.out.println("Informe a sua idade:");
            customer1.setAge(a.nextInt());

            System.out.println("Certo! Agora digite o seu CPF. Obs.: Use apenas números.");
            customer1.setDocument(a.nextLine());


        }else {
            System.out.println("Que pena! Te vejo numa próxima.");
        }





    }
}