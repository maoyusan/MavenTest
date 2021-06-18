package javaHomeWork.Polymorphism;

/**
 * @author clam
 * @version 1.8
 * @date 2021/6/18 9:31
 */
public class Staff implements Pay {
    int money;

    @Override
    public double pay(int money) {
        return money * 0.1 + money;
    }

}
