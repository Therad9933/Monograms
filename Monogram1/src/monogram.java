import java.util.Scanner;

public class monogram
	{

		public static void main(String[] args)
			{
				region();
				asking();

			}
		public static void asking()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello, What your full name? Please include your middle name.");
			String name = userInput.nextLine();
			String Input = name.toLowerCase();
			String[] nameArray = name.split(" ");
			System.out.println(nameArray[0].substring(0,1).toUpperCase() + nameArray[1].substring(0,1) + nameArray[2].substring(0,1));
		}
		public static void region()
		{
			
		}

	}
