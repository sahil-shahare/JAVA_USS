package MultiThread.Advance;

public class DaemonOne {
    public static void main(String[] args) {
        Thread daemon = new Thread(()->{
            while(true){
                System.out.println("Daemon thread running...");
            }
        });

        daemon.setDaemon(true);

        Thread user = new Thread(()->{
            for(int i=1;i<=6;i++){
                System.out.println("User thread: "+i);
            }
        });

        daemon.start();
        user.start();
    }
}
