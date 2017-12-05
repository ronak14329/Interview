import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 
 */

/**
 * @author Ronak Goyal
 *
 */
public class SortingComparator {

	/**
	 * @param <T>
	 * @param args
	 */
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
       List<Car> carList = new ArrayList<Car>();
       for(int i =0;i<10;i++){
    	   Car c = new Car();
    	   c.setName("H"+ (int)(Math.random()*10)+1);
    	   c.setPrice((int)(Math.random()*100)+1);
    	   carList.add(c);
       }
       Collections.sort(carList);
       for(Car c : carList){
    	   System.out.println(c.getName());
    	   System.out.println(c.getPrice());
       }
       
	}

}
