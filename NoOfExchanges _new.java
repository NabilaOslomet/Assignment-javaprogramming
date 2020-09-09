
public class NoOfExchanges
{
     
       
     // Method to find exchanges
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
     public static void main(String args[])
     {
        int a[]={1,2,3};
        int exchanges=exchanges(a);
        System.out.println(exchanges);
     }

}