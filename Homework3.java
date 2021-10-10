import java.util.*;

public class Homework3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int highest,lowest,N;

        System.out.println("몇 개의 수를 입력할 예정인가요? ");
        N = scanner.nextInt();

        int[] Arr = new int[N];

        System.out.println("수를 입력하세요:");
        for(int i=0; i<N; i++)
            Arr[i] = scanner.nextInt();

        highest = Arr[0];
        lowest = Arr[0];

        for(int i=0; i<N; i++)//최대값 최소값 최신화
        {
            if(highest < Arr[i])
            {
                highest = Arr[i];
            }
            if(lowest > Arr[i])
            {
                lowest = Arr[i];
            }
        }

        System.out.printf("최대값:%d\n최소값:%d",highest,lowest);
    }
}
