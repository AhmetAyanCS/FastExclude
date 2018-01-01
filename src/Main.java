import java.util.ArrayList;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		int limit = 3;	/*	Maximum distance from source node to target node	*/
		
		ArrayList<Node> Graph = new ArrayList<Node>();
		ArrayList<Edge> Edges = new ArrayList<Edge>();
		
		/*	Creating nodes	*/
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);	
		
		/*	Creating edges	*/
		
		Edge edge1 = new Edge(node1, node2, 1);
		Edge edge2 = new Edge(node1, node8, 1);
		Edge edge3 = new Edge(node1, node9, 1);
		Edge edge4 = new Edge(node2, node1, 1);
		Edge edge5 = new Edge(node2, node3, 1);
		Edge edge6 = new Edge(node2, node4, 1);
		Edge edge7 = new Edge(node2, node8, 1);
		Edge edge8 = new Edge(node2, node9, 1);
		Edge edge9 = new Edge(node3, node2, 1);
		Edge edge10 = new Edge(node3, node4, 1);
		Edge edge11 = new Edge(node3, node9, 1);
		Edge edge12 = new Edge(node4, node2, 1);
		Edge edge13 = new Edge(node4, node3, 1);
		Edge edge14 = new Edge(node4, node5, 1);
		Edge edge15 = new Edge(node4, node6, 1);
		Edge edge16 = new Edge(node4, node9, 1);
		Edge edge17 = new Edge(node4, node10, 1);
		Edge edge18 = new Edge(node5, node4, 1);
		Edge edge19 = new Edge(node5, node6, 1);
		Edge edge20 = new Edge(node5, node10, 1);
		Edge edge21 = new Edge(node6, node4, 1);
		Edge edge22 = new Edge(node6, node5, 1);
		Edge edge23 = new Edge(node6, node7, 1);
		Edge edge24 = new Edge(node6, node8, 1);
		Edge edge25 = new Edge(node6, node10, 1);
		Edge edge26 = new Edge(node7, node6, 1);
		Edge edge27 = new Edge(node7, node8, 1);
		Edge edge28 = new Edge(node7, node10, 1);
		Edge edge29 = new Edge(node8, node1, 1);
		Edge edge30 = new Edge(node8, node2, 1);
		Edge edge31 = new Edge(node8, node6, 1);
		Edge edge32 = new Edge(node8, node7, 1);
		Edge edge33 = new Edge(node8, node9, 1);
		Edge edge34 = new Edge(node8, node10, 1);
		Edge edge35 = new Edge(node9, node1, 1);
		Edge edge36 = new Edge(node9, node2, 1);
		Edge edge37 = new Edge(node9, node3, 1);
		Edge edge38 = new Edge(node9, node4, 1);
		Edge edge39 = new Edge(node9, node8, 1);
		Edge edge40 = new Edge(node9, node10, 1);
		Edge edge41 = new Edge(node10, node4, 1);
		Edge edge42 = new Edge(node10, node5, 1);
		Edge edge43 = new Edge(node10, node6, 1);
		Edge edge44 = new Edge(node10, node7, 1);
		Edge edge45 = new Edge(node10, node8, 1);
		Edge edge46 = new Edge(node10, node9, 1);
		
		/*	Adding edges to Edge	*/
		
		Edges.add(edge1);
		Edges.add(edge2);
		Edges.add(edge3);
		//Edges.add(edge4);
		Edges.add(edge5);
		Edges.add(edge6);
		//Edges.add(edge7);
		Edges.add(edge8);
		//Edges.add(edge9);
		Edges.add(edge10);
		//Edges.add(edge11);
		//Edges.add(edge12);
		//Edges.add(edge13);
		Edges.add(edge14);
		//Edges.add(edge15);
		//Edges.add(edge16);
		Edges.add(edge17);
		//Edges.add(edge18);
		Edges.add(edge19);
		//Edges.add(edge20);
		Edges.add(edge21);
		//Edges.add(edge22);
		//Edges.add(edge23);
		//Edges.add(edge24);
		Edges.add(edge25);
		Edges.add(edge26);
		//Edges.add(edge27);
		Edges.add(edge28);
		//Edges.add(edge29);
		//Edges.add(edge30);
		//Edges.add(edge31);
		Edges.add(edge32);
		//Edges.add(edge33);
		Edges.add(edge34);
		//Edges.add(edge35);
		//Edges.add(edge36);
		//Edges.add(edge37);
		//Edges.add(edge38);
		Edges.add(edge39);
		Edges.add(edge40);
		//Edges.add(edge41);
		//Edges.add(edge42);
		//Edges.add(edge43);
		//Edges.add(edge44);
		//Edges.add(edge45);
		//Edges.add(edge46);

		/*	Neighbors adding to nodes	*/
		
		node1.addNeighbors(node2);
		node1.addNeighbors(node8);
		node1.addNeighbors(node9);
		
		//node2.addNeighbors(node1);
		node2.addNeighbors(node3);
		node2.addNeighbors(node4);
		//node2.addNeighbors(node8);
		node2.addNeighbors(node9);
		
		//node3.addNeighbors(node2);
		node3.addNeighbors(node4);
		//node3.addNeighbors(node9);
		
		//node4.addNeighbors(node2);
		//node4.addNeighbors(node3);
		node4.addNeighbors(node5);
		//node4.addNeighbors(node6);
		//node4.addNeighbors(node9);
		node4.addNeighbors(node10);

		//node5.addNeighbors(node4);
		node5.addNeighbors(node6);
		//node5.addNeighbors(node10);
		
		node6.addNeighbors(node4);
		//node6.addNeighbors(node5);
		//node6.addNeighbors(node7);
		//node6.addNeighbors(node8);
		node6.addNeighbors(node10);
		
		node7.addNeighbors(node6);
		//node7.addNeighbors(node8);
		node7.addNeighbors(node10);
		
		//node8.addNeighbors(node1);
		//node8.addNeighbors(node2);
		//node8.addNeighbors(node6);
		node8.addNeighbors(node7);
		//node8.addNeighbors(node9);
		node8.addNeighbors(node10);
		
		//node9.addNeighbors(node1);
		//node9.addNeighbors(node2);
		//node9.addNeighbors(node3);
		//node9.addNeighbors(node4);
		node9.addNeighbors(node8);
		node9.addNeighbors(node10);
		
		//node10.addNeighbors(node4);
		//node10.addNeighbors(node5);
		//node10.addNeighbors(node6);
		//node10.addNeighbors(node7);
		//node10.addNeighbors(node8);
		//node10.addNeighbors(node9);
		
		/*	Nodes adding to Graph	*/
		
		Graph.add(node1);
		Graph.add(node2);
		Graph.add(node3);
		Graph.add(node4);
		Graph.add(node5);
		Graph.add(node6);
		Graph.add(node7);
		Graph.add(node8);
		Graph.add(node9);
		Graph.add(node10);
		
		Node sourceNode = node1;
		Node targetNode = node10;
		
		Dijkstra dijkstra = new Dijkstra();
		dijkstra.GetShortestPath(Graph, Edges, sourceNode);
		
		for(int k=0; k<sourceNode.getNeighbors().size(); k++){
			
			Node tempSourceNode = sourceNode.getNeighbors().get(k);
			System.out.println("Source = "+sourceNode.getID()+ " Neighbor = "+tempSourceNode.getID() +" Target = "+targetNode.getID());
			
			ArrayList<AllPaths> allPaths = new ArrayList<AllPaths>();
			FindAllPaths FAP = new FindAllPaths(Graph,tempSourceNode,node10);  // Calculate all paths from source to target
			
			for(ArrayList<Node> path : FAP.allPaths){	// Create allPaths nodes and add to allPaths arraylist
				AllPaths newPath = new AllPaths(path, path.get(0), path.get(path.size()-1), calculateDistance(Edges, path));
				allPaths.add(newPath);
			}
			
			allPaths = sortPaths(allPaths);	// Sort paths by distance
			
			int firstWeight = 0;
			for(int x=0; x<Edges.size(); x++)
				if(Edges.get(x).getSource().equals(sourceNode) && Edges.get(x).getTarget().equals(sourceNode.getNeighbors().get(k))){
					firstWeight = Edges.get(x).getWeight();
					break;
				}
			
			for(int j=0; j<allPaths.size(); j++){
				allPaths.get(j).getPath().add(0, sourceNode);
				allPaths.get(j).setDistance(allPaths.get(j).getDistance()+firstWeight);
			}
			
						
			for(int j=0; j<allPaths.size(); j++){
				System.out.print(j+1+" - Distance("+allPaths.get(j).getDistance()+") ");
				for(int i=0; i<allPaths.get(j).getPath().size(); i++){
					System.out.print(allPaths.get(j).getPath().get(i).getID()+"-");
				}
				System.out.println();
			}			
			System.out.println("-------------------------------");			
		}
	}
	
	public static int calculateDistance(ArrayList<Edge> Edges, ArrayList<Node> path){
		
		int distance = 0;
		
		for(int i=0; i<path.size(); i++){			
			for(Edge edge : Edges){
				if(i+1 != path.size() && edge.getSource().equals(path.get(i)) && edge.getTarget().equals(path.get(i+1))){
					distance += edge.getWeight();
					break;
				}
			}			
		}			
		return distance;
	}
	
	public static ArrayList<AllPaths> sortPaths(ArrayList<AllPaths> allPaths){	// Bubble sort algorithm

		int n = allPaths.size();
		
		for (int i = 0; i < n-1; i++)     		 
		// Last i elements are already in place   
			for (int j = 0; j < n-i-1; j++) 
				if (allPaths.get(j).getDistance() > allPaths.get(j+1).getDistance()){
					
					int tempD = allPaths.get(j).getDistance();
					Node tempS = allPaths.get(j).getSource();
					Node tempT = allPaths.get(j).getTarget();
					ArrayList<Node> tempP = (ArrayList<Node>)allPaths.get(j).getPath().clone();
					
					allPaths.get(j).setDistance(allPaths.get(j+1).getDistance());
					allPaths.get(j).setSource(allPaths.get(j+1).getSource());
					allPaths.get(j).setTarget(allPaths.get(j+1).getTarget());
					allPaths.get(j).setPath(allPaths.get(j+1).getPath());
					
					allPaths.get(j+1).setDistance(tempD);
					allPaths.get(j+1).setSource(tempS);
					allPaths.get(j+1).setTarget(tempT);
					allPaths.get(j+1).setPath(tempP);
				}		
		
		return allPaths;
	}
}