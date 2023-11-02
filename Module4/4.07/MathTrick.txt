public class MathTrick{
    //a. Generate a random 3-digit number so that the first and third digits differ by more than one.
    public static String RandomNumberString(int length){

        int ranDigit = (int)((Math.random()*900)+100);
        int oneDigit = ranDigit%10;
        int threeDigit = ranDigit/100;

        while(threeDigit == oneDigit + 1 || threeDigit == oneDigit - 1){
            ranDigit = (int)((Math.random()*900)+100);     
            oneDigit = ranDigit%10;
            threeDigit = ranDigit/100;   
        }

        return String.valueOf(ranDigit);
    }
    //b. Now reverse the digits to form a second number.
    public static String NumberReverser(String inp){
 
        int og = Integer.parseInt(inp);
        int output = 0;
        while(og>0){

            output *= 10;
            int lastDigit = og%10;
            output += lastDigit;
            og/=10;
        }

        return String.valueOf(output);
    }

    public static String StringReverser(String inp){
        String output = "";
        for(int i = inp.length(); i > 0; i--){
            String letter = inp.substring(i -1, i);
            output+=letter;
            letter = "";
        }
        return output;
    }
    //variable before step g.
    public static String StringReplacer(String inp){

        char[] inpArray = inp.toCharArray();
        for(int i = 0; i<inpArray.length; i++){
            switch(inpArray[i]){
                case '0':
                    inpArray[i] = 'Y';
                    break;
                case '1':
                    inpArray[i] = 'M';
                    break;
                case '2':
                    inpArray[i] = 'P';
                    break;
                case '3':
                    inpArray[i] = 'L';
                    break;
                case '4':
                    inpArray[i] = 'R';
                    break;
                case '5':
                    inpArray[i] = 'O';
                    break;
                case '6':
                    inpArray[i] = 'F';
                    break;
                case '7':
                    inpArray[i] = 'A';
                    break;
                case '8':
                    inpArray[i] = 'I';
                    break;
                case '9':
                    inpArray[i] = 'B';
                    break;
                default:
                    System.out.println("This is not a number value");
                    break;
            }
        }

        String out = new String(inpArray);
        return out;
    }
    //g. Then, replace each of the digits in your answer, with the letter it corresponds to using the following table:
    // 0 --> Y
    // 1 --> M
    // 2 --> P
    // 3 --> L
    // 4 --> R
    // 5 --> O
    // 6 --> F
    // 7 --> A
    // 8 --> I
    // 9 --> B

    public static void main(String[] args){
        
        //Hint: since replaceLtr is expecting a String, you should use String.valueOf(number) to create a String variable from the integer
        //h. Now reverse the letters in the string to read your message backward.
        //A Create
        String randomNumber = RandomNumberString(3);
        int randomInt = Integer.parseInt(randomNumber);
        System.out.println("Original Number: " +randomNumber);

        //B Reverse
        String reversedNumber = NumberReverser(randomNumber);
        int reversedInt = Integer.parseInt(reversedNumber);
        System.out.println("Reversed Number: " + reversedNumber);

        //c. Subtract the smaller number from the larger one.
        String subtractedString = "";
        int subtractedValue = 0;
        if(randomInt > reversedInt){
            subtractedValue = Math.abs(randomInt - reversedInt);
        }else{
            subtractedValue = Math.abs(reversedInt - randomInt);
        }
        subtractedString = String.valueOf(subtractedValue);
        System.out.println("Larger number subtracted from smaller number: "+subtractedString);

        //d. Now reverse the digits in the answer you got in step c and add it to that number.
        String reverseSubtract = NumberReverser(subtractedString);
        int reverseSubInt = Integer.parseInt(reverseSubtract);
        
        subtractedValue += reverseSubInt;
        subtractedString = String.valueOf(subtractedValue);
        
        System.out.println("Reversed number added to diffrence: "+ subtractedString);

        //e. Multiply by one million.
        subtractedValue *= 1000000;
        subtractedString = String.valueOf(subtractedValue);
        System.out.println("Muliply the last number by a million: "+ subtractedString);

        //f. Subtract 733,361,573.
        subtractedValue -= 733361573;
        subtractedString = String.valueOf(subtractedValue);
        System.out.println("Subtract the last number by 733,361,573: "+ subtractedString);

        
        //g. Then, replace each of the digits in your answer, 
        //with the letter it corresponds to using the following table:
        String finalValue = StringReplacer(subtractedString);
        System.out.println("Replace Values: "+ finalValue);

        
        System.out.println("Reversed value: "+ StringReverser(finalValue));
    }
}