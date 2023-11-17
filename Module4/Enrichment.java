public class Enrichment {

public static int ageInMonths(int age){
    if(age > 0){
      return age * 12; 
    }else{
      System.out.print("Please Provide a valid age greater then 0: ");
      return -1;
    }
}

  public static String lastCharacters (String word) {

    String last2 = word.substring(word.length()-2); 

    return "The last two characters in the word "+word+" are: "+ last2;
  }
  public static void main(String[] args) {
    System.out.println(ageInMonths(17));
    System.out.println(ageInMonths(0));
  }
}
