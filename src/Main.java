import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point> points = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Point point = new Point();
            point.x = scanner.nextInt();
            point.y = scanner.nextInt();
            point.z = Math.sqrt(point.x * point.x + point.y * point.y);
            points.add(point);
        }
        Collection.sort(points);
        Point furtherestPoint = points.get(n - 1);
        System.out.println(furtherestPoint.x + " " + furtherestPoint.y);
    }
}

class Point implements Comparable<Point> {
    int x;
    int y;
    double z;
    public int compareTo(Point other){
        double a = this.z = other.z;
        if(a < 0){
            return -1;
        }
        else if(a > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}