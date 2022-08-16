
public class TestTree {

	public static void main(String[] args) {
		System.out.println("Testing Tree");
		Tree tree = new Tree ();
		tree.setBST('$',20);
		tree.setBST(10,"10");
		tree.setBST(5,"5");
		tree.setBST(15,"15");
		tree.setBST(11,"11");
		tree.setBST(12,"12");
		tree.setBST(30,"30");
		tree.remove(10);
		tree.getBST('$');
		tree.PrintPreOrder(tree.getRoot());
		
	}

}
