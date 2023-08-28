/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo02;

/**
 *
 * @author Ammi
 */
class Particion1 {
    int id;
    int tamano;
    boolean ocupada;
    String nombreProceso;

    public Particion1(int id, int tamano) {
        this.id = id;
        this.tamano = tamano;
        this.ocupada = false;
        this.nombreProceso = "";
    }
}