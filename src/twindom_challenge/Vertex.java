package twindom_challenge;

/**
 * 
 */
import java.util.ArrayList;
/**
 * @author Ronak Goyal
 *
 */
public class Vertex {


    private ArrayList<Edge> neighborhood;
    private String label;
    
  
    public Vertex(String label){
        this.label = label;
        this.neighborhood = new ArrayList<Edge>();
    }
    
    
    public void addNeighbor(Edge edge){
        if(this.neighborhood.contains(edge)){
            return;
        }
        
        this.neighborhood.add(edge);
    }
    
    
    public boolean containsNeighbor(Edge other){
        return this.neighborhood.contains(other);
    }
    
   
    public Edge getNeighbor(int index){
        return this.neighborhood.get(index);
    }
    

    public int getNeighborCount(){
        return this.neighborhood.size();
    }
    
 
    public String getLabel(){
        return this.label;
    }
    
  
    public String toString(){
        return "Vertex " + label;
    }
    
    public int hashCode(){
        return this.label.hashCode();
    }
    
  
    public boolean equals(Object other){
        if(!(other instanceof Vertex)){
            return false;
        }
        
        Vertex v = (Vertex)other;
        return this.label.equals(v.label);
    }
    
 
    public ArrayList<Edge> getNeighbors(){
        return new ArrayList<Edge>(this.neighborhood);
    }
    
}



