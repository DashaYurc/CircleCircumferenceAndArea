package lv.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the circle's radius: ");

        Circle circle = new Circle();
        circle.setRadius(scan.nextFloat());
        scan.close();

        System.out.println("The circle's circumference is: " + circle.getCircumference());
        System.out.println("The circle's area is: " + circle.getArea());

    }
}
