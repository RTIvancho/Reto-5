/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto_5.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import reto_5.model.vo.SegundoInformeBancoVo;
import reto_5.util.JDBCUtilities;



public class SegundoInformeBancoDao{
 
    public List<SegundoInformeBancoVo> ListarSegundoInformeBanco()throws SQLException {
        ArrayList<SegundoInformeBancoVo> a=new ArrayList<SegundoInformeBancoVo>();
        Connection conn= JDBCUtilities.getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String consulta="SELECT ID_PROYECTO, CONSTRUCTORA , NUMERO_HABITACIONES , CIUDAD"
                +" FROM PROYECTO"
                +" WHERE CIUDAD IN ('Santa Marta', 'Cartagena', 'Barranquilla')"
                +"AND CLASIFICACION = 'Casa Campestre'";
        try {
            pstmt=conn.prepareStatement(consulta);
            rs=pstmt.executeQuery();
            while (rs.next()) {
                SegundoInformeBancoVo objeto=new SegundoInformeBancoVo();
                objeto.setId(rs.getInt("ID_PROYECTO"));
                objeto.setConstructora(rs.getString("CONSTRUCTORA"));
                objeto.setNumeroHabitaciones(rs.getInt("NUMERO_HABITACIONES"));
                objeto.setCiudad(rs.getString("CIUDAD"));
                a.add(objeto);

            }
        }finally{
            if (rs != null){
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null){
                conn.close();
            }

        }
        return a;
    }

}