import javax.xml.stream.events.Characters;

public class questionOne{
    public static void countOccurence(String[] stringArray,String input){
        for(String word: stringArray){
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
    }
    public static void main(String[] args) {
        String[] stringArray= {"Car","Truck"};
        String input = "I have 2 Car one is Baleno Car and other is Farari Car but Truck is used for transportation.";
        countOccurence(stringArray, input.toLowerCase());
    }
}