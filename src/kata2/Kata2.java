package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {7,2,8,2,10,22,4,7,7,2,1,6,4,4732,13,4,89,2,7,8};
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        
       
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
            
        }
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());

        }
    }
    
}
