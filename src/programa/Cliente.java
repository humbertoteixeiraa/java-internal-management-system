
//PACOTE
package programa;

//CLASSE Clente herdando da CLASSE Pessoa.
public class Cliente extends Pessoa {
    
    //ATRIBUTOS
    private String usuario;
    private String senha;
    
    //MÉTODOS
    public boolean verificarSenha(String senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void exibeDados() {
        if (nome == "LUCAS") {
            System.out.println("");
            System.out.println("Nome: " + this.getNome());
            System.out.println("-> Documento: " + this.getDocumento());
            System.out.println("-> Papel na Organização: CLIENTE");
            
        } else {
            System.out.println("");
            System.out.println("Nome: " + this.getNome());
            System.out.println("-> Documento: " + this.getDocumento());
            System.out.println("-> Papel na Organização: CLIENTE");
        }
    } 
    
    //MÉTODOS GETTERS e SETTERS
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
