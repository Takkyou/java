package ch19;

public class CoffeeTest {

	public static void main(String[] args) {
		
	Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		
		Coffee etiopitaLatte = new Latte(new EtiopiaAmericano());
		etiopitaLatte.brewing();
		
	Coffee mochaEtiopia = new Mocha(new Latte(new EtiopiaAmericano()));
	mochaEtiopia.brewing();
	}

}
