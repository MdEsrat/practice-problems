public class Max {
   public static void main(String[] args){
       int a = 10;
       int b = 5;
       int c = max(a,b);
       System.out.println("The Max num is: "+c);
   }
   public static int max(int n1, int n2){
       int max_value;
       if(n1 > n2)
           max_value = n1;
       else
           max_value = n2;
       return max_value;
   }

}
