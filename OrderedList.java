public class OrderedList {
	//features
	private Node<NumCount> lst;
	
	//builder
	public OrderedList(Node<NumCount> lst) {
		this.lst=lst;
	}
	
	//get
	public Node<NumCount> getLst(){
		return this.lst;
	}
	
	//set
	public void setLst(Node<NumCount> lst) {
		this.lst=lst;
	}
	
	//A1	
	/*
	 * scans an integer and adds it to the list 
	 * if there is a component of which num equals the integer, the function will
	 * raise count value by 1
	 * if there is not one, the function will add a new component of which 
	 * the num equals the integer and count equals 1. it will add it in a place 
	 * which keeps the increasing order of components 
	 */
	
	public void insertNum(int x) {
		Node<NumCount> p = this.lst;
		boolean change = false;
		while (p != null && !change) {
			if(p.getValue().getNum() == x) {
				p.getValue().setCount(p.getValue().getCount() + 1);
				change = true;
			}
			p = p.getNext();
		}
		if (!change) {
			p=this.lst;
			NumCount newS = new NumCount(x,1);
			Node<NumCount> newCom = null;
			if (x < p.getValue().getNum()) {
				newCom = new Node<NumCount>(newS, this.lst);
				this.lst = newCom;
			}
			else {
				while (p.getNext()!=null &&p.getNext().getValue().getNum()<x) {
					p = p.getNext();
				}
				newCom = new Node<NumCount>(newS, p.getNext());
				p.setNext(newCom);
				
			}
		}
		
	}
	//B
	// Gets an integer "n" and returns the value of the number in place "n"
	public int valueN(int n) {
		Node<NumCount> p = this.lst;
		int countTillN=0;
		
		while(p!=null) {
			countTillN+=p.getValue().getCount();
			
			if(countTillN>=n) {
				return p.getValue().getNum();
			} 
			
			p=p.getNext();
		}
		
		return 0; //Will not happen
	}
	
}




public static void first(Parking[] cars) {
	Parking fir = cars[0];
	for (int i = 0; i < cars.length; i++) {
		if (cars[i].getIn().before(fir.getIn()))
			fir = cars[i];
	}
	System.out.println(fir.getId());
}





public static int sumMoney(Parking[] cars) {
	int minutes = 0, sum = 0, cost = 0;
	for (int i =0; i < cars.length; i ++) {
		minutes = cars[i].total();
		cost = minutes - 120;
		if (cost < 0)
			cost = 0;
		sum += cost;
	}
	return sum;
}