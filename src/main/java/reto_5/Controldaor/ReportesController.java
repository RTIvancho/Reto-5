
package reto_5.Controldaor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import reto_5.model.dao.PrimerInformeBancoDao;
import reto_5.model.dao.SegundoInformeBancoDao;
import reto_5.model.dao.TercerInformeBancoDao;

import reto_5.model.vo.PrimerInformeBancoVo;
import reto_5.model.vo.SegundoInformeBancoVo;
import reto_5.model.vo.TercerInformeBancoVo;

public class ReportesController {
    private PrimerInformeBancoDao primerInformeBancoDao;
    private SegundoInformeBancoDao segundoInformeBancoDao;
    private TercerInformeBancoDao tercerInformeBancoDao;


    public ReportesController() {
        primerInformeBancoDao      = new PrimerInformeBancoDao();
        segundoInformeBancoDao  = new SegundoInformeBancoDao();
        tercerInformeBancoDao    = new TercerInformeBancoDao();

    }
    public List<PrimerInformeBancoVo> listarPrimerInformeBanco()throws SQLException {
        return primerInformeBancoDao.listarPrimerInforme();
    }
    public List<SegundoInformeBancoVo> listarSegundoInformeBanco() throws SQLException {
        return segundoInformeBancoDao.ListarSegundoInformeBanco();
    }
    public List<TercerInformeBancoVo> listarTercerInformeBanco() throws SQLException {
        return tercerInformeBancoDao.ListarTercerInformeBanco();
    }

    public List<PrimerInformeBancoVo> listarProyectosPorBanco(String conavi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
