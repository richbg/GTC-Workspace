public class PingPong implements Runnable {
	private boolean tchoice; // Will hold the choice to display ping or pong

	public PingPong(boolean choice) {
		tchoice = choice; // Sets the choice to tchoice
	}

	@Override
	public void run() // Implemented Runnable method
	{
		// if tchoice is true display ping
		if (tchoice)
			ping();
		// if not display pong
		else
			pong();
	}

	// This method displays ping
	private void ping() {
		try {
			for (int counter = 0; counter < 5; counter++) {
				System.out.println("ping");
				Thread.sleep(10000); // Thread sleeps for 10 seconds
			}
		} catch (InterruptedException e) {
			System.err.println("Thread Interrupted");
		}
	}

	// This method displays pong
	private void pong() {
		try {
			for (int counter = 0; counter < 5; counter++) {
				System.out.println("pong");
				Thread.sleep(10000); // Thread sleeps for 10 seconds
			}
		} catch (InterruptedException e) {
			System.err.println("Thread Interrupted");
		}
	}
}

