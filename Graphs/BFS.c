#include<stdio.h>
#include<stdlib.h>

#define MAX_VERTICES 100

struct Node{                    //Node->[Data,Next]
    int data;
    struct node *next;
};

struct Node* createNode(int data){
    struct Node* newNode=(struct Node*)malloc(sizeof(struct Node));
    newNode->data=data;
    newNode->next=NULL;
    return newNode;                 //newNode=[Data,_]
}

void addEdge(struct Node* adjList[], int u, int v){
    struct Node* newNode=createNode(v);     //newNode=[v,_]
    newNode->next=adjList[u];               //newNode=[v,u]
    adjList[u]=newNode;                     //adjList[u]=newNode
}

void bfs(struct Node* adjList[],int vertices, int startNode, int visited[]){
    int queue[MAX_VERTICES];
    int front=0, rear=0;

    visited[startNode]=1;
    queue[rear++]=startNode;

    while(front!=rear){
        int currentNode=queue[front++];
        printf("%d ",currentNode);

        struct Node* temp=adjList[currentNode];
        while(temp!=NULL){
            int neighbor = temp->data;
            if (!visited[neighbor]) {
                visited[neighbor] = 1;
                queue[rear++] = neighbor;
        }
        temp=temp->next;
    }
    }
}

int main(){
    // Number of vertices in the graph
    int vertices = 5;

    // Adjacency list representation of the graph
    struct Node* adjList[vertices];
    for (int i = 0; i < vertices; ++i)
        adjList[i] = NULL;

    // Add edges to the graph
    addEdge(adjList, 0, 1);
    addEdge(adjList, 0, 2);
    addEdge(adjList, 1, 3);
    addEdge(adjList, 1, 4);
    addEdge(adjList, 2, 4);

    // Mark all the vertices as not visited
    int visited[vertices];
    for (int i = 0; i < vertices; ++i)
        visited[i] = 0;

    // Perform BFS traversal starting from vertex 0
    printf(
        "Breadth First Traversal starting from vertex 0: ");
    bfs(adjList, vertices, 0, visited);

    return 0;
}