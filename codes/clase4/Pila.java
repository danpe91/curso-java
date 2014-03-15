import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Pila<T> {

	private Object[] elementos;
	private int tamMax;
	private int indice;

	public Pila(int tamMax) {

		this.tamMax = tamMax;
		this.indice = -1;

		elementos = new Object[tamMax];
	}

	public void push(T elemento) {

		elementos[++indice] = elemento;
	}

	public T top() {

		return (T)elementos[indice];
	}

	public T pop() {

		T e = (T)elementos[indice--];

		return e;
	}

	public int size() {

		return indice + 1;
	}

	public static void main(String[] args) {
		
		Pila<Integer> pila = new Pila<Integer>(5);
		System.out.println(pila.size());

		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		System.out.println(pila.size());
		
		System.out.println();
		
		while (pila.size() > 0) {
			System.out.println(pila.pop());
		}
		// System.out.println("Entrada");
		// Pila<Float> p = new Pila<Float>(5);

		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader bf = new BufferedReader(isr);

		// try {
			
		// 	String line;
		// 	while((line = bf.readLine()) != null && !line.isEmpty()) {

		// 		float e = Integer.valueOf(line);
		// 		p.push(e);
		// 	}
		// } catch(NumberFormatException nfe) {
		// 	System.out.println("Numero erroneo");
		// 	p.push(0f);
		// } catch(IOException e) {
		// 	System.out.println("Error");
		// } catch(Exception w) {
			
		// }
		// finally {
		// 	System.out.println("Listo");
		// }
		// System.out.println("Salida");
		// while (p.size() > 0) {
		// 	System.out.println(p.pop());
		// }	

		Scanner s = new Scanner(System.in);
		Pila<Object> otraPila = new Pila<Object>(6);
		System.out.println("Entrada");
		try {

			int e;
			String eString, lineaCompleta;
			float f;
			long l;
			System.out.println("Entero");
			e = s.nextInt();
			s.nextLine();
			System.out.println("linea");
			lineaCompleta = s.nextLine();
			System.out.println("next");
			eString = s.next();
			System.out.println("flotante");
			f = s.nextFloat();
			System.out.println("long");
			l = s.nextLong();
			otraPila.push(e);
			otraPila.push(lineaCompleta);
			otraPila.push(eString);
			otraPila.push(f);
			otraPila.push(l);
		} catch(ArrayIndexOutOfBoundsException e) {

		} catch(Exception e) {
			System.out.println("Ocurio algo malo");
			e.printStackTrace();
		}

		System.out.println("Salida");
		while (otraPila.size() > 0) {
			System.out.println(otraPila.pop());
		}	

	}
}