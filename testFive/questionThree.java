import javax.xml.stream.events.Characters;

public class questionThree {
    public static void checkPalindrome(String name){
        int low=0;
        int high=name.length()-1;
        boolean flag=true;
        while(low<high){
            while(!Character.isLetter(name.charAt(low))){
                low++;
            }
            while(!Character.isLetter(name.charAt(high))){
                high--;
            }
            if(name.charAt(low)!=name.charAt(high)){
                flag=false;
                break;
            }
            low++;
            high--;
        }

        if(flag){
            System.out.println("Palindrome "+name);
        }
        else{
            System.out.println("Not Palindrome"+name);
        }
        
    }
    public static void main(String[] args) {
        String name="Akram Marka";
        checkPalindrome(name.toLowerCase());
    }
}
