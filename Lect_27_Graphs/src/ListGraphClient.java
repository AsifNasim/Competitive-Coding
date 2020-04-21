public class ListGraphClient {
    public static void main(String[] args) {
        AdjacencyListGraph<String> list = new AdjacencyListGraph<>();

        list.addVertex("A");
        list.addVertex("B");
        list.addVertex("C");
        list.addVertex("D");

        list.addEdge("A", "B");

        list.display();
    }

}
