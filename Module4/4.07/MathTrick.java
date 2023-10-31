public class MathTrick{
    //a. Generate a random 3-digit number so that the first and third digits differ by more than one.
    public static String RandomNumberString(int length){
        String output = "";
        int oneDigit = 1;
        int twoDigit = 2;
        int threeDigit = 3;
        for(int i = 0; i < length; i++){
            int ranDigit = (int)((Math.random()*9));
            if(i == 0){
                oneDigit = ranDigit;
            }
            else if(i == 1){
                twoDigit = ranDigit;
            }else if(i == 2){
                threeDigit = ranDigit;
            }
            while(threeDigit == oneDigit + 1 || threeDigit == oneDigit - 1){
                threeDigit = (int)((Math.random()*9));
            }
        }
        output = String.valueOf(oneDigit)+String.valueOf(twoDigit)+String.valueOf(threeDigit);
        return output;
    }
    //b. Now reverse the digits to form a second number.
    public static String StringReverser(String inp){
        char[] inpArray = inp.toCharArray();
        
        char tempChar = inpArray[0];
        inpArray[0] = inpArray[inp.length()- 1];
        inpArray[inp.length()- 1] = tempChar;
    
        String output = new String(inpArray);
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
        String out = RandomNumberString(3);
        int outInt = Integer.parseInt(out);
        System.out.println("Non Reversed: " +out);

        //B Reverse
        String out2 = StringReverser(out);
        int out2Int = Integer.parseInt(out2);
        System.out.println("Reversed: " + out2);

        //c. Subtract the smaller number from the larger one.
        String out3 = "";
        int out3Int = 0;
        if(outInt > out2Int){
            out3Int = outInt -= out2Int;
        }else{
            out3Int = out2Int -= outInt;
        }
        out3 = String.valueOf(out3Int);
        System.out.println("Larger number subtracted from smaller number: "+out3);

        //d. Now reverse the digits in the answer you got in step c and add it to that number.
        String out4 = StringReverser(out3);
        int out4Int = Integer.parseInt(out4);
        out3Int += out4Int;
        out3 = String.valueOf(out3Int);
        System.out.println("Step C reversed and added to this number: "+ out3);

        //e. Multiply by one million.
        out3Int *= 1000000;
        out3 = String.valueOf(out3Int);
        System.out.println("Muliply the last number by a million: "+ out3);

        //f. Subtract 733,361,573.
        out3Int -= 733361573;
        out3 = String.valueOf(out3Int);
        System.out.println("Subtract the last number by 733,361,573: "+ out3);

        
        //g. Then, replace each of the digits in your answer, 
        //with the letter it corresponds to using the following table:
        String out6 = StringReplacer(out3);
        System.out.println("Replace Values: "+ out6);
    }
}