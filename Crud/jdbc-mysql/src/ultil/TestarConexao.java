package ultil;

import model.db.ConnectionFactory;
import model.entities.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestarConexao {
    public static void main(String[] args) throws SQLException {

        try (Connection conn = ConnectionFactory.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet resultSet = st.executeQuery("select * from tb_order");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getFloat("latitude"));
            }

            //Testando a conexão utilizando o objeto produto e recebendo como parametro as informações da tabela da query.
            ResultSet rs = st.executeQuery("select * from tb_product");

            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getLong("id"));
                p.setDescription(rs.getString("description"));
                p.setImageUri(rs.getString("image_uri"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getDouble("price"));
                System.out.println(p);
            }
        }
    }
}
