package AtividadeHerancaPoli5;

public class Clinte {
    private int cpf;

    public Clinte(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void visualizar() {

        System.out.println("\n\n************************************************************");
        System.out.println("os dados do cliente:");
        System.out.println("****************************************************************");
        System.out.println("CPF número do CPF: " + this.cpf);

    }
}
