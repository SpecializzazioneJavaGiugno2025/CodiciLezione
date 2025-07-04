public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        GenericPair<String, Integer> pair1 = new GenericPair<String,Integer>("Ciao", 5);
        System.out.println("I parametri della classe sono: " + pair1.getParam1() + " " + pair1.getParam2());

        GenericPair<Double, Integer> pair2 = new GenericPair<Double,Integer>(234.5, 5);
        System.out.println("I parametri della classe sono: " + pair2.getParam1() + " " + pair2.getParam2());
    }
}
