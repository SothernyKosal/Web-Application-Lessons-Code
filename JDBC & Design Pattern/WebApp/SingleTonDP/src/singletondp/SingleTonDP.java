

package singletondp;

//02.12.2019
//DesignPattern: 1. Creational -> 1.1 SingleTon (eager)

public class SingleTonDP {
//early
//    private int id;
//    private String name;
//    private static SingleTonDP s = new SingleTonDP();
//    private SingleTonDP(){}
//
//    public void print(){
//        System.out.println("Id : "+id+ " Name : "+name);
//    }
//    public static SingleTonDP getObj(){
//        return s;
//    }
    
    //lazy 04.12.2019
//    private SingleTonDP(){}
//    private static SingleTonDP s = null;
//    public static SingleTonDP getObj(){
//        if (s == null){
//            s = new SingleTonDP();
//        }
//        return s;
//    }
//    public void print(){
//        System.out.println("printing msg...");
//    }
    
    //thread : having 2 thread and try to instantiate one obj
    private SingleTonDP(){}

    private static SingleTonDP s = null;

    public static SingleTonDP getObj(){//func doesn't synchronized so any thread can come in
        Object lock1 = new Object();//buy the lock( internal lock) for the block of synchronized
        // if thread 1 come first it will unlock this syn block so if the thread 2 come it can't get into this syn block it has to go to the available 1
        Object lock2 = new Object();//buy the lock is to create object for any class now we create the obj for Object class which is the parent of all class

        synchronized(lock1){
            if (s == null){
                s = new SingleTonDP();
            }
        }

        synchronized (lock2){
            System.out.println("thread 2 also syn that use lock 2");
        }

        return s;
    }
    public void print(){
        System.out.println("printing msg...");
    }
    
}
