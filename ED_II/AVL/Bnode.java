public class Bnode {
    private int x;
    private Bnode esq, dir;

    public Bnode(int valor) {
        x = valor;
        esq = dir = null;
    }

    // Método para adicionar um valor na árvore AVL
    public Bnode add(int valor) {
        if (valor > x) {
            if (dir != null) {
                dir = dir.add(valor);
            } else {
                dir = new Bnode(valor);
            }
        } else {
            if (esq != null) {
                esq = esq.add(valor);
            } else {
                esq = new Bnode(valor);
            }
        }
        return balancear();
    }

    // Método para balancear a árvore
    private Bnode balancear() {
        int balanceamento = fatorBalanceamento();

        // Rotação simples à direita
        if (balanceamento > 1 && fatorBalanceamento(esq) >= 0) {
            return rotacaoDireita();
        }

        // Rotação simples à esquerda
        if (balanceamento < -1 && fatorBalanceamento(dir) <= 0) {
            return rotacaoEsquerda();
        }

        // Rotação dupla à direita (esquerda-direita)
        if (balanceamento > 1 && fatorBalanceamento(esq) < 0) {
            esq = esq.rotacaoEsquerda();
            return rotacaoDireita();
        }

        // Rotação dupla à esquerda (direita-esquerda)
        if (balanceamento < -1 && fatorBalanceamento(dir) > 0) {
            dir = dir.rotacaoDireita();
            return rotacaoEsquerda();
        }

        return this;
    }

    // Rotação simples à direita
    private Bnode rotacaoDireita() {
        Bnode novaRaiz = esq;
        Bnode temp = novaRaiz.dir;

        novaRaiz.dir = this;
        esq = temp;

        return novaRaiz;
    }

    // Rotação simples à esquerda
    private Bnode rotacaoEsquerda() {
        Bnode novaRaiz = dir;
        Bnode temp = novaRaiz.esq;

        novaRaiz.esq = this;
        dir = temp;

        return novaRaiz;
    }

    // Fator de balanceamento
    private int fatorBalanceamento() {
        return altura(esq) - altura(dir);
    }

    // Fator de balanceamento de um nó específico
    private int fatorBalanceamento(Bnode no) {
        if (no == null) return 0;
        return altura(no.esq) - altura(no.dir);
    }

    // Método para calcular a altura de um nó
    private int altura(Bnode no) {
        if (no == null) return 0;
        return 1 + Math.max(altura(no.esq), altura(no.dir));
    }

    
    // Método para calcular quantidade de nós da árvore
    public int size() {
        int e = 0, d = 0;
        if (esq != null) e = esq.size();
        if (dir != null) d = dir.size();
        return 1 + e + d;
    }

    // Método para somar os valores da árvore
    public int soma() {
        int e = 0, d = 0;
        if (esq != null) e = esq.soma();
        if (dir != null) d = dir.soma();
        return x + e + d;
    }

    // Método para exibir a árvore (in-order traversal)
    public void show() {
        if (esq != null) esq.show(); // ESQ
        System.out.println(x); // RAIZ
        if (dir != null) dir.show(); // DIR
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