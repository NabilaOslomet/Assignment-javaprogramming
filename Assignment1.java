
import java.util.NoSuchElementException ;
public class Assignment1 {
 
    // Returns true if s1 is substring of s2
    static int findMax(int a[])
    {
        int len = a.length;
        if(len==0){
            throw new NoSuchElementException("Empty array");
        }
        int temp;
       
for(int i=0;i<len-1;i++)
{
    if(a[i]>a[i+1])
    {
      temp=a[i];
     a[i]=a[i+1];
     a[i+1]=temp;
    }
}
       
       return a[len-1];
    }
 
    /* Driver program to test above function */
    public static void main(String args[])
    {
       int a[]={2};
       int max=findMax(a);
       System.out.println(max);
    }
}