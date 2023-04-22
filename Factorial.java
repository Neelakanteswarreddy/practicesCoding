class Factorial{
    public static int Fact(int x)
     {
          int fact=1;
        for (int i = 0; i <=x; i++) 
         {
  	      fact=fact*x;
  	   }
	       return fact;
     }
 public static void main(String... args)
  {
    int a=10;
     int s=Fact(a);
     System.out.println(s);
   }
}

   