// Jose Guzman
// October 19, 2023
// Created a method to show a table that converts kilograms to pounds
// File name: polymorphism.java
// To Compile in terminal type: javac polymorphism.java
// To Run in terminal type: java polymorphism
class polymorphism
{
	public static void kgToLbs()
	{
		//assume 1 kg is equal to 2.20462 lbs 
		System.out.println("\nKg       Lbs");
		for (int kg = 1; kg < 15; kg += 3 )
			System.out.printf("%-2d     %.2f\n", kg, kg*2.20462);
	}
	public static void kgToLbs(int kgBegin, int kgEnd)
	{
		//assume 1 kg = 2.20462 lbs
		System.out.println("\nKg     Lbs");
		for (int kg = kgBegin; kg < kgEnd; kg += 3)
			System.out.printf("%-2d      %.2f\n", kg, kg*2.20462);
	}
	public static void main(String[] args)
	{
		kgToLbs();
		kgToLbs(1,15);
	}
}//end class Polymorphism

/*
Kg       Lbs
1      2.20
4      8.82
7      15.43
10     22.05
13     28.66

Kg     Lbs
1       2.20
4       8.82
7       15.43
10      22.05
13      28.66
*/