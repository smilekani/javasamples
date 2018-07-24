package in.co.kani;

public class DeadLockProg {
	
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
	
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread2.start();
	}
	
	private static class Thread1 extends Thread
	{
		
		@Override
		public void run() {
			synchronized (lock1) {
				System.out.println("Inside Lock1 in Thread-1.....");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Waiting to get Lock2 Thread-1.....");
				synchronized (lock2) {
					System.out.println("Inside Lock2 in Thread-1......");
				}
			}
		}
		
	}

	private static class Thread2 extends Thread
	{
		
		@Override
		public void run() {
			synchronized (lock2) {
				System.out.println("Inside Lock2 in Thread-2.....");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Waiting to get Lock1 Thread-2.....");
				synchronized (lock1) {
					System.out.println("Inside Lock1 Thread -2......");
				}
			}
		}
		
	}
	
}
