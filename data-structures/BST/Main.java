// Toute modification a ce fichier ne sera pas comptabilisée
public class Main {

    // Le main fait simplement tester votre logique pour les deux exercices

    public static void main(String[] args) {
        System.out.println("Debut des tests du TP3");
        

        
        BinarySearchTree<Integer> tree=new BinarySearchTree<Integer>(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(10);
        tree.insert(11);
        tree.insert(17);
        tree.insert(18);
        tree.insert(14);
        tree.insert(19);



        
        System.out.print(tree.toStringInOrder());
        System.out.print(tree.getHeight());
        System.out.print(tree.contains(11));
        System.out.print(tree.contains(3));

        

        

        

    }
}
