package realOS2;
import java.io.IOException;

public class Working {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Producer producer1 = new Producer(buffer);
		Consumer consumer1 = new Consumer(buffer);
		Printer printer = new Printer(buffer);
		Producer producer2 = new Producer(buffer);
		Consumer consumer2 = new Consumer(buffer);
		Producer producer3 = new Producer(buffer);
		Consumer consumer3 = new Consumer(buffer);
		Producer producer4 = new Producer(buffer);
		Consumer consumer4 = new Consumer(buffer);
		Producer producer5 = new Producer(buffer);
		Consumer consumer5 = new Consumer(buffer);
		Producer producer6 = new Producer(buffer);
		Consumer consumer6 = new Consumer(buffer);
		Producer producer7 = new Producer(buffer);
		Consumer consumer7 = new Consumer(buffer);
		
		producer1.start();
		consumer1.start();
		producer2.start();
		consumer2.start();
		producer3.start();
		consumer3.start();
		producer4.start();
		consumer4.start();
		producer5.start();
		consumer5.start();
		producer6.start();
		consumer6.start();
		producer7.start();
		consumer7.start();
		
		printer.start();
		try { System.in.read(); }
		catch (IOException e) {}
	}

}
