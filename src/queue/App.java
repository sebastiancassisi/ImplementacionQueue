package queue;

import java.util.PriorityQueue;
import java.util.Queue;



public class App {

	// Algoritmo fifo (El primero en entrar es el primero en salir)
	public static void main(String[] args) {

//		Queue<String> cola = new PriorityQueue<>();
//		cola.offer("1----Sebastian");
//		cola.offer("2----Juan");
//		cola.offer("3----Agustin");
//		cola.offer("4----Fernando");
//		cola.offer("5----Javier");
//		cola.offer("6----Hernan");
//
//		for (String elemento : cola) {
//			System.out.println(elemento);
//		}
//
//		// Elemento que esta en el tope de la cola
//		System.out.println("Elemento que esta en el tope de la cola= " + cola.peek() + "\n");
//
//		while (!cola.isEmpty()) {
//			// Elimina hasta que no queden mas elementos
//			System.out.println("Eliminando a " + cola.poll());
//		}
		
		
		Queue<Persona> cola = new PriorityQueue<>();
		cola.offer(new Persona(1,"Sebastian",66));
		cola.offer(new Persona(2,"Juan",33));
		cola.offer(new Persona(3,"Ramon",22));
		cola.offer(new Persona(4,"Felipe",77));
		cola.offer(new Persona(5,"Adrian",88));
		cola.offer(new Persona(6,"Lucia",99));

		for (Persona elemento : cola) {
			System.out.println(elemento);
		}

		// Elemento que esta en el tope de la cola
		System.out.println("Elemento que esta en el tope de la cola= " + cola.peek() + "\n");

		while (!cola.isEmpty()) {
			// Elimina hasta que no queden mas elementos
			System.out.println("Eliminando a " + cola.poll());
		}
		
	}

}
