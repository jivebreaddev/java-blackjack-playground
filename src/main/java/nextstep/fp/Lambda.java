package nextstep.fp;

import java.util.List;

public class Lambda {
    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        numbers.forEach(value -> System.out.println(value));
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");

        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();
    }
    public static int sumConditional(List<Integer> numbers, Conditional conditional){
        return numbers.stream().filter(x -> conditional.test(x)).reduce(0, (x,y) -> x+y);
    }
    public static int sumAll(List<Integer> numbers) {
        return sumConditional(numbers, x -> true);
    }

    public static int sumAllEven(List<Integer> numbers) {
        return sumConditional(numbers, x -> x % 2 == 0);
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        return sumConditional(numbers, x -> x > 3);
    }
}
