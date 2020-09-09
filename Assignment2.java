
public class Assignment2 {
	// Method to find number of different values
    public static int numberDifferentSorted (int [] arr){
        int i, j;
        int res = 1;
        
        int len=arr.length;
        if (len == 0 || len == 1)
           return len;

       for ( i = 1; i < len; i++)

           // Unsorted pair found
           if (arr[i - 1] > arr[i])
               throw new IllegalStateException("The array is not sorted");

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
        int myarray[]={1,2,6,6,7};
        System.out.println("The number of distinct element is " + numberDifferentSorted(myarray));
       }
}
