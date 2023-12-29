package services;

import entities.Employee;

/* repara que eu tenho um componente que se chama SalaryService e que depende de outros 2 componentes (TaxService e PensionService) ...
 * ... mas que nao é esse componente SalaryService que vai dar o 'new' nesses componentes.
 * pois vai ser injetado ai dentro pelo metodo construtor, que é o que usaremos nesse exemplo*/
public class SalaryService {

    /* é um atributo inerno da nossa classe SalaryService. eu tenho somente que declarar o TaxService e o PensionService. nao vou instanciar eles aqui.*/
    /* repara que vou apenar declarar, pois o comando 'new' nao vai ficar aqui dentro do SalaryService, mas sim dentro do Program com metodo main.*/
    /* com isso eu to aplicando o principio da ''inversao de controle''. eu to tirando o controle do SalaryService sobre as suas dependencias.*/
    /* obs nao esquecer que o componente SalaryService depende do componente TaxService e do componente PensionService.*/
    /* nesse nosso exemplo vamos fazer a injecao de dependencia atraves do CONSTRUTOR, mas daria pra fazer tb pelo metodo set, e tbm atraves de framework*/
    private TaxService taxService;

    private PensionService pensionService;

    /* vou criar um construtor que vai fazer essa injecao de dependencia.
    * ... e nos argumentos vou colocar os componentes TaxService e PensionService*/
    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary (Employee employee) {
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
    }

}
