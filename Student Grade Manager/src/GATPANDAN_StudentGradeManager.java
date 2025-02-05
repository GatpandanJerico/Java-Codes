import java.io.*;
import java.util.Scanner;

public class GATPANDAN_StudentGradeManager {
	private static final int PASSING_AVERAGE = 75;
	private static final int MIN_GRADE = 60;
	private static int failedStudents = 0;
	private static int passedStudent = 0;

	static class Student {

		String name;
		int quizGrade;
		int activityGrade;
		int examGrade;
		double average;

		public Student(String name, int quizGrade, int activityGrade, int examGrade) {
			this.name = name;
			this.quizGrade = quizGrade;
			this.activityGrade = activityGrade;
			this.examGrade = examGrade;
			this.average = calculateAverage();
		}

		private double calculateAverage() {
			return (0.30 * quizGrade) + (0.30 * activityGrade) + (0.40 * examGrade);
		}

		public boolean hasPassed() {
			return average >= PASSING_AVERAGE;
		}

	}

	public static void main(String[] args) throws IOException {
		File file = new File("Student Info.txt");

		if (file.exists()) {
			try (Scanner fileScanner = new Scanner(file)) {
				countPassers(fileScanner);
			}
		}

		try (FileWriter filewriter = new FileWriter("Student Info.txt", true);
				PrintWriter printWriter = new PrintWriter(filewriter)) {
			Scanner input = new Scanner(System.in);

			do {
				System.out.print("Enter Name: ");
				String name = input.nextLine();

				// Input grades
				String[] gradeTypes = { "quiz", "activity", "exam" };
				int[] grades = new int[3];
				for (int i = 0; i < gradeTypes.length; i++) {
					grades[i] = getGrade(input, gradeTypes[i]);
				}
				input.nextLine();

				Student student = new Student(name, grades[0], grades[1], grades[2]);

				// Update pass/fail count
				if (student.hasPassed()) {
					passedStudent++;
				} else {
					failedStudents++;
				}

				// Append to file
				printWriter.print(student.name + "," + student.quizGrade + "," + student.activityGrade + ","
						+ student.examGrade + "," + String.format("%.1f", student.average) + "\n");

				// Display result
				System.out.println("\nNumber of Passed: " + passedStudent);
				System.out.println("Number of Failed: " + failedStudents);

				// Ask user to continue
				System.out.print("\nDo you want to enter again? (Yes/No) ");
				String choice = input.nextLine().trim();
				if (choice.equalsIgnoreCase("No")) {
					break;
				}

			} while (true);
		}
	}

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
