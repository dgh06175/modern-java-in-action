package chap02.printapple;

import java.util.ArrayList;
import java.util.List;

public class PrintApple {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(200, "red"));
        inventory.add(new Apple(50, "blue"));
        inventory.add(new Apple(150, "orange"));
        inventory.add(new Apple(1000, "yellow"));

        prettyPrintApple(inventory, new AppleInfoFormat());
        prettyPrintApple(inventory, new AppleWeightFormat());
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter appleFormatter) {
        for(Apple apple: inventory) {
            String output = appleFormatter.makeString(apple);
            System.out.println(output);
        }
    }
}
