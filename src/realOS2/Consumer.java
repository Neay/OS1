package realOS2;

public class Consumer extends Thread {
	Buffer buffer;
	public Consumer(Buffer buffer) {
			this.buffer=buffer;
		}
	public void run() { //It's remove
		buffer.concount();
		while (buffer.stillReqc()) {
			buffer.deReqc();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e){}
			if(!buffer.isEmpty()){
			buffer.dequeue();
			buffer.success();	}
			else{
		try {
			Thread.sleep(1);
		} catch (InterruptedException e){}
		if(!buffer.isEmpty()){
			buffer.dequeue();
			buffer.success();	
			}}
			}
		}}
	

