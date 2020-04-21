import java.util.LinkedList;

public class HashMapLL {
    LinkedList<Entity> entities = new LinkedList<>();
    public void put(String  key, String value){
        for (Entity entity: entities
             ) {
        if(entity.key.equals(key)){
            entity.value = value;
            return;
        }
        }
        entities.add((new Entity(key, value)));
    }

    public String remove(String key){
        Entity target = null;
        for (Entity entity: entities
             ) {
            if(entity.key.equals(key)){
                target = entity;
                break;
            }

        }
        String temp = target.value;
        entities.remove(target);
        return temp;
    }

    public String get(String key){
        for (Entity entity:entities
             ) {
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    class Entity{
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }


}
