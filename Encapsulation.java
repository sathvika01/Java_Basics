class BankAccount{
    private int balance;

    BankAccount(int balance){
        this.balance = balance;

    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;

    }





}



public class Encapsulation {
    public static void main(String[] args){
        BankAccount obj = new BankAccount(100);
        System.out.println(obj.getBalance());
        obj.setBalance(300);
        System.out.println("Updated balance is " + obj.getBalance());



    }

}
