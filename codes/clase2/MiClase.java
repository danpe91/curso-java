//package principal.paquete;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class MiClase  extends ClaseAbstracta{

	public MiClase(int i) {

	}
	void sumar(int a, int b) {

		a = 2;
	}
}

abstract class ClaseAbstracta {

	public ClaseAbstracta() {}
	public int a = 30;
	abstract void sumar(int a, int b);
	int resta (int a, int b) {
		return a - b;
	}
}

interface A {

	void imprimirLista(List<Integer> lista);
	int A = 0;
}

interface B extends A {

	int imprimirLista();
}

interface C  {

	void hola();
}

class SubB implements B, C {

	public void imprimirLista(List<Integer> lista) {}
	public int imprimirLista() {
		return 0;
	}
	public void hola() {

	}
}

class AB extends SubB{

}

class SubA1 implements A{

	public void imprimirLista(List<Integer> l) {

		for(int a : l) {
			System.out.println(a);
		}
	}

}

class SubA2 implements A{

	public int valor = 3;

	// nivel de acceso -> tipo de dato que regresa -> nombre del metodo -> (parametros) -> cuerpo
	public void imprimirLista(List<Integer> l) {

		int index = l.size();
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(--index));
		}
	}

	public int regresaValor() {
		return 2;
	}
}

class SubSubA extends SubA2 {

int valor = 5;
	public void imprimirLista(List<Integer> l) {
		System.out.println("SubSub");
		int index = l.size();
		for (int i = 0; i < l.size() / 2; i++) {
			System.out.println(l.get(--index));
		}
	}

}

class OtraClase extends MiClase implements A {

	static int  x = 0;
	int[] arreglo, arreglo2, matriz[];
	
	public OtraClase() {
		super(8);
		arreglo = new int[5];
		arreglo[0] = 0;
		arreglo[1] = 1;
		arreglo[2] = 2;
		arreglo[3] = 3;
		arreglo[4] = 4;
	}

	public void imprimirArreglo() {

		int size = arreglo.length;
		for(int i = 0; i < size; i++) {
			System.out.println(arreglo[i]);
		}
		for (int valor : arreglo) {
			System.out.println(valor);
		}
	}

	public static void imprimirList(List<Integer> lista) {

		for (int valor : lista) {
			System.out.println(valor);
		}
	}

	public void imprimirLista(List<Integer> lista) {

	}

	public static void main(String[] args) {
		List<Integer> lista = new LinkedList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		List<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(1);
		lista2.add(1);
		lista2.add(1);
		lista2.add(1);
		lista2.add(1);

		// imprimirList(lista);
		// imprimirList(lista2);

		A s1 = new SubA1();
		SubA2 s2 = new SubA2();
		s1.imprimirLista(lista);
		s2.imprimirLista(lista);
		//s2.regresaValor();

		SubSubA s3 = new SubSubA();
		s3.imprimirLista(lista);
		System.out.println(s2.valor);
		System.out.println(s3.valor);
		A n = new AB();
		ClaseAbstracta ca = new MiClase(0);
	}
}
