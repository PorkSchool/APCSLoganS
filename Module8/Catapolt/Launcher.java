public class Launcher{
    private double distance;
    public double GetDistance(){
        return distance;
    }
    public void SetDistance(double _d){
        distance = _d;
    }
    public Launcher(){}

    public double calcDistance(int speed, int angle){
        distance = (Math.pow(speed, 2) * Math.sin( 2 * Math.toRadians(angle)) / 9.81);
        return RoundToTwo(distance);
    }

    public double RoundToTwo(double val){
        return Math.round(val * 100.0)/100.0;
    }
}