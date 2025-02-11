package concreteProduct;

import interfaces.Report;

public class SalesReport implements Report{

    @Override
    public void generate() {
       System.out.println("Imprimiendo reporte de ventas");
    }

}
