import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BasicExecutorDemo {
    public static void main(String args[])
    {
        Runnable run = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println(name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println(name);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        };
        Thread t = new Thread(run);
        t.start();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(()-> {
            String name = Thread.currentThread().getName();
            for (int i = 0; ; i++) {
                System.out.println(name);
                System.out.println("From within Executor Servicve");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                }
            }
        });

        try
        {
            System.out.println("Shutting down the services");
            executor.shutdown(); // control to be passed to executor service from main
            executor.awaitTermination(1,TimeUnit.SECONDS);// wait()
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        finally {
            if(!executor.isTerminated())
            {
                System.out.println("Shutting down forcefully");
                executor.shutdownNow();
            }
        }





        }
    }

