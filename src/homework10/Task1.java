package homework10;

import java.util.ArrayList;

public class Task1 {

    public class JobQueue {
        ArrayList jobs = new ArrayList ();

        public synchronized void put(Runnable job){
            jobs.add(job);
            this.notifyAll();
        }

        public synchronized Runnable getJob(){
            while (jobs.size()==0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
            return (Runnable) jobs.remove(0);
        }
    }

}
