package app;

import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Salario bruto: ");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);

        /* esse programa principal aqui é como se fosse o encaixe da bateria fora do motor.
        * ... pois eu encaixei os componentes (TaxService, PensionService e SalaryService aqui fora ...
        * ... em compensacao la na classe SalaryService nao tem mais os componentes dentro dela encaixados */
        /* vou instanciar o TaxService e o PensionService aqui*/
        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();
        /* tenho que instanciar o SalaryService aqui e passar como argumentos os 2 componentes. conforme esta la no metodo construtor da classe SalaryService */
        SalaryService salaryService = new SalaryService(taxService, pensionService);

        double netSalary = salaryService.netSalary(employee);
        System.out.println(String.format("Salario liquido " + "$ " + String.format("%.2f", netSalary)));
    }

}
