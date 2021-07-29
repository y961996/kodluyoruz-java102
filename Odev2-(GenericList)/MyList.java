
public class MyList<T> {

	private int capacity;
	private int size = 0;
	private T[] data;
	
	@SuppressWarnings("unchecked")
	public MyList() {
		this.capacity = 10;
		this.data = (T[]) new Object[this.capacity];
	}
	
	public MyList(int capacity) {
		this.capacity = capacity;
	}
	
	public int size() {
		return this.size;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	@SuppressWarnings("unchecked")
	public void add(T data) {
		if(size >= capacity) {
			// Double the array size
			this.capacity = this.capacity * 2;
			T[] newData = (T[]) new Object[this.capacity];
			for(int i = 0; i < size; i++) {
				newData[i] = this.data[i];
			}
			this.data = newData;
		}
		// Add
		this.data[size] = data;
		size++;
	}
	
	public T get(int index) {
		if(index >= size) return null;
		return this.data[index];
	}
	
	public T remove(int index) {
		if(index >= size) return null;
		
		// Remove the item from the index
		T ret = this.data[index];
		for(int i = index; i < this.size-1; i++) {
			this.data[i] = this.data[i + 1];
		}
		this.size--;
		return ret;
	}
	
	public T set(int index, T data) {
		if(index >= size) return null;

		this.data[index] = data;
		return this.data[index];
	}
	
	public String toString() {
		String ret = "";
		
		ret += "[";
		for(int i = 0; i < size; i++) {
			if(i != size - 1)
				ret += this.data[i] + ",";
			else
				ret += this.data[i];
		}
		ret += "]";
		
		return ret;
	}
	
	public int indexOf(T data) {
		for(int i = 0; i < this.size; i++) {
			if(this.data[i].equals(data)) return i;
		}
		return -1;
	}
	
	public int lastIndexOf(T data) {
		for(int i = this.size - 1; i >= 0; i--) {
			if(this.data[i].equals(data)) return i;
		}
		return -1;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	@SuppressWarnings("unchecked")
	public T[] toArray() {
		T[] ret = (T[]) new Object[size];
		for(int i = 0; i < size; i++) {
			ret[i] = this.data[i];
		}
		return ret;
	}
	
	public void clear() {
		this.size = 0;
	}
	
	public MyList<T> subList(int start, int finish){
		MyList<T> ret = new MyList<>();
		for(int i = start; i <= finish; i++) {
			ret.add(this.data[i]);
		}
		return ret;
	}
	
	public boolean contains(T data) {
		for(T d : this.data) {
			if(data.equals(d)) return true;
		}
		return false;
	}
}
