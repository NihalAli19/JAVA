import java.io.*;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        String designation, permissions;

        Scanner sc = new Scanner(System.in);

        File file = new File("C:\\Users\\NihalAli\\Desktop\\Confidential.txt");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            System.out.println("Enter your designation: ");
            designation = sc.next();
            bw.write(designation);

            if (designation.equals("Faculty")) {
                file.setReadable(true);
                file.setWritable(true);
                file.setExecutable(true);
            }
            else if (designation.equals("Student")) {
                file.setReadable(true);
                file.setWritable(false);
            }
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
    }
}
