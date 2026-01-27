import javax.xml.stream.events.Characters;

public class questionTwo {
    public static void countOccurence(String word,String input){
     
            int length=0;
            int wordLength=word.length();
            int wordCount=0;
            while((length=input.indexOf(word.toLowerCase(), length))!= -1){
                wordCount++;
                length+=wordLength;
                System.out.println(length);
            }
            System.out.println(word+": "+wordCount);
        
    }
    public static void main(String[] args) {
        String word= "DAC";
        String input = "Wel come to CDAC it offers DAC in All CDAC centre.";
        countOccurence(word, input);
    }
}
