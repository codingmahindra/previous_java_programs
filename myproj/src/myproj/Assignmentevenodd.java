package myproj;

public class Assignmentevenodd {
	public static void main(String args[]) {
		int i = 1;
		int sumeven = 0;
		int sumodd = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				
					sumeven = sumeven + i;

				
			}

			else {
				if (i % 2 != 0) {
					sumodd =sumodd+ i;
				}

			}
			i++;
		}
		System.out.println("the sum of even numbers is "+sumeven);
		System.out.println("the sum of odd numbers is "+ sumodd);
	}

}