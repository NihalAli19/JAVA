import java.util.ArrayList;
public class Q1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("110");
        list.add("10");
        list.add("786");
        list.add("abc");

        int sum = 0;
        int count = 0;
        boolean hasValidInput = false;

        try {
            for (String number : list) {
                if (number == null || number.isEmpty()) {
                    throw new Exception("List is null or empty");
                }

                try {
                    int num = Integer.parseInt(number);
                    sum += num;
                    count++;
                    hasValidInput = true;
                }
                catch (NumberFormatException e) {

                }
            }
            if (!hasValidInput) {
                throw new Exception("List contains only invalid integers (non-numeric values)");
            }

            float average = sum / count;
            System.out.println("The average is: "+average);
        }
        catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
