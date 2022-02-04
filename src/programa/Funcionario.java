
//PACOTE
package programa;

//CLASSE ABSTRATA Funcionário herdando da CLASSE Cliente.
public abstract class Funcionario extends Pessoa {
    
    //ATRIBUTOS
    protected double salario;
    protected int ramal;
    
    //MÉTODO
    public double calculaSalarioAnual(double salario) {
        this.salario = salario*13;
        return this.salario;
    }
    
    //MÉTODOS GETTERS e SETTERS
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRamal() {
        return ramal;
    }
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
