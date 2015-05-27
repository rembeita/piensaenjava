
public class precedencia {

	static void visualizar(String s){
		System.out.println(s);
	}
	
	static void temario(int i)
	{
		
	}
	
	static void alternativo(int i)
	{
		if ( i < 10)
		{
			System.out.println("El numero " + i + "es menor a 10");
		}
		else
		{
			System.out.println("El numero " + i + "es mayor a 10");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int preseden1;
		int preseden2;
		
		preseden1 = 10 + 20 * 2 * 5;
		preseden2 = (10 + 20) * 2 * 5;
		visualizar("El valor es " + preseden1);
		visualizar("El valor es " + preseden2);
		alternativo(9);
	}

	
	
}
