public class Customer {
    private String document;
    private String name;
    private int age;
    private Account customerAccount;
    private boolean isActive;
    public Customer(String document, String name, int age, boolean isActive) {
        this.document = document;
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }
    public String getDocument() {
        return this.document;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public Account getCustomerAccount() {
        return this.customerAccount;
    }
    public boolean getIsActive(){
        return this.isActive;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDocument(String document){
        this.document = document;
    }
    public void setCustomerAccount (Account account) {
        this.customerAccount = account;
    }
    public void setIsActive (boolean isActive) {
        this.isActive = isActive;
    }

    public String checkAccount () {
        String feedbackAccount;
        if (this.isActive){
            return feedbackAccount = "O cliente está ativo.";
        } else {
            return feedbackAccount = "O cliente está inativo.";
        }
    }

}
