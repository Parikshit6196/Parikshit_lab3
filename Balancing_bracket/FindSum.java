package Balancing_bracket;

import java.util.HashSet;

public class FindSum {
  static public class Node{
	  int nodeData;
	  Node leftNode , rightNode;
  }
  static Node newNode(int nodeData) {
	  Node temp = new Node();
	  temp.nodeData = nodeData;
	  temp.leftNode = null;
	  temp.rightNode = null;
	  return temp;
	  }
  public Node insert(Node root, int key) {
	  
	  if(root == null)
	  {
		  return newNode(key);
	  }
	  if(key<root.nodeData) {
		  root.leftNode = insert(root.leftNode, key);
	  }else {
		  root.rightNode =  insert(root.rightNode, key);
	  }
	  return root;	  
  }

  
 private boolean findpair(Node root, int sum, HashSet<Integer> set) {
	if(root== null)
	return false;
	
	if(findpair(root.leftNode, sum, set))
		return true;
	
	if(set.contains(sum- root.nodeData)) {
		System.out.println("Pair found (" + (sum-root.nodeData) + "," + (root.nodeData) + ")");
		return true;
	}
	else 
	     set.add(root.nodeData);
	return findpair(root.rightNode, sum, set);
	
 }
 
 public void findPairWithSum(Node root, int sum) {
	  HashSet<Integer> set = new HashSet<Integer>();
	  if(!findpair(root, sum, set)) {
		  System.out.println("Pair not found" + "\n");
	  }
 }
 
}
