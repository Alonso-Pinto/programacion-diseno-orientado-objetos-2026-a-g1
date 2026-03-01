package com.corhuila.poo.semana1;

public class App {

    public static void main(String[] args) {

        // Crear 3 tareas
        Tarea tarea1 = new Tarea("Estudiar Java");
        Tarea tarea2 = new Tarea("Hacer ejercicio");
        Tarea tarea3 = new Tarea("Leer un libro");

        // 🔹 ANTES de completar
        System.out.println("=== ANTES ===");
        tarea1.mostrar();
        tarea2.mostrar();
        tarea3.mostrar();

        // Completar tareas
        tarea1.completar();
        tarea2.completar();
        tarea3.completar();

        // 🔹 DESPUÉS de completar
        System.out.println("=== DESPUÉS ===");
        tarea1.mostrar();
        tarea2.mostrar();
        tarea3.mostrar();
    }
}