
import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {

	private Queue queue;

	Producer(Queue queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			while (true) {
				queue.put(produce());
//				System.out.println("Produced resource - Queue size() = " + queue.size());
				System.out.println("Thêm" + queue.size());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private Integer produce() throws InterruptedException {
		Thread.sleep(500); // simulate time to produce the data
		return ThreadLocalRandom.current().nextInt(1, 100);
	}
}
