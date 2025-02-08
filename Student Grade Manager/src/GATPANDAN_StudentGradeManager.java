import java.io.*;
import java.util.Scanner;

public class GATPANDAN_StudentGradeManager {
	// Constant Variables
	private static final int PASSING_AVERAGE = 75;
	private static final int MIN_GRADE = 60;
	// Static variables
	private static int failedStudents = 0;
	private static int passedStudent = 0;

	// An Inner static class, it encapsulate the properties and behaviors of a
	// student.
	static class Student {

		String name;
		int quizGrade;
		int activityGrade;
		int examGrade;
		double average;

		// Constructor for Student Class
		public Student(String name, int quizGrade, int activityGrade, int examGrade) {
			this.name = name;
			this.quizGrade = quizGrade;
			this.activityGrade = activityGrade;
			this.examGrade = examGrade;
			this.average = calculateAverage();
		}

		// Method that calculates the average of the grades
		private double calculateAverage() {
			return (0.30 * quizGrade) + (0.30 * activityGrade) + (0.40 * examGrade);
		}

		// Method that returns true if the student has passed, otherwise false.
		public boolean hasPassed() {
			return average >= PASSING_AVERAGE;
		}

	}

	// The entry point of the program. It throws IOException to handle potential
	// file input/output errors.
	public static void main(String[] args) throws IOException {
		// A file object that create the file "Student Info.txt that will store the
		// student data"
		File file = new File("Student Info.txt");

		// Check if the file already exist, if it exist a Scanner object to read from it
		// and call countPassers method.
		if (file.exists()) {
			try (Scanner fileScanner = new Scanner(file)) {
				// A method that count how many students passed and failed based on the existing
				// data.
				countPassers(fileScanner);
			}
		}

		// Created FileWriter and PrintWriter object to append new student data to the
		// file.
		try (FileWriter filewriter = new FileWriter("Student Info.txt", true);
				PrintWriter printWriter = new PrintWriter(filewriter)) {
			Scanner input = new Scanner(System.in);

			// A loop that will repeatedly prompt the user for student information until
			// they choose to stop.
			do {
				System.out.print("Enter Name: ");
				String name = input.nextLine();

				// A loop to collect grades for each type by calling getGrade method
				String[] gradeTypes = { "quiz", "activity", "exam" };
				int[] grades = new int[3];
				for (int i = 0; i < gradeTypes.length; i++) {
					grades[i] = getGrade(input, gradeTypes[i]);
				}

				input.nextLine();

				// Create a new Student object with the collected name and grades
				Student student = new Student(name, grades[0], grades[1], grades[2]);

				// Update pass/fail count
				if (student.hasPassed()) {
					passedStudent++;
				} else {
					failedStudents++;
				}

				// Append the collected student information to Student Info.txt
				printWriter.print(student.name + "," + student.quizGrade + "," + student.activityGrade + ","
						+ student.examGrade + "," + String.format("%.1f", student.average) + "\n");

				// Display the number of passed and failed student in the console
				System.out.println("\nTotal Number of Failed: " + failedStudents);
				System.out.println("Total Number of Passed: " + passedStudent);

				// Ask user to if they want to continue
				while (true) {
					System.out.print("\nDo you want to enter again? (Yes/No) ");
					String choice = input.nextLine().trim();

					if (choice.equalsIgnoreCase("Yes")) {
						break;
					} else if (choice.equalsIgnoreCase("No")) {
						return;
					} else {
						System.out.println("Invalid choice! Try again.");
					}
				}
			} while (true);
		}
	}

	// A method that return the grade for each type and ensure if it is valid
	private static int getGrade(Scanner input, String gradeType) {
		int grade;
		while (true) {
			System.out.print("Enter your " + gradeType + " grade: ");
			if (input.hasNextInt()) {
				grade = input.nextInt();
				if (grade >= MIN_GRADE && grade <= 100) {
					return grade;
				}
			} else {
				input.next();
			}
			System.out.println("Invalid input. Enter a number between " + MIN_GRADE + " and 100.");
		}
	}

	// A method that read the file and update the passedStudent and failedStudent
	// variable
	private static void countPassers(Scanner fileScanner) {
		passedStudent = 0;
		failedStudents = 0;
		while (fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			String[] tokens = line.split(",");
			if (tokens.length >= 5) {
				try {
					double averageGrade = Double.parseDouble(tokens[4]);
					if (averageGrade >= PASSING_AVERAGE) {
						passedStudent++;
					} else {
						failedStudents++;
					}
				} catch (NumberFormatException e) {
					System.err.println("Error parsing average from line: " + line);
				}
			}
		}
	}
}
