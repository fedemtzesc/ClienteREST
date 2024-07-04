package com.fdxsoft.cliente;

import com.fdxsoft.data.Conectar;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import static jdk.jfr.internal.SecuritySupport.getResourceAsStream;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class Reporte {

    public boolean CreateFactura(String RFC) throws IOException, JRException {
        try {
            InputStream in = getResourceAsStream("/com/fdxsoft/reports/FacturaGas.jrxml");
            JasperReport archivo = JasperCompileManager.compileReport(in);
            Map<String, Object> map = new HashMap<>();
            map.put("RFC", RFC);
            Conectar con = new Conectar("jdbc:mysql://fdxsoft.com/fdx_sat?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true");
            
            JasperPrint prin = JasperFillManager.fillReport(archivo, map, con.getConnection());
            JasperExportManager.exportReportToPdfFile(prin, "/home/federico/Factura.pdf");
            return true;
        } catch (IOException | JRException e) {
            return false;
        }
    }

}
