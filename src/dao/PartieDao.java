package dao;

import utilitaire.UtilDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

import modele.Partie;

public class PartieDao {
    public static void save(Partie partie) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO partie VALUES (?, ?, ?)";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, partie.getIdPartie());
            ps.setString(2, partie.getDesignation());
            ps.setDate(3, new java.sql.Date(partie.getDate().getTime()));
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

    public static void update(Partie partie) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE partie SET designation = ?, date = ? WHERE  idpartie = ? ";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, partie.getDesignation());
            ps.setDate(3, new java.sql.Date(partie.getDate().getTime()));
            ps.setInt(3, partie.getIdPartie());
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

    public static void delete(int idPartie) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = " DELETE FROM partie WHERE idpartie = ? ";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idPartie);
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

    public static List<Partie> findAll(boolean monter) throws Exception {
        List<Partie> valiny = new ArrayList();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT * FROM partie";

        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Partie partie = new Partie();
                if (monter) {
                    partie.setIdPartie(rs.getInt(1));
                    partie.setDesignation(rs.getString(2));
                    partie.setDate(rs.getDate(3));
                } else {
                    partie.setIdPartie(rs.getInt(1));
                    partie.setDesignation(rs.getString(2));
                    partie.setDate(rs.getDate(3));
                }
                valiny.add(partie);
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

    public static Partie findById(int idPartie, boolean monter) throws Exception {
        Partie valiny = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT * FROM partie WHERE idpartie = ?";

        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idPartie);
            rs = ps.executeQuery();
            if (rs.next()) {
                valiny = new Partie();
                if (monter) {
                    valiny.setIdPartie(rs.getInt(1));
                    valiny.setDesignation(rs.getString(2));
                    valiny.setDate(rs.getDate(3));
                } else {
                    valiny.setIdPartie(rs.getInt(1));
                    valiny.setDesignation(rs.getString(2));
                    valiny.setDate(rs.getDate(3));
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
