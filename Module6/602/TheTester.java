public class TheTester {
    public static void main(String[] args){
        String[] mascots = { "Knights", "Seminoles", "Bulls", "Gators" };
int n = -1;
String str = "";

for (String m : mascots)
{
   n = m.indexOf("l") + 2;
   str += m.substring(n);
}
System.out.println(str);
    }
}
