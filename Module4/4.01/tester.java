public class tester {
    // A large quantity of red and blue tokens are placed in a box. 
    // The chance of picking a red token is 20 percent. Write the section of code
    // to simulate randomly picking 10 tokens and reporting the color of each.
    public static void main(String[] args){
       
        double redChance = 0.20;
       int maxCoinFlips = 10;
       int counter = 0;
       
       while(counter < maxCoinFlips){
       
        counter++;

        double chance = Math.random();
        if(chance <= redChance) System.out.println(counter+": Red was Chosen");
        else System.out.println(counter+": Blue was Chosen");
       }
    }
}
