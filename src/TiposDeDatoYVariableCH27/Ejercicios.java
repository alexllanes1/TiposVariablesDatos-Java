package TiposDeDatoYVariableCH27;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Hola Mundo");
		//Tipos de Datos
		
		//byte: sirve para representarun valor numerico de 8 bits.
		byte salas = 10;
		System.out.println(salas);
		
		//short: sirve para representar un valor numerico de 16 bits
		
		short asientos = 1120;
		System.out.println(asientos);
		
		//int: sirve para almacenar 32 bits
		int dulces = 3476;
		System.out.println(dulces);
		
		//long: Sirve para represenar un valor númerico
		
		long clientes = 313600;
		System.out.println(clientes);
		
		//float: Sirve para almacenar un valor númerico de 32 bits
		float palomitas = 35.5f;
		System.out.println(palomitas);
		
		//double: 64 bits
		double ganancia = 23770880.7d;
		System.out.println(ganancia);
		
		//Boolean para representar valores booleanos
		//char Sirve para un caracter o número (solo uno)
		//casting sirve para convertir tipos de datos
		
		double num = 59.7d;
		int numInt = (int) num;
		System.out.println("double " + numInt);
		
		int numLong = (int) num;
		System.out.println("long " + numLong);
		
		String cantidad = "85";
		String precio = "59.7";
		int cantEntero = Integer.parseInt(cantidad);
		double precioDouble = Double.parseDouble(precio);
		System.out.println("El valor de la compra es: " + (cantEntero * precioDouble));

		
		//Operadores aritmeticos
		int dias = 28;
		dias = dias/2;
		System.out.println("dias: " + dias);
		
		int p=0;
		p++;
		p++;
		p++;
		System.out.println(p);
		
		int a =10;
		int b =15;
		boolean resultado;
		resultado = a != b;
		System.out.println("Resultado de la operacion: " + resultado);

		
		}

}
