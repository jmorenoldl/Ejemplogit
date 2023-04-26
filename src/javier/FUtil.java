package javier;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FUtil {

	public static boolean fExiste(String filename) {
		boolean existe=true;
		try (FileReader fichero = new FileReader(filename)) {

		} catch (FileNotFoundException fnfe) {
		existe=false;
		}
		catch (IOException ioe) {
		System.out.println(ioe);
		}
		return existe;
		}
	
	
	public static void probar() {
		System.out.println("El metodo se ha ejecutado correctamente");
	}
	
}
