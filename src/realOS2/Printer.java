package realOS2;

public class Printer extends Thread {
	Buffer buffer;
	public Printer(Buffer buffer){
		this.buffer=buffer;
	}
	public void run(){
			while(buffer.stillReqc()||buffer.stillReqp()){
					buffer.timecount();
				try {
					Thread.sleep(1);
			} catch (InterruptedException e) {}
			}
			try {
				Thread.sleep(100);
		} catch (InterruptedException e) {}
				System.out.println("Producer "+buffer.getpro()+", Consumer "+buffer.getcon());
				System.out.println("Buffer size "+buffer.size());
				System.out.println("Requests "+buffer.getreq());
				buffer.printsuccess();
			
	}

}
