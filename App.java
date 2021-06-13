import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class App {

    private String output = "HEYYYYY";
    private 



    public static void main(String[] args) throws Exception {
        

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(output);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        
        
        System.out.println("SYSTEM EXIT"); //DEBUG
    }
}
