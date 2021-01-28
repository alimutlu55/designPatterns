package compositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        CompanyDirectory customerModule = new CompanyDirectory();
        CompanyDirectory paymentSystemModule = new CompanyDirectory();
        CompanyDirectory companyDirectory = new CompanyDirectory();

        Manager customerManager = new Manager("Hakan Mendere",5525,"Manager");
        Developer customerJavaDeveloper = new Developer("Gizem Genç",5555,"Java developer");
        customerModule.addEmployee(customerManager);
        customerModule.addEmployee(customerJavaDeveloper);

        Manager paymentSystemManager = new Manager("Hakan Menderes",5525,"Manager");
        Developer paymentSystemDeveloper = new Developer("Ali Mutlu",5555,"Java developer");
        paymentSystemModule.addEmployee(paymentSystemManager);
        paymentSystemModule.addEmployee(paymentSystemDeveloper);

        companyDirectory.addEmployee(customerModule);
        companyDirectory.addEmployee(paymentSystemModule);

        companyDirectory.showEmployeeDetails();



    }
}
