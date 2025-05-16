def is_valid(node, color, assignment, graph):
    """
    Check if assigning the given color to the node is valid.
    """
    for neighbor in graph[node]:
        if neighbor in assignment and assignment[neighbor] == color:
            return False
    return True


def select_unassigned_variable(assignment, graph):
    """
    Select the next unassigned node (using Minimum Remaining Values heuristic optionally).
    """
    for node in graph:
        if node not in assignment:
            return node
    return None


def csp_backtrack(assignment, graph, colors):
    """
    Recursive backtracking function for CSP.
    """
    if len(assignment) == len(graph):
        return assignment  # Assignment complete

    node = select_unassigned_variable(assignment, graph)

    for color in colors:
        if is_valid(node, color, assignment, graph):
            assignment[node] = color
            result = csp_backtrack(assignment, graph, colors)
            if result:
                return result
            del assignment[node]  # Backtrack

    return None  # Failure


def solve_graph_coloring(graph, num_colors):
    """
    Initialize colors and solve the CSP.
    """
    colors = [f'Color-{i + 1}' for i in range(num_colors)]
    assignment = {}
    return csp_backtrack(assignment, graph, colors)


# Example usage with one test case:
if __name__ == "__main__":
    # Test Case 1 (as mentioned in your prompt)
    graph = {
        'A': ['B', 'C'],
        'B': ['A', 'C', 'D'],
        'C': ['A', 'B', 'D'],
        'D': ['B', 'C']
    }
    num_colors = 3
    solution = solve_graph_coloring(graph, num_colors)
    print("Color assignment:", solution)

test_cases = [
    # Case 1
    ({
        'A': ['B'],
        'B': ['A', 'C'],
        'C': ['B', 'D'],
        'D': ['C']
    }, 2),
    
    # Case 2
    ({
        'A': ['B', 'C', 'D'],
        'B': ['A', 'C', 'D'],
        'C': ['A', 'B', 'D'],
        'D': ['A', 'B', 'C']
    }, 4),

    # Case 3
    ({
        'X': ['Y', 'Z'],
        'Y': ['X', 'Z'],
        'Z': ['X', 'Y']
    }, 2),

    # Case 4
    ({
        'A': ['B', 'C'],
        'B': ['A', 'D', 'E'],
        'C': ['A'],
        'D': ['B'],
        'E': ['B']
    }, 2),

    # Case 5
    ({
        'A': ['B', 'E', 'F'],
        'B': ['A', 'C', 'G'],
        'C': ['B', 'D', 'H'],
        'D': ['C', 'E', 'I'],
        'E': ['D', 'A', 'J'],
        'F': ['A', 'H', 'I'],
        'G': ['B', 'I', 'J'],
        'H': ['C', 'F', 'J'],
        'I': ['D', 'F', 'G'],
        'J': ['E', 'G', 'H']
    }, 3)
]

for i, (graph, k) in enumerate(test_cases, 1):
    print(f"Test Case {i}:")
    solution = solve_graph_coloring(graph, k)
    print("Color assignment:", solution, "\n")
