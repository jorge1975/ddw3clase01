package senati.ddw.ciclo3.clase01;

public class Tipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tipos de datos en java
		// byte, int, float, double, boolean, short, long, char
		// String se considera una clase
		// tipo variable = valor;
		byte edad=0;
		float precio=0f;
		int ndias=0;
		double sueldo=0d;
		short nota=0;
		long infinito=0;
		char categoria='a';
		boolean sexo=false;
		String nombre = "Luciana Leon";
		// Asignar valores
		edad=45;
		precio=14.5f;
		ndias=5800;
		sueldo=15850d;
		nota=19;
		infinito=1000000;
		categoria='a';
		sexo=false;
		// Impresion
		System.out.println("El nombre es " + nombre);
		System.out.println("La edad es " + edad);
		System.out.println("El precio es " + precio);
		System.out.println("Dias transcurridos es " + ndias);
		System.out.println("La calificacion  es " + nota);
		System.out.println("Categoria " + categoria);
		System.out.println("Sueldo " + sueldo);
		System.out.println("Genero o Sexo " + sexo);
		System.out.println("Monto acumulado " +infinito);
	}

}
