package task_2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<String> drop = new SynchronousQueue<>();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
