package hackerRank.com;

public class MatrixCoupaEX {
  
	public static void main(String[] args) {
	
		//Java Program to Add Two M*N Matrix From User Input

		int[][] arr = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90} };
		for(int  i=0;i<3; i++) {
			for( int j=0; j<3;j++) {
				int sum=0 ;
				for(int k=(i+j); k<5; k++)
				 {
					sum=sum+arr[i][j];
					System.out.println(" "+sum);
					i++;
					j++;
				 }
				int add= (sum+arr[i][j]);
			//	System.out.println(" "+add);
				}
		
			}
	
}
}


