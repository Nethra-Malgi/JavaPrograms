package encapsulation;

public class BankMain {

	public static void main(String[] args) {

		
		Bank b=new Bank();
		b.setAccno(100);
		b.setName("honi");
		b.setBal(1223.32);
		
		System.out.println(b.getAccno());
		System.out.println(b.getName());
		System.out.println(b.getBal());
	}

}
