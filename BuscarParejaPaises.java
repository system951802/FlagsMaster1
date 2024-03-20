/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escenario2;

/**
 *
 * @author Luis Ocoro
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BuscarParejaPaises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> parejas = new HashMap<>();

        // Solicitar al usuario que ingrese las parejas de países
        System.out.println("Ingrese las parejas de países (país, pareja):");
        while (true) {
            System.out.print("País: ");
            String pais = scanner.nextLine();
            if (pais.isEmpty()) {
                break; // Salir del bucle si se ingresa una línea vacía
            }
            System.out.print("Pareja: ");
            String pareja = scanner.nextLine();
            parejas.put(pais, pareja);
        }

        // Buscar la pareja de un país específico
        while (true) {
            System.out.print("\nIngrese el país para encontrar su pareja (o escriba 'salir' para salir): ");
            String paisBuscado = scanner.nextLine();
            if (paisBuscado.equalsIgnoreCase("salir")) {
                break; // Salir del programa si se escribe "salir"
            }
            String parejaEncontrada = parejas.get(paisBuscado);
            if (parejaEncontrada != null) {
                System.out.println("La pareja de " + paisBuscado + " es " + parejaEncontrada);
            } else {
                System.out.println("No se encontró una pareja para " + paisBuscado);
            }
        }

        scanner.close();
    }
}