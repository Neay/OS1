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
				try {
					Thread.sleep(1);
				} catch (InterruptedException e){}
			if(!buffer.isFull())
			buffer.enqueue("A");
			else{
			try {
				Thread.sleep(1);
			} catch (InterruptedException e){}
			if(!buffer.isFull())
				buffer.enqueue("A");
			}}
			}
			}
		


