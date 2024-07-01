public class NumCount {
	//defining features
	private int num;
	private int count;
	
	//builder
	public NumCount(int num,int count) {
		this.num=num;
		this.count=count;
	}
	
	//get
	public int getNum() {
		return this.num;
	}
	public int getCount() {
		return this.count;
	}
	
	//set
	public void setNum(int num) {
		this.num=num;
	}
	public void setCount(int count) {
		this.count=count;
	}
	
	//The function returns a String that describes the object
	public String toString() {
		String str = "";
		str = str + "num = " + this.num + " count = " + this.count;
		return str;
	}
}
