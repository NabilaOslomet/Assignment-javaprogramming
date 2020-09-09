
public class Assignment10 {
 
    // Returns true if s1 is substring of s2
    static boolean contained(
        String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();
 
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            int j;
 
            /* For current index i, check for
            pattern match */
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j)
                    != s1.charAt(j))
                    break;
 
            if (j == M)
                return true;
        }
 
        return false;
    }
 
    /* Driver program to test above function */
    public static void main(String args[])
    {
        String s1 = "lfor";
        String s2 = "geeksforgeeks";
        String s3=s1.toUpperCase();
        String s4=s2.toUpperCase();
 
        boolean res = contained(s3, s4);
 
        if (res == false)
            System.out.println("Not present");
        else
            System.out.println(
                "Present");
    }
} 
