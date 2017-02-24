package realOS2;

public class Producer extends Thread {
	Buffer buffer;
	public Producer(Buffer buffer) {
			this.buffer=buffer;
		}
	public void run() { //It's append
		buffer.procount();
			while (buffer.stillReqp()) {
				buffer.deReqp();
			if(!buffer.isFull())
			buffer.enqueue("A");
			else{
			try {
				Thread.sleep(0,1);
			} catch (InterruptedException e){}
			if(!buffer.isFull())
				buffer.enqueue("A");
			}}
			}
			}
		


