/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package BST_Lab;

/**
 *
 * @author HP
 */
public class BinarySearchTree {
    
    public class TreeNode   {
        int data;
        TreeNode left = null, right = null, parent = null;
        
        public TreeNode (int d) {
            data = d;
        }
    }
    public TreeNode root = null;
    
    void printPreOrder (TreeNode node)  {
        if(node == null) return;
        
        System.out.println(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    
    void printInOrder (TreeNode node)   {
        if(node == null) return;
        
        printInOrder(node.left);
        System.out.println(node.data + " ");
        printInOrder(node.right);
    }
    
    void printPostOrder (TreeNode node) {
        if(node == null) return;
        
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.data + " ");
    }
    
    public void print(TreeNode node)    {
        if (node == null) return;
        
        System.out.println(node.data);
        print(node.left);
        print(node.right);
    }
    
    public TreeNode search(int d, TreeNode node)   {
        if(node == null) return null;
        if(d == node.data) return node;
        if(d < node.data) return search(d, node.left);
        return search(d, node.right);
    };
    
    public void insert(int d, TreeNode node)   {
        if(node == null)    {
            root = new TreeNode(d);
        }        
        else if(d < node.data)   {
            if(node.left == null)   {
                node.left = new TreeNode(d);
                node.left.parent = node;
            } else insert(d, node.left);
        }
        else    {
            if(node.right == null)  {
                node.right = new TreeNode(d);
                node.right.parent = node;
            } else insert(d, node.right);
        }
    }
    
    public void delete(int d, TreeNode node)   {
        if(node == null) return;
        
        if(d < node.data)   {
            delete(d, node.left);
        }
        else if(d > node.data)  {
            delete(d, node.right);
        }
        else    {
            if((node.left == null) || (node.right == null)) {
                TreeNode temp = (node.left == null) ? node.right : node.left;
                if(node.parent.left == node)    {
                    node.parent.left = temp;
                }
                else    {
                    node.parent.right = temp;
                }
                if(temp != null)    {
                    temp.parent = node.parent;
                }
            }
            else    {
                TreeNode temp = findMax(node.left);
                delete(temp.data, node.left);
                if(node.parent.left == node)    {
                    node.parent.left = temp;
                }
                else    {
                    node.parent.right = temp;
                }
                temp.left = node.left;
                temp.right = node.right;
            }
        }
    }
    
    public TreeNode findMax(TreeNode node){
        if(node == null) return null;
        if(node.right == null) return node;
        return findMax(node.right);
    }

    public TreeNode findMin(TreeNode node){
        if(node == null) return null;
        if(node.left == null) return node;
        return findMin(node.left);
    }
}
