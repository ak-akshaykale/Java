
public class DeadLockThread {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		try {
			thread.join();
		}
		catch (InterruptedException e)
		{
			
		}

	}

}
