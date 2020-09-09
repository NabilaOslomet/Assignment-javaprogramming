
public class Assignment3 {
	  // Method to find number of different values
    public static int UlikeUSorted (int [] arr){
        int i, j;
        int res = 1;
        
        int len=arr.length;
        if (len == 0 || len == 1)
           return len;

      
        
      
        

   // Pick all elements one by one
   for ( i = 1; i < len; i++)  
   {
        
       for (j = 0; j < i; j++)
           if (arr[i] == arr[j])
               break;

        
       if (i == j)
           res++;
   }
   return res;
    }
      
    
    public static void main(String[] args)  
    {
        int myarray[]={45,9,80,7,5,4,3,3,2,2};
        System.out.println("The number of distinct element is " + UlikeUSorted(myarray));
       }
}
