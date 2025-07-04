import java.util.Comparator;

class Point3DComparator implements Comparator<App.Point3D>{

    @Override
    public int compare(App.Point3D p1, App.Point3D p2) {
        int sum1 = p1.x() + p1.y() + p1.z();
        int sum2 = p2.x() + p2.y() + p2.z();
        return Integer.compare(sum1,sum2);
    }
    
}