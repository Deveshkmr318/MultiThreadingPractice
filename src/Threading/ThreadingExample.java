package Threading;

/**
 * Created by : devesh
 */
public class ThreadingExample implements Runnable{

    transient int num = 0;

    @Override
    public void run() {
        this.num++;
        System.out.println(Thread.currentThread().getName() + " " + this.num);
    }
}
