package javaHomeWork.Polymorphism;

import java.util.Scanner;

/**
 * @author clam
 * @version 1.8
 * @date 2021/6/18 9:27
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Staff staff = new Staff();
        Scanner in = new Scanner(System.in);

        System.out.println("请输入员工的工资");
        double a = manager.pay(in.nextInt());
        System.out.println("请输入经理的工资");
        double b = staff.pay(in.nextInt());

        System.out.println("员工涨后工资为" + b);
        System.out.println("经理涨后工资为" + a);
    }
}
