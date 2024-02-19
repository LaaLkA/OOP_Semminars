package Main.clients.old;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Mathematics m = (a, b) -> a + b;
        Mathematics x = Double::sum; // lambda функция
        System.out.println(x.add(10, 12));
    }
}

interface Mathematics {
    double add(double a, double b);
}

class Calculator {

    static Map<Character, Calculable> map = new HashMap<>();

    static {
        map.put('+', arr -> arr[0] + arr[1]);
        map.put('-', arr -> arr[0] - arr[1]);
        map.put('*', arr -> arr[0] * arr[1]);
        map.put('/', arr -> arr[0] / arr[1]);
        map.put('f', arr -> Math.sqrt(arr[0]));
        map.put('^', arr -> Math.pow(arr[0], arr[1]));
    }

    public static void main(String... args) {
        System.out.println(calculate1('*', 4, 10));
    }

    public static double calculate(char op, double x, double y) {
        if (op == '+') return x + y;
        if (op == '-') return x - y;
        if (op == '*') return x * y;
        else throw new UnsupportedOperationException("Не реализуется");
    }

    public static double calculate1(char op, double ... arr){
        return map.get(op).calc(arr);
    }
}

interface Calculable {
    double calc(double ... arr);
}
