class Sync extends Thread {
    static int balance = 1000;
    int amount = 700;
    synchronized void withdraw() {
        if (balance >= amount) {
            System.out.println(getName() + " is withdrawing");
            balance -= amount;
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void run() {
        withdraw();
    }
    public static void main(String[] args) {
        Sync t1 = new Sync();
        Sync t2 = new Sync();
        t1.start();
    }
}