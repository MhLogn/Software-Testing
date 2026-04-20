import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=== HE THONG KIEM THU BAI TOAN ===");
            System.out.println("1. Tinh chu vi hinh chu nhat");
            System.out.println("2. Tinh dien tich hinh chu nhat");
            System.out.println("3. Giai phuong trinh bac 2");
            System.out.println("4. Tinh so ngay cua mot thang");
            System.out.println("5. Kiem tra so nguyen to");
            System.out.println("6. Tinh tong S = 1 - 2 + 3 - 4 + ... + n");
            System.out.println("7. Tim UCLN cua a va b");
            System.out.println("8. Tinh tong S = 1! + 2! + ... + n!");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang (0-8): ");
            
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Nhap chieu dai: ");
                        double l1 = scanner.nextDouble();
                        System.out.print("Nhap chieu rong: ");
                        double w1 = scanner.nextDouble();
                        System.out.println("Ket qua: " + MathOperations.calculateRectanglePerimeter(l1, w1));
                        break;
                    case 2:
                        System.out.print("Nhap chieu dai: ");
                        double l2 = scanner.nextDouble();
                        System.out.print("Nhap chieu rong: ");
                        double w2 = scanner.nextDouble();
                        System.out.println("Ket qua: " + MathOperations.calculateRectangleArea(l2, w2));
                        break;
                    case 3:
                        System.out.print("Nhap he so a: ");
                        double a = scanner.nextDouble();
                        System.out.print("Nhap he so b: ");
                        double b = scanner.nextDouble();
                        System.out.print("Nhap he so c: ");
                        double c = scanner.nextDouble();
                        System.out.println("Ket qua: " + MathOperations.solveQuadratic(a, b, c));
                        break;
                    case 4:
                        System.out.print("Nhap thang: ");
                        int month = scanner.nextInt();
                        System.out.print("Nhap nam: ");
                        int year = scanner.nextInt();
                        System.out.println("Ket qua: " + MathOperations.getDaysInMonth(month, year));
                        break;
                    case 5:
                        System.out.print("Nhap n: ");
                        int n5 = scanner.nextInt();
                        System.out.println("Ket qua: " + (MathOperations.isPrime(n5) ? "La so nguyen to" : "Khong phai so nguyen to"));
                        break;
                    case 6:
                        System.out.print("Nhap n: ");
                        int n6 = scanner.nextInt();
                        System.out.println("Ket qua: " + MathOperations.calculateAlternatingSum(n6));
                        break;
                    case 7:
                        System.out.print("Nhap a: ");
                        int a7 = scanner.nextInt();
                        System.out.print("Nhap b: ");
                        int b7 = scanner.nextInt();
                        System.out.println("Ket qua: " + MathOperations.findGCD(a7, b7));
                        break;
                    case 8:
                        System.out.print("Nhap n: ");
                        int n8 = scanner.nextInt();
                        System.out.println("Ket qua: " + MathOperations.calculateFactorialSum(n8));
                        break;
                    default:
                        System.out.println("Lua chon khong hop le.");
                }
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
            }
            System.out.println();
        }
        scanner.close();
    }
}