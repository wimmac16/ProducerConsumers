package htl.wimmer.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class PasswordQueue {

    private Queue<Password> passwordQueue = new LinkedList<>();

    public void add(Password str){
        passwordQueue.add(str);
    }

    public void remove(Password str){
        passwordQueue.remove(str);
    }

    public boolean isFull(){
        return passwordQueue.size() >= 100;
    }

    public Password getNext(){
        return passwordQueue.element();
    }
}
