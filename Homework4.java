import java.util.*;

public class Homework4 {
    static int gcd(int m, int n)
    {

        if (m==0)
        {
            return m;
        }
        else if(m%n == 0)
        {
            return n;
        }
        else
        {
            m = m%n;
            return gcd(n,m);
        }

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a,b,dab;
        a = scanner.nextInt();
        b = scanner.nextInt();

        dab = gcd(a,b);
        System.out.printf("%d",dab);

    }
}
