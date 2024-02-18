public class Account {
    int agency;
    int number;
    private double balance;
    Customer accountOwner;

    public Account(int number, int agency, double balance, Customer accountOwner) {
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.accountOwner = accountOwner;
    }

    int getNumber() {
        return this.number;
    }
    int getAgency() {
        return this.agency;
    }
    double getBalance() {
        return this.balance;
    }
    void setNumber(int number) {
        this.number = number;
    }
    void setAgency(int agency){
        this.agency = agency;
    }
    void setBalance(double balance) {
        this.balance = balance ;
    }

    public void deposit(double value) {

        if (value > 0) {
            this.balance = this.balance + value;
        }
        else {
            System.out.println("O valor precisa ser positivo.");
        }
    }

    public void withdraw(double value) {
        if (value > 0) {
            this.balance = this.balance - value;
        }
        else {
            System.out.println("Você não pode sacar um valor negativo.");
        }
    }

}
