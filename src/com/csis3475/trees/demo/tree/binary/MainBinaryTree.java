package com.csis3475.trees.demo.tree.binary;

import java.util.Iterator;

public class MainBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree<String> myTree = new BinaryTree<>();
		
		BinaryTree<String> pTree = new BinaryTree<>("P");
		BinaryTree<String> rTree = new BinaryTree<>("R");
		BinaryTree<String> tTree = new BinaryTree<>("T");
		BinaryTree<String> uTree = new BinaryTree<>("U");
		BinaryTree<String> iTree = new BinaryTree<>("I");
		BinaryTree<String> vTree = new BinaryTree<>("V");
		BinaryTree<String> xTree = new BinaryTree<>("X");
		BinaryTree<String> kTree = new BinaryTree<>("K");
		BinaryTree<String> lTree = new BinaryTree<>("L");
		BinaryTree<String> zTree = new BinaryTree<>("Z");
		BinaryTree<String> nTree = new BinaryTree<>("N");
		BinaryTree<String> yTree = new BinaryTree<>("Y");
		
		BinaryTree<String> oTree = new BinaryTree<>("O", yTree, null);
		BinaryTree<String> mTree = new BinaryTree<>("M", zTree, null);

		BinaryTree<String> gTree = new BinaryTree<>("G", nTree, oTree);
		BinaryTree<String> fTree = new BinaryTree<>("F", lTree, mTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, gTree);
		
		
		BinaryTree<String> sTree = new BinaryTree<>("S", tTree, uTree);
		BinaryTree<String> qTree = new BinaryTree<>("Q", rTree, sTree);
		BinaryTree<String> hTree = new BinaryTree<>("H", pTree, qTree);
		
		
		BinaryTree<String> jTree = new BinaryTree<>("J", vTree, xTree);

		
		BinaryTree<String> dTree = new BinaryTree<>("D", hTree, iTree);
		BinaryTree<String> eTree = new BinaryTree<>("E", jTree, kTree);
		
		BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);


		myTree.setTree("A", bTree, cTree);
		
		
		
		System.out.println("     			  	  A");
		System.out.println("     			  /    	  \\");
		System.out.println("     			 /    	   \\");
		System.out.println("     			/    		\\");
		System.out.println("     		   /             \\");
		System.out.println("   		  	  /               \\");
		System.out.println("   		  	 /                 \\");
		System.out.println("   		  	/                   \\");
		System.out.println("   		   /                     \\");
		System.out.println("  		  B                	      C");
		System.out.println("     	 / \\             		 / \\");
		System.out.println("     	/   \\         		    /    \\");
		System.out.println("       /     \\       	       /      \\");
		System.out.println("	   D        E      	      F         G");
		System.out.println("	 / \\       / \\         / \\      / \\");
		System.out.println("    H    I     J    K 		L	 M    N    O");
		System.out.println("   / \\       / \\              /         / \\");
		System.out.println("  /   \\     /   \\            /         /");
		System.out.println(" P      Q   V     X 	      Z         Y");
		System.out.println("       / \\ ");
		System.out.println("      /   \\");
		System.out.println("     /     \\");
		System.out.println("	R       S");
		System.out.println("       		/ \\ ");
		System.out.println("      	   /   \\");
		System.out.println("          /     \\");
		System.out.println("         T       U");

		System.out.println("PreOrder: ");
		Iterator<String> preOrderItr = myTree.getPreorderIterator();
		while(preOrderItr.hasNext()) {
			System.out.print(preOrderItr.next() + " ");
		}
		
		System.out.println("\n****************************************************");
		System.out.println("PostOder:");
		Iterator<String> postOrderIter = myTree.getPostorderIterator();
		while(postOrderIter.hasNext()) {
			
			System.out.print(postOrderIter.next() + " ");
		}
			
//			if(postOrderIter.next().equals("E")) {
//				System.out.print(" You ");
//			}
//			else {
//				continue;
//			}
		System.out.println("\n****************************************************");

		treeInformation(myTree);
		System.out.println("\n****************************************************");
		
        Iterator<String> oneTraversal = myTree.getPreorderIterator();
//        while(oneTraversal.hasNext()) {
//        	
//        	
//
//        }

		
		

	}
	
	
	
	
	public static void treeInformation(BinaryTree<String> tree) {
		
		System.out.println("Height of the tree: "+ tree.getHeight() );
		
		System.out.println("is the tree empty: "+ tree.isEmpty() );
		
		System.out.println("Number of Nodes: "+ tree.getNumberOfNodes());
		System.out.println("Root Data: "+ tree.getRootData());

		
	}

}
