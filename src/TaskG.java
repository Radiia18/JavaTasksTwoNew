import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chips = scanner.nextInt();

        boolean possible = chips >= 4 && chips % 4 == 0;
        System.out.println(possible ? "YES" : "NO");
    }
}