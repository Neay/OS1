package realOS2;
import java.io.*;
import java.util.Date;
public class Buffer {
	private static final int capacity = 1000;
	private final int N;
	private Object[] Q;
	private int f = 0;
	private int r = 0;
	private final int req = 1000000;
	private int cre;
	private int pre;
	private int suc=0;
	private float tim=0;
	private int connum=0;
	private int pronum=0;
	public Buffer(){
		this(capacity);
	}
	public Buffer(int capacity) {
		N = capacity;
        Q = new Object[N];
        cre = req;
        pre = req;
	}
	synchronized int getreq(){
		return req;
	}
	synchronized int getpro(){
		return pronum;
	}
	synchronized int getcon(){
		return connum;
	}
	synchronized void procount(){
		pronum++;
	}
	synchronized void concount(){
		connum++;
	}
	synchronized void timecount(){
		tim++;
	}
	
	synchronized void printsuccess(){
		System.out.println("\n"+"Successfully consumed"+" "+suc+" "+"("+(((float)suc/(float)req)*100)+"%"+")");
		System.out.println("Elapsed Time: "+(((float)tim/734))+" s");
		System.out.println("Throughput "+(float)suc/(((float)tim)/734)+" successful requests/s");
	}
	
	synchronized void success() {
        suc++;
    }
	synchronized void deReqp() {
        pre--;
    }
	synchronized void deReqc() {
        cre--;
    }
	
	synchronized boolean stillReqc() {
        if(cre>0)
        	return true;
        else return false;
    }
	synchronized boolean stillReqp() {
        if(pre>0)
        	return true;
        else return false;
    }
	
	// Queue Algorithm start here
	
	synchronized int size() {
        return capacity;
    }
	synchronized boolean isEmpty() {

        if(r == f){
            return true;
        }
        else return false;
        }
  
     
    
	synchronized boolean isFull() {
 
        int diff = r - f; 
        if(diff == -1 || diff == (N -1)){
        return true;
        }
        else return false;
    }
	
	synchronized void enqueue(Object obj){ //It's add_item
        
            Q[r] = obj;
            r = (r + 1) % N;
            
         
            notify();
    }
	synchronized void dequeue(){ //It's remove item
	       
	            Q[f] = null;
	            f = (f + 1) % N;
	            
	           
	            notify();
	    }
}
