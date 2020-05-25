import java.util.concurrent.TimeUnit;

public class ThreadTest {
    public static void main(String[] args){
        TimeUnit seconds = TimeUnit.SECONDS;

    }

    private void func() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                function();
            }
        }).start();
    }

    private void function() {
        System.out.println("hi");
    }
}
