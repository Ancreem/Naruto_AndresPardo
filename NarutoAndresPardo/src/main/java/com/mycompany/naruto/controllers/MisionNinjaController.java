package com.mycompany.naruto.controllers;

import com.mycompany.naruto.model.classes.DAO.MisionNinjaDAO;
import com.mycompany.naruto.model.classes.MisionNinja;

public class MisionNinjaController {
    private static MisionNinjaDAO misionNinjaDAO = new MisionNinjaDAO();

    public static MisionNinja consultMisionsDisponibleNinja(long id){
        return misionNinjaDAO.getByIdConsult(id, "Disponible");
    }
    public static MisionNinja consultMisionsCompleteNinja(long id){
        String estado = "Completado";
        return misionNinjaDAO.getByIdConsult(id, "Completado");
    }

    public static void saveMisions(MisionNinja misionNinja){
        misionNinjaDAO.save(misionNinja);
    }
    
    public static MisionNinja agarrarId(long id){
        return misionNinjaDAO.getById(id);
    }
    
    public static void actualizarCompletadoId(MisionNinja misionNinja){
        misionNinjaDAO.update(misionNinja, "Completado");
    }
    
    public static void actualizarDisponibleId(MisionNinja misionNinja){
        misionNinjaDAO.update(misionNinja, "Disponible");
    }
}
