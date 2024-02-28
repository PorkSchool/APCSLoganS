public class Launcher{
    
    
    // 2. Determine the fruit you will be using during the contest. Then create two classes: 
    // one to implement your catapult object and the other to
    // test it. The class names are your choice.

    //Watermelons and Oranges

    // 3. Calculate the distance for ONE throw of the Catapult, representing 
    // a single instance of the class. One distance calculation uses a single
    // speed and single angle sent into the Catapult class.
    
    private double distance;
    private double gravity = 9.81;
    public double GetDistance(){
        return distance;
    }
    public void SetDistance(double _d){
        distance = _d;
    }

    
    // (See expected output).
    
    
    // 5. Review the distance calculation below.
    // distance = (speed * speed) * sin(2 * radians(angle)) / gravity
    
    
    // 6. For more information about calculating projectile trajectories, 
    // review the Background Information section below.
    
    
    // 7. Look up the toRadians() and the sin() and other useful methods 
    // in the Java API for the Math class. The sin() method parameter
    // must be in radians.
    
    
    // 8. Take time to plan your project. The program must use OOP design.
    
    
    // 9. Determine the range of speeds and angles to use for the table. 
    // Use at least five speeds and six angles. Speeds can be in MPH or KPH, so
    // be sure to label the output accordingly. Assign the speeds and angles to one-dimensional arrays.
    public Launcher(){}

    public double calcDistance(int speed, int angle){
        distance = (speed * speed) * Math.sin(2 * Math.toRadians(angle)) / gravity;
        return RoundToTwo(distance);
    }

    public double RoundToTwo(double val){
        return Math.round(val * 100.0)/100.0;
    }
}