
import java.util.LinkedList;

public class Queue {

	private static final int compacity = 10;
	private LinkedList items = new LinkedList<>();

	public synchronized void put(int T) throws InterruptedException {
		while (items.size() == compacity) {
			System.out.println("Queue is full");
			wait();
		}
		items.addLast(T);
		notifyAll();
	}

	public synchronized void take() throws InterruptedException {
		while (items.size() == 0) {
			System.out.println("Queue is empty");
			wait();
		}
		notifyAll();
		items.removeFirst();
	}

	public synchronized int size() {
		return items.size();
	}
}
