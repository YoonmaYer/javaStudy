package interface1.unit2;

public class Tank extends GroundUnit implements Repairable{
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
}
