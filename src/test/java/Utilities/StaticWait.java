package Utilities;

public class StaticWait {

    //static wait method.

    public static void wait(int second){
        try{
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
    }
}
