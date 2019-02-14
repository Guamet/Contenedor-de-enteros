package practica1;

public class ContenedorDeEnteros {
	
	private Nodo primero;
	private int size;
	
	public ContenedorDeEnteros() {
		primero = null;
		size = 0;
	}

	public int cardinal() {
		return size;
	}
	
	public boolean insertar(int valor) {
		if(buscar(valor)) {
			return false;
		}
		Nodo nuevo = new Nodo(valor, primero);
		primero = nuevo;
		size++;
		return true;
	}
	
	public boolean extraer(int valor) {
		if(buscar(valor)) {
			int pos = indexOf(valor);
			if(pos == 0) {
				Nodo actual1 = primero.siguiente;
				primero = actual1;
				size--;
				return true;
			}
			Nodo actual2 = getNodo(pos - 1);
			actual2.siguiente = actual2.siguiente.siguiente;
			size--;
			return true;
		}
		return false;
	}

	public boolean buscar(int valor) {
		if(indexOf(valor) != -1) {
			return true;
		}
		return false;
	}
	
	public void vaciar() {
		primero = null;
		size = 0;
	}

	public int[] elementos() {
		int[] res = new int[size];
		for(int i = 0; i < size; i++) {
			res[i] = getNodo(i).valor;
		}
		return res;
	}
	
	private Nodo getNodo(int ind) {
		Nodo actual = primero;
		for(int i = 0; i < ind; i++) {
			actual = actual.siguiente;
		}
		return actual;
	}
	
	private int indexOf(int valor) {
		if(size == 0) {
			return -1;
		}else {
			Nodo actual = primero;
			int pos = 0;
			while(actual != null) {
				if(actual.valor == valor) {
					return pos;
				}
				actual = actual.siguiente;
				pos++;
			}
			return -1;
		}
	}
	
	private class Nodo{
		private int valor;
		private Nodo siguiente;
		
		public Nodo(int value, Nodo next) {
			valor = value;
			siguiente = next;
		}
	}
}