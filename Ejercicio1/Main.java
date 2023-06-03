import Accounts.Account;
import Accounts.CheckingAccount;
import Accounts.SavingsAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("*BIENVENIDO AL SISTEMA DE CUENTAS DE BANCO*");
        System.out.println("===========================================");
        System.out.println();
        System.out.println("¿Qué tipo de cuenta desea abrir?");
        System.out.println("- Seleccione 1 para abrir una cuenta de ahorros.");
        System.out.println("- Seleccione 2 para abrir una cuenta corriente.");

        int accountType = 0;
        boolean isntValid = true;
        while (isntValid) {
            Main.validateInt(sc);
            accountType = sc.nextInt();
            if (accountType != 1 && accountType != 2) {
                System.out.println("¡Ingrese alguna de las opciones!");
            } else {
                isntValid = false;
            }
        }

        System.out.print("Ingrese su saldo inicial= $");
        Main.validateFloat(sc);
        float initialBalance = sc.nextFloat();
        System.out.print("Ingrese su tasa de interés= ");
        Main.validateFloat(sc);
        float annualRate = sc.nextFloat();

        Account account;

        if (accountType == 1) {
            System.out.println("¡BIENVENIDO AL SISTEMA DE CUENTAS DE AHORRO!");
            account = new SavingsAccount(initialBalance, annualRate);
        } else {
            System.out.println("¡BIENVENIDO AL SISTEMA DE CUENTAS CORRIENTES!");
            account = new CheckingAccount(initialBalance, annualRate);
        }

        System.out.println();
        account.print();

        boolean runProgram = true;
        while (runProgram) {
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("- Seleccione 1 para depositar.");
            System.out.println("- Seleccione 2 para retirar.");
            System.out.println("- Seleccione 3 para calcular el extracto mensual.");
            System.out.println("- Seleccione 4 para ver la información de la cuenta.");
            System.out.println("- Seleccione 5 para salir.");

            int operation = 0;
            boolean isntValidOperation = true;
            while (isntValidOperation) {
                Main.validateInt(sc);
                operation = sc.nextInt();
                if (operation != 1 && operation != 2 && operation != 3 && operation != 4 && operation != 5) {
                    System.out.println("¡Ingrese alguna de las opciones!");
                } else {
                    isntValidOperation = false;
                }
            }

            System.out.println();

            switch (operation) {
                case 1 -> {
                    System.out.print("Ingresar cantidad a consignar: $");
                    Main.validateFloat(sc);
                    float totalToDeposit = sc.nextFloat();
                    account.deposit(totalToDeposit);
                }
                case 2 -> {
                    System.out.print("Ingresar cantidad a retirar: $");
                    Main.validateFloat(sc);
                    float totalToWithdraw = sc.nextFloat();
                    account.withdraw(totalToWithdraw);
                }
                case 3 -> account.withdrawMonthlyStatement();
                case 4 -> account.print();
                case 5 -> runProgram = false;
            }
        }

        System.out.println();
        System.out.println("GRACIAS POR UTILIZAR NUESTRO SISTEMA.");
    }

    public static void validateFloat(Scanner sc) {
        while (!sc.hasNextFloat()) {
            System.out.println("¡ Por favor ingresa un número entero válido !");
            sc.nextLine();
        }
    }

    public static void validateInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("¡ Por favor ingresa un número entero válido !");
            sc.nextLine();
        }
    }
}