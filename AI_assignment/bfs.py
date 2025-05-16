from collections import deque

def bfs(graph, start_node):
    visited = set()
    queue = deque([start_node])
    bfs_traversal = []

    while queue:
        node = queue.popleft()
        if node not in visited:
            bfs_traversal.append(node)
            visited.add(node)
            queue.extend(graph[node])

    return bfs_traversal

# Example usage
graph = {
    'A': ['B', 'C'],
    'B': ['A', 'D', 'E'],
    'C': ['A', 'F', 'G'],
    'D': ['B'],
    'E': ['B', 'H'],
    'F': ['C'],
    'G': ['C'],
    'H': ['E']
}

start = 'A'
print("Breadth-First Search (BFS) Traversal:", bfs(graph, start))
