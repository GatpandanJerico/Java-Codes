import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ModifyFileLine {
	public static void main(String[] args) throws IOException {
		
		int lineToModify = 1;
		
		String[] names = {"John", "Doe", "Jesse", "Jonas", "Jane", "Joseph"};
		try (PrintWriter outputLine = new PrintWriter(new FileWriter("Hello.txt", false))){
			for (int i = 0; i < names.length; i++) {
				outputLine.println(names[i]);
			}
		} 
		
		ArrayList<String> lines = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader("Hello.txt"))) {
			String line;
			while((line = reader.readLine()) != null) {
				lines.add(line);
			}
		}
		
		if (lineToModify > 0 && lineToModify <= lines.size()) {
			lines.set(lineToModify - 1, "June");
		} 
		else {
			System.out.println("Invalid line number");
			return;
		}
		
		try (PrintWriter outputLine = new PrintWriter(new FileWriter("Hello.txt", false))){
			for (int i = 0; i < lines.size(); i++) {
				outputLine.println(lines.get(i));
			}
		}
	}
}

