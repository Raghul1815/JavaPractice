class W06_P5 extends Thread {
    public void run() {
        System.out.println("Thread Executing");
    }

    public static void main(String[] args) {
        W06_P5 t = new W06_P5();
        System.out.println("Default Thread Name: " + t.getName());
t.setName("JavaThread");
t.start();
System.out.println("Updated Thread Name: " + t.getName());
    }
}
