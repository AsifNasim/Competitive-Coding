import java.util.*;

public class AdjacencyListGraph<T> {
    LinkedList<Vertex> vertices;

    // Constructor
    public AdjacencyListGraph(){
        this.vertices = new LinkedList<>();
    }

    class Vertex{
        T value;
        LinkedList<Vertex> neighbours;
        public Vertex(T value){
            this.value = value;
            this.neighbours = new LinkedList<>();
        }
    }

    public void addEdge(T first, T second){
        Vertex f = get(first);
        Vertex s = get(second);
        if(f != null && s != null ){
            f.neighbours.add(s);
            s.neighbours.add(f);

        }

    }

    public void addVertex(T value){
        vertices.add(new Vertex(value));
    }

    private Vertex get(T value) {
        for (Vertex vertex:vertices) {
            if(vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
//        LinkedList<Vertex> head = vertex;
    }

    public void display(){
        for (Vertex vertex: vertices) {
            System.out.println(vertex.value+" =>");
            for (Vertex padosi: vertex.neighbours) {
                System.out.println(padosi.value+ ",");
            }
            System.out.println();
        }
    }

    public void BFS(){
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();
        Vertex first = vertices.get(0);
            visited.add(first);
            queue.add(first);

            while (!queue.isEmpty()){
                Vertex temp = queue.remove();
                System.out.println(temp.value);
                for (Vertex padosi:temp.neighbours) {
                    if(!visited.contains(padosi)){
                        visited.add(padosi);
                        queue.add(padosi);
                    }
                }
            }

    }
    public void DFT(){
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited = new HashSet<>();
        Vertex first = vertices.get(0);
        visited.add(first);
        stack.add(first);

        while (!stack.isEmpty()){
            Vertex temp = stack.pop();
            System.out.println(temp.value);
            for (Vertex padosi:temp.neighbours) {
                if(!visited.contains(padosi)){
                    visited.add(padosi);
                    stack.push(padosi);
                }
            }
        }

    }

//    public boolean bipartite(){
//        Queue<Vertex> visited = new LinkedList<>();
//        Set<Vertex> red = new HashSet<>();
//        Set<Vertex>green = new HashSet<>();
//        Vertex first = vertices.get(0);
////        .add(first);
////        visited.add(first);
////        re
//    }



}
