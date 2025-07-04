public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        GenClass gen = new GenClass();
        gen.<String>print("Ciao");
        gen.<Integer>print(100);

        System.out.println(gen.<String>returnTypeGeneric("Sono la funzione con il return!"));

        System.out.println(gen.returnTypeGeneric(200));
    }
}
