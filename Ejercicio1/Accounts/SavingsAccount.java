package Accounts;

public class SavingsAccount extends Account {

    private boolean isActive = false;

    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        if (balance >= 10000) this.isActive = true;
    }

    public void deposit(float value) {
        if (this.isActive) {
            super.deposit(value);
        } else {
            System.out.println("Su cuenta no se encuentra activa, porfavor comuníquese con soporte.");
            System.out.println();
        }
    }

    public void withdraw(float value) {
        if (this.isActive) {
            super.withdraw(value);
        } else {
            System.out.println("Su cuenta no se encuentra activa, porfavor comuníquese con soporte.");
            System.out.println();
        }
    }

    public void withdrawMonthlyStatement() {
        if (this.totalWithdrawals > 4) this.monthlyCommission += (this.totalWithdrawals - 4) * 1000;
        super.withdrawMonthlyStatement();
        if (balance < 10000) this.isActive = false;
    }

    public void print() {
        System.out.println("El saldo es = $ " + this.balance);
        System.out.println("La comisión mensual es = $ " + this.monthlyCommission);
        System.out.println("El número de transacciones es = " + (this.totalWithdrawals + this.totalDeposits));
        System.out.println();
    }
}
