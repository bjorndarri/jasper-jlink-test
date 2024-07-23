package is.test.jasper;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

import java.util.HashMap;

public class Test {

  public static void main(String[] args) throws JRException {
    JasperReport report = (JasperReport) JRLoader.loadObject(Test.class.getResource("/report.jasper"));

    JRDataSource dataSource = new JRDataSource() {
      @Override
      public boolean next() throws JRException {
        return false;
      }

      @Override
      public Object getFieldValue(JRField jrField) throws JRException {
        return null;
      }
    };

    System.out.println(JasperFillManager.fillReport(report, new HashMap<>(), dataSource).getName());
  }
}
