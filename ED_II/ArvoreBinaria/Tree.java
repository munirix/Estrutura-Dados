public class Tree {
    private Node raiz;

    public Tree(){
        raiz = null;
    }

    public void add(int valor){
        if(raiz!=null){
            raiz.add(valor);
        }
        else{
            raiz = new Node(valor);
        }
    }

    public void show(){
        if(raiz!=null) raiz.show();
    }

    public int size(){
        if(raiz!=null){
            return raiz.size();
        }
        else{
            return 0;
        }
    }

    public int soma(){
        if(raiz!=null){
            return raiz.soma();
        }
        else{
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
