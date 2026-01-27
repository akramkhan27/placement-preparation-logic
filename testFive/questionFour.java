public class questionFour {
    public static void countWords(String sentence){
        char[] characters=sentence.toCharArray();
        int eof=sentence.length()-1;
        boolean isword=false;
        int countWord=0;
        for(int i=0; i <= eof; i++){
            if(Character.isLetter(characters[i]) && i!=eof){
                isword=true;
            }
            else if(!Character.isLetter(characters[i]) && isword){
                isword=false;
                countWord++;
            }else if(Character.isLetter(characters[i]) && i==eof){
                countWord++;
            }
        }
        System.out.println("Word : "+countWord);
    }
    public static void main(String[] args) {
        String sentence="I have 2 Car one is Baleno Car and other is Farari Car but Truck is used for transportation";
        countWords(sentence.toLowerCase());
    }
}
