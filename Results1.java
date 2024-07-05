public class Results1 {
	//Attributes
	private int[] arr;
	private String name;
	
	//Builder
	public Results1(int[] arr, String name) {
		this.arr = arr;
		this.name = name;
	}
	
	//Get
	public int[] getArr() {
		return this.arr;
	}
	
	public String getName() {
		return this.name;
	}
	
	//Set
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int deltas(boolean isLonger) {
		int sum = 0;
		if (isLonger) {
			for (int i = 0; i < this.arr.length - 1; i++) {
				if (this.arr[i] < this.arr[i + 1]) {
					sum += this.arr[i + 1] - this.arr[i];
				}
			}
			return sum;
		}
		for (int i =0; i < this.arr.length - 1; i++) {
			if (this.arr[i] > this.arr[i + 1])
				sum += this.arr[i] - this.arr[i + 1];
		}
		return sum;
	}
}
