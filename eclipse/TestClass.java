import java.util.*;
class TestClass
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int c1=0,c2=0;
		char[] numbers=name.toCharArray();
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]=='0'){
				c1++;
			}
			else if(numbers[i]=='1'){
				c2++;
			}
		}
		if(c1==c2){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
}