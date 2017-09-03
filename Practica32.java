import java.util.Random;  //Biblioteca para generar aleatorios
import java.util.Scanner;
import java.util.ArrayList; //Biblioteca para generar listas
import java.util.Date;  //Biblioteca para obtener fecha y hora

public class Practica32{
	public static void main(String[] args){
		int random = generaAleatorio();
		Persona[] personas = new Persona[random]; //Arreglo de personas, nos ayudara a capturar los datos de las "n" personas
		ArrayList<Persona> array = new ArrayList<Persona>(); //ArrayList de tipo Persona, en el cual se almacenaran las personas 
		System.out.println("Numero de personas= "+random);
		pedirDatos(personas);
		moverArrayList(personas,array);
		muestraDatos(array);
	}

	//Método que genera números aleatorios
	public static int generaAleatorio(){
		Random rnd = new Random();
		int aleatorio = 5+rnd.nextInt(14); //Genera el aleatorio entre 5-15
		return aleatorio;
	}

	public static Persona nuevaPersona(){ //Instancia un objeto de tipo persona
		Persona persona = new Persona();
		return persona;
	}

	public static void pedirDatos(Persona[] personas){ //Pide los datos de la personas
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<personas.length;i++){
			System.out.println("Persona numero "+i);
			Persona persona = nuevaPersona(); //Crea una nueva persona
			System.out.println("Ingrese nombre: ");
			String nombre = sc.nextLine();
			persona.setNombre(nombre);
			System.out.println("Ingrese apellido paterno: ");
			String apellidoP = sc.nextLine();
			persona.setApellidoPaterno(apellidoP);
			System.out.println("Ingrese apellido materno: ");
			String apellidoM = sc.nextLine();
			persona.setApellidoMaterno(apellidoM);
			Date fecha = new Date(); //Obtiene la fecha en que se registran los datos de la persona
			persona.setFecha(fecha); //Guarda la fecha
			personas[i]=persona; 
		}
	}

	public static void moverArrayList(Persona[] personas,ArrayList<Persona> lista){
		for(int i=0;i<personas.length;i++){
			lista.add(personas[i]); //Añade a la persona al ArrayList
			System.out.println("Se almaceno en ArrayList");
		}
	}

	public static void muestraDatos(ArrayList<Persona> lista){
		Persona aux = new Persona();
		for(int i=0;i<lista.size();i++){
			aux=lista.get(i);
			String nombre = aux.getNombre();
			String apellidoP = aux.getApellidoPaterno();
			String apellidoM = aux.getApellidoMaterno();
			Date fecha = aux.getFecha();
			System.out.println("Numero: "+i);
			System.out.println("Nombre: "+nombre);
			System.out.println("Apellido paterno: "+apellidoP);
			System.out.println("Apellido materno: "+apellidoM);
			System.out.println("Fecha y hora: "+fecha);
		}
	} 
}
