import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BinarySearchTree<T extends Comparable<? super T> > {

    private BinaryNode<T> root;

    public BinarySearchTree() { }

    // TODO: initialisation
    public BinarySearchTree(T item) {
    	BinaryNode<T> newNode= new BinaryNode <T> (item);
    	root=newNode;
    }

    // TODO: on insere un nouvel item a partir de la racine
    // O(log(n))
    public void insert(T item) {
    	root.insert(item);
    }

    // TODO: est-ce qu'un item fais partie de l'arbre
    // O(log(n))
    public boolean contains(T item) {
    	boolean isContained=root.contains(item);

        return isContained;
    }

    // TODO: trouver la hauteur de l'arbre
    // O(n)
    public int getHeight() {
    	int treeHeight=root.getHeight();
        return treeHeight;
    }

    // TODO: placer dans une liste les items de l'arbre en ordre
    // O(n)
    public List<BinaryNode<T>> getItemsInOrder() {
    	List<BinaryNode<T>> orderedList = new LinkedList<BinaryNode<T>>();
    	root.fillListInOrder(orderedList);
    	
        return orderedList;
    }

    // TODO: retourner la liste d'item en String selon le bon format
    // O(n)
    public String toStringInOrder() {
    	List<BinaryNode<T>> orderedList=getItemsInOrder();    	
    	
    	StringBuilder stringList= new StringBuilder();
    	
    	stringList.append("[");
    	
    	for(BinaryNode<T> currentNode:orderedList) {
    		stringList.append(currentNode.getData()+", ");
    	}
    	stringList.delete(stringList.length()-2, stringList.length());

    	stringList.append("]");

    	
        return stringList.toString();
    }
}
