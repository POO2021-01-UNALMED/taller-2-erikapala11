package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	 public static boolean cambiarColor(String color) {
		if (color== "blanco")
			return true;
		if (color=="rojo")
			return true;
		if (color=="verde")
			return true;
		if (color=="amarillo")
			return true;
		if (color=="negro")
			return true;
		else
			return false;
		
		
			
	}
	
}
