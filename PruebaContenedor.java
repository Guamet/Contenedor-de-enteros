package practica1;

public class PruebaContenedor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContenedorDeEnteros a = new ContenedorDeEnteros();
		int[] v;
		System.out.println("El contenedor a tiene "+a.cardinal()+" elementos.");
		for(int i=0; i<10; i++){
			a.insertar(i);
			a.buscar(i);
		}
		System.out.println("El contenedor a tiene "+a.cardinal()+" elementos.");
		System.out.println(a.extraer(3));
		System.out.println(a.insertar(-1));
		System.out.println(a.extraer(3));
		System.out.println(a.insertar(15));
		System.out.println(a.insertar(18));
		System.out.println(a.insertar(16));
		System.out.println(a.insertar(17));
		
		
		v = a.elementos();
		for(int i=0; i < a.cardinal(); i++) System.out.println(v[i]);
		a.vaciar();
		
		
		for(int i=0; i<100; i++){
			a.insertar(i);
			a.extraer(i);
		}
		System.out.println("El contenedor a tiene "+a.cardinal()+" elementos.");
	}

}
