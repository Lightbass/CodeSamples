package ru.repomf.threads;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by a.makarov on 09.07.2018.
 */
public class ThreadsTest {
    @Test
    public void whenCreateThread() throws InterruptedException{
        assertThat("Three",is("Three"));
        startThreads(2);

    }
    void startThreads(int numThreads) throws InterruptedException{
        Threads treads = new Threads(numThreads, 1000000000L);
        for(Thread tr : treads.getMasThreads())
            tr.join();
        treads = new Threads(numThreads, 1000000000L);
        for(Thread tr : treads.getMasThreads())
            tr.join();
        treads = new Threads(numThreads, 1000000000L);
        for(Thread tr : treads.getMasThreads())
            tr.join();
        treads = new Threads(numThreads, 1000000000L);
        for(Thread tr : treads.getMasThreads())
            tr.join();
        treads = new Threads(numThreads, 1000000000L);
        for(Thread tr : treads.getMasThreads())
            tr.join();
    }
}
