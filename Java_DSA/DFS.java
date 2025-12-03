import java.util.*;
public class Main {

	public static void dfs(List<List<Integer>> graph,boolean[] visited,int startvertex) {
		visited[startvertex]=true;
		System.out.println(startvertex);
		for(int neighbour:graph.get(startvertex)) {
			if(!visited[neighbour]) {
				dfs(graph,visited,neighbour);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter vertices:");
		int vertices=sc.nextInt();
		System.out.print("enter edge:");
		int e=sc.nextInt();
		List<List<Integer>> graph=new ArrayList<>();
		for(int i=0; i<vertices; i++) {
			graph.add(new ArrayList<>());
		}
	
		for(int i=0; i<e; i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			graph.get(u).add(v);
			graph.get(v).add(u);

		}
 	System.out.print("enter a start value:");
		int startvertex=sc.nextInt();
		sc.close();
		boolean[] visited=new boolean[vertices];
	    System.out.println("DFS:");
		dfs(graph,visited,startvertex);
	}
}
