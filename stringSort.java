import java.util.Scanner;

class stringSort 
{
	public static void main(String[] args)
	{
		int n;
		String words[]= new String[10],temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of strings:");
		n = in.nextInt();
		System.out.println("Enter the strings:");

		for (int i =0 ; i < n ; i++)
		{
		 words[i] = in.next();
		}

		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (words[i].compareTo(words[j]) > 0) 
				{
					temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		
		System.out.println("\nThe strings in alphabetical order are: ");
		for (int i = 0; i < n; i++) 
		{
			System.out.println(words[i]);
		}
	}
}

