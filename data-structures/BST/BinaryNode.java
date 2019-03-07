import java.util.List;

public class BinaryNode<T extends Comparable<? super T>> {
	private T data;
	private BinaryNode<T> right;
	private BinaryNode<T> left;

	// TODO: initialisation
	// O(1)
	public BinaryNode(T data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}

	// TODO: on retourne la donnee voulue
	// O(1)
	public T getData() {
		return this.data;
	}

	// TODO: on ajoute une nouvelle donnee au bon endroit
	// O(log(n))
	public void insert(T item) {
		if (this.data.compareTo(item) >= 0) { // this.data >= item, donc va a gauche du noeud
			if (this.left == null)
				this.left = new BinaryNode<T>(item);
			else
				this.left.insert(item);
		} else {
			if (this.right == null)
				this.right = new BinaryNode<T>(item);
			else
				this.right.insert(item);
		}
	}

	// TODO: est-ce que l'item fais partie du noeuds courant
	// O(log(n))
	public boolean contains(T item) {

		boolean isContained = false;

		/*
		 * S'il un item d'un noeud est egal a la valeur, on set le flag isContained a
		 * true
		 */
		if (this.data.compareTo(item) > 0) {
			if (this.left != null && this.left.contains(item))
				isContained = this.left.contains(item);

		}

		else if (this.data.compareTo(item) < 0) {
			if (this.right != null && this.right.contains(item))
				isContained = this.right.contains(item);

		} else {
			isContained = true;
		}
		return isContained;

	}

	// TODO: on retourne la maximale de l'arbre
	// O(n)
	public int getHeight() {
		// No Child
		if (this.left == null && this.right == null) {
			return 0;
		}

		// Only one child (XOR is define by the symbol ^)
		else if (this.left != null ^ this.right != null) {
			if (this.left != null) {
				return this.left.getHeight() + 1;
			} else {
				return this.right.getHeight() + 1;
			}
		}

		// Two children
		else {
			return Math.max(this.right.getHeight(), this.left.getHeight()) + 1;
		}
	}

	// TODO: l'ordre d'insertion dans la liste est l'ordre logique
	// de manière que le plus petit item sera le premier inseré
	// O(n)
	public void fillListInOrder(List<BinaryNode<T>> result) {
		
		if (this.left != null)
			this.left.fillListInOrder(result);

		// centre
		result.add(this);

		if (this.right != null)
			this.right.fillListInOrder(result);

	}
}
