
public class punto3 {
	
	static int prueba(int intento, int solucion){
		int resultado = 0;
	
		if (intento > solucion){
			resultado = +1;
		}
		else if (intento < solucion){
			resultado = -1;
		}
		else
		{
			resultado = 0;
		}
		return resultado;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prueba(10, 5));
		System.out.println(prueba(5, 10));
		System.out.println(prueba(5, 5));
	}

}
