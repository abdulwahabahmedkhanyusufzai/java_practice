import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class iuexcept {
    public static void main(String[] args) {
        // We declare the reader outside try so we can close it in finally
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter a number: ");
            String input = br.readLine(); // readLine() throws IOException (Checked)

            int num = Integer.parseInt(input); // throws NumberFormatException (Unchecked)
            System.out.println("You entered: " + num);

        } catch (IOException e) {
            System.out.println("Input/Output error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Validation Error: Please enter a valid integer.");
        } finally {
            try {
                // Good practice: always close your streams
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}