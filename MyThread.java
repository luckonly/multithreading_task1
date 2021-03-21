package multithreading_task1;

public class MyThread extends Thread {

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {

        try {
            while(!isInterrupted()) {
                System.out.println("Привет, я поток " + Thread.currentThread().getName());
                sleep(2500);
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("Поток %s завершен\n", Thread.currentThread().getName());
        }
    }



}
