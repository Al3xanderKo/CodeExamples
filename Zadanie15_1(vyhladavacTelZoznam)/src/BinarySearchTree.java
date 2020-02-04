
public class BinarySearchTree {
	private String key;
	private Osoba value;
	private BinarySearchTree left, right;

	public BinarySearchTree() {

	}

	public Osoba get(String key) {
		if (this.key.equals(key)) {
			return value;
		}

		if (key.compareTo(this.key) < 0) {
			return left == null ? null : left.get(key);
		} else {
			return right == null ? null : right.get(key);
		}
	}

	public void put(String key, Osoba value) {
		if (key.compareTo(this.key) < 0) {
			if (left != null) {
				left.put(key, value);
			} else {
				left = new BinarySearchTree();
			}
		} else if (key.compareTo(this.key) > 0) {
			if (right != null) {
				right.put(key, value);
			} else {
				right = new BinarySearchTree();
			}
		} else {
			this.value = value;
		}
	}
}