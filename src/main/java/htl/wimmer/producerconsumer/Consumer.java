package htl.wimmer.producerconsumer;

public class Consumer implements Runnable {

    private PasswordQueue queue = new PasswordQueue();

    @Override
    public void run() {
        while(true){
            Password temp = queue.getNext();
            

        }
    }
}
