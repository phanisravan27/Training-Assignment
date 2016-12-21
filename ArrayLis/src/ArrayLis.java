import java.util.ArrayList;
/* Program for insert 1 to 10 numbers using arraylist and display them */
// Phani sravan Kolapalli

public class ArrayLis {
	public static void main(String args[])
	{
		ArrayList<Integer> num= new ArrayList<Integer>(10);
		
		for(int i=1; i<=10; i++)
		{
			num.add(i);
			System.out.println(num.get(i-1));
			
		}
		
	}
}
