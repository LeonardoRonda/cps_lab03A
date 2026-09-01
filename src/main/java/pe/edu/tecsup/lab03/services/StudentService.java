package pe.edu.tecsup.lab03.services;
import pe.edu.tecsup.lab03.Entities.StudentEntity;

public class StudentService {

    public void addStudent(String nombre, String apellido, int edad) {
        StudentEntity student = new StudentEntity();
        student.nombre = nombre;
        student.apellido = apellido;
        student.edad = edad;
    }
}