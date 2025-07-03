public class SvsA {
    public static void main(String[] args) throws InterruptedException {
        // StringBuffer
        // Xử lý đồng bộ
        StringBuffer sb = new StringBuffer();

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                sb.append("A");
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Length with StringBuffer: " + sb.length());

        // StringBuilder
        // Xử lý bất đồng bộ
        StringBuilder sBuilder = new StringBuilder();

        Runnable taskRunnable = () -> {
            for (int i = 0; i < 10000; i++) {
                sBuilder.append("A");
            }
        };

        t1 = new Thread(taskRunnable);
        t2 = new Thread(taskRunnable);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Length with StringBuilder: " + sBuilder.length());
    }

}