public class Btree {
    private Bnode raiz;

    public Btree() {
        raiz = null;
    }

    // Método para adicionar um valor na árvore AVL
    public void add(int valor) {
        if (raiz != null) {
            raiz = raiz.add(valor);
        } else {
            raiz = new Bnode(valor);
        }
    }

    // Método para exibir a árvore
    public void show() {
        if (raiz != null) raiz.show();
    }

    // Método para calcular o tamanho da árvore
    public int size() {
        if (raiz != null) {
            return raiz.size();
        } else {
            return 0;
        }
    }

    // Método para somar os valores da árvore
    public int soma() {
        if (raiz != null) {
            return raiz.soma();
        } else {
            return 0;
        }
    }

    // Método para exibir a árvore de forma estruturada
    public void showEstruturado() {
        if (raiz != null) {
            raiz.showEstruturado("", true);
        } else {
            System.out.println("Árvore vazia");
        }
    }
}