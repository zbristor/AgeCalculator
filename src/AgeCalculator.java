import java.util.Scanner;

public class AgeCalculator {
public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	System.out.println("How many records will you be entering? ");
	int num = kb.nextInt();
    int[] arr = new int[num];
    
    System.out.println("Enter the todays date (00/00/0000): ");
    String comb = kb.next();
	String[] sSplit = comb.split("/");
	int iMonth = Integer.parseInt(sSplit[0]);
	int iDay = Integer.parseInt(sSplit[1]);
	int iYear = Integer.parseInt(sSplit[2]);
	String yn = "Y";
	int count = 0;
	
	int age;
	int dif;
	while (yn.equals("Y"))
	{
		System.out.println("Enter the day, month, and year of your birth (00/00/0000): ");
		
		comb = kb.next();
		sSplit = comb.split("/");
		int fMonth = Integer.parseInt(sSplit[0]);
		int fDay = Integer.parseInt(sSplit[1]);
		int fYear = Integer.parseInt(sSplit[2]);
		if (iMonth>=fMonth && iDay>=fDay)
			dif = iYear-fYear;
		else 
			dif = iYear-fYear-1;
		System.out.println("You are "+dif+" years old.");
		arr[count]=dif;
		

		System.out.println("Would you like to enter details for another client? (Y/N) ");
		yn = kb.next();
		if (yn.equals("N"))
		{
			System.out.println("Thank you for using the age calculator!");
			break;
		}
		count++;
	}
	for (int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]);
	}
	
	
	
}
}
