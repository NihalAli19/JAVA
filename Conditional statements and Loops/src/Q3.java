public class Q3 {
    public static void main(String[] args)
    {
        System.out.println("Numbers divisible by 3 are: ");
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0)
            {
                System.out.print("  "+i);
            }
        }
        System.out.println("\nNumbers divisible by 5 are: ");
        for (int i = 1; i <= 100; i++)
        {
            if (i % 5 == 0)
            {
                System.out.print("  "+i);
            }
        }
        System.out.println("\nNumbers divisible by (3 and 5) both are: ");
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.print("  "+i);
            }
        }
    }
}
