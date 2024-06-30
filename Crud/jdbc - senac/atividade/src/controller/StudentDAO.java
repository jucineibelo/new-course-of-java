package controller;
import model.entities.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public void insertStudent(Student student) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String query = "INSERT INTO stundent(id, nome, idade) VALUES (?, ?, ?)";
            PreparedStatement psmt = conn.prepareStatement(query);

            psmt.setInt(1, student.getId());
            psmt.setString(2, student.getNome());
            psmt.setInt(3, student.getIdade());
            psmt.execute();
            System.out.println("Registro inserido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(Student student) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String query = "UPDATE stundent set nome = ?, idade = ? where id = ?";
            PreparedStatement psmt = conn.prepareStatement(query);

            psmt.setString(1, student.getNome());
            psmt.setInt(2, student.getIdade());
            psmt.setInt(3, student.getId());
            psmt.execute();
            System.out.println("Registro alterado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(Integer id) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String query = "delete from stundent where id = ?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, id);
            psmt.execute();
            System.out.println("Registro excluido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getStudents() {
        List<Student> listaEstudantes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection()) {
            String query = "select id, nome, idade from stundent";
            PreparedStatement pstm = conn.prepareStatement(query);
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setNome(resultSet.getString("nome"));
                student.setIdade(resultSet.getInt("idade"));
                listaEstudantes.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaEstudantes;

    }
}
