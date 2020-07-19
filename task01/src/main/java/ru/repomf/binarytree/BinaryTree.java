package ru.repomf.binarytree;

/**
 * Binary search tree without recursion. It's working.
 *
 * Created by a.makarov on 16.07.2020.
 */
public class BinaryTree {

    /**
     * Replaces node for delete method and copy links for nodes.
     * @param current node to delete.
     * @return node for replacing.
     */
    private static Node deleteAndReplaceNode(Node current) {
        Node replace = null;

        if (current.right != null && current.left != null) {
            Node movedNodeParent = null;
            replace = current.right;
            while (replace.left != null) {
                movedNodeParent = replace;
                replace = replace.left;
            }
            if (movedNodeParent != null) {
                movedNodeParent.left = replace.right;
            }
            replace.right = current.right;
            replace.left = current.left;
        } else if (current.right != null) {
            replace = current.right;
        } else if (current.left != null) {
            replace = current.left;
        }
        return replace;
    }

    /**
     * Classic class for nodes in binary tree.
     */
    public static class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public int getData() {
            return data;
        }
    }

    private Node root;

    private void insertNode(Node node, int data) {
        while (true) {
            if (data < node.data) {
                if (node.left == null) {
                    node.left = new Node(data);
                    break;
                } else {
                    node = node.left;
                }
            } else if (data > node.data) {
                if (node.right == null) {
                    node.right = new Node(data);
                    break;
                } else {
                    node = node.right;
                }
            } else {
                break;
            }
        }
    }

    public void add(int data) {
        if (root != null) {
            insertNode(root, data);
        } else {
            root = new Node(data);
        }
    }

    public Node getElement(int data) {
        Node current = this.root;
        while (current != null) {
            if (current.data == data) {
                break;
            } else {
                current = data < current.data ? current.left : current.right;
            }
        }
        return current;
    }

    public void remove(int data) {
        if (this.root != null) {
            if (this.root.data == data) {
                this.root = deleteAndReplaceNode(this.root);
            } else {
                Node current = this.root;
                while (current != null) {
                    if (current.left != null && current.left.data == data) {
                        current.left = deleteAndReplaceNode(current.left);
                    } else if (current.right != null && current.right.data == data) {
                        current.right = deleteAndReplaceNode(current.right);
                    } else {
                        current = data < current.data ? current.left : current.right;
                    }
                }
            }
        }
    }

    public Node getRoot() {
        return this.root;
    }
}
