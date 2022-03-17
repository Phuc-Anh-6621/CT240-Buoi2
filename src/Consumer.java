import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable {

	private Queue queue;

	Consumer(Queue queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			while (true) {
				queue.take();
//				System.out.println("Consumed resource - Queue size() = " + queue.size());
				System.out.println("Còn: "+ queue.size());
				Thread.sleep(9000); // simulate time passing
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}