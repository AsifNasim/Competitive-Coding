import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapUsingAL{
    class Entity{
        String key;
        String value;
        public Entity(String key, String value){
            this.key= key;
            this.value = value;
        }
    }
    private int size = 0;
    private float lf = 0.5f;

    //  load factor = size/ entity size;


    ArrayList<LinkedList<Entity>> map = new ArrayList<>();

    public HashMapUsingAL(){
        for (int i = 0; i < 100; i++) {
            map.add(new LinkedList<>());
        }
    }

    public void put(String key, String value){
        if((float)size/ map.size()> lf){
            rehash();
        }
        int hashCode = Math.abs(key.hashCode()%map.size());
        LinkedList<Entity> list = map.get(hashCode);

        for (Entity entity: list) {
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }

        list.add(new Entity(key, value));
        size++;
    }

    private void rehash() {
        ArrayList<LinkedList<Entity>> old = map;
        map = new ArrayList<>();
        for (int i = 0; i < old.size()*2; i++) {
            map.add(new LinkedList<>());
        }

        size = 0;
        for (LinkedList<Entity> list: old) {
            for (Entity entity: list) {
                put(entity.key, entity.value);
            }
        }
    }

    public String get(String key){

        int hashcode = Math.abs(key.hashCode()%map.size());
        LinkedList<Entity> list = map.get(hashcode);

        for (Entity entity: list) {

            if(entity.key.equals(key)){
                return entity.value;
            }

        }

        return null;
    }

    public void remove(String key){
        int hashcode = Math.abs(key.hashCode()%map.size());
        Entity target = null;
        LinkedList<Entity> list = map.get(hashcode);
        for (Entity entity: list) {
            if(entity.key.equals(key)){
                target = entity;
                size--;
                break;
            }
        }
        list.remove(target);
    }

}