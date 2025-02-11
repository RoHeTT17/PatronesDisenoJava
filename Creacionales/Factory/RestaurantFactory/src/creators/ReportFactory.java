package creators;

import interfaces.Report;

public abstract class ReportFactory {

    // Método fábrica abstracto
    //Debe estar como protected para poder utilizar el generateReport    
    protected abstract Report createReport();

    // Método principal que utiliza el método fábrica
    public void generateReport(){
        Report report = this.createReport();
        report.generate();
    }

}
