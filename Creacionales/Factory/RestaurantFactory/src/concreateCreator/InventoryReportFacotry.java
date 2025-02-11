package concreateCreator;

import concreteProduct.InventoryReport;
import creators.ReportFactory;
import interfaces.Report;

public class InventoryReportFacotry extends ReportFactory{

    @Override
    protected Report createReport() {
        
        return new InventoryReport();
    }

}
