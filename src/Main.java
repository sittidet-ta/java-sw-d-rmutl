
public class Main {
	
	//Test Test
	
	public static void main(String[] args) 
	{
		int a, b, c = 2;
		double gpa = 3.50;
		String firstName = "Sittidet";
		
		
		//System.out.println("Hello, " + firstName);
		//System.out.println(c);
		
		/*for(int i=0; i<10; i++)
			System.out.println("Hello, " + i);*/
		
		int[] numbers = {1, 1, 2, 3, 5};
		int[] even = new int[20];
		
		/*String[] fruits = {"banana", "apple", "melon"};
		for(int i=0; i<3; i++)
			System.out.println(fruits[i]);*/
		
		/*String[] fruits = {"banana", "apple", "melon", "orange"};
		for(int i=0; i<fruits.length; i++) //แสดงเท่ากับที่ fruits มี
			System.out.println(fruits[i]);*/
		
		// for-each loop
		/*String[] fruits = {"banana", "apple", "melon", "orange"};
		for(String f : fruits)
			System.out.println(f);*/
		
		// String
		//System.out.println(firstName.length()); // แสดงว่ามี กีตัว
		//System.out.println(firstName.charAt(1));
		
		String tel = "053-211-122";
		String[] sp = tel.split("-");
		System.out.println("("+sp[0]+")"+sp[1]);
		
	}

}
