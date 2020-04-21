public class adjListClient {
    public static void main(String[] args) {
        adjcListGraph<String> graph = new adjcListGraph<>();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("C", "D");
        graph.BFT();
        graph.display();

    }
}
