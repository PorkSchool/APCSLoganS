import java.util.ArrayList;

class test {
    public static void main(String[] args){
        ArrayList<Double> aList = new ArrayList<Double>(3);
        aList.add(3.5);
        aList.add(4.3);
        aList.set(1, 12.3);
        aList.add(1, 18.9);
        //aList.remove(0,4.3);
        aList.remove(2);
        aList.set(0, -20.3);
        aList.add(24.8);
        
        System.out.println(aList.size());
    }
}