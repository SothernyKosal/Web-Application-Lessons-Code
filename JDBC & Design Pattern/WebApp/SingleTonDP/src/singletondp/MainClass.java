
package singletondp;


public class MainClass {
    //thread
    static SingleTonDP s1 = null;
    static SingleTonDP s2 = null;
    public static void main(String[] args) {
        //early(eager)
//        SingleTonDP t1 = SingleTonDP.getObj();
//        t1.print();

//late( lazy)
//        SingleTonDP s = SingleTonDP.getObj();
//        System.out.println(s);
//        s.print();
//        s = SingleTonDP.getObj();
//        System.out.println(s);


    
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                s1 = SingleTonDP.getObj();
            }
        });
        Thread t2 = new Thread(new Runnable(){

            public void run(){
                s1 = SingleTonDP.getObj();
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
