package twindom_challenge;

/**
 * 
 */

/**
 * @author Ronak Goyal
 *
 */

public class Edge  {

    private Vertex first, second;
   
    public Edge(Vertex one, Vertex two){
        this.first = (one.getLabel().compareTo(two.getLabel()) <= 0) ? one : two;
        this.second = (this.first == one) ? two : one;
    }
    
    
    public Vertex getNeighbor(Vertex current){
        if(!(current.equals(first) || current.equals(second))){
            return null;
        }
        return (current.equals(first)) ? second : first;
    }
    
    public Vertex getFirst(){
        return this.first;
    }
    
    public Vertex getSecond(){
        return this.second;
    }
       
    public String toString(){
        return "({" + first + ", " + second + "}, ";
    }
    
    public int hashCode(){
        return (first.getLabel() + second.getLabel()).hashCode(); 
    }
    
    public boolean equals(Object other){
        if(!(other instanceof Edge)){
            return false;
        }
        
        Edge e = (Edge)other;
        
        return e.first.equals(this.first) && e.second.equals(this.second);
    }

  
}

