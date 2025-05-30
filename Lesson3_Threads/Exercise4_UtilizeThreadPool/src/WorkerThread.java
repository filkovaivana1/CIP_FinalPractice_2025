class WorkerThread implements Runnable {

    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        proccessMessage();
        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    public void proccessMessage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
//    private String message;
//
//    public WorkerThread(String message) {
//        this.message = message;
//    }
//
//    public void run() {
//        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
////        processMessage();
//        System.out.println(Thread.currentThread().getName() + " (End)");
//    }
//
//    private void processMessage() {
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            System.out.println(Thread.currentThread().getName() + " got interrupted");
//            Thread.currentThread().interrupt();
//        }
//    }
}