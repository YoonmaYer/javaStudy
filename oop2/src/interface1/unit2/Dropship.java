package interface1.unit2;

public class Dropship extends AirUnit implements Repairable{
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Dropship";
    }
}
