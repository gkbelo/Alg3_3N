
public class Red_Black<K extends Comparable<? super K>,V> {

	public static final boolean VERIFY_RBTREE = true;
	   
	public Nodo<K,V> root;

	public Red_Black() {
		root = null;
	}
	
    public void Inserir(K key, String valor) {
    	Nodo<K,V> ins_Nodo = new Nodo<K,V>(key, valor, "RED", null, null);
	    
    	if (root == null) {
            root = ins_Nodo;
	    } else {
            Nodo<K,V> n = root;
            while (true) {
                int compResult = key.compareTo(n.chave);
                if (compResult == 0) {
                    n.valor = valor;
                    return;
                } else if (compResult < 0) {
                    if (n.esq == null) {
                        n.esq = ins_Nodo;
                        break;
                    } else {
                        n = n.esq;
                    }
                } else {
                    assert compResult > 0;
                    if (n.dir == null) {
                        n.dir = ins_Nodo;
                        break;
                    } else {
                        n = n.dir;
                    }
                }
            }
            ins_Nodo.pai = n;
        }
    }
    
    public void print() {
        printArv(root, 0);
    }

    private static void printArv(Nodo<?,?> n, int indent) {
        if (n == null) {
            System.out.print("<empty tree> \n");
            return;
        }
        if (n.dir != null) {
            printArv(n.dir, indent + 2);
        }
        for (int i = 0; i < indent; i++)
            System.out.print(" ");
        if (  n.cor.equalsIgnoreCase("BLACK")){
            System.out.println(n.chave);
        } else {
            System.out.println("<" + n.chave + ">");
        }
        if (n.esq != null) {
            printArv(n.esq, indent + 2);
        }
    }
    
    public void Consultar( ){
    	//
    	
    }
    
    public void Remover( ){
    	//
    	
    }
    
    private void rotarEsquerda(Nodo<K,V> n) {
        Nodo<K,V> r = n.dir;
        SubstituirNodo(n, r);
        n.dir = r.esq;
        if (r.esq != null) {
            r.esq.pai = n;
        }
        r.esq = n;
        n.pai = r;
    }

    private void rotarDireita(Nodo<K,V> n) {
        Nodo<K,V> l = n.esq;
        SubstituirNodo(n, l);
        n.esq = l.dir;
        if (l.dir != null) {
            l.dir.pai = n;
        }
        l.dir = n;
        n.pai = l;
    }
    
    private void SubstituirNodo(Nodo<K,V> oldn, Nodo<K,V> newn) {
        if (oldn.pai == null) {
            root = newn;
        } else {
            if (oldn == oldn.pai.esq)
                oldn.pai.esq = newn;
            else
                oldn.pai.dir = newn;
        }
        if (newn != null) {
            newn.pai = oldn.pai;
        }
    }
}