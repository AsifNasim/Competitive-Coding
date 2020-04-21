import java.util.*;

public class adjcListGraph<T> {
    LinkedList<Vertex> vertices;
    public adjcListGraph(){
        this.vertices = new LinkedList<>();
    }
    class Vertex{
        T value;
        LinkedList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours = new LinkedList<>();
        }
    }

    public void addVertex(T value){
        vertices.add(new Vertex(value));
    }
    public void addEdge(T first, T second){
        Vertex F = get(first);
        Vertex S = get(second);
        if(F != null && S != null){
            F.neighbours.add(S);
            S.neighbours.add(F);
        }
    }

    public Vertex get(T vertex){
        Vertex target = null;
        LinkedList<Vertex> head = vertices;
        for (Vertex list: head ) {
            if(list.value.equals(vertex)){
                return list;
            }
        }
        return null;
    }

    public void display(){
        for (Vertex vertex: vertices) {
            System.out.print(vertex.value+"=>");
            for (Vertex padosi: vertex.neighbours ) {
                System.out.print(padosi.value);
            }
            System.out.println();
        }
    }

    public void BFT() {
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();
//          for connected components
//        for (Vertex vertex: vertices) {
//            if(visited.contains(vertex)){
//                continue;
//            }
//        queue.add(vertex);
//        visited.add(vertex);
//
        Vertex first = vertices.get(0);
        queue.add(first);
        visited.add(first);
        while (!queue.isEmpty()) {
            Vertex temp = queue.remove();
            System.out.println(temp.value);
            for (Vertex vertex : temp.neighbours) {
                if (!visited.contains(vertex)) {
                    queue.add(vertex);
                    visited.add(vertex);
                }
            }
        }
//    }
    }

    public void ConnectedComponentsBFT() {
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();
//          for connected components
        for (Vertex vertex: vertices) {
            if(visited.contains(vertex)){
                continue;
            }
        queue.add(vertex);
        visited.add(vertex);

//      Vertex first = vertices.get(0);
//        queue.add(first);
//        visited.add(first);
        while (!queue.isEmpty()) {
            Vertex temp = queue.remove();
            System.out.println(temp.value);
            for (Vertex padosi : temp.neighbours) {
                if (!visited.contains(padosi)) {
                    queue.add(padosi);
                    visited.add(padosi);
                }
            }
        }
    }
    }



    public void DFT(){
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited = new HashSet<>();
        Vertex first = vertices.get(0);
        stack.push(first);
        visited.add(first);
        while (!stack.isEmpty()){
            Vertex temp = stack.pop();
            System.out.println(temp.value);
            for (Vertex padosi: temp.neighbours) {
                if (!visited.contains(padosi)){
                    stack.push(padosi);
                    visited.add(padosi);
                }
            }
        }
    }


    public void DFS(){
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited = new HashSet<>();
        Vertex first = vertices.get(0);
        stack.push(first);
        visited.add(first);
        while (!stack.isEmpty()){
            Vertex temp = stack.pop();
//            System.out.println(temp.value);
//            if (temp.value.equals(first))
            for (Vertex padosi: temp.neighbours) {
                if (!visited.contains(padosi)){
                    stack.push(padosi);
                    visited.add(padosi);
                }
            }
        }
    }


}
