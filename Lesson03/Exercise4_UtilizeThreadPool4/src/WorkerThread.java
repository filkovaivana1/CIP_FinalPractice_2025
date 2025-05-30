public class WorkerThread implements Runnable{

    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) message: " + message);
        proccessMessage();
        System.out.println(Thread.currentThread().getName() + "(end)");
    }

    public void proccessMessage(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
