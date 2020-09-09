
public class Assignment5 {
	   
    // Method for rotation
    
        public static void rotation (char [] a)
   {
       int n=a.length;
       char last= a[a.length-1];
       if(n==1 || n==0)
       {
           System.out.println(a);
           System.exit(0);
       }
      
      
      for(int j = a.length-1; j > 0; j--){    
               //Shift element of array by one    
               a[j] = a[j-1];    
           }    
           a[0]=last;
           System.out.println(a);
   }
    
      
    // Driver method
    public static void main(String[] args)  
    {
        char myarray[]={'A','B','C','D','E'};
         rotation(myarray);
        
       }
}
