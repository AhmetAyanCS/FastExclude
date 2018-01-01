import java.util.ArrayList;

public class AllPaths {

	private ArrayList<Node> Path;
	private Node Source;
	private Node Target;
	private int Distance;
	
	public AllPaths(ArrayList<Node> path, Node source, Node target, int distance){
		
		super();
		Path = path;
		Source = source;
		Target = target;
		Distance = distance;		
	}
	
	public ArrayList<Node> getPath() {
		return Path;
	}

	public void setPath(ArrayList<Node> path) {
		Path = path;
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

	public int getDistance() {
		return Distance;
	}

	public void setDistance(int distance) {
		Distance = distance;
	}
}
