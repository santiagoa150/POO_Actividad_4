package Accounts;

public class CheckingAccount extends Account {

    private float overdraft = 0;

    public CheckingAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }

    public void withdraw(float value) {
        if (value > this.balance) {
            overdraft += value - this.balance;
            this.balance = 0;
        } else super.withdraw(value);
    }

    public void deposit(float value) {
        if (this.overdraft <= 0) super.deposit(value);
        else {
            float waste = this.overdraft - value;
            if (waste > 0) {
                this.overdraft = 0;
                this.balance = waste;
            } else {
                this.overdraft = -waste;
                this.balance = 0;
            }
        }
    }

    public void print() {
        System.out.println("El saldo es = $ " + this.balance);
        System.out.println("El cargo mensual es = $ " + this.monthlyCommission);
        System.out.println("El número de transacciones es = " + (this.totalDeposits + this.totalWithdrawals));
        System.out.println("El valor de sobregiro = $" + this.overdraft);
        System.out.println();
    }
}
