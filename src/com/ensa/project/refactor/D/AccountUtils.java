package com.ensa.project.refactor.D;

public class AccountUtils {
    public static String getAccountState ( Account account) {

        if ( account.getState() == -1 )
            return "Invalid";
        else if ( account.getState() == 0 )
            return "New";
        else if ( account.getState() == 1 )
            return "Pending";
        else if ( account.getState() == 5 )
            return "Confirmed";
        else
            throw new IllegalStateException("Unknown state");

    }
}
