import java.util.Scanner;


public class revarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[],i;
		arr = new int[10];
		Scanner s = new Scanner(System.in);
		for(i=0;i<=(arr.length-1);i++)
		{
			System.out.println("\n enter element: ");
			arr[i] = s.nextInt();
		}

		System.out.println("\n Array elements in reverse order are: ");
		for(i=(arr.length-1);i>=0;i--)
		{
			System.out.print(" "+arr[i]);
		}

	}

}
