import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public record Point3D(int x, int y, int z) {}

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Set<Integer> numbers = new TreeSet<>(
        //     Set.of(1,5,3,4,9)
        // );

        // System.out.println(numbers);

        // Set<String> names = new TreeSet<>(
        //     Set.of("marco","andrea","francesco","barbara")
        // );

        // System.out.println(names);

        // class Point3DComparator implements Comparator<Point3D>{

        //     @Override
        //     public int compare(Point3D p1, Point3D p2) {
        //         return (p1.x() + p1.y() + p1.z()) - (p2.x() + p2.y() + p2.z());
        //     }
            
        // }

        Set<Point3D> points = new TreeSet<>(new Point3DComparator());

        points.add(new Point3D(3, 4, 5));
        points.add(new Point3D(1, 2, 6));
        points.add(new Point3D(5, 7, 4));

        System.out.println(points);

    }
}
