# 1. Reuse the Node class and the three recursive traversal functions
class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def preorder(root):
    if root is None:
        return []
    return [root.value] + preorder(root.left) + preorder(root.right)

def inorder(root):
    if root is None:
        return []
    return inorder(root.left) + [root.value] + inorder(root.right)

def postorder(root):
    if root is None:
        return []
    return postorder(root.left) + postorder(root.right) + [root.value]

# 2. Implement insert(root, value) and build_bst(values)
def insert(root, value):
    # Base case: found an empty spot, create and return a new Node
    if root is None:
        return Node(value)
    
    # Smaller values go left
    if value < root.value:
        root.left = insert(root.left, value)
    # Larger values go right
    elif value > root.value:
        root.right = insert(root.right, value)
    # If value == root.value, do nothing (ignore duplicates)
    
    return root

def build_bst(values):
    root = None
    for value in values:
        root = insert(root, value)
    return root

# 3. Print the original insertion list and all three traversals
insertion_list = [50, 30, 70, 20, 40, 60, 80, 30]
bst_root = build_bst(insertion_list)

print("Insertion list:", insertion_list)
print("Preorder:", preorder(bst_root))
print("Inorder:", inorder(bst_root))
print("Postorder:", postorder(bst_root))

# Required checks verification
assert inorder(bst_root) == [20, 30, 40, 50, 60, 70, 80]
assert len(preorder(bst_root)) == len(inorder(bst_root)) == len(postorder(bst_root)) == 7
assert build_bst([]) is None
