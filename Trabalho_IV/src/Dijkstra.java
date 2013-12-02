import java.util.*;

public class Dijkstra{

	public void calcular(Vertice origem){
		origem.minDistancia = 0;
		PriorityQueue<Vertice> queue = new PriorityQueue<Vertice>();
	    queue.add(origem);
	              
	    while(!queue.isEmpty()){
	    	Vertice u = queue.poll();
	      	  
	        for(Aresta vizinho:u.vizinhos){
	        	Double novaDist = u.minDistancia + vizinho.peso;
	                              
	          	if(vizinho.destino.minDistancia > novaDist){
	          		queue.remove(vizinho.destino);
	                vizinho.destino.minDistancia = novaDist;
	                                      
	                vizinho.destino.caminho = new LinkedList<Vertice>(u.caminho);
	                vizinho.destino.caminho.add(u);
	                                      
	                queue.add(vizinho.destino);                                        
	          	}
	        }
	    }
	}
//	
}

