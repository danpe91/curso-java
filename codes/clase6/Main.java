import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class Main {

	public static int variableEstatica;
	public static String cadenaEstatica;

	public int variableNoEstatica;
	static {
		variableEstatica = 300;
		cadenaEstatica = "Hola";
	}

	{
		variableEstatica = 400;
		variableNoEstatica = 100;
	}

	public static void imprimeValores() {

		System.out.println(String.format("(%s, %d)", cadenaEstatica, variableEstatica));
	}

	public void otroMetodoNoEstatico() {

		System.out.println(String.format("(%s, %d, %d)", cadenaEstatica, variableEstatica, variableNoEstatica));
	}

	public static void main(String[] args) {
		
		Main.imprimeValores();
		Main m = new Main();
		
		m.imprimeValores();
		m.variableEstatica = 499;
		
		Main.imprimeValores();
		m.imprimeValores();

		System.out.println("Interna");
		Main.ClaseInterna ci = new Main.ClaseInterna();
		ci.cadenaEstatica = "abcdef";
		Main.imprimeValores();
		m.imprimeValores();
		ci.imprimeValores();

		Main.OtraClaseInterna oci = m.getInstanceOfInterna();
		System.out.println(oci.suma(10, 23));
		System.out.println( (((oci.suma(10,23) % 2 == 0))? ("Par"):("Impar")));

		System.out.println((((oci.suma(20,24) & 1) == 0)?("see"):("noo")));		

		FileReader flf;
		FileReader fls;
		BufferedReader br;
		File file;
		String line;

		try {
			file = new File("rutaArchivo.txt");
			System.out.println(file.exists());
			System.out.println(file.getAbsolutePath());

			flf = new FileReader(file);
			fls = new FileReader("." + File.separator + "rutaArchivo.txt");
			br = new BufferedReader(flf);

			System.out.println(file.exists());
			while (((line = br.readLine()) != null) && !line.isEmpty()) {

				System.out.println(line);
			}
		} catch (IOException ioe) {
			System.out.println("Ocurrio un error al leer el archivo");
		}

	}
	
	public OtraClaseInterna getInstanceOfInterna() {

		return new OtraClaseInterna();
	}
	
	public static class ClaseInterna extends Main {
	}

	class OtraClaseInterna {

		public int suma(int a, int b) {

			return (((a + b) > 50)?( (a+b) % 50) : (a + b));
		}
	}
}
