package poliomorfismo_heranca.teste.ClientProgram.entities;

public class businessAccount extends Client{
    private Double loanLimit;

    public businessAccount(Integer number, String Holder, Double balance, Double loanLimit){
        super(number, Holder, balance); // Contrutores herdados da classe PAI
        this.loanLimit = loanLimit;
    }

    public businessAccount() {}
    public double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit) {
            balance += amount - 10.0;
        } else {
            System.out.println("Amount too low");
        }
    }
}
