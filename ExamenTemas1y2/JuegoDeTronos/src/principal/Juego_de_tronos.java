package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego_de_tronos {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Batalla> batallas = new ArrayList<>();
	// punto 1
	public static void cargarFichero () {
		try (BufferedReader br = new BufferedReader(new FileReader(new File("/home/dm2/eclipse-workspace/JuegoDeTronos/src/principal/battles.csv")));) {
			int cont = 0;
			br.readLine();
			for (int i = 1;br.ready();i++) {
				String linea = br.readLine();
				//contar caracteres
				for (int j = 0;j<linea.length();j++) {
					if (linea.charAt(j)==',') 
						cont++;
				}
				//String nota = linea.substring(linea.indexOf("\""));
				if (cont==25) {
					String[] partes = linea.split(",");
					for (int k = 0;k<partes.length;k++) {
						if (partes[k]=="") {
							partes[k]+=-1;
						}
					}
					Batalla batalla = new Batalla(partes[0], Integer.parseInt(partes[1]), Integer.parseInt(partes[2]), partes[3], partes[4], partes[5], partes[6], partes[7], partes[8], partes[9], partes[10], partes [11], partes[12], partes[13], partes[14], partes[15], partes[16], Integer.parseInt(partes[17]), Integer.parseInt(partes[18]), partes[19], partes[20], partes[21], partes[22], partes[23], partes[24]);
					batallas.add(batalla);
					
				} 
				cont = 0;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("ARCHIVO NO ENCONTRADO");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR DE ENTRADA/SALIDA");
		}
	}
	
	
	
	
	
	public static void batallasPorRegion() {
		System.out.println("Dame una region");
		String buscar = sc.nextLine();
		for (int i = 0;i<batallas.size();i++) {
			if (batallas.get(i).getRegion() == buscar) {
				System.out.println(" - "+batallas.get(i).getRegion());
				System.out.println(" - "+batallas.get(i).getLocation());
				System.out.println(" - "+batallas.get(i).getName());
				System.out.println(" - "+batallas.get(i).getYear());
				System.out.println(" - "+batallas.get(i).getAttacker_king());
				System.out.println(" - "+batallas.get(i).getDefender_king());
				System.out.println(" - "+batallas.get(i).getAttacker_outcome()+"\n");
			}
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int opcion;
		cargarFichero();
		do {
			//menu
			System.out.println("1. Buscar batallas por region");
			System.out.println("2. Crear XML Batallas");
			System.out.println("3. Crar fichero binario objetos");
			System.out.println("4. Eliminar batalla fic. Binario objetos");
			System.out.println("0. Salir");
			opcion = sc.nextInt();
			switch (opcion) {
				case 1:
					batallasPorRegion();
					break;
				case 2:
								
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 0:
					
					break;
				default:
					break;
			}
		} while (opcion!=0);
	}
}
