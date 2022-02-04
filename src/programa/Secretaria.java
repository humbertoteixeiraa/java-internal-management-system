
//PACOTE
package programa;

//CLASSE Secretaria herdando da CLASSE Funcionário.
public class Secretaria extends Funcionario{

    @Override
    public void exibeDados() {
        if (nome == "ANA") {
            System.out.println("");
            System.out.println("Nome: " + this.getNome());
            System.out.println("-> Documento: " + this.getDocumento());
            System.out.println("-> Papel na Organização: SECRETÁRIA");
            System.out.println("-> Salário anual: " + this.calculaSalarioAnual(salario));
        } else {
            System.out.println("");
            System.out.println("Nome: " + this.getNome());
            System.out.println("-> Documento: " + this.getDocumento());
            System.out.println("-> Papel na Organização: SECRETÁRIA");
        }
    }
    
}