import java.util.ArrayList;
import java.util.Stack;

/*  Reference : https://introcs.cs.princeton.edu/java/45graph/AllPaths.java.html  */

public class FindAllPaths {
	
	private ArrayList<Node> path  = new ArrayList<Node>();   // the current path
    private ArrayList<Node> onPath  = new ArrayList<Node>();     // the set of vertices on the path
    public ArrayList<ArrayList<Node>> allPaths;
    
    public FindAllPaths(ArrayList<Node> G, Node s, Node t) {
    	
    	allPaths = new ArrayList<ArrayList<Node>>();    	
    	enumerate(G, s, t);
    }

    // use DFS
    private void enumerate(ArrayList<Node> G, Node v, Node t) {

        // add node v to current path from s
        path.add(v);
        onPath.add(v);

        // found path from s to t - currently prints in reverse order because of stack
        if (v.equals(t)){
        	ArrayList<Node> newPath  = (ArrayList<Node>)path.clone();
        	allPaths.add(newPath);
        }

        // consider all neighbors that would continue path with repeating a node
        else {
            for (Node w : v.getNeighbors()) {
                if (!onPath.contains(w)) enumerate(G, w, t);
            }
        }

        // done exploring from v, so remove from path
        path.remove(path.size()-1);
        onPath.remove(v);
    }	
}
