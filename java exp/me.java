class my extends Thread
{
   public void run()
	{
		try{
			System.out.println("Thread:"+Thread.currentThread().getId());
			Thread.sleep(1000);             
		  }
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class me
{
	public static void main(String args[])
	{
		int n=5;
		
		for(int i=1;i<5;i++)
		{
			my m1=new my();
			m1.start();
			System.out.println(m1.getState());
		}
	}
}
