import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		String file = "aaa.txt";
		BufferedReader reader = null;
		String line = "";

		try {
			reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {
				String[] row = line.split(",");

				for (String index : row) {
					System.out.print(index);
					// System.out.printf("%-10s",index);
				}
				System.out.println();

			}

		} catch (Exception e) {
			// System.out.println(e);
			e.printStackTrace();
		}
	}	
}
