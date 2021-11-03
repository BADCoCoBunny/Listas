package cuc.edu.pruebas;

import cuc.edu.listas.ListaDoble;
import java.util.Scanner;

public class TestSumaListas {

    public static void main(String[] args) {

        ListaDoble<Integer> numero_uno = new ListaDoble<>();
        ListaDoble<Integer> numero_dos = new ListaDoble<>();
        ListaDoble<Integer> numero_reslt = new ListaDoble<>();
        Scanner scanner_int = new Scanner(System.in);

        System.out.println(">> Solo funcionando para dos números con la misma cantidad de dígitos<<\n");
        System.out.println(">> Ingrese el número 1 a sumar: ");
        int num = scanner_int.nextInt();
        String number = String.valueOf(num);
        char[] digits = number.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            numero_uno.adicionarElemento(Character.getNumericValue(digits[i]));
        }
        System.out.println(numero_uno);

        System.out.println(">> Ingrese el número 2 a sumar: ");
        num = scanner_int.nextInt();
        number = String.valueOf(num);
        digits = number.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            numero_dos.adicionarElemento(Character.getNumericValue(digits[i]));
        }
        System.out.println(numero_dos);

        System.out.println("Resultado: " + sumar(numero_uno, numero_dos));
    }

    public static ListaDoble<Integer> sumar(ListaDoble<Integer> numero_uno, ListaDoble<Integer> numero_dos) {
        if (!numero_uno.estaVacia() && !numero_dos.estaVacia()) { //Si las listas no están vacias
            ListaDoble<Integer> resultado = new ListaDoble<>(); //Lista con el número resultado
            if (numero_uno.longitud() == numero_dos.longitud()) { //Si tienen la misma cantidad de dígitos
                int num1;
                int num2;
                boolean sumar_decena = false;
                int reslt;
                for (int i = numero_uno.longitud() - 1; i >= 0; i--) { //Recorrido de las listas
                    num1 = numero_uno.buscar(i);
                    num2 = numero_dos.buscar(i);
                    if (sumar_decena) { //Si hay que sumar una decena
                        reslt = num1 + num2 + 1;
                    } else { //Sino hay que sumar una decena
                        reslt = num1 + num2;
                    }

                    if (reslt >= 10) { //Si el resultado es mayor o igual a 10
                        sumar_decena = true; //Sumar decena true
                        if (i != 0) { //Sino son los últimos dígitos a sumar
                            reslt -= 10;
                        } else {
                            reslt -= 10;
                            resultado.adicionarInicio((Integer) reslt);
                            resultado.adicionarInicio((Integer) 1);
                            return resultado;
                        }
                    } else { //Sino
                        sumar_decena = false; //Sumar decena false
                    }
                    resultado.adicionarInicio((Integer) reslt);
                }
                return resultado;
            } else if (numero_uno.longitud() > numero_dos.longitud()) { //Si en número uno tiene más dígitos que el dos
                return null;
            } else { //Si el número dos tiene más dígitos que el uno
                return null;
            }
        } else {
            return null;
        }
    }
}
