package dp_singleton_thread;



public class DP_singleton_thread {
    
    static singleton_thread s1 = null;
    static singleton_thread s2 = null;
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Runnable(){
           @Override
           public void run(){
               s1 = singleton_thread.getObj();
           }
        });
        
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                s1 = singleton_thread.getObj();
            }
        });
        
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
