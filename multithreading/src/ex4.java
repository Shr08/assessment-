class ReverseHello implements Runnable { // score 2
    private static final int LIMIT = 10;
    private static int counter = 0;
    private int num = 0;

    @Override
    public void run() {
        if (counter++ < LIMIT) {
            ReverseHello hello = new ReverseHello();
            hello.num = counter;
            Thread t = new Thread(hello);
            t.start();

            // wait until all the thread finish
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from Thread " + hello.num + "!");
        }
    }

    public static void main(String[] args) {
        new Thread(new ReverseHello()).start();
    }
}