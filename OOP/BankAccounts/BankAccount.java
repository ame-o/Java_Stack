public class BankAccount {
    // Member Attributes
    private double checkingBalance;
    private double savingsBalance;
    private static int accountsCount;
    private static double accountTotals;
    private String name;

    // Constructor
    public BankAccount(String name){
        this.name = name;
        accountsCount++;
    }

    // //Getters and Setters
    // public static getAllBalances(){
    //     return double accountTotals = checkingBalance + savingsBalance;
    // }
    // public int getChecking(){
    //     return int this.checkingBalance;
    // }
    // public int getSaving(){
    //     int this.savingsBalance;
    // }

    // public double setDeposit(double deposit, double accountType){
    //     this.accountType+=deposit;
    // }
    // public double setWithdrawl(double withdrawl,double accountType){
    //     if (accountType >= withdrawl){
    //     this.accountType -=withdrawl;
    //     }
    //     else{
    //         System.out.println("Insufficient funds! Sorry, you only have "+ accountType + " in your bank account.");
    //     }
    // }

    // public double getBothBalanaces(){
    //     return this.checkingBalance + this.savingsBalance;
    // }
}