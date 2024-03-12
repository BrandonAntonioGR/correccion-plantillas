/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.controller;

import com.digitalfinance.DAO.entity.Plantilla;
import com.digitalfinance.view.ExaminaPlantilla;
import com.digitalfinance.view.AgregaPlantilla;
import com.digitalfinance.view.Login;
import com.digitalfinance.view.ModificarPlantilla;


public class ControllerPantallas {
    public void Login(){
        Login login = new Login();
        login.setVisible(true);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
    }
    
    public void ExaminarPlantilla(Plantilla pl){
        ExaminaPlantilla ep= new ExaminaPlantilla(pl);
        ep.setVisible(true);
        ep.setLocationRelativeTo(null);
        ep.setResizable(false);
    }
    public void AgregarPlantilla(){
        AgregaPlantilla ap= new AgregaPlantilla();
        ap.setVisible(true);
        ap.setLocationRelativeTo(null);
        ap.setResizable(false);
    }
    public void ModificarPlantilla(Plantilla pl,int i){
        ModificarPlantilla mp= new ModificarPlantilla(pl,i);
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
        mp.setResizable(false);
    }
}
