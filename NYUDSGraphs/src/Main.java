import ch10.graphs.WeightedGraph;

public class Main {

	public static void main(String[] args) {
		WeightedGraph<String> mygraph = new WeightedGraph<String>();
		String[] vertices = {"A","B","C","D","E"};
		for (int i =0; i<vertices.length; i++) {
			mygraph.addVertex(vertices[i]);
		}
		for (int i =0; i<vertices.length-1; i++) {
			int weight = Math.abs(vertices[i].charAt(0) - vertices[i+1].charAt(0));
			mygraph.addEdge(vertices[i],vertices[i+1],weight);
		}
		System.out.println(mygraph.edgeExists("A","B"));
		 System.out.println(mygraph.hasVertex("A")); 
		 System.out.println(mygraph.weightIs("D","E")); 
	}

}
