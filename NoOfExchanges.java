
public class NoOfExchanges
{
     
       
     // Method to find maximum in arr[]
     static int exchanges(int arr[])
     {
         int i;
           int countSwap=0;
         // Initialize maximum element
         int max = arr[0];
       
         // Traverse array elements from second and
         // compare every element with current max  
         for (i = 1; i < arr.length; i++)
             if (arr[i] > max){
                 max = arr[i];
                 countSwap++;
             }
         return countSwap;
     }
}