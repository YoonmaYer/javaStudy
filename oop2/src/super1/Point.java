package super1;

public class Point {
    int x= 10 ,y = 20;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        return "x: " + x + ", y" + y;
    }
}
