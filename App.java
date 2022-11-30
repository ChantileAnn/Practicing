public class App
{
   public static void main(String[] args) {
       System.out.println("   September 2022");
       System.out.println(" S  M  T  W  T  F  S");
       int breakNumber = 1;
       for(int i = -3; i <= 30; i++) {
           if(i <= 0) {
               System.out.print("   ");
           }
           else {
               System.out.print(" "+ i + ((i < 10) ? " " : ""));
           }
           if(breakNumber == 7) {
               System.out.println();
               breakNumber = 0;
           }
           breakNumber++;
       }
   }
}
