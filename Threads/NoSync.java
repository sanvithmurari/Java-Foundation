class NoSync extends Thread {
    static int balance = 1000;
    int amount = 700;
    public void run() {
        if (balance >= amount) {
            System.out.println(getName() + " is withdrawing");
            balance -= amount;
            System.out.println("Balance: " + balance);
        }
    }
    public static void main(String[] args) {
        NoSync t1 = new NoSync();
        NoSync t2 = new NoSync();
        t1.start();
        t2.start();
    }
}