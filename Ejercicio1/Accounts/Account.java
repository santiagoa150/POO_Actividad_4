package Accounts;

public class Account {

    protected float balance;
    protected int totalDeposits = 0;
    protected int totalWithdrawals = 0;
    protected float annualRate;
    protected float monthlyCommission = 0;

    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public void deposit(float value) {
        this.balance += value;
        this.totalDeposits++;
        System.out.println("Se ha depositado exitosamente!");
        System.out.println();
    }

    public void withdraw(float value) {
        if (value > this.balance) {
            System.out.println("La cantidad a retirar excede el saldo actual");
            System.out.println();
        } else {
            this.balance -= value;
            this.totalWithdrawals++;
        }
    }

    public void depositMonthlyInterest() {
        float monthlyInterest = this.balance * (this.annualRate / 12);
        this.balance += monthlyInterest;
    }

    public void withdrawMonthlyStatement() {
        this.balance -= this.monthlyCommission;
        this.depositMonthlyInterest();
        System.out.println("Se ha calculado exitosamente!");
        System.out.println();
    }

    public void print() {
        System.out.println("El saldo es = $" + this.balance);
        System.out.println("Se ha retirado en total = $" + this.totalWithdrawals);
        System.out.println("Se ha depositado en total = $" + this.totalDeposits);
        System.out.println("Tasa anual = $" + this.annualRate);
        System.out.println("Comisión mensual = $" + this.monthlyCommission);
        System.out.println();
    }
}
