package poliomorfismo_heranca.teste.ClientProgram;
import poliomorfismo_heranca.teste.ClientProgram.entities.Client;
import poliomorfismo_heranca.teste.ClientProgram.entities.SavingAccounts;
import poliomorfismo_heranca.teste.ClientProgram.entities.businessAccount;

public class ClientProgram {
    static void main() {
        Client cp = new Client(1001, "Alex", 0.0);
        businessAccount business = new businessAccount(1002, "Maria", 0.0, 500.0);

        //Upcasting
        Client cp1 = business; // A conta empresarial está sendo assciada a uma conta.
        // Atribuindo um novo objeto da Sub-Classe
        Client cp2 = new businessAccount(1003, "Josh", 0.0, 200.0);
        Client cp3 = new SavingAccounts(1004, "Anna", 0.0, 0.01);

        //Downcasting
        businessAccount cp4 = (businessAccount)cp2;
        cp4.loan(100.00); // Realizando empréstimo

        if(cp3 instanceof businessAccount){
            businessAccount cp5 = (businessAccount)cp3;
            cp5.loan(200.00);
            System.out.println("Loan!");
        }
        if(cp3 instanceof SavingAccounts){
            SavingAccounts cp5 = (SavingAccounts)cp3;
            cp5.updateBaalance();
            System.out.println("Baalance updated!");
        }
    }
}
