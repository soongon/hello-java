package kr.re.kitri.fi;

public class FunctionalDemo {
    public static void main(String[] args) {
        System.out.println("Main Thread start..");

        Thread t = new Thread(() -> {
                System.out.println("MyThread running..");
            }
        );

        t.start();

        System.out.println("Main thread ended..");
    }
}
