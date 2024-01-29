package com.mycompany.naruto.model.classes.DAO;

import com.mycompany.naruto.globalDAO.IGetByIdConsult;
import com.mycompany.naruto.globalDAO.IGetByIdDao;
import com.mycompany.naruto.globalDAO.ISaveDao;
import com.mycompany.naruto.globalDAO.IUpdateDao;
import com.mycompany.naruto.model.classes.Mision;
import com.mycompany.naruto.model.classes.MisionNinja;
import com.mycompany.naruto.persistence.BDConnection;
import com.mycompany.naruto.persistence.Operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class MisionNinjaDAO implements IGetByIdConsult<MisionNinja>, ISaveDao<MisionNinja>, IUpdateDao<MisionNinja>, IGetByIdDao<MisionNinja> {



    @Override
    public MisionNinja getByIdConsult(long id, String consult) {
        Operations.setConnection(BDConnection.MySQLConnection());
        String stm = "select n.nombre, m.Descripcion from MisionNinja mn join Mision m on m.ID = mn.ID_Mision join Ninja n on n.ID = mn.ID_Ninja where mn.Estado = ? and n.ID = ?;";

        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stm)) {
            ps.setLong(2, id);
            ps.setString(1, consult);
            ResultSet rs = Operations.query_db(ps);
            if (rs.next()){
                MisionNinja misionNinja = new MisionNinja();
                misionNinja.setMisionNinjaId(rs.getLong("ID"));
                misionNinja.setIdMision(rs.getLong("ID_Mision"));
                misionNinja.setIdNinja(rs.getLong("ID_Ninja"));
                misionNinja.setFechaInicio(LocalDate.parse(rs.getString("FechaInicio")));
                misionNinja.setFechaFin(LocalDate.parse(rs.getString("FechaFin")));
                misionNinja.setEstado(rs.getString("Estado"));
            } else {
                System.out.println("ERROR: No se encontro el id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(MisionNinja misionNinja) {
        Operations.setConnection(BDConnection.MySQLConnection());
        String stmInsert = "insert into MisionNinja (ID, ID_Mision, ID_Ninja, FechaInicio, FechaFin, Estado) values (?,?,?,?,?,?),";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stmInsert)) {
            ps.setLong(1, misionNinja.getMisionNinjaId());
            ps.setLong(2, misionNinja.getIdMision());
            ps.setLong(3, misionNinja.getIdNinja());
            ps.setString(4, misionNinja.getFechaInicio().toString());
            ps.setString(5, misionNinja.getFechaFin().toString());
            ps.setString(6, misionNinja.getEstado());

            int rows = Operations.insert_update_delete_db(ps);
            if (rows <= 0) {
                System.out.println("Cannot insert Mision Ninja");
            } else {
                System.out.println("Successful insert of Mision Ninja");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void update(MisionNinja misionNinja, String estado) {
        MisionNinja sqlMisionNinja = getById(misionNinja.getMisionNinjaId());
    }

    @Override
    public MisionNinja getById(long id) {
        Operations.setConnection(BDConnection.MySQLConnection());
        String stm = "select * from MisionNinja where MisionNinja = ?";

        try (PreparedStatement ps = Operations.getConnection().prepareStatement(stm)) {
            ps.setLong(1, id);
            ResultSet rs = Operations.query_db(ps);
            if (rs.next()){
                MisionNinja misionNinja = new MisionNinja();
                misionNinja.setMisionNinjaId(rs.getLong("ID"));
                misionNinja.setIdMision(rs.getLong("ID_Mision"));
                misionNinja.setIdNinja(rs.getLong("ID_Ninja"));
                misionNinja.setFechaInicio(LocalDate.parse(rs.getString("FechaInicio")));
                misionNinja.setFechaFin(LocalDate.parse(rs.getString("FechaFin")));
                misionNinja.setEstado(rs.getString("Estado"));
            } else {
                System.out.println("ERROR: No se encontro el id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
