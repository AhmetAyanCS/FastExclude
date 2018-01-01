import java.util.ArrayList;

/*	Reference : http://www.baeldung.com/java-dijkstra	*/

public class Dijkstra {

	public ArrayList<Node> GetShortestPath(ArrayList<Node> Graph, ArrayList<Edge> Edges, Node source){
		
		ArrayList<Node> settledNodes = new ArrayList<Node>();
		ArrayList<Node> unsettledNodes = new ArrayList<Node>();
		
		source.setDistance(0);
		for(Node node : Graph){
			if(!node.equals(source))
				node.setDistance(Integer.MAX_VALUE);
		}
		
		unsettledNodes.add(source);
		
		while (unsettledNodes.size() != 0){
			Node currentNode = getLowestDistanceNode(unsettledNodes);
			unsettledNodes.remove(currentNode);
			for (Node neighbor: currentNode.getNeighbors()) {
		        Node adjacentNode = neighbor;
		        
		        Integer edgeWeight = 0;
		        for(Edge edge : Edges)		        	
		        	if(edge.getSource().equals(source) && edge.getTarget().equals(neighbor)){
		        		edgeWeight = edge.getWeight();
		        		break;
		        	}
		        
		        if (!settledNodes.contains(adjacentNode)) {
		        	CalculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
		            unsettledNodes.add(adjacentNode);
		        }
			}
		    settledNodes.add(currentNode);		
		}		
		return Graph;
	}
	
	private static Node getLowestDistanceNode(ArrayList<Node> unsettledNodes){
		
	    Node lowestDistanceNode = null;
	    int lowestDistance = Integer.MAX_VALUE;
	    for (Node node : unsettledNodes) {
	        int nodeDistance = node.getDistance();
	        if (nodeDistance < lowestDistance) {
	            lowestDistance = nodeDistance;
	            lowestDistanceNode = node;
	        }
	    }
	    return lowestDistanceNode;
	}
	
	private static void CalculateMinimumDistance(Node evaluationNode, Integer edgeWeigh, Node sourceNode){
		
		Integer sourceDistance = sourceNode.getDistance();
		
		if (sourceDistance + edgeWeigh < evaluationNode.getDistance()){
			evaluationNode.setDistance(sourceDistance + edgeWeigh);
			ArrayList<Node> shortestPath = new ArrayList<>(sourceNode.getShortestPath());
			shortestPath.add(sourceNode);
			evaluationNode.setShortestPath(shortestPath);
		}
	}
}