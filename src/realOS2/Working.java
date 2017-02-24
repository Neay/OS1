package realOS2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Working {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		List<Producer> listPro = new ArrayList<Producer>();
		List<Consumer> myCon = new ArrayList<Consumer>();
		System.out.print("Number of producer : ");
		Scanner scan = new Scanner(System.in);
		int j = scan.nextInt();
		
		for(int i =0;i<j;i++)
		{
			listPro.add( new Producer(buffer));
		}
		System.out.print("Number of consumer : ");
		int k = scan.nextInt();
		for(int i =0;i<k;i++)
		{
			myCon.add( new Consumer(buffer));
		}
		for(Iterator<Producer> i = listPro.iterator(); i.hasNext(); ) {
		    Producer item = i.next();
		    item.start();
		}
	
		for(Iterator<Consumer> i = myCon.iterator(); i.hasNext(); ) {
			Consumer item = i.next();
		    item.start();
		}
		Printer printer = new Printer(buffer);
	
		
		
	
		printer.start();
		try { System.in.read(); }
		catch (IOException e) {}
	}

}
