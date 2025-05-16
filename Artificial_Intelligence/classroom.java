import java.util.*;

public class classroom {
    static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }

    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();  //Every index of the arraylist is empty. We can change the value of an empty arraylist.
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,4,10));

        graph[3].add(new Edge(3,1,-1));
        graph[3].add(new Edge(3,4,0));
        graph[3].add(new Edge(3,5,0));

        graph[4].add(new Edge(4,3,10));
        graph[4].add(new Edge(4,2,10));
        graph[4].add(new Edge(4,5,10));

        graph[5].add(new Edge(5,3,10));
        graph[5].add(new Edge(5,4,10));
        graph[5].add(new Edge(5,6,10));

        graph[6].add(new Edge(6,5,10));
    }

    public static void bfs(ArrayList<Edge> graph[], int V){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[V];

        q.add(0);

        while(!q.isEmpty()){
            int curr=q.remove();
            if(visited[curr]==false){
                System.out.print(curr+" ");
                visited[curr]=true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
                dfs(graph,e.dest,vis);
            }
        }
    }

    public static void printAllPath(ArrayList<Edge>[] graph, int curr, int target, String path, boolean[] vis){
        if(curr==target){
            System.out.println(path);
            return;
        }

        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            
            if(!vis[e.dest]){
                printAllPath(graph, e.dest, target, path + " -> " + e.dest, vis);
                vis[e.dest] = false;
            }
        }
        
    }
    @SuppressWarnings("unchecked")
    public static void main(String args[]){

        int V=7;
        boolean[] vis = new boolean[V];  // or appropriate size
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[V];  //every index of the array list is null. We cannot add a value on top of null
        createGraph(graph);
        //bfs(graph,V);
        int src=0;
        int tar=5;
        printAllPath(graph, src, tar,"0", new boolean[V]);
        System.out.println();
    }
}
