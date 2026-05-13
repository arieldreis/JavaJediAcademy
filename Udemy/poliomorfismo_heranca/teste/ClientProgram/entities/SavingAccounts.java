package poliomorfismo_heranca.teste.ClientProgram.entities;

public class SavingAccounts extends Client{
    private Double InterestRate; // Taxa de júros

    public SavingAccounts(){
        super();
    }
    public SavingAccounts(Integer number, String Holder, Double balance, Double InterestRate) {
        super(number, Holder, balance);
        this.InterestRate = InterestRate;
    }

    public Double getInterestRate(){
        return InterestRate;
    }
    public void setInterestRate(Double InterestRate){
        this.InterestRate = InterestRate;
    }

    public void updateBaalance(){
        balance += balance * InterestRate;
    }
}
