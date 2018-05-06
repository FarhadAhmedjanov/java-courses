package ru.afm.threads;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void incerase() throws InterruptedException {
        final Counter counter = new Counter();
        final List<MyReader> readers = Arrays.asList(
                new MyReader(counter), new MyReader(counter),new MyReader(counter),new MyReader(counter),new MyReader(counter),
                new MyReader(counter),new MyReader(counter),new MyReader(counter),new MyReader(counter),new MyReader(counter)
        );

        for(final MyReader reader: readers){
            reader.start();
        }

        Thread.sleep(10001);
        assertEquals(101, counter.incerase());
    }

    private class MyReader extends Thread{
        private final Counter counter;

        public MyReader(Counter counter){
            this.counter = counter;
        }

        public void run(){
            for(int i = 0; i < 10; i++){
                System.out.println(String.format("%s : %s", Thread.currentThread().getId(), this.counter.incerase()));
            }
        }
    }
}