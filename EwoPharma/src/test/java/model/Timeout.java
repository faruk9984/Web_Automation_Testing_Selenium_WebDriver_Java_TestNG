package model;

public class Timeout {
    public void timeout(int timeoutNumber){
        try {
            Thread.sleep(timeoutNumber);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
