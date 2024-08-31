
public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.gender);
		p.eat();
		p.walk();
		p.sleep();
		
		System.out.println(p.hr.heartBeat);
		System.out.println(p.hr.weight);
		p.hr.pumpBlood();
		
		System.out.println(p.br.color);
		System.out.println(p.br.weight);
		p.br.thinks();
		
		Book bo = new Book();
		System.out.println(bo.authorName);
		System.out.println(bo.bookName);
		bo.userReads();
		
		Bike bk = new Bike();
		System.out.println(bk.brand);
		System.out.println(bk.engNo);
		bk.userRides();
		
		p = null;
		// Same things
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.gender);
		p.eat();
		p.walk();
		p.sleep();
		
		System.out.println(p.hr.heartBeat);
		System.out.println(p.hr.weight);
		p.hr.pumpBlood();
		
		System.out.println(p.br.color);
		System.out.println(p.br.weight);
		p.br.thinks();
	}

}
