public class BankAccount {
 private String accountName;
 private String accountNum;
 private double balance;
 private boolean isOverDraftAllowed;
 private double overDraftSum;
 public BankAccount(){
     accountName="account";
     accountNum="000001";
     balance=0;
     isOverDraftAllowed=false;
     overDraftSum=0;
 }
 public BankAccount(String account,String num,double balance,boolean flag,double sum){
     this.accountName=account;
     this.accountNum=num;
     this.balance=balance;
     this.isOverDraftAllowed=flag;
     this.overDraftSum=sum;
 }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isOverDraftAllowed() {
        return isOverDraftAllowed;
    }

    public void setOverDraftAllowed(boolean overDraftAllowed) {
        isOverDraftAllowed = overDraftAllowed;
    }

    public double getOverDraftSum() {
        return overDraftSum;
    }

    public void setOverDraftSum(double overDraftSum) {
        this.overDraftSum = overDraftSum;
    }
}