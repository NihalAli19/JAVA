import java.io.*;

public class Q2 {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\NihalAli\\Desktop\\Nihal Ali.txt"));
            bw.write("Nihal Ali\n");
            bw.write("University Student(freshman)");
            System.out.println("Written to file successfully!");
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\NihalAli\\Desktop\\Nihal Ali.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\n");

                for (int i = 0; i < data.length; i++) {
                    System.out.println("\n"+data[i]);
                }
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
