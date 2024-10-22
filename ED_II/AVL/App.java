public class App {
    public static void main(String[] args) throws Exception {
        Btree a = new Btree();
        // a.add(42);
        // a.add(51);
        // a.add(19);
        // a.add(37);
        // a.add(42);
        // a.add(86);
        // a.add(71);
        // a.add(10);
        // a.add(75);
        // a.add(22);
        // a.add(31);
        // a.add(42);
        //15, 10, 20, 8, 12, 25, 5, 11, 14, 30
        // a.add(15);
        // a.add(10);
        // a.add(20);
        // a.add(8);
        // a.add(12);
        // a.add(25);
        // a.add(5);
        // a.add(11);
        // a.add(14);
        // a.add(30);
        //51, 19, 37, 42, 86, 71, 10, 75, 22, 31, 42
        // a.add(51);
        // a.add(19);
        // a.add(37);
        // a.add(42);
        // a.add(86);
        // a.add(71);
        // a.add(10);
        // a.add(75);
        // a.add(22);
        // a.add(31);
        // a.add(42);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        a.add(11);

        a.show();
        System.out.println("----- quantidade de nós");
        System.out.println(a.size());
        System.out.println("----- soma de todos os nós");
        System.out.println(a.soma());
        System.out.println("----- árvore AVL");
        a.showEstruturado();
    }
}