import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {

    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap();

        gpaMap.put("scott", 2.2);
        gpaMap.put("udyr", 2.9);
        gpaMap.put("gage", 3.8);
        gpaMap.put("titus", 3.69);
        gpaMap.put("aaron", 0.08);
        gpaMap.put("keith", 3.86);

        Double scottGpa = gpaMap.get("scott");  // return double next to Scott 
        
        dump(gpaMap);
        System.out.println();

        // print all gpas that are 3.5 or greater
        Collection<Double> gpas = gpaMap.values();
        for (double gpa : gpas){
            if( gpa >= 3.5){
                System.out.println(gpa);
            }
        }
        for (var entry : gpaMap.entrySet()){
            if( entry.getValue() >= 2.75){      // var entry replaces entry.

                System.out.println(entry.getKey());
            }
        }

    }

    private static void dump(Map<String, Double> map) {
        for (Map.Entry<String,Double> entry : map.entrySet()){             // entry could be called "row"" too
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }

}