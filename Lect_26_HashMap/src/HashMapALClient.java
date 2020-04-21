public class HashMapALClient {
    public static void main(String[] args) {
        HashMapUsingAL map = new HashMapUsingAL();

        map.put("Apple", "Theek");
        map.put("Mango ", "Bekaar");
        map.put("Orange", "Sabse Bekaar");
        map.put("Banana", "mast se bhi mast");

        System.out.println(map.get("Apple"));
        System.out.println(map.get("Mango"));
        System.out.println(map.get("Orange"));
        System.out.println(map.get("Banana"));
        System.out.println();

    }
}
