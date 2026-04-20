public class MathOperations {

    public static double calculateRectanglePerimeter(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Loi: Chieu dai va chieu rong phai lon hon 0");
        }
        return 2 * (a + b);
    }

    public static double calculateRectangleArea(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Loi: Chieu dai va chieu rong phai lon hon 0");
        }
        return a * b;
    }

    public static String solveQuadratic(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Loi: Phuong trinh bac 2 yeu cau he so a khac 0");
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "Vo nghiem";
        } else if (delta == 0) {
            return "Nghiem kep x = " + (-b / (2 * a));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1) {
            throw new IllegalArgumentException("Loi: Thang phai tu 1-12 va nam phai lon hon 0");
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
            throw new IllegalArgumentException("Loi: So n phai lon hon 1 de kiem tra nguyen to");
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
            throw new IllegalArgumentException("Loi: Tham so n yeu cau la so nguyen duong");
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
            throw new IllegalArgumentException("Loi: Ca a va b deu phai la so nguyen duong");
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
            throw new IllegalArgumentException("Loi: Khong the tinh giai thua cho so am");
        }
        if (n > 20) {
            throw new IllegalArgumentException("Loi: n qua lon, vuot gioi han bo nho cua kieu long (n <= 20)");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long calculateFactorialSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Loi: Tham so n yeu cau la so nguyen duong");
        }
        if (n > 20) {
            throw new IllegalArgumentException("Loi: n qua lon, vuot gioi han bo nho cua kieu long (n <= 20)");
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }
}