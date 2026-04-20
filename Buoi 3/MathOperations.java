public class MathOperations {

    public static double calculateRectanglePerimeter(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Lỗi: Chiều dài và chiều rộng phải lớn hơn 0");
        }
        return 2 * (a + b);
    }

    public static double calculateRectangleArea(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Lỗi: Chiều dài và chiều rộng phải lớn hơn 0");
        }
        return a * b;
    }

    public static String solveQuadratic(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Lỗi: Phương trình bậc 2 yêu cầu hệ số a khác 0");
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "Vô nghiệm";
        } else if (delta == 0) {
            return "Nghiệm kép x = " + (-b / (2 * a));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1) {
            throw new IllegalArgumentException("Lỗi: Tháng phải từ 1-12 và năm phải lớn hơn 0");
        }
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                }
                return 28;
            default:
                return 31;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("Lỗi: Số n phải lớn hơn 1 để kiểm tra nguyên tố");
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calculateAlternatingSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Lỗi: Tham số n yêu cầu là số nguyên dương");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    public static int findGCD(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Lỗi: Cả a và b đều phải là số nguyên dương");
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Lỗi: Không thể tính giai thừa cho số âm");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long calculateFactorialSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Lỗi: Tham số n yêu cầu là số nguyên dương");
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }
}