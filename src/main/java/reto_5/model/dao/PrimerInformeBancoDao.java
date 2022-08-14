
package reto_5.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import reto_5.model.vo.PrimerInformeBancoVo;
import reto_5.util.JDBCUtilities;

public class PrimerInformeBancoDao {

       public List<PrimerInformeBancoVo> listarPrimerInforme()throws SQLException {
        ArrayList<PrimerInformeBancoVo> a=new ArrayList<PrimerInformeBancoVo>();
        Connection conn= JDBCUtilities.getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String consulta="SELECT ID_LIDER, NOMBRE , PRIMER_APELLIDO , CIUDAD_RESIDENCIA"
                +" FROM LIDER"
                +" ORDER BY CIUDAD_RESIDENCIA ASC ";
        try {
            pstmt=conn.prepareStatement(consulta);
            rs=pstmt.executeQuery();
            while (rs.next()) {
                PrimerInformeBancoVo objeto=new PrimerInformeBancoVo();
                objeto.setId(rs.getInt("ID_LIDER"));
                objeto.setNombre(rs.getString("NOMBRE"));
                objeto.setPrimerApelido(rs.getString("PRIMER_APELLIDO"));
                objeto.setCiudadResidencia(rs.getString("CIUDAD_RESIDENCIA"));
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
