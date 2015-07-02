package edu.neu.jon.subtree.unit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;

import edu.neu.jon.model.TreeNode;
import edu.neu.jon.subtree.SubtreeChecker;

public class SubtreeCheckerTest {

	
	private TreeNode r1;
	private TreeNode r2;
	private TreeNode r3;
	
	@Before
	public void setup() {
		r1 = new TreeNode(1);
		r2 = new TreeNode(2);
		r3 = new TreeNode(3);
	}
	
	@Test
	public void testIsSubTree() {
		prepareTreesForPass();
		assertEquals(true, SubtreeChecker.isSubtree(r1, r2));
	}
	
	@Test
	public void testGetInOrderTraversalStr() {
		prepareTreesForPass();
		assertEquals("11 2 22 1 ", SubtreeChecker.getInOrderTraversalStr(r1));
		assertEquals("11 2 22", SubtreeChecker.getInOrderTraversalStr(r2));
	}
	
	@Test
	public void testGetPostOrderTraversalStr() {
		prepareTreesForPass();
		assertEquals("11 22 2 1", SubtreeChecker.getPostOrderTraversalStr(r1));
		assertEquals("11 22 2", SubtreeChecker.getPostOrderTraversalStr(r2));
	}
	
	private void prepareTreesForPass() {
		TreeNode rr1 = new TreeNode(11);
		TreeNode rr2 = new TreeNode(22);
		r1.left = r2;
		r2.left = rr1;
		r2.right = rr2;
	}

}
