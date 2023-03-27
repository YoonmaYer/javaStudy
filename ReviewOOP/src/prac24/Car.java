package prac24;

public class Car {
    //Field
    private int speed;
    public boolean stop;

    //Method
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if(speed<0) {
            this.speed = speed;
            return;
        } else {
            this.speed = speed;
        }
    }
    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop) {
            speed = 0;
        }
    }
}
