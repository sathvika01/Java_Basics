class Bank{
    int getInterestRate(){
        return 5;
    }
}

class HDFC extends Bank{
    int getInterestRate(){
        return 7;
    }
}

class SBI extends Bank{
    int getInterestRate(){
        return 6;
    }
}

public class Overriding {
    public static void main(String[] args){
        Bank obj = new Bank();
        Bank obj1 = new HDFC();
        Bank obj2 = new SBI();

        System.out.println("General interest rate is " + obj.getInterestRate() + "%");
        System.out.println("HDFC interest rate is "+obj1.getInterestRate() + "%");
        System.out.println("SBI interest rate is " + obj2.getInterestRate() + "%");

    }
}
