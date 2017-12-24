
public class Edge {
	
	private Node Source;
	private Node Target;
	private int Weight;
	
	public Edge(Node source, Node target, int weight){
		
		super();
		Source = source;
		Target = target;
		Weight = weight;
		
	}

	public Node getSource() {
		return Source;
	}

	public void setSource(Node source) {
		Source = source;
	}

	public Node getTarget() {
		return Target;
	}

	public void setTarget(Node target) {
		Target = target;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}
}
