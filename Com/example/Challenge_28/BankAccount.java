package Com.example.Challenge_28;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    void deposit( double Rs){
        balance = balance + Rs;
        System.out.printf("your account has successfully credit Rs %f \n",balance);
    }
    void withdraw (double Rs) {
        if (balance <= 0){
            System.out.println("Insufficient Balance");
        }else {
            balance = balance - Rs;
            System.out.printf("You successfully debited Rs %f",Rs);
        }
    }
}