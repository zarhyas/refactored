package com.ensa.project.refactor.E;

class Order{
    String status;

    public String getStatus() {
        return status;
    }
}
class Account{
    boolean logged;

    public boolean isLogged() {
        return logged;
    }
}
public class SimplifyConditions {

    public void processOrder(Order order) {
        if (order != null && order.getStatus() != null && order.getStatus().equals("Shipped")) {
            // Processing command
        }
    }

    public String getConnectionStatus( Account account ) {
        return account.isLogged() ? "Connected" : "Disconnected";
    }

    public void check(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("Both conditions are verified");
        }
    }
}
