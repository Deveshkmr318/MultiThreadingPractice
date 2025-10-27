import Threading.ThreadingExample;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        ThreadingExample example = new ThreadingExample();

        for (int i = 1; i <= 100; i++) {

            String threadname = "Thread" + i;
            Thread thread = new Thread( example, threadname);

            thread.start();
//            thread.join();
        }
    }
}