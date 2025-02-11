package creators;

import concreteProduct.InventoryReport;
import concreteProduct.SalesReport;
import interfaces.Report;

public class ReportFactoryGeneric {

    public Report generateReport(String type){

        switch (type) {
            case "sales":
                return new SalesReport();        
            case "inventory":
                return new InventoryReport();
                
            default:
                break;
        }
        
        return null;

    }

}
