package poliomorfismo_heranca.teste.ClientProgram.entities;

public class Client {
    private Integer number;
    private String Holder;
    protected Double balance;

    public Client(Integer number, String Holder, Double balance) {
        this.number = number;
        this.Holder = Holder;
        this.balance = balance;
    }

    public Client() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return Holder;
    }

    public void setHolder(String holder) {
        Holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withDraw(double balance) {
        balance -= balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
