import java.util.*;

public class MaxMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of semester: ");
        int sem = sc.nextInt();

        for (int i = 1; i <= sem; i++) {
            System.out.print("Enter no of subjects in semester " + i + ": ");
            int sub = sc.nextInt();

            int max = Integer.MIN_VALUE;

            System.out.println("Enter marks:");
            for (int j = 0; j < sub; j++) {
                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    return;
                }
                max = Math.max(max, mark);
            }

            System.out.println("Maximum mark in semester " + i + ": " + max);
        }
    }
}