
//PACOTE
package programa;


//CLASSE PRINCIPAL
public class Principal {

    public static void main(String[] args) {
        
        //Criando os OBJETOS (Instanciando as CLASSES).
        Presidente p = new Presidente();
        
        Secretaria s1 = new Secretaria();
        Secretaria s2 = new Secretaria();
        
        Vendedor v1 = new Vendedor();
        Vendedor v2 = new Vendedor();
        Vendedor v3 = new Vendedor();
        
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        Cliente c4 = new Cliente();
        
        //Atribuindo valores aos OBJETOS.
        p.setNome("ASDRUBAL LEÔCIO CORREA");//Nome do Presidente LEÔNCIO.
        p.setDocumento("000.000.000-00");//Documento de LEÔNCIO.
        p.setSalario(16400);//Salário mensal de LEÔNCIO.
        
        s1.setNome("FÁTIMA");//Nome da Secretária FÁTIMA.
        s1.setDocumento("111.111.111-11");//Documento de FÁTIMA.
        s2.setNome("ANA");//Nome da Secretária ANA.
        s2.setDocumento("222.222.222-22");//Documento da Secretária ANA.
        s2.setSalario(1180);//Salário mensal de ANA.
        
        v1.setNome("JOÃO");//Nome do Vendedor JOÃO.
        v1.setDocumento("333.333.333-33");//Documento do Vendedor JOÃO.
        v1.setSalario(1500);//Salário mensal de JOÃO.
        v1.setComissao(350);//Comissão de JOÃO.
        v2.setNome("VANESSA");//Nome da Vendedora VANESSA.
        v2.setDocumento("444.444.444-44");//Documento de VANESSA.
        v2.setSalario(1500);//Salário mensal de VANESSA.
        v2.setComissao(620);//Comissão de VANESSA.
        v3.setNome("CARLOS");//Nome do Vendedor CARLOS.
        v3.setDocumento("555.555.555-55");//Documento de CARLOS.
        v3.setSalario(1500);//Salário mensal de CARLOS.
        v3.setComissao(1200);//Comissão de CARLOS.
        
        c1.setNome("MARCOS");//Nome do Cliente CARLOS.
        c1.setDocumento("666.666.666-66");//Documento de CARLOS.
        c2.setNome("JOANA");//Nome do Cliente JOANA.
        c2.setDocumento("777.777.777-77");//Documento de JOANA.
        c3.setNome("ELISA");//Nome do Cliente ELISA.
        c3.setDocumento("888.888.888-88");//Documento de ELISA.
        c4.setNome("LUCAS");//Nome do Cliente LUCAS.
        c4.setDocumento("999.999.999-99");//Documento de LUCAS.
        c4.setSenha("teste");//Senha de LUCAS.
        
        //Exibindo os dados.
        System.out.println("-------- ((( DADOS DOS FUNCIONÁRIOS ))) ----------");
        System.out.println("");
       
        p.exibeDados();
        
        System.out.println("");
        System.out.println("--------------------------------------------------");
        
        s1.exibeDados();
        s2.exibeDados();
        
        System.out.println("");
        System.out.println("--------------------------------------------------");
        
        v1.exibeDados();
        v2.exibeDados();
        v3.exibeDados();
        
        System.out.println("");
        System.out.println("--------------------------------------------------");
        
        c1.exibeDados();
        c2.exibeDados();
        c3.exibeDados();
        c4.exibeDados();      
        
        //Verificação da senha correta do Cliente LUCAS.
        System.out.println("-> VERIFICAÇÃO DE SENHA ");
        System.out.println("   LUCAS esqueceu sua senha de acesso.");
        System.out.println("   Abaixo serão feitas três tentativas para descobrir a senha correta: ");
        System.out.println("   #########################");
        System.out.println("   Testando a senha: 123456");
        if(c4.verificarSenha("123456"))
            System.out.println("   Senha Correta =)");
        else
            System.out.println("   Senha errada !!!");        
        System.out.println("   #########################");
        System.out.println("   Testando a senha: segredo");
        if(c4.verificarSenha("segredo"))
            System.out.println("   Senha Correta =)");
        else
            System.out.println("   Senha errada !!!");        
        System.out.println("   #########################");
        System.out.println("   Testando a senha: teste");
        if(c4.verificarSenha("teste"))
            System.out.println("   Senha Correta =)");
        else
            System.out.println("   Senha errada !!!");
        System.out.println("   #########################");
        
        System.out.println("");
        System.out.println("--------------------------------------------------");
        
        
    }
    
}
