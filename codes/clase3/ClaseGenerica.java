import java.util.Stack;

class ClaseGenerica<T> {
	T t1;

	public void asignarT(T t1) {

		this.t1 = t1;
	}

	public void imprimir() {
		System.out.println(t1);
	}
}
class ClaseGenericaNumber<T extends Number> {
	T t1;

	public void asignarT(T t1) {

		this.t1 = t1;
	}

	public void imprimir() {
		System.out.println(t1);
	}
}

class Main {

	public static void main(String[] args) {
		
		ClaseGenerica<Integer> cg = new ClaseGenerica<Integer>();
		cg.asignarT(10);
		cg.imprimir();
		ClaseGenerica<String> cg2 = new ClaseGenerica<String>();
		cg2.asignarT("Caden");
		cg2.imprimir();
		ClaseGenerica<Object> cg3 = new ClaseGenerica<Object>();
		cg3.asignarT("Caden");
		cg3.imprimir();
		cg3.asignarT(20);
		cg3.imprimir();
		cg3.asignarT(2.3);
		cg3.imprimir();
		cg3.asignarT(new Main());
		cg3.imprimir();
		Object o = new Integer(2);
		int x =  (Integer)o  + (Integer)o;

		ClaseGenericaNumber<Number> cgn = new ClaseGenericaNumber<Number>();
		cgn.asignarT(10.2);
		cgn.imprimir();

		Stack<Integer> st = new Stack<Integer>();
		st.push(2);
		st.push(3);

		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}

	public String toString() {
		return "Objecto Main";
	}
}

