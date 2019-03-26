package htl.wimmer.producerconsumer;


import java.util.ArrayList;
import java.util.Scanner;

public class Producer implements Runnable{

    private PasswordQueue passwordQueue;

    public Producer(PasswordQueue passwordQueue){
        this.passwordQueue = passwordQueue;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        String pw = sc.nextLine();

        Password pass = new Password(pw);
        passwordQueue.add(pass);

        try {
            passwordQueue.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
