import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=== HỆ THỐNG KIỂM THỬ BÀI TOÁN ===");
            System.out.println("1. Tính chu vi hình chữ nhật");
            System.out.println("2. Tính diện tích hình chữ nhật");
            System.out.println("3. Giải phương trình bậc 2");
            System.out.println("4. Tính số ngày của một tháng");
            System.out.println("5. Kiểm tra số nguyên tố");
            System.out.println("6. Tính tổng S = 1 - 2 + 3 - 4 + ... + n");
            System.out.println("7. Tìm UCLN của a và b");
            System.out.println("8. Tính tổng S = 1! + 2! + ... + n!");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng (0-8): ");
            
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Nhập chiều dài: ");
                        double l1 = scanner.nextDouble();
                        System.out.print("Nhập chiều rộng: ");
                        double w1 = scanner.nextDouble();
                        System.out.println("Kết quả: " + MathOperations.calculateRectanglePerimeter(l1, w1));
                        break;
                    case 2:
                        System.out.print("Nhập chiều dài: ");
                        double l2 = scanner.nextDouble();
                        System.out.print("Nhập chiều rộng: ");
                        double w2 = scanner.nextDouble();
                        System.out.println("Kết quả: " + MathOperations.calculateRectangleArea(l2, w2));
                        break;
                    case 3:
                        System.out.print("Nhập hệ số a: ");
                        double a = scanner.nextDouble();
                        System.out.print("Nhập hệ số b: ");
                        double b = scanner.nextDouble();
                        System.out.print("Nhập hệ số c: ");
                        double c = scanner.nextDouble();
                        System.out.println("Kết quả: " + MathOperations.solveQuadratic(a, b, c));
                        break;
                    case 4:
                        System.out.print("Nhập tháng: ");
                        int month = scanner.nextInt();
                        System.out.print("Nhập năm: ");
                        int year = scanner.nextInt();
                        System.out.println("Kết quả: " + MathOperations.getDaysInMonth(month, year));
                        break;
                    case 5:
                        System.out.print("Nhập n: ");
                        int n5 = scanner.nextInt();
                        System.out.println("Kết quả: " + (MathOperations.isPrime(n5) ? "Là số nguyên tố" : "Không phải số nguyên tố"));
                        break;
                    case 6:
                        System.out.print("Nhập n: ");
                        int n6 = scanner.nextInt();
                        System.out.println("Kết quả: " + MathOperations.calculateAlternatingSum(n6));
                        break;
                    case 7:
                        System.out.print("Nhập a: ");
                        int a7 = scanner.nextInt();
                        System.out.print("Nhập b: ");
                        int b7 = scanner.nextInt();
                        System.out.println("Kết quả: " + MathOperations.findGCD(a7, b7));
                        break;
                    case 8:
                        System.out.print("Nhập n: ");
                        int n8 = scanner.nextInt();
                        System.out.println("Kết quả: " + MathOperations.calculateFactorialSum(n8));
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
            System.out.println();
        }
        scanner.close();
    }
}