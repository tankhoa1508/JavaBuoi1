import java.util.Scanner;

public class BoiSo {
    public static int calculateLifePathNumber(int day, int month, int year) {
        int sum = day + month + year;
        return reduceToSingleDigit(sum);
    }

    // Phương thức rút gọn số đến chữ số duy nhất hoặc số thầy phong
    private static int reduceToSingleDigit(int number) {
        while (number > 9 && number != 11 && number != 22 && number != 33) {
            number = sumOfDigits(number);
        }
        return number;
    }

    // Phương thức tính tổng các chữ số
    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ngày sinh (dd): ");
        int day = sc.nextInt();

        System.out.print("Nhập tháng sinh (mm): ");
        int month = sc.nextInt();

        System.out.print("Nhập năm sinh (yyyy): ");
        int year = sc.nextInt();

        int lifePathNumber = calculateLifePathNumber(day, month, year);
        System.out.println("Số của bạn là: " + lifePathNumber);
    }
}
