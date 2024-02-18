
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("03029092062","João",30, true);

        Account account1 = new Account(5678,1324,100.00, customer1);

        System.out.println("Nome do cliente: " + customer1.getName());
        System.out.println("O seu saldo é: " + account1.getBalance());

    }
}