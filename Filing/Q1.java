import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        String name;
        ArrayList<String> names = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name: ");
            name = sc.nextLine();
            names.add(i, name);
        }

        File file = new File("C:\\Users\\NihalAli\\Desktop\\User Names.txt");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            for (String Username : names) {
                bw.write(Username);
                bw.write("\n");
            }
            bw.close();

            System.out.println("Data successfully written in file.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        file.delete();
        System.out.println("File deleted successfully!");

    }
}
