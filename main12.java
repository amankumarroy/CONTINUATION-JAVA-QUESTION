package work8;



import java.util.Queue;



import java.util.LinkedList;
import java.util.*;

public class main12 {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		main12 m = new main12();

//		String input = scn.nextLine();
//		String[] arrs = input.split(" ");
//		final int size = arrs.length;
//		int[] level = takeInput(size, arrs);
		BinaryTree bt = m.new BinaryTree();
		//bt.display();
		bt.levelOrderNewLine();
	}

	public static int[] takeInput(int n, String[] arrs) {

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = Integer.parseInt(arrs[i]);
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
			public Node(int a)
			{
				this.data=a;
				this.left=left;
				this.right=right;
			}
		}

		private Node root;
		private int size;

		public BinaryTree() {
			
			

			this.root = new Node(scn.nextInt());
	        Queue<Node> q = new LinkedList<>();
	        q.add(this.root);
	        while (!q.isEmpty()) {
	            Node rv = q.remove();
	            int d1 = scn.nextInt();
	            if (d1 != -1) {
					rv.left = new Node(d1);
					q.add(rv.left);
				}	
				int d2 = scn.nextInt();
				if (d2 != -1) {
					rv.right = new Node(d2);
					q.add(rv.right);
				}
	        }
		
//			Queue<Integer> queue = new LinkedList<Integer>();
//			queue.add(null);
//			this.root = this.construct(level, this.root, 0);
		}
		

//		private Node construct(int[] arr, Node root, int i) {
//
//			if (i >= arr.length) {
//				return null;
//			}
//			if (arr[i] == -1) {
//				return null;
//			}
//
//			Node temp = new Node();
//			temp.data = arr[i];
//			root = temp;
//
//			root.left = construct(arr, root.left, 2 * i + 1);
//
//			root.right = construct(arr, root.right, 2 * i + 2);
//
//			return root;
//		}

		public void levelOrderNewLine() {

			this.levelOrderNewLine(this.root);
		}

		private void levelOrderNewLine(Node n) {
			
			if(n==null)
			{
				return;
			}
			Queue<Node> queue = new LinkedList<>();

			queue.add(null);
			queue.add(n);
			Node trans;

			while (!queue.isEmpty()) {

				trans = queue.poll();
				if (trans == null&&queue.size()!=0) 
				{
					System.out.print(queue.peek().data + " ");
					queue.add(null);
				}
				
					
				
				
					
				
				if (trans != null) {

					if (trans.left != null) {
						queue.add(trans.left);
					}
					if (trans.right != null) {
						queue.add(trans.right);
					}
				}
			}
		}

		public void find() {
			this.find(this.root);
		}

		private void find(Node node) {

			if (node.right == null) {
				System.out.println(node.data + " ");
			}
			if (node.left == null && node.right == null) {

				return;
			}
			find(node.left);
			find(node.right);

		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}
		
	
		
		
		}
	}

