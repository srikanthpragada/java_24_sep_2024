package adv;

class MyThread implements Runnable {
	@Override
	public void run() {
		 System.out.println("In Thread!");
	}
}

public class LambdaDemo {

	public static void main(String[] args) {
        var t1 = new Thread(new MyThread());
        t1.start();
        
        var t2 = new Thread(new Runnable() {
        	 public void run() {
        		 System.out.println("Anonymous inner class thread!");
        	 }
        });

        t2.start();
        
	}

}
