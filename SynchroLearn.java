package interview.Threads;

import interview.collections.PlaywithHashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SynchroLearn {


    public static void main(String[] args) {

        PlaywithHashMap playwithHashMap = new PlaywithHashMap();

        Test test1 = new Test(playwithHashMap);
        Test test2 = new Test(playwithHashMap);

     Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);


        t1.start();
        t2.start();

    }
}

class Test implements Runnable{

    PlaywithHashMap playwithHashMap;

    Test(PlaywithHashMap playwithHashMap){
        this.playwithHashMap = playwithHashMap;
    }


    public void run(){

        synchronized (playwithHashMap){
            playwithHashMap.useMyMap();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}