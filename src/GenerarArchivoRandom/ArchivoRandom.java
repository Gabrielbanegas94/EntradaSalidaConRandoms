package GenerarArchivoRandom;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoRandom {

	public static void main(String[] args) {

		FileWriter ArchivoEntrada;// Genera mi archivo con numeros aleatorios

		try {

			ArchivoEntrada = new FileWriter("Random.txt");
			BufferedWriter BufferEntrada = new BufferedWriter(ArchivoEntrada);
			int rango = (20000 - 10000) + 1;
			int cantMax = (int) (Math.random() * rango) + 10000;/// Va a establecer una cantidad aleatoria entre 10000 y
																/// 20000

			for (int i = 0; i < cantMax; i++) {
				int numeroRandom = (int) (Math.random() * 12000);/// Genera el numero que va al archivo Random.in entre
																	/// 0 y 12000
				BufferEntrada.write(String.format("%d\n", numeroRandom));
			}

			ArchivoEntrada.close();
			System.out.println("Se genero el archivo Random");

		} catch (IOException e) {
			System.out.println("No se pudo abrir el archivo");
			e.printStackTrace();
		}

	}
}
