package Paquete1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {

    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        ResultSet rs;

        try {

            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/ProyectoProgramacionUno",
                            "postgres", "root1234");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            rs = stmt.executeQuery("select * from carniceria.\"inventario\"");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("nombre");

                System.out.println("ID = " + id);
                System.out.println("NAME = " + name);

            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");

    }

    public void introTablas() {
        Connection c = null;
        Statement stmt = null;
        ResultSet rs;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/ProyectoProgramacionUno",
                            "postgres", "root1234");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            stmt.executeUpdate("insert into carniceria.\"inventarioCentral\"(id,nombre) values('3','ghj')");

            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El id esta en uso, intente con otro");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }

    
    
    
    
    
    public void introValidacionTablas() {
        Connection c = null;
        Statement stmt = null;
        ResultSet rs;

        try {

            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/ProyectoProgramacionUno",
                            "postgres", "root1234");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            
            ///rs = stmt.executeQuery("select * from carniceria.\"inventario\"");
            rs=stmt.executeQuery("select count(*) from carniceria.\"inventario\"");
           // System.out.println(rs.getInt(stmt.executeQuery("select count(*) from carniceria.\"inventario\"")));
           /* while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("nombre");
                if(name.equals(NOMBRE)){
                    JOptionPane.showMessageDialog(null, "Repetido");
                    //return;
                }else{
                    stmt = c.createStatement();
                    stmt.executeUpdate("insert into carniceria.\"inventario\"(id,nombre) values('2','Oscar')");
                }
                

                System.out.println("ID = " + id);
                System.out.println("NAME = " + name);

            }*/
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");

    }

}

