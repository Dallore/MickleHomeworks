package homework9;

import java.util.concurrent.*;

public class Task2 {

    public static void main ( String[] args ) throws ExecutionException, InterruptedException {

        ExecutorService exec = Executors.newFixedThreadPool ( 2 );


        MyCallable task1 = new MyCallable ();
        Future<String> future1 = exec.submit ( task1 );

        MyCallable task2 = new MyCallable ();
        Future<String> future2 = exec.submit ( task2 );

        MyCallable task3 = new MyCallable ();
        Future<String> future3 = exec.submit ( task3 );

        MyCallable task4 = new MyCallable ();
        Future<String> future4 = exec.submit ( task4 );

        String string = future1.get ();
        System.out.println ( string );

        Thread.sleep ( 1000 );

        String string2 = future2.get ();
        System.out.println ( string2 + " I'm Mike! " );

        Thread.sleep ( 1000 );

        String string3 = future3.get ();
        System.out.println ( string3 + " I'm Mike! " + "I love to dance! " );

        Thread.sleep ( 1000 );

        String string4 = future4.get ();
        System.out.println ( string4 + " I'm Mike! " + "I love to dance! " + "End." );

    }

    public static class MyCallable implements Callable<String> {

        @Override
        public String call () throws Exception {
            return "Hello World!";
        }
    }


}
