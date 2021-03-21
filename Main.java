package multithreading_task1;

public class Main extends Thread {

    public static void main(String[] args) throws InterruptedException {

        ThreadGroup threadGroup = new ThreadGroup("Main");

        for (int i = 1; i < 5; i++) {
            Thread thread = new MyThread(threadGroup, Integer.toString(i));
            thread.start();
        }
        System.out.println("Начало ожидания");
        Thread.sleep(15000);
        System.out.println("Конец ожидания");
        threadGroup.interrupt();

    }
}
