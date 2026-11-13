// Create two bidder threads that each add three bids to a shared list 
// through a synchronized method. Join them and print the
// highest bid.

import java.util.*;

class Bidder{
    ArrayList<Integer> bids;
    Bidder(){
        bids=new ArrayList<>();
    }
    public synchronized void add(int b){
        bids.add(b);
    }
}

class Mythread extends Thread{
    Bidder obj;
    Mythread(Bidder o, String name){
        super(name);
        obj=o;
        
    }
    public void run(){
        for(int i=0;i<3;i++){
            obj.add(i);
        }
    }

    public static void main(String args[]){
        Bidder b=new Bidder();
        Mythread t1=new Mythread(b, "Thread 1");
        Mythread t2=new Mythread(b, "Thread 2");
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){}
        System.out.println("Highest Bid: "+Collections.max(b.bids));

    }
}