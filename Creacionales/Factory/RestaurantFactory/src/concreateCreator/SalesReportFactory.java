package concreateCreator;
import concreteProduct.SalesReport;
import creators.ReportFactory;
import interfaces.Report;

public class SalesReportFactory  extends ReportFactory{

    @Override
    protected Report createReport() {
            return new SalesReport();
    }

}
