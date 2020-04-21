import java.util.HashMap;

public class hashMapeg {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Apple", "Awesome");
        map.put("Orange","Sahi Hai");
        map.put("Mango", "Sweetest");
        System.out.println(map);
        for (String string:map.keySet()
             ) {
            System.out.println(string);
        }

        for (String string:map.values()
             ) {
            System.out.println(string);
        }

        map.remove("Apple");

        for (String string:map.keySet()
        ) {
            System.out.println(string);
        }

        // String compression
        System.out.println(frequency("aabbaa"));


        }
    public static HashMap<Character, Integer> frequency(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+ 1);
            }
            else{
                map.put(ch,1);
            }

        }
        return map;
    }
}
