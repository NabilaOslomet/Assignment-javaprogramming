
public class Assignment7 { 
  
    // Function for alternatively merging two strings 
    public static String flett(String s1, String s2) 
    { 
        int Length1= s1.length();
        int Length2=s2.length();
        // To store the final string 
        StringBuilder result = new StringBuilder();
        
  
        // For every index in the strings 
        if(Length1>Length2){
        for (int i = 0; i < Length2;  i++) { 
            
            
  
            // First choose the ith character of the 
            // first string if it exists 
            
                result.append(s1.charAt(i)).append(s2.charAt(i)); 
  
            // Then choose the ith character of the 
            // second string if it exists 
            
        }
        for (int j=Length2;j<Length1;j++){
            result.append(s1.charAt(j));
        }
        }
        if(Length1<=Length2){
        for (int i = 0; i < Length1;  i++) { 
            
            
  
            // First choose the ith character of the 
            // first string if it exists 
            
                result.append(s1.charAt(i)).append(s2.charAt(i)); 
  
            // Then choose the ith character of the 
            // second string if it exists 
            
        }
        for (int k=Length1;k<Length2;k++){
            result.append(s2.charAt(k));
        }
        }
  
  
        return result.toString(); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String s1 = "geeks234567"; 
        String s2 = "forge"; 
        String s3=s1.toUpperCase();
        String s4=s2.toUpperCase();
        System.out.println(flett(s3, s4)); 
    } 
} 
