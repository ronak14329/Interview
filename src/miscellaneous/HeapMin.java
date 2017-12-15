package miscellaneous;
import java.util.ArrayList;

public class HeapMin {
public HeapMin(){}
	ArrayList<Integer> store = new ArrayList<>();

public void swap(int index1,int index2){
	int temp = store.get(index1);
	store.set(index1,store.get(index2));
	store.set(index2, temp);
}
public int size(){
	return store.size();
}
public int peak(){
	return store.get(0);
}
public void insert(int value){
	store.add(value);
	bubbleUp(size()-1);
}
public void bubbleUp(int childIndex){
	int parentIndex=getParentIndex(childIndex);
	while(childIndex>0 && store.get(parentIndex)>store.get(childIndex)){
		swap(childIndex,parentIndex);
		childIndex=parentIndex;
		parentIndex=getParentIndex(childIndex);
	}
}
public int getParentIndex(int childIndex){
	if(childIndex%2==0){
		return(childIndex-2)/2;
	}else{
		return (childIndex-1)/2;
	}
}
public int removePeak(){
	swap(0,size()-1);
	int toreturn=store.get(size()-1);
	bubbleDown(0);
	return toreturn;
}
public void bubbleDown(int parentIndex){
	int childIndex1=2*parentIndex+1;
	int childIndex2=2*parentIndex+2;
	int masterIndex;
	if(childIndex1>=size()){
		return;
	}else if(childIndex2>=size()){
		masterIndex=childIndex1;
	}else if(store.get(childIndex1)<store.get(childIndex2)){
		masterIndex=childIndex1;
	}else{
		masterIndex=childIndex2;
	}
	
	//
	while (parentIndex < size() - 1 && store.get(parentIndex) > store.get(masterIndex)){
        this.swap(parentIndex, masterIndex);
        
        parentIndex = masterIndex;
        childIndex1 = 2 * parentIndex + 1;
        childIndex2 = 2 * parentIndex + 2;
        if (childIndex1 >= this.size()){
            return;
        } else if (childIndex2 >= this.size()){
            masterIndex = childIndex1;
        } else if (store.get(childIndex1) < store.get(childIndex2)){
            masterIndex = childIndex1;
        } else {
            masterIndex = childIndex2;
        }
    }
	//
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}





