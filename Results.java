public class Results {
	private int[] arr;
	private String name;
	
	public Results(int[] arr, String name) {
		this.arr=arr;
		this.name=name;
	}
	public int[] getArr() {
		return this.arr;
	}
	public String getName() {
		return this.name;
	}
	public void setArr(int[] arr) {
		this.arr=arr;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int deltas(boolean isLonger) {
		int sum=0,delta,i;
		if(isLonger) {
			for(i=1;i<this.arr.length;i++) {
				if(this.arr[i]>this.arr[i-1]) {
					delta=this.arr[i]-this.arr[i-1];
					sum+=delta;
				}				
			}
		}
		else {
			for(i=1;i<this.arr.length;i++) {
				if(this.arr[i]<this.arr[i-1]) {
					delta=this.arr[i-1]-this.arr[i];
					sum+=delta;
				}
			}
		}
		return sum;
	}
	public boolean improving() {
		if(this.deltas(false)>this.deltas(true))
			return true;
		return false;
	}

}
