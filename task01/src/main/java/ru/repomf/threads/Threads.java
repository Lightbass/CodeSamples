package ru.repomf.threads;

/**
 * Created by a.makarov on 09.07.2018.
 */
public class Threads {
    private Thread[] t;
    long count = 0;
    long g = System.currentTimeMillis();

    public Threads(int countThreads, long endNumber){
        t = new Thread[countThreads];
        Runnable r = () -> {
            while(count < endNumber) {
                //inc();
                count++;
                //System.out.println(Thread.currentThread());
            }
            System.out.println("Time:" + (System.currentTimeMillis() - g) + " Count:" + count);

        };
        for(int i = 0; i < t.length; i++){
            t[i] = new Thread(r);
            t[i].start();
        }
    }

    public Threads(long endNumber){
        this(4, endNumber);
    }

    public Threads(){
        this(4, 1000000);
    }

    public Thread[] getMasThreads(){ return t;}

    synchronized void inc(){
        ++count;
    }
}
