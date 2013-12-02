import java.io.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		int totalVertices = 0;
    	Dijkstra obj = new Dijkstra();
    	Grafo g = new Grafo(0);
    	
		System.out.println("Digite o caminho completo do arquivo:");
	    String local_Arq = Ler.next();

	    try{
	    	File      arquivo = new File( local_Arq );
		    BufferedReader bf = new BufferedReader(new FileReader(arquivo));
		    System.out.println("Informe a Qtde de Vértices:");
		    totalVertices = Ler.nextInt();
		    g = new Grafo(totalVertices);

		    while(bf.ready()){
		    	String[] array = bf.readLine().split(" ");
               
		    	int Origem  = Integer.parseInt(array[0]);
		    	int Destino = Integer.parseInt(array[1]);
		    	int Peso    = Integer.parseInt(array[2]);

		    	g.addAresta(Origem, Destino, Peso);
	    	
		    }
		    bf.close();
		    
	    } catch (FileNotFoundException e) {
            e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	    
	    System.out.println("Para exibir o menor caminho...");
	    System.out.println("Digite o vértice inicial:");
	    int ver1 = Ler.nextInt();
	    System.out.println("Digite o vértice final:");
	    int ver2 = Ler.nextInt();  
	    
	    obj.calcular(g.getVertice(0));
	    
	    for(Vertice v : g.getVertices()){
	 	  System.out.print("Vertice - " + v + " , Distância - "+ v.minDistancia +" , Caminho - ");
	       for(Vertice pathvert : v.caminho) {
	     	  System.out.print(pathvert+" ");
	       }
	       System.out.println(""+v);
	   }
	}
//  E:\Algoritmos_III\Trabalho_IV\carga.txt
}
