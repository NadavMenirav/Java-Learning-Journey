public class Song {
	
	private String name;
	private int lenS;
	
	public Song(String name, int lenS) {
		this.name=name;
		this.lenS=lenS;
	}
	
	public String getName() {
		return this.name;
	}
	public int getLenS() {
		return this.lenS;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setLenS(int lenS) {
		this.lenS=lenS;
	}
	
	public String toString() {
		String str="";
		str+="name= "+this.name+" length= "+this.lenS;
		return str;
	}
	public boolean long1() {
		if (this.lenS>=180)
			return true;
		return false;
	}	

}
	