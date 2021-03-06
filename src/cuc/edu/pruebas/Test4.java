package cuc.edu.pruebas;

import cuc.edu.listas.ListaDoble;

public class Test4 {

    public static void main(String[] args) {
        /*Prueba de métodos de listas dobles para una lista con elementos repetidos
        Métodos probados: mostrar el total de apariciones de un elemento, eliminar
        por dato y por posición todos los elementos iguales, buscar todas la posiciones en las
        que aparece un dato, buscar todos los valores previos a un valor especificado en la lista,
        eliminar la enésima aparición de un dato en la lista.*/

        ListaDoble<Integer> numeros = new ListaDoble<>();
        Integer a = 1;
        int b = 2;

        //Adición
        System.out.println(">> Adicionando ([1, 1, 1, 2, 1, 3, 3, 1, 5, 1, 1, 6, 2, 3, 5])...");
        numeros.adicionarElemento(1);
        numeros.adicionarElemento(1);
        numeros.adicionarElemento(1);
        numeros.adicionarElemento(2);
        numeros.adicionarElemento(1);
        numeros.adicionarElemento(3);
        numeros.adicionarElemento(3);
        numeros.adicionarElemento(1);
        numeros.adicionarElemento(5);
        numeros.adicionarElemento(1);
        numeros.adicionarElemento(1);
        numeros.adicionarElemento(6);
        numeros.adicionarElemento(2);
        numeros.adicionarElemento(3);
        numeros.adicionarElemento(5);
        System.out.println("Números: " + numeros.toString());
        System.out.println("Números reverso: " + numeros.reverseToString());
        System.out.println("Elementos contenidos: " + numeros.longitud());

        //Informacion
        System.out.println("\n>> Mostrando el número de apariciones de un dato (Num1)...");
        System.out.println("Apariciones: " + numeros.apariciones(a));

        //Búsqueda
        System.out.println("\n>> Mostrando una lista con todas las posciciones en las que aparece un dato (Num1)...");
        System.out.println("Lista de apariciones: " + numeros.buscarTodos(a));

        System.out.println("\n>> Mostrando una lista con todos los valores previos a un dato (Num1)...");
        System.out.println("Números: " + numeros.toString());
        System.out.println("Lista de previos: " + numeros.buscarPrevios((Integer) 1));

        //Eliminación
        System.out.println("\n>> Eliminando todas las apariciones de un dato (Num1)...");
        System.out.println("Números antes: " + numeros.toString() + " Longitud: " + numeros.longitud());
        System.out.println("Números reverso antes: " + numeros.reverseToString());
        System.out.println("------------------------------------------------");
        numeros.eliminarElemento(a, true);
        System.out.println("Números después: " + numeros.toString() + " Longitud: " + numeros.longitud());
        System.out.println("Números reverso después: " + numeros.reverseToString());

        System.out.println("\n>> Eliminando todas las apariciones de un dato en una posición especifica (Pos2)...");
        System.out.println("Dato en la posición indicada: " + numeros.buscar(b));
        System.out.println("Números antes: " + numeros.toString() + " Longitud: " + numeros.longitud());
        System.out.println("Números reverso antes: " + numeros.reverseToString());
        System.out.println("------------------------------------------------");
        numeros.eliminarElemento(b, true);
        System.out.println("Números después: " + numeros.toString() + " Longitud: " + numeros.longitud());
        System.out.println("Números reverso después: " + numeros.reverseToString());

        System.out.println("\n>> Eliminando la enésima aparición de un dato en la lista (Num5,Apa2)...");
        System.out.println("Números antes: " + numeros.toString() + " Longitud: " + numeros.longitud());
        System.out.println("Números reverso antes: " + numeros.reverseToString());
        System.out.println("------------------------------------------------");
        numeros.eliminarElemento((Integer) 5, (int) 2);
        System.out.println("Números después: " + numeros.toString() + " Longitud: " + numeros.longitud());
        System.out.println("Números reverso después: " + numeros.reverseToString());
        
        //Sustituir
        System.out.println("\n>> Sustituyendo todos los datos iguales a un dato especificado con otro dato (Num2,Num3)...");
        System.out.println("Números antes: " + numeros.toString());
        System.out.println("Números reverso antes: " + numeros.reverseToString());
        System.out.println("------------------------------------------------");
        numeros.sustituir((Integer) 2, (Integer) 3, true);
        System.out.println("Números después: " + numeros.toString());
        System.out.println("Números reverso después: " + numeros.reverseToString());
        
        System.out.println("\n>> Sustituyendo todos los datos iguales a un dato en una posición especifica (Pos0,Num0)...");
        System.out.println("Dato a sustituir: " + numeros.buscar((int) 3));
        System.out.println("Números antes: " + numeros.toString());
        System.out.println("Números reverso antes: " + numeros.reverseToString());
        System.out.println("------------------------------------------------");
        numeros.sustituir((int) 0, (Integer) 0, true);
        System.out.println("Números después: " + numeros.toString());
        System.out.println("Números reverso después: " + numeros.reverseToString());
    }
}
