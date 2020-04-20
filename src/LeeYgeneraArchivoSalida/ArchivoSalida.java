package LeeYgeneraArchivoSalida;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ArchivoSalida {
	
	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("Random.txt");//lee el archivo Ramdom
			Scanner lectura = new Scanner(fr);
			int cantNum = 0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			double sum = 0;
			 while(lectura.hasNextInt()) {
			 
			    int valorFile= lectura.nextInt();//tomo el entero del archivo
			    
			      if(valorFile>max) {
			      max=valorFile;
			      }
			      
			      if(valorFile<min) {
			    	  min=valorFile;
			      }
			      
			      sum+=valorFile;
			      cantNum++;
			 
			 }
			 
			 lectura.close();
			
			 double prom=  sum/cantNum;//calculamos el promedio
			 
			 ///Generamos el archivo salida
			 FileWriter ArchivoSalida;
			  try {
				ArchivoSalida = new FileWriter("Salida.txt");
				BufferedWriter SalidaFinal = new BufferedWriter(ArchivoSalida);
				//muestra en salida.out
				SalidaFinal.write("+----------+-------+");
				SalidaFinal.newLine();
				SalidaFinal.write("| Máximo   | " +  max + " |");
				SalidaFinal.newLine();
				SalidaFinal.write("+----------+-------+");
				SalidaFinal.newLine();
				SalidaFinal.write("| Mínimo   | " +  min + "     |");
				SalidaFinal.newLine();
				SalidaFinal.write("+----------+-------+");
				SalidaFinal.newLine();
				SalidaFinal.write("| Promedio | " +  String.format("%5.0f |", prom));
				SalidaFinal.newLine();
				SalidaFinal.write("+----------+-------+");
				SalidaFinal.close();
				
				System.out.println(" Se genero el archivo salida !!!");
				
				///para mostrar por consola
				System.out.println("+----------+-------+");
				System.out.println("| Máximo   | " +  max + " |");
				System.out.println("+----------+-------+");   
				System.out.println("| Mínimo   | " +  min + "     |");
				System.out.println("+----------+-------+");
				System.out.println("| Promedio | " +  String.format("%5.0f |", prom));///Solucionar lo de formato
				System.out.println("+----------+-------+");
				
				
			} catch (IOException e) {
				System.out.println(" No se genero el archivo salida");
				e.printStackTrace();
			}///TRYcatch SALIDA.OUT
			 
	
			
		} catch (FileNotFoundException e) {
			System.out.println("No se abrio el archivo");
			e.printStackTrace();
		}///TRYCATCH DE RAMDOM.IN
	
	
	
	}///Fin del main
	
	
}///Fin de la clase
