/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalfinance.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonArrayJson {
    // Crear un objeto JSON con un array que contiene otro objeto JSON
    public static String jsonArrayJson(int idCampaign, String number,String dpd,
            String tipoAsignacion,String adeudo,String tel,String nameClient,String algoritmo){
        // Crear un objeto JSON con la estructura modificada
        //POST Lead - New record
        // Crear el objeto ObjectMapper de Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        // Crear un objeto JSON principal
        ObjectNode objetoPrincipal = objectMapper.createObjectNode();
        // Agregar propiedades al objeto principal
        objetoPrincipal.put("campaign_id", idCampaign);
        // Crear un arreglo dentro del objeto principal
        ArrayNode arreglo = objetoPrincipal.putArray("Leads");
        // Crear un objeto JSON dentro del arreglo
        ObjectNode objetoEnArreglo = objectMapper.createObjectNode();
        objetoEnArreglo.put("NUMBER", number);
        objetoEnArreglo.put("DPD", dpd);
        objetoEnArreglo.put("TIPO_ASIGNACION", tipoAsignacion);
        objetoEnArreglo.put("ADEUDO", adeudo);//
        objetoEnArreglo.put("TEL", tel);
        objetoEnArreglo.put("CLIENT_FULL_NAME", nameClient);
        objetoEnArreglo.put("ALGORITMO", algoritmo);
        // Agregar el objeto al arreglo
        arreglo.add(objetoEnArreglo);
        // Convertir el objeto principal a formato JSON
        String jsonString = objetoPrincipal.toString();
        // Imprimir el JSON resultante
        return jsonString;
    }
}
