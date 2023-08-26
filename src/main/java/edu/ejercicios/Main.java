package Alumnos;

import Alumnos.Alumno;
import Alumnos.CursoAsignado;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            CursoAsignado curso1 = new CursoAsignado(101,"Programacion", 500 );
            CursoAsignado curso2 = new CursoAsignado(105,"Derecho",1);
            CursoAsignado curso3 = new CursoAsignado(110,"Estadistica",450);
            CursoAsignado curso4 = new CursoAsignado(120,"Electronica",400);


            Alumno al1 = new Alumno("2023015","Andrea","5555","5 calle 8-36 zona 2");
            al1.agregarCursoAsignado(curso2);
            al1.agregarCursoAsignado(curso1);

            for (CursoAsignado curso : al1.getCursoAsignados()){
                System.out.println("nombre del curso"+curso.getNombreCurso());
                System.out.println("Costo:"+curso.getNombreCurso());
            }

    }
}