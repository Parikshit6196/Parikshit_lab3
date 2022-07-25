package driver;

import Balancing_bracket.FindSum;
import Balancing_bracket.FindSum.Node;

public class driverBst {
 public static void main(String[] args) {
	 Node root = null;
	 FindSum findSp = new FindSum();
	 root = findSp.insert(root,40);
	 root = findSp.insert(root,20);
	 root = findSp.insert(root,60);
	 root = findSp.insert(root,10);
	 root = findSp.insert(root,30);
	 root = findSp.insert(root,50);
	 root = findSp.insert(root,110);
	 
	 int sum = 200;
	 findSp.findPairWithSum(root,sum);
 }
}
