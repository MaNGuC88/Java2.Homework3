package com.geektech;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(0.0);
        bankAccount.deposit(20000.0);
        int withdrawnAmount = 6000;

        while (true) {
            try {
                bankAccount.withDraw(withdrawnAmount);
                System.out.println("Вы сняли: " + withdrawnAmount);
                System.out.println("Остаток средств на счете: " + bankAccount.getAmount());
                System.out.println("----------------------------------------");
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("Остаток к снятию = " + bankAccount.getAmount());
                System.out.println("Вы сняли: " + bankAccount.getAmount() + ". Текущий остаток: " +
                        LimitException.getRemainingAmount(bankAccount.getAmount() - bankAccount.getAmount()));
                break;
            }
        }
    }
}
