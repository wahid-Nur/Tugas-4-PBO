public class Method{
   
   public static void main(String[] args){
      int a = 6;
      int b = 9;
      int c = minFunction(a,b);
      System.out.println("nilai terkecil = " + c);
   }

   public static int minFunction(int n1, int n2) {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;
      return min; 
   }
}