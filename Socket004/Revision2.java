package Socket004;

class CustomRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the custom Runnable
        CustomRunnable customRunnable = new CustomRunnable();
        
        // Create a Thread object and pass the custom Runnable instance to its constructor
        Thread thread = new Thread(customRunnable);
        
        // Start the thread
        thread.start();
    }
}
