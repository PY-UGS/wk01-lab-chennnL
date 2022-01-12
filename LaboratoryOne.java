/**
 * @author linweichen
 *
 */

public class LaboratoryOne {

	public static void main(String[] args) {
		// Example 1
		System.out.println("Example 1");
		System.out.println("Hello, I am Weichen!");
		System.out.println("\n");

		// Example 3
		System.out.println("Example 3");
		String moduleCode = "CSC1009";
		switch (moduleCode) {
		case "CSC1008":
			System.out.println("Data Structures and Algorithms");
			System.out.println("\n");
			break;
		case "CSC1009":
			System.out.println("Object-Oriented Programming");
			System.out.println("\n");
			break;
		case "CSC1010":
			System.out.println("Computer Networks");
			System.out.println("\n");
			break;
		default:
			System.out.println("Unknown module");
			System.out.println("\n");
			break;
		}

		// Example 4
		System.out.println("Example 4");
		for (int x = 102; x > 66; x--) {
			if (x % 2 == 1) {
				System.out.println("Value of x is " + x);
			}

		}
	}

}

