public class Customer {
    String document;
    String name;
    int age;
    int customerAccount;
    boolean isActive;
    public Customer(String document, String name, int age, int customerAccount, boolean isActive) {
        this.document = document;
        this.name = name;
        this.age = age;
        this.customerAccount = customerAccount;
        this.isActive = isActive;
    }
    String getDocument() {
        return this.document;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    int getCustomerAccount() {
        return this.customerAccount;
    }


}
