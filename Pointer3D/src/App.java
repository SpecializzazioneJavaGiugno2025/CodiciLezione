import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        
        // Set<Pointer3D> points = Set.of(
            //     new Pointer3D(10, 10, 5),
            //     // new Pointer3D(10, 10, 5),
            //     new Pointer3D(20, 10, 5),
            //     new Pointer3D(30, 10, 5),
            //     new Pointer3D(40, 10, 5)
            // );
            
        Set<Pointer3D> points = new HashSet<>(
            Set.of(
                new Pointer3D(10, 10, 5),
                new Pointer3D(10, 10, 5),
                new Pointer3D(20, 10, 5),
                new Pointer3D(30, 10, 5),
                new Pointer3D(40, 10, 5)
            )
        );

        // points.add(new Pointer3D(50, 10, 5));

        // System.out.println(points.toString());

        // System.out.println("Equals e hasCode \n");
        // Pointer3D point1 = new Pointer3D(10, 10, 5);
        // Pointer3D point2 = new Pointer3D(10, 10, 5);

        // System.out.println(point1.equals(point2));

        // System.out.println(point1.hashCode());
        // System.out.println(point2.hashCode());

        // points.add(new Pointer3D(50, 10, 5));
        

    }
}
