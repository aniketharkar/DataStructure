package pkg2;
import java.util.*;

public class Graph {
	static class Edge{
		int src;
		int des;
		
		Edge(int s,int d){
			this.src=s;
			this.des=d;
		}
	}
	public static void creation(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<>();
		}
//		graph[0].add(new Edge(0,2));
//		
//		graph[1].add(new Edge(1,0));
//		
//		graph[2].add(new Edge(2,3));
//		
//		graph[3].add(new Edge(3,0));
//		graph[0].add(new Edge(0,1));
//		graph[0].add(new Edge(0,2));  
//		
//		graph[1].add(new Edge(1,0));
//		graph[1].add(new Edge(1,3));
//		
//		graph[2].add(new Edge(2,0));
//		graph[2].add(new Edge(2,4));
//		
//		graph[3].add(new Edge(3,1));
//		graph[3].add(new Edge(3,4));
//		graph[3].add(new Edge(3,5));
//		
//		graph[4].add(new Edge(4,2));
//		graph[4].add(new Edge(4,3));
//		graph[4].add(new Edge(4,5));
//		
//		graph[5].add(new Edge(5,3));
//		graph[5].add(new Edge(5,4));
//		graph[5].add(new Edge(5,6));
//		
//		graph[6].add(new Edge(6,5));
//		graph[5].add(new Edge(5,2));
//		graph[5].add(new Edge(5,0));
//		
//		graph[2].add(new Edge(2,3));
//		
//		graph[3].add(new Edge(3,1));
//		
//		graph[4].add(new Edge(4,0));
//		graph[4].add(new Edge(4,1));
		graph[0].add(new Edge(0,2));
		graph[0].add(new Edge(0,1));
		
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,2));
		
		graph[2].add(new Edge(2,1));
		graph[2].add(new Edge(2,0));
		
		graph[2].add(new Edge(2,3));
		graph[3].add(new Edge(3,2));
		
		
	}
	
	public static void getedge(ArrayList<Edge> g[],int v) {
		for(int i=0;i<g[v].size();i++) {
			Edge e=g[v].get(i);
			System.out.println(e.src+"->"+e.des);
			
		}
	}

	public static void bfs(ArrayList<Edge> g[],int v) {
		Queue q=new LinkedList();
		q.add(0);
		boolean vist[]=new boolean[v];
		
		while(!q.isEmpty()) {
			int curr=(int) q.remove();
			if(vist[curr]==false) {
				System.out.print (curr+" ");
				vist[curr]=true;
				for(int i=0;i<g[curr].size();i++) {
					Edge e=g[curr].get(i);
					q.add(e.des);
				}
			}
		}
	}
	public static void dfs(int curr,ArrayList<Edge> graph[],boolean vist[]) {
		System.out.print(curr+" ");
		vist[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(vist[e.des]==false) {
				dfs(e.des,graph,vist);
			}
		}
	}
	
	public static void paths(ArrayList<Edge> graph[],int tar,int curr,boolean vist[],String path) {
		if(curr==tar) {
			System.out.println(path);
			return;
			
		}
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(vist[e.des]==false) {
				vist[curr]=true;
				paths(graph,tar,e.des,vist,path+" "+curr);
				vist[curr]=false;
			}
		}
	}
	
	public static boolean iscyclicgraph(ArrayList<Edge> graph[],int curr,boolean vist[],boolean rec[]) {
		vist[curr]=true;
		rec[curr]=true;
		
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(rec[e.des]==true) {
				return true;
			}
			else if(vist[e.des]==false) {
				return iscyclicgraph(graph,e.des,vist,rec);
			}
		}
		rec[curr]=false;
		return false;
		
	}
	public static void topologicalorder(int curr,ArrayList<Edge> graph[],boolean vis[],Stack<Integer> q) {
		vis[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(vis[e.des]==false) {
				topologicalorder(e.des,graph,vis,q);
			}
		}
		q.push(curr);
	}
	
	public static void top(ArrayList<Edge> graph[],int v) {
		boolean V[]=new boolean[v];
		Stack<Integer> sq=new Stack<>();
		for(int i=0;i<V.length;i++) {
			if(V[i]==false) {
				topologicalorder(i,graph,V,sq);
			}
		}
		while(!sq.isEmpty()) {
			System.out.print(sq.peek()+" ");
			sq.pop();
		}
		
	}
	
	public static boolean iscycle(int curr,ArrayList<Edge> graph[],boolean vis[],int par) {
		vis[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(vis[e.des]==true && e.des!=par) {
				return true;
			}
			else if(vis[e.des]==false) {
			 if(iscycle(e.des,graph,vis,curr)) {
				 return true;
			 }
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=4;
		ArrayList<Edge> Graphs[]=new ArrayList[V];
		Graph.creation(Graphs);
	  boolean vis[]=new boolean[V];
//	Graph.top(Graphs, V);
//		Graph.paths(Graphs, 5, 0, vis,"");
//
	  boolean asi=false;
	  for(int i=0;i<vis.length;i++) {
		  if(vis[i]==false) {
			 asi=iscycle(i,Graphs,vis,-1);
		  }
	  }
      System.out.println(asi);
	}

}
