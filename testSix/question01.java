import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class question01 {
    public static void main(String[] args) {
        String[] arr= { "A", "B", "C", "D", "E", "F", "F", "G", "A" };
        HashMap<String,Integer> map= new HashMap<>();
        for(String s:arr){
            map.put(s,map.getOrDefault(s, 0)+1);
        }
        System.out.println(map.getOrDefault("A",0));
    }
}
