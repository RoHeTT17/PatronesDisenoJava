package concreteProduct;

import interfaces.Report;

public class InventoryReport implements Report{

    @Override
    public void generate() {
        System.out.println("Impriminedo reporte de inventario");
    }

}
