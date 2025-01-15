/*Diseña un programa en Java que trabaje con una clase llamada Alumno.
Serán atributos del alumno su número de expediente, nombre, apellidos, fecha de nacimiento
y curso en el que se matricula. La clase debe incluir un constructor y los métodos get y
set correspondientes y toString. Instancia varios objetos de esta clase y prueba los métodos
creados. */
package Tema4.ejercicio5;

public class Alumno {
    private int nExpediente;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String cursoMatricula;

    public Alumno(int nExpediente, String nombre, String apellidos, String fechaNacimiento, String cursoMatricula) {
        this.nExpediente = nExpediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.cursoMatricula = cursoMatricula;
    }

    public int getnExpediente() {
        return nExpediente;
    }

    public void setnExpediente(int nExpediente) {
        this.nExpediente = nExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCursoMatricula() {
        return cursoMatricula;
    }

    public void setCursoMatricula(String cursoMatricula) {
        this.cursoMatricula = cursoMatricula;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nExpediente=" + nExpediente +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", cursoMatricula='" + cursoMatricula + '\'' +
                '}';
    }
}
