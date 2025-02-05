import java.io.*;
import java.util.Scanner;

public class GATPANDAN_StudentGradeManager {
	static int failedStudents = 0;
	static int passedStudent = 0;
	static final int MIN_GRADE = 60;
	static final int PASSING_AVERAGE = 75;

	public static void main(String[] args) throws IOException {
		File file = new File("src\\Student Info.txt");

		if (file.exists()) {
			Scanner fileScanner = new Scanner(file);
			countPassers(fileScanner);
			fileScanner.close();
		}

		try (FileWriter filewriter = new FileWriter("src\\Student Info.txt", true);
				PrintWriter printWriter = new PrintWriter(filewriter)) {
			Scanner input = new Scanner(System.in);

			do {
				int quizGrade, activityGrade, examGrade;
				System.out.print("Enter Name: ");
				String name = input.nextLine();

				// Prompt the user to enter the grades
				String[] gradeTypes = { "quiz", "activity", "exam" };
				int[] grades = new int[3];
				for (int i = 0; i < gradeTypes.length; i++) {
					grades[i] = getGrade(input, gradeTypes[i]);
				}

				input.nextLine();

				double average = (0.30 * quizGrade) + (0.30 * activityGrade) + (0.40 * examGrade);

				if (average >= 75) {
					passedStudent++;
				} else {
					failedStudents++;
				}

				printWriter.println(name + "," + quizGrade + "," + activityGrade + "," + examGrade + "," + average);

				System.out.println("\nNumber of Passed: " + passedStudent);
				System.out.println("Number of Failed: " + failedStudents);

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
		do {
			System.out.println("Enter your " + gradeType + "grade: ");
			grade = input.nextInt();
		} while (grade < MIN_GRADE || grade > 100);
		return grade;
	}

	private static void countPassers(Scanner fileScanner) {
		while (fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			String[] tokens = line.split(",");
			if (tokens.length >= 5) {
				try {
					double average = Double.parseDouble(tokens[4]);
					if (average >= 75) {
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
