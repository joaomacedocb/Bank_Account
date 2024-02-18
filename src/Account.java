public class Account {
    int agency;
    int number;
    double balance;

    public Account(int agency, int number, double balance) {
        this.agency = agency;
        this.number = number;
        this.balance = balance;
    }

    int getAgency() {
        return this.agency;
    }

    int getNumber() {
        return this.number;
    }

    double getBalance() {
        return this.balance;
    }

    void setAgency(int agency) {
        this.agency = agency;
    }

    void setNumber(int number) {
        this.number = number;
    }

    void setBalance(double balance) {
        this.balance = balance ;
    }

    public void deposit(double value) {
        this.balance = this.balance + value;
    }

}
