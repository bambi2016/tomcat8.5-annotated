public class ThreadTest {
    public static void main(String[] args){
        int LOCK_COUNT = Runtime.getRuntime().availableProcessors();
        System.out.println(LOCK_COUNT);
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
