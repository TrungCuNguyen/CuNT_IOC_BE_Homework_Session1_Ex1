package exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        Float radius = sc.nextFloat();
        Double PI = 3.14159265359;
        Double area = PI * radius * radius;
        System.out.printf("Diện tích hình tròn là: %.2f", area);
    }
}
