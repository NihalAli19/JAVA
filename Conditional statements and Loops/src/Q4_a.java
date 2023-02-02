import java.util.Scanner;
public class Q4_a {
    public static void main(String[] args)
    {
        int n,marks, pass = 0,fail = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students for which you want to process grade for: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the marks of student: ");
            marks = sc.nextInt();

            if (marks >= 60)
            {
                pass++;
            }
            else
            {
                fail++;
            }
        }
        System.out.println("The number of students passed are: "+pass);
        System.out.println("The number of students failed are: "+fail);

    }
}
