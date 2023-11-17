public class Main {
    //Write a static method that takes a String and returns an integer. 
    //Return the number of characters, EXCLUDING spaces, in the passed in, String parameter.
    
    // public static int IntegerString(String inp){
        
    //     while(inp.indexOf(" ") != -1){
    //        inp.replace(" ", "");

    //     }
        
    //     int out = Integer.parseInt(inp);
    //     return out;
    // }

    public static int checkLength(String inp){
        int num = 0;
        for(int i = 0; i< inp.length(); i++){
            char theChar = inp.charAt(i);
            if(theChar != ' '){
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args){
        String output = "L O GA N";
        System.out.println(output);
        System.out.println(checkLength(output));
    }

}
