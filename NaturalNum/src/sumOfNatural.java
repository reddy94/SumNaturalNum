
public class sumOfNatural {
	public static int Natural(int n){
		int i;
		int sum=0;
		for(i=0;i<=n;i++)
			sum=sum+i;
		return sum;
		
	}
public static void main(String[]args)
{
	int n=10;
	int sum=Natural(n);
	System.out.println(sum);
}
}
