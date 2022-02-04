
//PACOTE
package programa;

//CLASSE Presidente herdando da CLASSE Funcionário.
public class Presidente extends Funcionario {

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("-> Documento: " + this.getDocumento());
        System.out.println("-> Papel na Organização: PRESIDENTE");
        System.out.println("-> Salário anual: " + this.calculaSalarioAnual(salario));
    }
    
}
