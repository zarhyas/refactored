package com.ensa.project.refactor.D;

public class Account {
    private AccountState state;

    public Account(AccountState state) {
        this.state = state;
    }

    public AccountState getState() {
        return state;
    }

    public String getStateDescription() {
        return state.getDescription();
    }

    public enum AccountState {
        INVALID(-1, "Invalid"),
        NEW(0, "New"),
        PENDING(1, "Pending"),
        CONFIRMED(5, "Confirmed");

        private final int code;
        private final String description;

        AccountState(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public static AccountState fromCode(int code) {
            for (AccountState state : values()) {
                if (state.code == code) {
                    return state;
                }
            }
            throw new IllegalStateException("Unknown state");
        }

        public String getDescription() {
            return description;
        }
    }
}
