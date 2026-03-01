package com.corhuila.poo.semana1;

public class Tarea {

    // Atributos privados
    private String titulo;
    private boolean completada;

    // Constructor
    public Tarea(String titulo) {
        this.titulo = titulo;
        this.completada = false; // Siempre inicia pendiente
    }

    // Método para marcar como hecha
    public void completar() {
        completada = true;
    }

    // Método para mostrar información
    public void mostrar() {
        System.out.println("Tarea: " + titulo);

        if (completada) {
            System.out.println("Estado: Completada");
        } else {
            System.out.println("Estado: Pendiente");
        }

        System.out.println("-------------------");
    }
}