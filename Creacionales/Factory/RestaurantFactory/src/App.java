import concreateCreator.InventoryReportFacotry;
import concreateCreator.SalesReportFactory;
import creators.ReportFactory;
import creators.ReportFactoryGeneric;
import interfaces.Report;

public class App {
    public static void main(String[] args) throws Exception {

        //El objeto es de tipo ReportFactory porque es nuestra clase abstracta donde tenemos los métodos de forma generica y recibe
        //el valor de acuerdo con la clase del concrete creator (la cual hereda de Report Factory)
        ReportFactory report = new InventoryReportFacotry();
        
        report.generateReport();


        ReportFactory reportSales = new SalesReportFactory();
        reportSales.generateReport();

        //Esta es otra forma de usarlo
        ReportFactoryGeneric reporFactorytGeneric = new ReportFactoryGeneric();

        //Report reportGeneric = reporFactorytGeneric.generateReport("sales");
        Report reportGeneric = reporFactorytGeneric.generateReport("inventory");
        System.out.println("Otra forma ");

        reportGeneric.generate();
        
    }
}
