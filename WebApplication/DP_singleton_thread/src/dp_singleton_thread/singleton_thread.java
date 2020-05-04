package dp_singleton_thread;

public class singleton_thread {
   private  singleton_thread(){}
   private static singleton_thread ts = null;
   
   
    public static singleton_thread getObj(){
        //buy the lock mean create obj for any class
        //below we create obj for Object class which is the parent of all class
        Object lock1 = new Object();
        /*
        above line buy the lock (internal lock) for the block of synchronized
        if thread 1 come fist it will unlock this sync block so if the thread 2 come
        it can't get into this sync block, it has to go to the available one
        */
   
        Object lock2 = new Object();
   
        synchronized(lock1){
            if(ts == null){
            ts = new singleton_thread();
        }
    }
        synchronized(lock2){
            System.out.println("thread 2 also syn that use lock2");
        }
            return ts;
    }
    public void print(){
        System.out.println("printing msg...");
    }
}

