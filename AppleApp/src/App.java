import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // List<Apple> apples = List.of(
        //     new Apple(Color.GREEN),
        //     new Apple(Color.RED),
        //     new Apple(Color.GREEN),
        //     new Apple(Color.RED),
        //     new Apple(Color.GREEN),
        //     new Apple(Color.RED),
        //     new Apple(Color.GREEN),
        //     new Apple(Color.RED)
        // );

        List<Apple> apples = List.of(
            new Apple(Color.GREEN, 120),
            new Apple(Color.RED, 170),
            new Apple(Color.YELLOW, 150),
            new Apple(Color.RED, 110),
            new Apple(Color.GREEN, 89),
            new Apple(Color.YELLOW, 75),
            new Apple(Color.YELLOW, 180),
            new Apple(Color.RED, 115),
            new Apple(Color.GREEN, 89),
            new Apple(Color.RED, 75),
            new Apple(Color.GREEN, 180),
            new Apple(Color.RED, 115)
        );


        // List<Apple> greenApples = filterGreenApples(apples);

        // for(Apple apple : greenApples){
        //     System.out.println(apple.getColor());
        // }

        // List<Apple> redApples = filterRedApples(apples);

        // for(Apple apple : redApples){
        //     System.out.println(apple.getColor());
        // }

        // List<Apple> redApples = filterApples(apples, Color.RED);

        // for(Apple apple : redApples){
        //     System.out.println(apple.getColor());
        // }

        // List<Apple> applesbyWeight = filterApplesByWeight(apples, 150);

        // for(Apple apple : applesbyWeight){
        //     System.out.println(apple.getWeight());
        // }

        // List<Apple> redApples = filterApples(apples, new AppleRedColorPredicate());
        // List<Apple> greenApples = filterApples(apples, new AppleGreenColorPredicate());
        // List<Apple> lightApples = filterApples(apples, new AppleLightPredicate());
        // List<Apple> heavyApples = filterApples(apples, new AppleWeightPredicate());

        // System.out.println("Red Apples");
        // for(Apple apple : redApples){
        //     System.out.println(apple.getColor());
        // }
       
        // System.out.println("Green Apples");
        // for(Apple apple : greenApples){
        //     System.out.println(apple.getColor());
        // }
       
        // System.out.println("Light Apples");
        // for(Apple apple : lightApples){
        //     System.out.println(apple.getWeight());
        // }
       
        // System.out.println("Heavy Apples");
        // for(Apple apple : heavyApples){
        //     System.out.println(apple.getWeight());
        // }

        // ApplePredicateInterface redAppleLambda = (Apple a) -> a.getColor().equals(Color.RED);
        // ApplePredicateInterface greenAppleLambda = (Apple a) -> a.getColor().equals(Color.GREEN);
        // ApplePredicateInterface lightAppleLambda = (Apple a) -> a.getWeight() <= 150;
        // ApplePredicateInterface heavyAppleLambda = (Apple a) -> a.getWeight() > 150;

        // List<Apple> redApples = filterApples(apples, redAppleLambda);
        // List<Apple> greenApples = filterApples(apples, greenAppleLambda);
        // List<Apple> lightApples = filterApples(apples, lightAppleLambda);
        // List<Apple> heavyApples = filterApples(apples, heavyAppleLambda);


        List<Apple> redApples = filterApples(apples, (Apple a) -> a.getColor().equals(Color.RED));
        List<Apple> greenApples = filterApples(apples, (Apple a) -> a.getColor().equals(Color.GREEN));
        List<Apple> lightApples = filterApples(apples, (Apple a) -> a.getWeight() <= 150);
        List<Apple> heavyApples = filterApples(apples, (Apple a) -> a.getWeight() > 150);
        List<Apple> yellowApples = filterApples(apples, (Apple a) -> a.getColor().equals(Color.YELLOW));
        List<Apple> yellowApplesAndHeavy = filterDoubleApples(apples, (Apple a) -> a.getColor().equals(Color.YELLOW), (Apple a) -> a.getWeight() > 150);
        // List<Apple> yellowApplesAndHeavy2 = filterApples(apples, (Apple a)->{
        //                                                                         return a.getColor().equals(Color.YELLOW) && a.getWeight()>150;
        //                                                                     }
                                                        // );
        List<Apple> yellowApplesAndHeavy2 = filterApples(apples, (Apple a)->a.getColor().equals(Color.YELLOW) && a.getWeight()>150);

        System.out.println("Red Apples");
        for(Apple apple : redApples){
            System.out.println(apple.getColor());
        }
       
        System.out.println("Green Apples");
        for(Apple apple : greenApples){
            System.out.println(apple.getColor());
        }
       
        System.out.println("Light Apples");
        for(Apple apple : lightApples){
            System.out.println(apple.getWeight());
        }
       
        System.out.println("Heavy Apples");
        for(Apple apple : heavyApples){
            System.out.println(apple.getWeight());
        }

        System.out.println("Yellow Apples");
        for(Apple apple : yellowApples){
            System.out.println(apple.getColor());
        }

        System.out.println("Yellow Apples and Heavy");
        for(Apple apple : yellowApplesAndHeavy2){
            System.out.println(apple.getColor() + " " + apple.getWeight());
        }

    }

    // public static List<Apple> filterGreenApples(List<Apple> apples){
    //     List<Apple> result = new ArrayList<>();

    //     for(Apple apple : apples){
    //         if(apple.getColor().equals(Color.GREEN)){
    //             result.add(apple);
    //         }
    //     }

    //     return result;
    // }

    // public static List<Apple> filterRedApples(List<Apple> apples){
    //     List<Apple> result = new ArrayList<>();

    //     for(Apple apple : apples){
    //         if(apple.getColor().equals(Color.RED)){
    //             result.add(apple);
    //         }
    //     }

    //     return result;
    // }

    // public static List<Apple> filterApples(List<Apple> apples, Color color){
    //     List<Apple> result = new ArrayList<>();

    //     for(Apple apple : apples){
    //         if(apple.getColor().equals(color)){
    //             result.add(apple);
    //         }
    //     }

    //     return result;
    // }

    // public static List<Apple> filterApplesByWeight(List<Apple> apples, int weight){
    //     List<Apple> result = new ArrayList<>();

    //     for(Apple apple : apples){
    //         if(apple.getWeight() > weight){
    //             result.add(apple);
    //         }
    //     }

    //     return result;
    // }

    // public static List<Apple> filterApples(List<Apple> apples, ApplePredicateInterface predicate) {
    //     List<Apple> result = new ArrayList<>();

    //     for (Apple apple : apples) {
    //         if (predicate.test(apple)) {
    //             result.add(apple);
    //         }
    //     }

    //     return result;
    // }

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static List<Apple> filterDoubleApples(List<Apple> apples, Predicate<Apple> predicate, Predicate<Apple> predicate2) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : apples) {
            if (predicate.test(apple) || predicate2.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }
}
