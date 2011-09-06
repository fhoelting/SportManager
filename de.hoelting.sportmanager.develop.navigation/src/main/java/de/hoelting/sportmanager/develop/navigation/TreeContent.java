package de.hoelting.sportmanager.develop.navigation;

import org.eclipse.jface.viewers.TreeNode;

public class TreeContent extends TreeNode {

	public static final int ROOT = 0;
	
	public static final int NAVIGATIN = 1;
	
	public static final int DATA = 2;
	
	int type = DATA;
	
	String label = Messages.TreeContent_defaultLabel;
	
	public TreeContent() {
		super(Messages.TreeContent_root);
		
	}

	public String toString(){
		return label;
	}
	
	public int getType(){
		return type;
	}
	
	public static TreeNode[] createTreeContent(){
		TreeContent root = new TreeContent();
		TreeNode[] firstLevel = new TreeNode[4];
		firstLevel[0] = new TreeNavgationContent(Messages.TreeContent_masterData);
		firstLevel[1] = new TreeNavgationContent(Messages.TreeContent_Planing);
		firstLevel[2] = new TreeNavgationContent(Messages.TreeContent_report);
		firstLevel[3] = new TreeNavgationContent(Messages.TreeContent_breakdown);

		root.setChildren(firstLevel);
		return firstLevel;
	}
}
