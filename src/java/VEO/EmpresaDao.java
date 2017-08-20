package VEO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import util.Conexion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user7
 */
public class EmpresaDao {

private Connection conexion;

    public EmpresaDao() {
       
       Conexion db = Conexion.getConexion();
        this.conexion = db.getConnection();
    
    }

    
    
public LinkedList<Empresa> Listar() {

        LinkedList<Empresa> a = new LinkedList<>();

        String query = "SELECT * FROM Empresa";

        try {
           Statement statement =
                    this.conexion.createStatement();

            ResultSet rs = 
                    statement.executeQuery(query);

            while (rs.next()) {
                String nombre = rs.getString("Nombre");
                String descripcion = rs.getString("Direccion");
               

                Empresa pro = new Empresa(nombre,descripcion);
                a.add(pro);
            }
            System.out.println(a);

        } catch (SQLException e) {
            System.out.println("Failed to make update!");
            e.printStackTrace();
        }

        return a;
    }


    
}
