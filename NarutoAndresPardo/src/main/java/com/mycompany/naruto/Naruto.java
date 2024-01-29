package com.mycompany.naruto;

import com.mycompany.naruto.controllers.MisionNinjaController;

public class Naruto {
    public static void main(String[] args) {
        MisionNinjaController misionNinjaController = new MisionNinjaController();

        misionNinjaController.consultMisionsDisponibleNinja(1);

        System.out.println( misionNinjaController.consultMisionsDisponibleNinja(1));
        System.out.println( misionNinjaController.consultMisionsCompleteNinja(2));
    }
}
