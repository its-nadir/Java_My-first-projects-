import java.util.Scanner;
import java.util.Calendar;

class Test {
    public static void main(String[] args) {
        System.out.print("Enter Your Birth Year: ");

        Scanner scanner = new Scanner(System.in);
        int birthYear = scanner.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;

        System.out.println("Your Age Is " + age + " Years Old.");

        scanner.close();
    }}
