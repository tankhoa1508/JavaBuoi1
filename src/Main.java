import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static int inputNumber(String name) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int value = 0;
        while (!validInput) {
            try {
                float a = 0;
                double b = 0;
                System.out.printf("Nhập %s của bạn: ", name);
                value = scanner.nextInt();
                scanner.nextLine();
                validInput = true; // Nếu nhập hợp lệ, thoát vòng lặp
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next(); // Xóa bỏ dữ liệu không hợp lệ khỏi scanner
            }


        }
        return value;
    }

        public static void nhapXuat(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên của bạn: ");
            String name= scanner.nextLine();
            int age=0;
            int height=0;
            age= inputNumber("tuổi");
            height = inputNumber("chiều cao");

            System.out.println("Tên: " +name);
            System.out.println("Chiều cao: "+height+ "m");
            scanner.close();
        }

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

    public static void main(String[] args) {
//            nhapXuat();
        HinhChuNhat a = new HinhChuNhat(4,5 );
        System.out.println("Dài = "+a.dai);
        System.out.println("Rộng = "+a.rong);
        System.out.println("Chu vi là: "+a.ChuVi());
        System.out.println("Diện tích là: "+a.DienTich());
        }

        // Nhập một số thực
//        System.out.print("Nhập chiều cao của bạn (mét): ");
//        double height = scanner.nextDouble();
//
//        // Hiển thị thông tin đã nhập
//        System.out.print("Tên: " + name);
//        System.out.print("Chiều cao: " + height + " mét");


//        int a=2, b=3;
//        System.out.println("a + b = "+(a+b));
//        System.out.println("a - b = "+(a-b));
//        System.out.println("a x b = "+(a*b));
//        System.out.println("a % b = "+(a%b));
//        System.out.println("a / b = "+(float)a/b);
//        System.out.println("a / b = "+a/(float)b);
//        System.out.println("a / b = "+a/(double)b);
//        System.out.println("a / b = "+a*1.0/b);
//        System.out.println("a / b = "+a/(b*1.0));
//
//        System.out.println("sum= " + Sum(2,3));

        // Đóng đối tượng Scanner
//        scanner.close();

}