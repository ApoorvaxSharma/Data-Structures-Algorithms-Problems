package Graphs;
import java.util.*;

import Graphs.bfs_dfs.Edge;

public class bfs_dfs {
    public static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }

        @Override
        public String toString() {
            return "(" + src + " -> " + dest + ", weight: " + weight + ")";
        }
    }

    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,2,45));

        graph[1].add(new Edge(1,0,78));

        graph[2].add(new Edge(2,3,89));

        //graph[3].add(new Edge(3,0,99));
    }

    public static void printGraph(ArrayList<Edge>graph[]){
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int j = 0; j < graph[i].size(); j++) {
                System.out.print(graph[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void bfs(ArrayList<Edge>graph[], int v){
        Queue<Integer> q=new LinkedList<>();
        boolean visisted[]=new boolean[v];

        q.add(0);

        while(!q.isEmpty()){
            int curr=q.remove();

            if(visisted[curr]==false){
                System.out.print(curr+" ");
                visisted[curr]=true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);

                    if(!visisted[e.dest]){
                        q.add(e.dest);
                    }
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge>graph[],int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void PrintAllPaths(ArrayList<Edge>graph[], boolean vis[], int target, int curr, String path){
        if(curr==target){
            System.out.println(path);
            return;
        }
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                PrintAllPaths(graph,vis,target, e.dest, path+" -> "+e.dest);
                vis[e.dest]=false;
            }
        }
    }

    public static boolean checkCycleDirected(ArrayList<Edge>graph[], int curr, boolean vis[], boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(rec[e.dest]==true){
                return true;
            }
            else if(!vis[e.dest]){
                if(checkCycleDirected(graph,e.dest,vis,rec)){
                    return true;
                }

            }
        }
        rec[curr]=false;
        return false;
    }

    public static void topSortUtil(ArrayList<Edge>graph[], int curr, boolean vis[], Stack<Integer> stack){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            if(!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge>graph[],int V){
        boolean vis[]=new boolean[V];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<V;i++){
            if(!vis[i]){
                topSortUtil(graph, i, vis, stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }



    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int V=4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraph(graph);
        //System.out.println("BFS Traversal: ");
        //bfs(graph, V);

        //System.out.println();

        //System.out.println("DFS Traversal: ");
        //dfs(graph, 0, visisted);
       // printGraph(graph);

        //System.out.println();

        //System.out.println("Print all paths to target");
        //boolean visisted[]=new boolean[V];
        //boolean rec[]=new boolean[V];
       //PrintAllPaths(graph, visisted, 6, 0, "0");
        //boolean ans=checkCycleDirected(graph, 0, visisted, rec);
        //System.out.println("The graph is cyclic: "+ ans);

        topSort(graph, V);

    }
}
