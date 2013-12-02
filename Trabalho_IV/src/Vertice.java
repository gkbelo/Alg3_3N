import java.util.*;

public class Vertice implements Comparable<Vertice>{
	public int valor;
    public ArrayList<Aresta> vizinhos;
    public LinkedList<Vertice> caminho;
    public double minDistancia = Double.POSITIVE_INFINITY;
    public Vertice anterior;
    
    public int compareTo(Vertice other){
    	return Double.compare(minDistancia, other.minDistancia);                
    }
    
    public Vertice(int valor){
    	this.valor = valor;
        vizinhos   = new ArrayList<Aresta>();
        caminho    = new LinkedList<Vertice>();
    }
    
    public int getValor(){
    	return valor;
    }        
    
    public String toString(){
        return String.valueOf(valor);
    }
}