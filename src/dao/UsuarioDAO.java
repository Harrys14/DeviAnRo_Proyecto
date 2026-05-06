package dao;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Usuario;

public class UsuarioDAO {

    // REGISTRO
    public void insertar(Usuario u) {
        String sql = "INSERT INTO usuario(nombre, correo, password) VALUES (?, ?, ?)";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getCorreo());
            ps.setString(3, u.getPassword());

            ps.executeUpdate();
            System.out.println("Usuario registrado");

        } catch (Exception e) {
            System.out.println("Error insertar: " + e.getMessage());
        }
    }

    // LOGIN
    public boolean login(String correo, String password) {
        String sql = "SELECT * FROM usuario WHERE correo=? AND password=?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, correo);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (Exception e) {
            System.out.println("Error login: " + e.getMessage());
            return false;
        }
    }
}