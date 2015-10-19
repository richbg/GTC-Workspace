public class ThreadsMain {
	public static void main(String args[]) {
		
		Thread thread = new Thread(new PingPong(true)); // Creates a thread with
														// the thread that
														// creates ping
		Thread thread1 = new Thread(new PingPong(false)); // Creates a thread
															// with the thread
															// that creates pong
		// displays ping and pong 10 time
		thread1.start();
		thread.start();
	}
}