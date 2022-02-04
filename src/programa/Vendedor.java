
//PACOTE
package programa;


//CLASSE Vendedor herdando da CLASSE Funcionário.
public class Vendedor extends Funcionario {
    
    //ATRIBUTOS
    private double comissao;
    
    //MÉTODOS
    public double salarioMesComComissao(double comissao, double salario) {
        this.comissao = salario+comissao;
        return this.comissao;
    }
    
    @Override
    public void exibeDados() {
        System.out.println("");
        System.out.println("Nome: " + this.getNome());
        System.out.println("-> Documento: " + this.getDocumento());
        System.out.println("-> Papel na Organização: VENDEDOR");
        System.out.println("-> Apenas Salário Mensal Fixo: " + this.getSalario());
        System.out.println("-> Apenas a Comissão: " + this.getComissao());
        System.out.println("-> Salário Mensal com a Comissão: " + this.salarioMesComComissao(comissao, salario));
    }
    
    //MÉTODOS GETTERS e SETTERS
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
