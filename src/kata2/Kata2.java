package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        //Integer[] data = {7,2,8,2,10,22,4,7,7,2,1,6,4,4732,13,4,89,2,7,8};
        String[] data ={"","","","","Hola","Que","Que","Tal","Tal","Tal",""};
        HistogramGenerator<String> histogramGenerator = new HistogramGenerator(data);
        Map<String,Integer> histogram = histogramGenerator.getHistogram();
        
       
        for (Map.Entry<String,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());

        }
        
    }
    
}
