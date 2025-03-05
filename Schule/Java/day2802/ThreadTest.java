/**
 * 
 */
package day2802;

/**
 * @author fred
 *
 */



class MyThread extends Thread {
    public void run() {
    	for(int i=0; i< 10; i++) {
            System.out.println("Thread läuft " + i + ": " + Thread.currentThread().getName());
            try {
				Thread.sleep(i*500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}

class MyThread2 extends Thread {
    public void run() {
    	for(int i=0; i< 100; i++) {
            System.out.println("Thread läuft " + i + ": " + Thread.currentThread().getName());
            try {
				Thread.sleep(57);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}


public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start();

		MyThread thread2 = new MyThread();
		thread2.start();

		MyThread2 thread3 = new MyThread2();
		thread3.start();

	}

}
