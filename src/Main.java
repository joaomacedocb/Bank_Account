
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("03029092062","João",30, true);
        Customer customer2 = new Customer("03029092066","Júlia",18,false);

        Account account1 = new Account(5678,1324,100.00, customer1);
        Account account2 = new Account(5679,1324,0.00, customer2);

        System.out.println("Nome do cliente: " + customer1.getName());
        System.out.println("O seu saldo é: " + account1.getBalance());
        System.out.println(customer1.checkAccount());

        System.out.println("Nome do cliente: " + customer2.getName());
        System.out.println("O seu saldo é: " + account2.getBalance());
        System.out.println(customer2.checkAccount());


    }
}