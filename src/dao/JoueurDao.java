package dao;

import utilitaire.UtilDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import modele.Joueur;

public class JoueurDao {
    public static void save(Joueur joueur) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO joueur VALUES (?, ?)";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, joueur.getIdJoueur());
            ps.setString(2, joueur.getPseudo());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public static void update(Joueur joueur) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE joueur SET pseudo = ? WHERE  idjoueur = ? ";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, joueur.getPseudo());
            ps.setInt(2, joueur.getIdJoueur());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public static void delete(int idJoueur) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = " DELETE FROM joueur WHERE idjoueur = ? ";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idJoueur);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public static List<Joueur> findAll(boolean monter) throws Exception {
        List<Joueur> valiny = new ArrayList();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT * FROM joueur";

        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Joueur joueur = new Joueur() {
                };
                if (monter) {
                    joueur.setIdJoueur(rs.getInt(1));
                    joueur.setPseudo(rs.getString(2));
                } else {
                    joueur.setIdJoueur(rs.getInt(1));
                    joueur.setPseudo(rs.getString(2));
                }
                valiny.add(joueur);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return valiny;
    }

    public static Joueur findById(int idJoueur, boolean monter) throws Exception {
        Joueur valiny = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT * FROM joueur WHERE idjoueur = ?";

        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idJoueur);
            rs = ps.executeQuery();
            if (rs.next()) {
                valiny = new Joueur();
                if (monter) {
                    valiny.setIdJoueur(rs.getInt(1));
                    valiny.setPseudo(rs.getString(2));
                } else {
                    valiny.setIdJoueur(rs.getInt(1));
                    valiny.setPseudo(rs.getString(2));
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return valiny;
    }
}
