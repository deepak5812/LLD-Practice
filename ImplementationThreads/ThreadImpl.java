package Patterns.ImplementationThreads;



public class ThreadImpl implements Runnable{

//        extends Thread{


//    @Override
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//        }
//    }

    public static void main(String[] args){
//        ThreadImpl t1=new ThreadImpl();
//        t1.run();
        Thread t2=new Thread(new ThreadImpl());
        t2.run();

    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
