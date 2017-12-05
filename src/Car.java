/**
 * 
 */

/**
 * @author Ronak Goyal
 *
 */
public class Car implements Comparable<Car> {
 String name ;
 int price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public int compareTo(Car o) {
	// TODO Auto-generated method stub
	
	// odd even compareTo method
//	if(o.getPrice()%2==0)return -1;
//	else if(o.getPrice()%2!=0)return 1;
//	else return 0;
	// for ascending order
	if(this.getPrice() > o.getPrice())return 1;
	else if(this.getPrice() < o.getPrice())return -1;
	else return 0;
	// for descending order
//	if(this.getPrice() < o.getPrice())return 1;
//	else if(this.getPrice() > o.getPrice())return -1;
//	else return 0;
}
 
}
