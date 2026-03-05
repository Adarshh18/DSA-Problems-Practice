import java.util.*;

public class FindFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("No Factors");
            return;
        }

        num = Math.abs(num);

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.print(i + (i < num ? "," : ""));
        }
    }
}