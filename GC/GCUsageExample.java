package Study.GC;

public class GCUsageExample {
	public static void main(String[] args) {
		
		MyBigData[] bigarr=new MyBigData[10000];
		
		for(int i=0;i<bigarr.length;i++) {
			MyBigData obj=new MyBigData();
			//bigarr[i]=new MyBigData();
			//System.out.println(i);
			//System.gc(); //programmer request to JVM
		}
				
		
	}// main

}//end Exam class

class MyBigData
{
	long[] arr=new long[100000];
	@Override
	protected void finalize() throws Throwable {
		System.out.println(" GC will SWEEP this "+this +" ");
	}
}
/*PLAY with the GC code 
1. Use array  --- observe that GC is not able to free a single object , so program crashes
2. Use local scope reference  --- observe that when heap starts filling jvm runs gc, gc frees unreachable objects and calls finalize
3. Use few objects in loop and see that gc is never called by JVM
4. Use System.gc() to explicitly call gc.*/