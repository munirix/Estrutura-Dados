public class Node {
    private int x;
    private Node esq, dir;

    public Node(int valor){
        x = valor;
        esq = dir = null;
    }

    public void add(int valor){
        if(valor > x){
            if(dir!=null) dir.add(valor);
            else dir = new Node(valor);
        }
        else{
            if(esq!=null) esq.add(valor);
            else esq = new Node(valor);
        }
    }

    public void show(){
        
        if(dir!=null) dir.show();    // DIR
        System.out.println(x);       // RAIZ
        if(esq!=null) esq.show();    // ESQ
        
    }

    public int size(){
        int e = 0, d = 0;
        if(esq!=null) e = esq.size();
        if(dir!=null) d = dir.size();
        return 1 + e + d;
    }

    public int soma(){
        int e = 0, d = 0;
        if(esq!=null) e = esq.soma();
        if(dir!=null) d = dir.soma();
        return x + e + d;
    }
    // Método para exibir a árvore de forma estruturada
    public void showEstruturado(String prefixo, boolean isLeft) {
        if (dir != null) {
            dir.showEstruturado(prefixo + (isLeft ? "│   " : "    "), false);
        }
        System.out.println(prefixo + (isLeft ? "└── " : "┌── ") + x);
        if (esq != null) {
            esq.showEstruturado(prefixo + (isLeft ? "    " : "│   "), true);
        }
    }
}
