import java.util.ArrayList;
import java.io.*;
public class Driver {
	public static void main (String args []) throws IOException {
		ArrayList <Quadrilateral> shapeList = new ArrayList <Quadrilateral> (20);
		int input;
		String searchChoice;
		intro();
		System.out.println("Would you like to create a default shape (1), a custom shape (2), or to exit (0)?");
		input = Integer.parseInt(getInput());
		while (input != 0 && Quadrilateral.getNumQ() < 20) {
			if (input == 1) {
				makeDefaultShape (shapeList);
			}
			else if (input == 2) {
				makeCustomShape (shapeList);
			} else {
				System.out.println("Oops, I think you entered an invalid option. Please try again!");
			}
			if (Quadrilateral.getNumQ()!=20) {
				System.out.println("Would you like to create a default shape (1), a custom shape (2), or to exit (0)?");
				input = Integer.parseInt(getInput());
			}
		}
		if (Quadrilateral.getNumQ() != 0) {
			output();
			printDatabase(shapeList);
			System.out.println("Would you like more information about a specific shape you created? Enter <y> for yes, or <n> for no.");
			searchChoice = getInput();
			while (searchChoice.equalsIgnoreCase("y")) {
				searchDatabase(shapeList);
				System.out.println("Would you like to search for another shape? Enter <y> for yes, or <n> for no.");
				searchChoice = getInput();
			}
		}
		System.out.println("\nThank you for using the Quadrilateral Driver! Have a great day!");
	}
	public static void intro () {
		System.out.println("WELCOME TO THE QUADRILATERAL DRIVER!");
		System.out.println("THIS PROGRAM WILL ALLOW YOU TO CREATE UP TO 20 DIFFERENT QUADRILATERALS!");
		System.out.println("");
		System.out.println("With this program, you can choose from a variety of 6 different quadrilateral shapes.");
		System.out.println("");
		System.out.println("You will have the choice to create a default shape, in which all the dimensions are preset to '1',");
		System.out.println("OR");
		System.out.println("You can create a custom shape in which you will enter each dimension for the shape you choose to create.");
		System.out.println("");
		System.out.println("Each shape you create will be given a different name, that you can use to search through the database of shapes you created to get more information about each shape.");
		System.out.println("The names of the shapes will be printed after you create all the shapes you wish to create.");
		System.out.println("There will also be a report printed that will tell you the total number of shapes created, along with the numnber of each type of shape created.");
		System.out.println("");
	}
	public static String getInput () throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		return br.readLine();
	}
	public static void makeDefaultShape (ArrayList<Quadrilateral> shapeList) throws IOException {
		int input;
		System.out.println("Please enter: \n 1: Square \n 2: Rectangle \n 3: Parallelogram \n 4: Trapezoid \n 5: Rhombus \n 6: Kite");
		input = Integer.parseInt(getInput());
		switch (input) {
		case 1: 
			System.out.println("Are you sure you would like to create a square with side length of 1? Enter 'y' for yes or 'n' for no.");
			if (confirm()) {
				shapeList.add(new Square());
				System.out.println("You have created a square!");
			}
			break;
		case 2: 
			System.out.println("Are you sure you would like to create a rectangle with a length of 1 and a width of 1? Enter 'y' for yes or 'n' for no.");
			if (confirm()) {
				shapeList.add(new Rectangle());
				System.out.println("You have created a rectangle!");
			}
			break;
		case 3:
			System.out.println("Are you sure you would like to create a parallelogram with a length of 1, a width of 1 and a height of 1? Enter 'y' for yes or 'n' for no.");
			if (confirm()
					) {
				shapeList.add(new Parallelogram());
				System.out.println("You have created a parallelogram!");
			}
			break;
		case 4:
			System.out.println("Are you sure you would like to create a trapezoid with a length of 1, a base of 1, a height of 1, and a top base of 1? Enter 'y' for yes or 'n' for no.");
			if (confirm()) {
				shapeList.add(new Trapezoid());
				System.out.println("You have created a trapezoid!");
			}
			break;
		case 5:
			System.out.println("Are you sure you want to create a rhombus with length 1, first diagnal 1, and second diagnal 1? Enter 'y' for yes or 'n' for no.");
			if (confirm()) {
				shapeList.add(new Rhombus());
				System.out.println("You have created a rhombus!");
			}
			break;
		case 6: 
			System.out.println("Are you sure you want to create a kite with length 1, first diagnal 1, second diagnal 1, and second side length of 1? Enter 'y' for yes or 'n' for no.");
			if (confirm()) {
				shapeList.add(new Kite());
				System.out.println("You have created a kite!");
			}
			break;
		}
	}
	public static void makeCustomShape (ArrayList<Quadrilateral> shapeList) throws IOException {
		double dimensions [] = new double [4];
		int input;
		System.out.println("Please enter: \n 1: Square \n 2: Rectangle \n 3: Parallelogram \n 4: Trapezoid \n 5: Rhombus \n 6: Kite");
		input = Integer.parseInt(getInput());
		switch (input) {
		case 1:
			do {
				System.out.println("What side length would you like the square to have?");
				dimensions [0] = Double.parseDouble(getInput());
				System.out.println("Are you sure you want a side length of "+dimensions[0]+"? Enter 'y' for yes or 'n' for no");
			} while (!confirm());
			shapeList.add(new Square(dimensions[0]));
			System.out.println("You have created a square!");
			break;
		case 2:
			do {
				System.out.println("What length would you like the rectangle to have?");
				dimensions [0] = Double.parseDouble(getInput());
				System.out.println("What width would you like the rectangle to have?");
				dimensions [1] = Double.parseDouble(getInput());
				System.out.println("Are you sure you want a  length of "+dimensions[0]+" and a width of "+dimensions[1]+"? Enter 'y' for yes or 'n' for no");
			} while (!confirm());
			shapeList.add(new Rectangle(dimensions[0], dimensions[1]));
			System.out.println("You have created a rectangle!");
			break;
		case 3:
			do {
				System.out.println("What length would you like the Parallelogram to have?");
				dimensions [0] = Double.parseDouble(getInput());
				System.out.println("What width would you like the Parallelogram to have?");
				dimensions [1] = Double.parseDouble(getInput());
				System.out.println("What height would you like the Parallelogram to have?");
				dimensions [2] = Double.parseDouble(getInput());
				System.out.println("Are you sure you want a  length of "+dimensions[0]+", a width of "+dimensions[1]+" and a height of "+dimensions[2]+"? Enter 'y' for yes or 'n' for no");
			} while (!confirm());
			shapeList.add(new Parallelogram(dimensions[0], dimensions[1], dimensions[2]));
			System.out.println("You have created a parallelogram!");
			break;
		case 4:
			do {
				System.out.println("What length would you like the Trapezoid to have?");
				dimensions [0] = Double.parseDouble(getInput());
				System.out.println("What base would you like the Trapezoid to have?");
				dimensions [1] = Double.parseDouble(getInput());
				System.out.println("What height would you like the Trapezoid to have?");
				dimensions [2] = Double.parseDouble(getInput());
				System.out.println("What size would you like the top base of the Trapezoid to have?");
				dimensions [3] = Double.parseDouble(getInput());
				System.out.println("Are you sure you want a length of "+dimensions[0]+", a base of "+dimensions[1]+", a height of "+dimensions[2]+" and a top base of "+dimensions[3]+"? Enter 'y' for yes or 'n' for no");
			} while (!confirm());
			shapeList.add(new Trapezoid(dimensions[0], dimensions[1], dimensions[2], dimensions[3]));
			System.out.println("You have created a trapezoid!");
			break;
		case 5:
			do {
				System.out.println("What length would you like the Rhombus to have?");
				dimensions [0] = Double.parseDouble(getInput());
				System.out.println("How long would you like the first diagnal to be?");
				dimensions [1] = Double.parseDouble(getInput());
				System.out.println("How long would you like the second diagnal to be?");
				dimensions [2] = Double.parseDouble(getInput());
				System.out.println("Are you sure you want a  length of "+dimensions[0]+", the first diagnal to be "+dimensions[1]+" and the second diagnal to be "+dimensions[2]+"? Enter 'y' for yes or 'n' for no");
			} while (!confirm());
			shapeList.add(new Rhombus(dimensions[0], dimensions[1], dimensions[2]));
			System.out.println("You have created a rhombus!");
			break;
		case 6:
			do {
				System.out.println("What length would you like the Kite to have?");
				dimensions [0] = Double.parseDouble(getInput());
				System.out.println("How long would you like the first diagnal to be?");
				dimensions [1] = Double.parseDouble(getInput());
				System.out.println("How long would you like the second diagnal to be?");
				dimensions [2] = Double.parseDouble(getInput());
				System.out.println("What would you like the second side length to be?");
				dimensions [3] = Double.parseDouble(getInput());
				System.out.println("Are you sure you want a  length of "+dimensions[0]+", the first diagnal to be "+dimensions[1]+", the second diagnal to be "+dimensions[2]+" and a second side length of "+dimensions[3]+"? Enter 'y' for yes or 'n' for no");
			} while (!confirm());
			shapeList.add(new Kite(dimensions[0], dimensions[1], dimensions[2], dimensions[3]));
			System.out.println("You have created a kite!");
			break;
		}
	}
	public static boolean confirm () throws IOException {
		return getInput().equalsIgnoreCase("y");
	}
	public static void searchDatabase (ArrayList <Quadrilateral> shapeList) throws IOException {
		String name;
		boolean notFound = true;
		System.out.println("");
		System.out.println("Please enter the name of the object you would like information for based on the names that were provided above");
		name = getInput();
		System.out.println("");
		while (notFound) {
			for (int i = 0; i < shapeList.size(); i++) {
				if (name.equalsIgnoreCase(shapeList.get(i).getName())) {
					System.out.println(shapeList.get(i));
					i = shapeList.size();
					notFound = false;
				} 
			}
			if (notFound) {
				System.out.println("There is no shape by that name, please check your input!");
				notFound = false;
			}	
		}
		System.out.println("");
	}
	public static void output () {
		System.out.println("\nReport:");
		System.out.println("The total number of shapes created is: "+Quadrilateral.getNumQ());
		System.out.println("The total number of squares created is: "+Square.getNumS());
		System.out.println("The total number of rectangles created is: "+Rectangle.getNumRec());
		System.out.println("The total number of parallelograms created is: "+Parallelogram.getNumP());
		System.out.println("The total number of trapezoids created is: "+Trapezoid.getNumT());
		System.out.println("The total number of rhombuses created is: "+Rhombus.getNumRhom());
		System.out.println("The total number of kites created is: "+Kite.getNumK());
		System.out.println();
	}
	public static void printDatabase (ArrayList <Quadrilateral> shapeList) {
		System.out.println("");
		System.out.println("Shape Names:");
		for (int i = 0; i < shapeList.size(); i++) {
			System.out.println(shapeList.get(i).getName());
		}
		System.out.println("");
	}
}
