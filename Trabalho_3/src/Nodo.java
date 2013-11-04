
public class Nodo<K extends Comparable<? super K>, V> {

    public K chave;
    public String valor;
    public Nodo<K,V> esq;
    public Nodo<K,V> dir;
    public Nodo<K,V> pai;
    public String cor;

    public Nodo( K key, String valor, String cor, Nodo<K,V> esq, Nodo<K,V> dir ) {
        this.chave = key;
        this.valor = valor;
        this.cor   = cor;
        this.esq   = esq;
        this.dir   = dir;
        
        if (esq != null){ 
        	esq.pai = this;
        }
        if (dir != null){ 
        	dir.pai = this;
        }
        this.pai = null;
    }   
}