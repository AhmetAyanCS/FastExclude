import java.util.ArrayList;

public class Node {
	
	private int ID;
	private ArrayList<Node> Neighbors;
	private ArrayList<Node> ShortestPath;	/*	Shortest paths for each node from source node	*/
	private ArrayList<Node> SecondShortestPath;	/*	Shortest paths for each node from source node	*/
	private int Distance;
	
	public Node(int id) {
		
		super();
		ID = id;
		Neighbors = new ArrayList<Node>();
		ShortestPath = new ArrayList<Node>();		
		Distance = 0;
	}	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public ArrayList<Node> getNeighbors() {
		return Neighbors;
	}

	public void addNeighbors(Node neighbor) {
		Neighbors.add(neighbor);
	}
	
	public void deleteNeighbors(Node neighbor) {
		Neighbors.remove(neighbor);
	}
	
	public ArrayList<Node> getShortestPath() {
		return ShortestPath;
	}

	public void setShortestPath(ArrayList<Node> shortestPath) {
		ShortestPath = shortestPath;
	}
	
	public ArrayList<Node> getSecondShortestPath() {
		return SecondShortestPath;
	}

	public void setSecondShortestPath(ArrayList<Node> secondShortestPath) {
		SecondShortestPath = secondShortestPath;
	}

	public int getDistance() {
		return Distance;
	}

	public void setDistance(int distance) {
		Distance = distance;
	}
}
