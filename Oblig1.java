package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
    	int len = a.length;
    	int temp;
        if(len == 0){
        	
            throw new java.util.NoSuchElementException();
        }
        if (len==1) {
        	//System.out.println(a[0]);
        	return a[0];
        }
        
       
for(int i=0;i<len-1;i++)
{
    if(a[i]>a[i+1])
    {
      temp=a[i];
     a[i]=a[i+1];
     a[i+1]=temp;
    }
}
       //System.out.println(a[len-1]);
       return a[len-1];
        //throw new UnsupportedOperationException();
    }

    public static int ombyttinger(int[] a) {
        //throw new UnsupportedOperationException();
    	int len = a.length;
    	int noofswaps=0;
        if(len==0){
            throw new NoSuchElementException();
        }
        int temp;
       
for(int i=0;i<len-1;i++)
{
    if(a[i]>a[i+1])
    {
      temp=a[i];
     a[i]=a[i+1];
     a[i+1]=temp;
     noofswaps++;
    }
}
      System.out.println(noofswaps); 
       return noofswaps;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
    	int i, j;
        int res = 0;
        
        int len=a.length;
		
		  if (len == 0 || len==1) { 
			  System.out.println(len);
		  return len;}
		 
           //throw new UnsupportedOperationException();

       for ( i = 1; i < len; i++)

           // Unsorted pair found
           if (a[i - 1] > a[i])
               throw new IllegalStateException();

       // Pick all elements one by one
   for ( i = 0; i < len; i++)  
   {
        
       for (j = 0; j < i; j++)
           if (a[i] == a[j])
               break;

        
       if (i == j)
           res++;
   }
   System.out.println(res);
   return res;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
    	 int res = 0; 
    	  int n= a.length;
    	 // System.out.println(res);
    	  if(n==0 || n==1) {
    		  //System.out.println("Zero Length Table");
    		  //return 0;
    		  System.out.println(n);
    		  //throw new UnsupportedOperationException();
    		  //System.out.println("Empty Table");
    		  return n;
    	  }
    	  
    	  
    		  
        // Pick all elements one by one 
        for (int i = 0; i < n; i++)  
        { 
            int j = 0; 
            for (j = 0; j < i; j++) 
                if (a[i] == a[j]) 
                    break; 
      
            // If not printed earlier,  
            // then print it 
            if (i == j) {
                res++;} 
             
        } 
        System.out.println(res);    
       return res; 
        
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
    	//throw new UnsupportedOperationException();
    	int left=0;
    	  int right=0;
    	  
    	  if(a.length==0 || a.length==1) {
    		  //throw new UnsupportedOperationException();
    		  //System.out.println("Do not do anything");
    		  return;
    	  }
    	  //int sorted[]= new int[arr.length];
    	  for (int i = 0; i < a.length; i++) {
    	   
    		  if((Math.abs(a[i]%2))==1)
    	  {
    	    left++;
    	   }
    		  if((a[i]%2)==0)
    			   {
    			    right++;
    			    }
    		  }
				
    		 int odd[] =new int[left];
    		 int even[]=new int[right];
    		// int merge[]=new int[a.length];
    		 int j=0;int k=0;int temp=0;
    			 for(int i=0;i<a.length;i++) {
    			 if(Math.abs(a[i]%2)==1) {
    				 odd[j]=a[i];
    				 j++;
    				 //System.out.println(odd[i]);
    			 }}
    			 for (int i = 0; i < odd.length; i++) 
    		        {
    		            for ( j = i + 1; j < odd.length; j++) { 
    		                if (odd[i] > odd[j]) 
    		                {
    		                    temp = odd[i];
    		                    odd[i] = odd[j];
    		                    odd[j] = temp;
    		                }
    		            }
    		        }
    			 for(int i=0;i<a.length;i++) {
    				 if((a[i]%2)==0) {
    					 even[k]=a[i];
    					 k++;
    					 //System.out.println(odd[i]);
    				 }}
    			 for (int i = 0; i < even.length; i++) 
    		        {
    		            for ( j = i + 1; j < even.length; j++) { 
    		                if (even[i] > even[j]) 
    		                {
    		                    temp = even[i];
    		                    even[i] = even[j];
    		                    even[j] = temp;
    		                }
    		            }
    		        }
    			 int pos = 0;
    		        for (int element : odd) {
    		            a[pos] = element;
    		            pos++;
    		        }

    		        for (int element : even) {
    		            a[pos] = element;
    		            pos++;
    		        }


    	   
    	   

    	  System.out.println("Array after separating even and odd numbers : ");
    	  
    	  for (int i = 0; i < a.length; i++) {
    		  //a[i]=merge[i];
    	   System.out.print(a[i]+"\n ");
    	  // System.out.println(left);
    	  // System.out.println(right);
    	  }
    }
    public static void quickSort(int[] arr, int start, int end){
   	 
        int partition = partition(arr, start, end);

        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];

        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }
    

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
                
        
        if( a.length==0)
        {
        	
           return; 
        }
       if(a.length==1) {
    	   System.out.println("Single length string");
       }
       char last= a[a.length-1];
       
       for(int j = a.length-1; j > 0; j--){    
                //Shift element of array by one    
                a[j] = a[j-1];    
            }    
            a[0]=last;
            System.out.println(a);
            

    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
		/*
		 * int n=a.length;
		 * 
		 * // last= a[a.length-1]; if( n==0) { throw new
		 * UnsupportedOperationException(); }
		 * 
		 * if(k>0){
		 * 
		 * int i; for (i = 0; i <= k - 1; i++) { char temp=a[0]; for(int j=0;j<n-1;j++){
		 * a[j] = a[j + 1]; } a[n-1]=temp; } System.out.println(a); } if(k<0) { int
		 * y=Math.abs(k); for (int i = 0; i <=y-1; i++) { char temp = a[n - 1]; for (int
		 * j = n - 1; j > 0; j--) { a[j] = a[j - 1]; } a[0] = temp; }
		 * System.out.println(a);
		 * 
		 * }
		 */
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
		/*
		 * //throw new UnsupportedOperationException(); int Length1= s.length(); int
		 * Length2=t.length(); // To store the final string StringBuilder result = new
		 * StringBuilder();
		 * 
		 * 
		 * // For every index in the strings if(Length1>Length2){ for (int i = 0; i <
		 * Length2; i++) {
		 * 
		 * 
		 * 
		 * // First choose the ith character of the // first string if it exists
		 * 
		 * result.append(s.charAt(i)).append(t.charAt(i));
		 * 
		 * // Then choose the ith character of the // second string if it exists
		 * 
		 * } for (int j=Length2;j<Length1;j++){ result.append(s.charAt(j)); } }
		 * if(Length1<=Length2){ for (int i = 0; i < Length1; i++) {
		 * 
		 * 
		 * 
		 * // First choose the ith character of the // first string if it exists
		 * 
		 * result.append(s.charAt(i)).append(t.charAt(i));
		 * 
		 * // Then choose the ith character of the // second string if it exists
		 * 
		 * } for (int k=Length1;k<Length2;k++){ result.append(t.charAt(k)); } }
		 * 
		 * 
		 * return result.toString();
		 */
    	throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
    	int M = a.length();
        int N = b.length();
        if (M==0 ||N==0) {
        	System.out.println("Empty Strings");
        }
 
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            int j;
 
            /* For current index i, check for
            pattern match */
            for (j = 0; j < M; j++)
                if (b.charAt(i + j)
                    != a.charAt(j))
                    break;
 
            if (j == M)
            	//System.out.println("Contains the string");
                return true;
        }
 
        return false;
        
    }

}  // Oblig1
