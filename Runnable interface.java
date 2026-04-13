class MyRunnable implements Runnable {
    public void run() {
        System.out.print("Runnable Thread Executed");
    }
}
public class W06_P2 {
    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
