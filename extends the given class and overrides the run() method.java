interface Task {
    void run();
}

class BaseTask implements Task {
    public void run() {}
}
class MyThread extends BaseTask {
    public void run() {
        System.out.print("Java Threads");
    }
}
public class W06_P3 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
    }
}
