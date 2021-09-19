import java.util.*;

public class Homework1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int hap = 0;
        int number[] = new int[5];
        for(int i=0 ; i<5 ; i++)
        {
            System.out.printf("정수를 입력하세요: ");
            number[i] = scanner.nextInt();
            hap +=number[i];
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n",hap);
        }
    }
}
