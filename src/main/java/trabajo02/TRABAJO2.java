/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trabajo02;
import java.util.ArrayList;
import java.util.List;


import java.util.*;

public class TRABAJO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Primer Ajuste*/
        int MemoriaTotal = 2000;
        int MemoriaUtilizada=0;//Tmaño del sistema Operativo
          
 
        System.out.print("Ingrese el número de particionesel (sistema Operativo cuenta como particion): ");
        int numParticiones = scanner.nextInt();

        List<Particion1> particiones = new ArrayList<>();
        List< Proceso1 > procesos= new ArrayList<>();
        for (int i = 0; i < numParticiones; i++) {
            System.out.print("Ingrese el tamaño de la partición " + (i + 1) + ": ");
            int tamanoParticion = scanner.nextInt();
            if (tamanoParticion > MemoriaTotal) {
                System.out.println("El tamaño de la partición no puede ser mayor que la memoria total.");
                return;
                
            }
            particiones.add(new Particion1(i + 1, tamanoParticion));
        }
        /*procesos.add(new Proceso1("S0",100));
        procesos.add(new Proceso1("JAVA", 200));
        procesos.add(new Proceso1("word", 700));
        procesos.add(new Proceso1("Paint", 1100));*/
        procesos.add(new Proceso1("S.O", 100));
        procesos.add(new Proceso1("JAVA", 70));
        procesos.add(new Proceso1("word", 200));
        procesos.add(new Proceso1("Paint", 10));
        procesos.add(new Proceso1("sql", 10));
        procesos.add(new Proceso1("a", 250));

        for (int i = 0; i < procesos.size(); i++) {
        Proceso1 proceso = procesos.get(i);
        boolean asignado = false;
        for (int j =0 ; j < particiones.size(); j++) {
            Particion1 particion = particiones.get(j);
            if (!particion.ocupada && particion.tamano >= proceso.tamano) {
            particion.ocupada = true;
            particion.nombreProceso = proceso.nombre;
            asignado = true;
            System.out.println(proceso.nombre + " asignado a la Particion " + particion.id);
            MemoriaUtilizada += proceso.tamano;
        break;
    }
}

if (!asignado) {
                System.out.println(proceso.nombre + " no fue asignado a memoria.");
            }
}
        int MemoriaDisponible=MemoriaTotal-MemoriaUtilizada;
        System.out.println("Memoria dispnible es: "+MemoriaDisponible);
        
        
    }


            
            }
        
    

            
        
        
    
