import java.util.Arrays;

public class HelloWorld{
    public static void main(String[] args) {
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);
        System.out.println("Ciao, benvenuti al primo programma Java!");

        // String stringa = new String("stringa");

        // int[] array = new int[5];

        // array[0] = 1;
        // array[1] = 2;
        // array[2] = 3;
        // array[3] = 4;
        // array[4] = 5;
        //array[5] = 1; out of bound

        int[] array2 = {1,2,3,4,5};

        for (int ciccia : array2) {
            System.out.println(ciccia);
        }

        Arrays.toString(args);

        // array2[5] = 7;

        // int j = null;

        // Integer i = null;

    }
}