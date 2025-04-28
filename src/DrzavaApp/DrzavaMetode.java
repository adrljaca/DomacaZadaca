package DrzavaApp;

import java.sql.*;

public class DrzavaMetode {

    public static void dodajDrzavu(Connection connection, String nazivDrzave) {
        String sql = "INSERT INTO Drzava (Naziv) VALUES (?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nazivDrzave);
            stmt.executeUpdate();
            System.out.println("Država uspješno dodana.");
        } catch (SQLException e) {
            System.err.println("Greška prilikom dodavanja države.");
            e.printStackTrace();
        }
    }


    public static void izmijeniDrzavu(Connection connection, int idDrzave, String noviNaziv) {
        String sql = "UPDATE Drzava SET Naziv = ? WHERE IdDrzava = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, noviNaziv);
            stmt.setInt(2, idDrzave);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Država uspješno izmijenjena.");
            } else {
                System.out.println("Država s tim ID-om nije pronađena.");
            }
        } catch (SQLException e) {
            System.err.println("Greška prilikom izmjene države.");
            e.printStackTrace();
        }
    }


    public static void obrisiDrzavu(Connection connection, int idDrzave) {
        String sql = "DELETE FROM Drzava WHERE IdDrzava = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idDrzave);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Država uspješno obrisana.");
            } else {
                System.out.println("Država s tim ID-om nije pronađena.");
            }
        } catch (SQLException e) {
            System.err.println("Greška prilikom brisanja države.");
            e.printStackTrace();
        }
    }


    public static void prikaziDrzave(Connection connection) {
        String sql = "SELECT * FROM Drzava ORDER BY Naziv";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int idDrzave = rs.getInt("IdDrzava");
                String naziv = rs.getString("Naziv");
                System.out.println("ID: " + idDrzave + ", Naziv: " + naziv);
            }
        } catch (SQLException e) {
            System.err.println("Greška prilikom prikaza država.");
            e.printStackTrace();
        }
    }
}
