class Bank extends Thread {
    static int balance = 1000;
    int amount;
    boolean deposit;
    Bank(int amount, boolean deposit) {
        this.amount = amount;
        this.deposit = deposit;
    }
    public void run() {
        if (deposit) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        Bank d = new Bank(500, true);
        Bank w = new Bank(200, false);
        w.setPriority(MAX_PRIORITY);
        d.setPriority(MIN_PRIORITY);
        d.start();
        w.start();
    }
}