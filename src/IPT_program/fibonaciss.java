package IPT_program;

public class fibonaciss {

	public static void main(String[] args) {

		int n1=0, n2=1 , sum =0 , count=10;
		System.out.println(n1+ "  " +n2);  /// 0  1
		 
		
		for(int i=2; i<count;i++)
		{
			sum=n1+n2; /// 1
			System.out.println("  "+sum); //1 
			n1=n2;          // assing value from sum and inital value of n1 and n2 
			n2=sum;
		}
		
	}

}
