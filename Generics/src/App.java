public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        GenericClass<String> generico = new GenericClass<String>("Ora questo è generico");
        System.out.println(generico.getData());

        GenericClass<Integer> genericoInteger = new GenericClass<Integer>(53);
        System.out.println(genericoInteger.getData());
    }
}
