package view;

import controller.StudentDAO;
import model.entities.Student;

import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws SQLException {

        //inserindo um registro
        StudentDAO student = new StudentDAO();
        student.insertStudent(new Student(1, "Jucinei", 1989));
        student.insertStudent(new Student(3, "Marilena", 1989));
        student.insertStudent(new Student(4, "João", 1989));
        student.insertStudent(new Student(5, "Camila", 1990));

//        //alterando esse registro
        student.updateStudent(new Student(1, "Jorge", 1998));

//        //deletando um registro
        student.deleteStudent(1);

        //listando todos os estudantes
        Student estudantes = new Student();
        for (Student estudante : student.getStudents()) {
            System.out.println("Estudante : " + estudante.getNome());
        }

    }
}
