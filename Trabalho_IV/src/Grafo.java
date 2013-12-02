import java.util.*;

public class Grafo {
	private ArrayList<Vertice> vertices;
    
	public Grafo(int numberVertices){
        vertices = new ArrayList<Vertice>(numberVertices);
   
        for(int i=0; i<numberVertices; i++){
        	vertices.add(new Vertice(i));
    	}
    }

	public void addAresta(int src, int dest, int peso){
		Vertice s       = vertices.get(src);
        Aresta new_edge = new Aresta(vertices.get(dest), peso);
        s.vizinhos.add(new_edge);
    }

    public ArrayList<Vertice> getVertices() {
    	return vertices;
    }

    public Vertice getVertice(int vert){
    	return vertices.get(vert);
    }
}