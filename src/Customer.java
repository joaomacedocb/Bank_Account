public class Customer {
    String document;
    String name;
    int age;
    Account customerAccount;
    boolean isActive;
    public Customer(String document, String name, int age, boolean isActive) {
        this.document = document;
        this.name = name;
        this.age = age;
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
    Account getCustomerAccount() {
        return this.customerAccount;
    }
    boolean getIsActive(){
        return this.isActive;
    }
    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    void setDocument(String document){
        this.document = document;
    }
    void setCustomerAccount (Account account) {
        this.customerAccount = account;
    }
    void setIsActive (boolean isActive) {
        this.isActive = isActive;
    }

}
