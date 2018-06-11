package dao;

import utilitaire.UtilDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import modele.DetailScore;

public class DetailScoreDao {
    public static void save(DetailScore detailscore) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO detailscore VALUES (?, ?, ?, ?)";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setLong(1, detailscore.getIdDetailScore());
            ps.setInt(2, detailscore.getPoints());
            ps.setLong(3, detailscore.getPartie().getIdPartie());
            ps.setLong(4, detailscore.getJoueur().getIdJoueur());
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

    public static void update(DetailScore detailscore) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE detailscore SET points = ?, idpartie = ?, joueur = ? WHERE  iddetailscore = ? ";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, detailscore.getPoints());
            ps.setLong(2, detailscore.getPartie().getIdPartie());
            ps.setLong(3, detailscore.getJoueur().getIdJoueur());
            ps.setLong(4, detailscore.getIdDetailScore());
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

    public static void delete(long idDetailScore) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = " DELETE FROM detailscore WHERE iddetailscore = ? ";
        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setLong(1, idDetailScore);
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

    public static List<DetailScore> findAll(boolean monter) throws Exception {
        List<DetailScore> valiny = new ArrayList();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT * FROM detailscore";

        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DetailScore detailscore = new DetailScore();
                if (monter) {
                    detailscore.setIdDetailScore(rs.getInt(1));
                    detailscore.setPoints(rs.getInt(2));
                    detailscore.setPartie(PartieDao.findById(rs.getInt(3), false));
                    detailscore.setJoueur(JoueurDao.findById(rs.getInt(4), false));
                } else {
                    detailscore.setIdDetailScore(rs.getInt(1));
                    detailscore.setPoints(rs.getInt(2));
                    detailscore.setPartie(null);
                    detailscore.setJoueur(null);
                }
                valiny.add(detailscore);
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

    public static DetailScore findById(long idDetailScore, boolean monter) throws Exception {
        DetailScore valiny = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT * FROM detailscore WHERE iddetailscore = ?";

        try {
            conn = UtilDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setLong(1, idDetailScore);
            rs = ps.executeQuery();
            if (rs.next()) {
                valiny = new DetailScore();
                if (monter) {
                    valiny.setIdDetailScore(rs.getInt(1));
                    valiny.setPoints(rs.getInt(2));
                    valiny.setPartie(PartieDao.findById(rs.getInt(3), false));
                    valiny.setJoueur(JoueurDao.findById(rs.getInt(4), false));
                } else {
                    valiny.setIdDetailScore(rs.getInt(1));
                    valiny.setPoints(rs.getInt(2));
                    valiny.setPartie(null);
                    valiny.setJoueur(null);
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
