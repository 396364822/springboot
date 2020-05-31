import java.util.HashMap;

public class WeightedRoundRobin {

    private static final HashMap<String,Integer> maps = new HashMap<>();

    private static HashMap<String,Weight> weightMaps = new HashMap<>();

    private static Integer totalWeight = 0;
    static {
        maps.put("A",5);
        maps.put("B",1);
        maps.put("C",1);
        totalWeight = 7;
    }

    public String getServer(){
        //初始化
        if(weightMaps.isEmpty()){
            maps.forEach((ip,weight)->{
                weightMaps.put(ip,new Weight(ip,weight,0));
            });
        }
        for(Weight weight : weightMaps.values()){
            weight.setDynamicWeight(weight.getWeight()+weight.getDynamicWeight());
        }
        Weight max = null;
        for(Weight weight : weightMaps.values()){
            if(max == null || weight.getDynamicWeight()>max.getDynamicWeight())
                max = weight;
        }
        max.setDynamicWeight(max.getDynamicWeight()-totalWeight);
        return max.getIp();
    }

    public static void main(String[] args) {
        WeightedRoundRobin w = new WeightedRoundRobin();
        for(int i=0; i<7; i++){
            System.out.println(w.getServer());
        }
    }
}
