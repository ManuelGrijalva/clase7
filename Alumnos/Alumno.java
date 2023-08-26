package Alumnos;

import java.util.ArrayList;

        public class Alumno {
            private  String carnet;

            public String getCarnet() {
                return carnet;
            }

            public void setCarnet(String carnet) {
                this.carnet = carnet;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public String getTelefono() {
                return telefono;
            }

            public void setTelefono(String telefono) {
                this.telefono = telefono;
            }

            public String getDireccion() {
                return direccion;
            }

            public void setDireccion(String direccion) {
                this.direccion = direccion;
            }

            public ArrayList<CursoAsignado> getCursoasignados() {
                return Cursoasignados;
            }

            public void setCursoasignados(ArrayList<CursoAsignado> cursoasignados) {
                Cursoasignados = cursoasignados;
            }

            public String nombre;

            public String telefono;

            public String direccion;

            private ArrayList<Alumnos.CursoAsignado> Cursoasignados;

            public double getTotalCurso(){
                double t = 0;
                for (Cursoasignado c : CursoAsignados()){
                    t = t + c.getCostoCurso();
                }
                return t;
            }

            //constructor
            public Alumno (String carnet, String nombre, String telefono, String direccion){

                this.nombre = nombre;
                this.carnet = carnet;
                this.telefono = telefono;
                this.direccion = direccion;
                this.Cursoasignados = new ArrayList<>();

            }

            public void agregarCursoAsignado(CursoAsignado curso ){
                Cursoasignados.add(curso);

            }

            @Override
            public String toString(){
                return "Carnet:" + this.carnet+ "Nombre:"+ this.nombre+"Direccion:"+ this.direccion;
            }

            public void mostrarInformacion(){
                System.out.println("nombre: "+nombre);
                System.out.println("Curso Asignados:");
                for (Alumnos.CursoAsignado curso : Cursoasignados ){
                    System.out.println("Curso:"+curso.getNombreCurso());
                    System.out.println("precio:"+curso.getCostoCurso());
                    System.out.println("-----------------------");
                }
            }

            public CursoAsignado[] getCursoAsignados() {
                return new CursoAsignado[0];
            }
        }

