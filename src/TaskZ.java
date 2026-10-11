import java.util.Scanner;

public class TaskZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int lastTwoDigits = n % 100;
        int lastDigit = n % 10;
        String word;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            word = "bochek";
        } else if (lastDigit == 1) {
            word = "bochka";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            word = "bochki";
        } else {
            word = "bochek";
        }

        System.out.println(n + " " + word);
    }
}