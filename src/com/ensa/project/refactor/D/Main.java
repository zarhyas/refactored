package com.ensa.project.refactor.D;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(Account.AccountState.NEW);
        String stateDescription = myAccount.getStateDescription();

        System.out.println("State: " + stateDescription);
    }
}
