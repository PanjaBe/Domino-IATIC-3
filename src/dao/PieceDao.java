package dao;

import utilitaire.UtilDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import modele.Piece;

public class PieceDao {
    public static void save(Piece piece) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO piece VALUES (?, ?)";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, piece.getIdPiece());
            ps.setString(2, piece.getNomImage());
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

    public static void update(Piece piece) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE piece SET nomimage = ? WHERE  idpiece = ? ";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, piece.getNomImage());
            ps.setInt(2, piece.getIdPiece());
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

    public static void delete(int idPiece) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = " DELETE FROM piece WHERE idpiece = ? ";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idPiece);
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

    public static List<Piece> findAll(boolean monter) throws Exception {
        List<Piece> valiny = new ArrayList();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT * FROM piece";

        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Piece piece = new Piece();
                if (monter) {
                    piece.setIdPiece(rs.getInt(1));
                    piece.setNomImage(rs.getString(2));
                } else {
                    piece.setIdPiece(rs.getInt(1));
                    piece.setNomImage(rs.getString(2));
                }
                valiny.add(piece);
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

    public static Piece findById(int idPiece, boolean monter) throws Exception {
        Piece valiny = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT * FROM piece WHERE idpiece = ?";

        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idPiece);
            rs = ps.executeQuery();
            if (rs.next()) {
                valiny = new Piece();
                if (monter) {
                    valiny.setIdPiece(rs.getInt(1));
                    valiny.setNomImage(rs.getString(2));
                } else {
                    valiny.setIdPiece(rs.getInt(1));
                    valiny.setNomImage(rs.getString(2));
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
