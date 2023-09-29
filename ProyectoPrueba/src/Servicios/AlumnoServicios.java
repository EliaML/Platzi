package Servicios;


import java.util.Scanner;

import Entidades.Alumno;

public class AlumnoServicios {

    Scanner leer= new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno(){
        Alumno a=new Alumno();
        System.out.println("ingresa el nombre:");
        a.setName(leer.next());
        System.out.println("ingresa la curp"); 
        a.setCurp(leer.next());
        System.out.println("cuantos años tiene:");
        a.setEdad(leer.nextInt());

        return a;

    }
    
}
