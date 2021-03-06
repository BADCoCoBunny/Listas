package cuc.edu.pruebas;

import cuc.edu.listas.ListaDoble;

public class Test3 {

    public static void main(String[] args) {
        /*Prueba de métodos de listas dobles para una lista sin elementos repetidos
        Métodos probados: adicionar elemento, adicionar en posición especifica,
        adicionar al inicio y al final, eliminar una vez, eliminar por posicion una vez,
        eliminar en un intervalo de posiciones, eliminar al inicio y al final, buscar por dato,
        buscar por posición, buscar por intervalo de posiciones, buscar penúltimo y pultimo, 
        mover un elemento de una posición X a una Y, sustituir un elemento en una posición especificada
        con un elemento especificado.*/

        ListaDoble<Integer> numeros = new ListaDoble<>();
        Integer a = 2020;
        int b = 8;

        //Adición
        System.out.println(">> Adicionando ([10, 20, 30, 40, 50, 60, 70, 80, 90, 100])...");
        numeros.adicionarElemento(10);
        numeros.adicionarElemento(20);
        numeros.adicionarElemento(30);
        numeros.adicionarElemento(40);
        numeros.adicionarElemento(50);
        numeros.adicionarElemento(60);
        numeros.adicionarElemento(70);
        numeros.adicionarElemento(80);
        numeros.adicionarElemento(90);
        numeros.adicionarElemento(100);
        System.out.println("Números: " + numeros.toString());
        System.out.println("Números reverso: " + numeros.reverseToString());
        System.out.println("Elementos contenidos: " + numeros.longitud());

        System.out.println("\n>> Adicionando en posición especifica (Num2020)(Pos5)...");
        numeros.adicionarElemento(2020, 5);
        System.out.println("Números: " + numeros.toString());
        System.out.println("Números reverso: " + numeros.reverseToString());
        System.out.println("Elementos contenidos: " + numeros.longitud());

        System.out.println("\n>> Adicionando al inicio (Num0)...");
        numeros.adicionarInicio(0);
        System.out.println("Números: " + numeros.toString());
        System.out.println("Números reverso: " + numeros.reverseToString());
        System.out.println("Elementos contenidos: " + numeros.longitud());

        System.out.println("\n>> Adicionando al final (Num110)...");
        numeros.adicionarFinal(110);
        System.out.println("Números: " + numeros.toString());
        System.out.println("Números reverso: " + numeros.reverseToString());
        System.out.println("Elementos contenidos: " + numeros.longitud());

        //Eliminación
        System.out.println("\n>> Eliminando dato una vez (Num2020)...");
        numeros.eliminarElemento(a, false);
        System.out.println("Números: " + numeros.toString());
        System.out.println("Números reverso: " + numeros.reverseToString());
        System.out.println("Elementos contenidos: " + numeros.longitud());

        System.out.println("\n>> Eliminando dato por posición una vez (Pos8)...");
        numeros.eliminarElemento(b, false);
        System.out.println("Números: " + numeros.toString());
        System.out.println("Números reverso: " + numeros.reverseToString());
        System.out.println("Elementos contenidos: " + numeros.longitud());

        System.out.println("\n>> Eliminando dato por posición negativa una vez (Pos-5)...");
        b = -5;
        numeros.eliminarElemento(b, false);
        System.out.println("Números: " + numeros.toString());
        System.out.println("Números reverso: " + numeros.reverseToString());
        System.out.println("Elementos contenidos: " + numeros.longitud());

        System.out.println("\n>> Eliminando datos en un intervalo de posiciones (Pos3,Pos5)...");
        numeros.eliminarElemento(3, 5);
        System.out.println("Números: " + numeros.toString());
        System.out.println("Números reverso: " + numeros.reverseToString());
        System.out.println("Elementos contenidos: " + numeros.longitud());

        System.out.println("\n>> Eliminando al inicio...");
        numeros.eliminarInicial();
        System.out.println("Números: " + numeros.toString());
        System.out.println("Números reverso: " + numeros.reverseToString());
        System.out.println("Elementos contenidos: " + numeros.longitud());

        System.out.println("\n>> Eliminando al final...");
        numeros.eliminarUltimo();
        System.out.println("Números: " + numeros.toString());
        System.out.println("Números reverso: " + numeros.reverseToString());
        System.out.println("Elementos contenidos: " + numeros.longitud());

        //Búsqueda
        System.out.println("\n>> Búsqueda por dato (Num60)...");
        a = 60;
        System.out.println("Posición: " + numeros.buscar(a));

        System.out.println("\n>> Búsqueda por posición (Pos3)...");
        b = 3;
        System.out.println("Dato: " + numeros.buscar(b));

        System.out.println("\n>> Búsqueda por intervalo de posiciones (Pos0, pos2)...");
        System.out.println("Lista resultado: " + numeros.buscar(0, 2));

        System.out.println("\n>> Búsqueda penúltimo dato...");
        System.out.println("Números: " + numeros.toString());
        System.out.println("Penúltimo dato: " + numeros.buscarPreFinal());

        System.out.println("\n>> Búsqueda último dato...");
        System.out.println("Números: " + numeros.toString());
        System.out.println("Último dato: " + numeros.buscarFinal());

        //Mover
        System.out.println("\n>> Mover dato (Pos1,Pos4)...");
        System.out.println("Datos a mover: " + numeros.buscar((int) 1) + "-" + numeros.buscar((int) 4));
        System.out.println("Números antes: " + numeros.toString());
        System.out.println("Números reverso antes: " + numeros.reverseToString());
        System.out.println("------------------------------------------------");
        numeros.mover(1, 4);
        System.out.println("Números después: " + numeros.toString());
        System.out.println("Números reverso después: " + numeros.reverseToString());

        //Sustituir
        System.out.println("\n>> Sustituyendo un dato especificado con otro dato (Num10,Num1)...");
        System.out.println("Números antes: " + numeros.toString());
        System.out.println("Números reverso antes: " + numeros.reverseToString());
        System.out.println("------------------------------------------------");
        numeros.sustituir((Integer) 10, (Integer) 1, false);
        System.out.println("Números después: " + numeros.toString());
        System.out.println("Números reverso después: " + numeros.reverseToString());
        
        System.out.println("\n>> Sustituyendo un dato en una posición especifica (Pos3,Num0)...");
        System.out.println("Dato a sustituir: " + numeros.buscar((int) 3));
        System.out.println("Números antes: " + numeros.toString());
        System.out.println("Números reverso antes: " + numeros.reverseToString());
        System.out.println("------------------------------------------------");
        numeros.sustituir((int) 3, (Integer) 0, false);
        System.out.println("Números después: " + numeros.toString());
        System.out.println("Números reverso después: " + numeros.reverseToString());
    }
}
