package Multithreading;
class Check{
	 static int a;
	public   synchronized void  increment() {
		a++;
		System.out.println("Incremetded value = "+a);
	} 
	public void decrement() {
		a--;
		System.out.println("Incremetded value = "+a);
	}
}
public class SyncEx {
	public static void main(String[] args) throws Exception{
		Check obj = new Check();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 1;i<=10;i++)
				{
					obj.increment();
				}
			} 
			
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i = 1;i<=10;i++)
				{
					obj.decrement();
				}
			} 
			
		}
				
				); 
		t1.start();
	t1.join();
		t2.start();
		

	}

}
