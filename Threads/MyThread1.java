class MyThread1 implements Runnable {
    public void run() {
        System.out.println("Thread is running by implementing Runnable interface");
    }

    public static void main(String[] args) {
        MyThread1 obj = new MyThread1();
        Thread t = new Thread(obj);
        t.start();
    }
}