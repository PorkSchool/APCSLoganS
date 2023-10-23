public class test {
    public static void main(String[] args){
        int c = 2;
int d = 0;
while (c <= 10)
{
   d = 1;
   while (d < c)
   {
      d++;
   }
   c += d;
}
System.out.println(c);  
    }
    
}

