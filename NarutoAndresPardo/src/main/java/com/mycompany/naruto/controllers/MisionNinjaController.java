package com.mycompany.naruto.controllers;

import com.mycompany.naruto.model.classes.DAO.MisionNinjaDAO;
import com.mycompany.naruto.model.classes.MisionNinja;

public class MisionNinjaController {
    private static MisionNinjaDAO misionNinjaDAO = new MisionNinjaDAO();

    public static MisionNinja consultMisionsDisponibleNinja(long id){
        String estado = "Disponible";
        return misionNinjaDAO.getByIdConsult(id, estado);
    }
    public static MisionNinja consultMisionsCompleteNinja(long id){
        String estado = "Completado";
        return misionNinjaDAO.getByIdConsult(id, estado);
    }
}
