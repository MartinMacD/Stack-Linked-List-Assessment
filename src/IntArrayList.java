
public class IntArrayList {
	
	private int[ ] array;
	private int count;
	
	public IntArrayList() {
		array = new int[10];
		count = 0;
	}
	
	public IntArrayList(int max) {
		array = new int[max];
		count  = 0;
	}	
	
	public int getCount(){
		return count;
	}
	
	public int[] getArray(){
		return array;
	}
	
	public void add(int value){
		//add value to the last position in the array if there is space
		if(!isFull()){
			array[count] = value;
			count++;
		}
	}
	public void add(int value, int pos){
		//add value to position i in the array if there is space
		if(!isFull() && pos < array.length){
			array[pos] = value;
			count++;
		}
	}	
	public int delete(){
		//delete value at last position in the array
		int val = -1;
		int temp = 0;
		if(!isEmpty()){
			count--;
			temp = array[count];
			array[count] = 0;
			return temp;
		} 
		else return val;
	}
	public int delete(int pos){
		//delete value at position i in the array	
		int val = -1;
		int temp = 0;
		if(!isEmpty()){
			count--;
			temp = array[pos];
			array[pos] = 0;
			return temp;
		} 
		else return val;
	}
	public boolean isEmpty(){
		return count==0;
	}
	public boolean isFull(){
		return count==array.length;
	}
}
