import java.util.Scanner;

public class CungHoangDao {
    public static String Cung(int day, int month) {
        if (month==1) {
            return (day<=19) ? "Ma Kết" : "Bảo Bình";
        } else if (month==2) {
            return (day<=18) ? "Bảo Bình" : "Song Ngư";
        }
        else if (month==3) {
            return (day<=20) ? "Song Ngư" : "Bạch Dương";
        }
        else if (month==4) {
            return (day<=19) ? "Bạch Dương" : "Kim Ngưu";
        }
        else if (month==5) {
            return (day<=20) ? "Kim Ngưu" : "Song Tử";
        }
        else if (month==6) {
            return (day<=20) ? "Song Tử" : "Cự Giải";
        }
        else if (month==7) {
            return (day<=22) ? "Cự Giải" : "Sư Tử";
        }
        else if (month==8) {
            return (day<=22) ? "Sư Tử" : "Xử Nữ";
        }
        else if (month==9) {
            return (day<=22) ? "Xử Nữ" : "Thiên Bình";
        }
        else if (month==10) {
            return (day<=22) ? "Thiên Bình" : "Bọ Cạp";
        }
        else if (month==11) {
            return (day<=21) ? "Bọ Cạp" : "Nhân Mã";
        }
        else if (month==12) {
            return (day<=21) ? "Nhân Mã" : "Ma Kết";
        }else {
            return "Ngày hoặc tháng không hợp lệ";
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ngày sinh (dd): ");
        int day = sc.nextInt();

        System.out.print("Nhập tháng sinh (mm): ");
        int month = sc.nextInt();

        System.out.println("Cung của bạn là: " + Cung(day, month));
    }
}
