
public class Book {
	private int pageNo;
	
	//Setter
	public void setData(int pageNo) {
		if(pageNo > 0) {
			this.pageNo = pageNo;
		}
		else {
			System.out.println("Invalid pageNo");
		}
	}
	
	//Getter
	public int getData() {
		return pageNo;
	}
}
