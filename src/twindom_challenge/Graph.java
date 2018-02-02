package twindom_challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/**
 * @author Ronak Goyal
 *
 */

public class Graph {
    
    private HashMap<String, Vertex> vertices;
    private HashMap<Integer, Edge> edges;
    
    public Graph(){
        this.vertices = new HashMap<String, Vertex>();
        this.edges = new HashMap<Integer, Edge>();
    }
    
    /**
     * This constructor accepts an ArrayList<Vertex> and populates
     * this.vertices. 
     */
    public Graph(ArrayList<Vertex> vertices){
        this.vertices = new HashMap<String, Vertex>();
        this.edges = new HashMap<Integer, Edge>();
        
        for(Vertex v: vertices){
            this.vertices.put(v.getLabel(), v);
        }
        
    }
    

    public boolean addEdge(Vertex first, Vertex second){
        if(first.equals(second)){
            return false;   
        }
       
        //to check that the Edge is not in the Graph
        Edge e = new Edge(first, second);
        if(edges.containsKey(e.hashCode())){
            return false;
        }
       
        //and that the Edge isn't already incident to one of the vertices
        else if(first.containsNeighbor(e) || second.containsNeighbor(e)){
            return false;
        }
            
        edges.put(e.hashCode(), e);
        first.addNeighbor(e);
        second.addNeighbor(e);
        return true;
    }
    
 
    public boolean containsEdge(Edge e){
        if(e.getFirst() == null || e.getSecond() == null){
            return false;
        }
        
        return this.edges.containsKey(e.hashCode());
    }
    
    public boolean containsVertex(Vertex vertex){
        return this.vertices.get(vertex.getLabel()) != null;
    }
    
    public Vertex getVertex(String label){
        return vertices.get(label);
    }
    

    public boolean addVertex(Vertex vertex){
        Vertex current = this.vertices.get(vertex.getLabel());
        if(current != null){
           return false;
        }
        
        vertices.put(vertex.getLabel(), vertex);
        return true;
    }
    
 
    public Set<String> vertexKeys(){
        return this.vertices.keySet();
    }
    
    
    public Set<Edge> getEdges(){
        return new HashSet<Edge>(this.edges.values());
    }
    public static void main(String[] args){
        Graph graph = new Graph();
        
        
        //to check some vertices and add them to the graph
        Vertex[] vertices = new Vertex[5];
        for(int i = 0; i < vertices.length; i++){
            vertices[i] = new Vertex("" + i);
            graph.addVertex(vertices[i]);
        }
        
        //to show that  duplicate edges aren't added
        for(int i = 0; i < vertices.length - 1; i++){
            for(int j = i + 1; j < vertices.length; j++){
               graph.addEdge(vertices[i], vertices[j]);
               graph.addEdge(vertices[i], vertices[j]);
               graph.addEdge(vertices[j], vertices[i]);
            }
        }
        
        //to show the initial setup- all vertices adjacent to each other
        for(int i = 0; i < vertices.length; i++){
            System.out.println(vertices[i]);
            
            for(int j = 0; j < vertices[i].getNeighborCount(); j++){
                System.out.println(vertices[i].getNeighbor(j));
            }
            System.out.println();
        }
        //true
        System.out.println("Graph Contains {1, 4}: " +
                graph.containsEdge(new Edge(graph.getVertex("1"), graph.getVertex("4"))));
   
        System.out.println("Graph Contains {1, 2}: " + graph.containsEdge(new Edge(graph.getVertex("1"), graph.getVertex("2"))));
        
        System.out.println("Graph Contains {2, 3} " + graph.containsEdge(new Edge(graph.getVertex("2"), graph.getVertex("3"))));
        
        System.out.println("Is graph contains the Vertex 1: "+graph.containsVertex(new Vertex("1"))); //true
        System.out.println("Is graph contains the Vertex 6 : "+graph.containsVertex(new Vertex("6"))); //false
        System.out.println("add already existing vertex: " +graph.addEdge(vertices[1], vertices[2])); // return false Since the Edge already exist.
        System.out.println("Vertex 5: " + graph.getVertex("5")); //null Since it doesn't exist in the graph
        System.out.println("Vertex 2: " + graph.getVertex("2")); //Vertex 2
    }
    
}

