package myproj1;
import java.util.Scanner;

public class Tenaryoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the marks");
		int marks = sc.nextInt();
		String result =
			    (marks < 0 || marks > 100) ? "Invalid"
			  : (marks >= 90)              ? "Grade A"
			  : (marks >= 80)              ? "Grade B"
			  : (marks >= 70)              ? "Grade C"
			  : (marks >= 60)              ? "Grade D"
			  :                              "Fail";

			System.out.println(result);




	}

}
