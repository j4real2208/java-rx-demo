package org.example;



public class CallBackDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello world! , Main Thread is running");
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    new CallBackDemo().runningAsync(new CallBack() {
                        @Override
                        public void call() {
                            System.out.println("Call Back Called !!");
                        }
                    });
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main Thread Completed !! ");
    }

    public void runningAsync(CallBack callBack) throws InterruptedException {
        System.out.println("Hello world! , I am a different Thread in running");
        sleep(1000);
        callBack.call();

    }

    private void sleep(int duration) throws InterruptedException {
        Thread.sleep(duration);
    }
}
