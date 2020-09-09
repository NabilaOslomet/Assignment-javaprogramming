
import java.lang.*;
public class Assignment6
{
       
public static void rotation (char [] a,int k)
    {
        int n=a.length;
       
        // last= a[a.length-1];
        if(n==1 || n==0)
        {
            System.out.println(a);
            System.exit(0);
        }
       
       if(k>0){
       
       int i;
    for (i = 0; i <= k - 1; i++) {
        char temp=a[0];
        for(int j=0;j<n-1;j++){
        a[j] = a[j + 1];
        }
   a[n-1]=temp;
    }
            System.out.println(a);
       }
    if(k<0)
    {
        int y=Math.abs(k);
        for (int i = 0; i <=y-1; i++) {
            char temp = a[n - 1];
            for (int j = n - 1; j > 0; j--)
            {  a[j] = a[j - 1]; } a[0] = temp; }
System.out.println(a);

    }
   
   
    }
   
    
     public static void main(String[] args)  
     {
         char myarray[]={'A','B','C','D','E'};
          rotation(myarray,-2);
         
        }
 }    

