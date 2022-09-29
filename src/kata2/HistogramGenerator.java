package kata2;

import java.util.HashMap;
import java.util.Map;

class HistogramGenerator {
    private final int[] data;

    public HistogramGenerator(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    public Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < this.data.length; i++) {
            map.put(data[i],map.containsKey(data[i])? 
                            map.get(data[i])+1:1);
            
        }
        return map;
    }
}
