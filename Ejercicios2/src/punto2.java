
public class punto2 {

	static void visualizar(String s){
		System.out.println(s);
	}
	
	static int ternario(int i)
	{
		return i < 10 ? i * 100 : i * 10;
	}
	
	static int alternativo(int i)
	{
		if ( i < 10)
		{
			System.out.println("El numero " + i + " es menor a 10");
			return i * 100;
		}
		else
		{
			System.out.println("El numero " + i + " es mayor a 10");
			return i * 10;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alternativo(30);
		alternativo(3);
		int val1 = ternario(30);
		int val2 = ternario(4);
		System.out.println("Ternario " + val1);
		System.out.println("Ternario2 " + val2);

	
	}

	
	
}