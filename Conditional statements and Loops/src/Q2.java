public class Q2 {
    public static void main(String[] args)
    {
        int sum_even = 0, sum_odd = 0;
        for (int i = 1; i <= 100; i++)
        {
            if (i % 2 == 0)
            {
                sum_even = sum_even + 1;
            }
            else
            {
                sum_odd = sum_odd + 1;
            }
        }
        System.out.println("Sum of even numbers: "+sum_even);
        System.out.println("Sum of odd numbers: "+sum_odd);
    }
}
