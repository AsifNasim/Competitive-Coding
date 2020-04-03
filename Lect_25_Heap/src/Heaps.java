import java.util.ArrayList;
public class Heaps {
    ArrayList<Integer> list = new ArrayList<>();
    public void insert(int value){
        list.add(value);
        upheap(list.size()-1);
    }

    private void upheap(int index) {
        if(index == 0){
            return;
        }
        int parent = parent(index);
        if(list.get(parent)> list.get(index)){
            swap(parent,index);
            upheap(parent);
        }
    }

    private void swap(int parent, int index) {
        int temp = list.get(parent);
        list.set(parent, list.get(index));
        list.set(index, temp);

    }

    public int parent(int index){
        return (index-1)/2;
    }

    public int leftChild(int index){
        return (2*index)+1;
    }

    public int rightChild(int index){
        return (2*index)+2;
    }

    public void display(){
        System.out.println(list);
    }

    public int remove() throws Exception {
        if(list.isEmpty()){
            throw new Exception("Khaali hai");
        }
        int temp = list.get(0);
        int lastVal = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,lastVal);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index) {
        int min = index;
        int left = leftChild(index);
        int right = leftChild(index);
        if(left< list.size() && list.get(min)>list.get(left) ){
            min = left;
        }

        if(right < list.size() && list.get(min) > list.get(right)){
            min = right;
        }

        if(min != index){
            swap(min, index);
        }
    }

}
