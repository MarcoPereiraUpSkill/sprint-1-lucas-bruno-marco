/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.clubedesportivo;

/**
 *
 * @author Vicious
 */
public class Atleta {
    private String nome;
    private int nic;
    private String genero;
    private int idade;
    private int fcr;
    private String atividade;
    
    private static final String NOME_POR_OMISSAO="";
    private static final int NIC_POR_OMISSAO=0;
    private static final String GENERO_POR_OMISSAO="";
    private static final int IDADE_POR_OMISSAO=1;
    private static final int FCR_POR_OMISSAO=1;
    private static final String ATIVIDADE_POR_OMISSAO = "";
    
    private static double fcmPadrao = 208.75;
    private static double fcmPadraoI = 0.73;
    private static double fcmCiclismoFem = 189;
    private static double fcmCiclismoMas = 202;
    private static double fcmCiclismoIFem = 0.56;
    private static double fcmCiclismoIMas = 0.72;
    private static double fcmNatacao = 204;
    private static double fcmNatacaoI = 1.7;

    public Atleta(String nome, int nic, String genero, int idade, int fcr, String atividade) {
        this.nome = nome;
        this.nic = nic;
        this.genero = genero;
        this.idade = idade;
        this.fcr = fcr;
        this.atividade = atividade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNic() {
        return nic;
    }

    public void setNic(int nic) {
        this.nic = nic;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getFcr() {
        return fcr;
    }

    public void setFcr(int fcr) {
        this.fcr = fcr;
    }

    @Override
    public String toString() {
        return "Atleta{" + "nome=" + nome + ", nic=" + nic + ", genero=" + genero + ", idade=" + idade + '}';
    }
          
    public boolean validarAtividade (){
        return atividade.equalsIgnoreCase(Atividade.CAMINHADA)
                || atividade.equalsIgnoreCase(Atividade.CICLISMO)
                || atividade.equalsIgnoreCase(Atividade.CORRIDA)
                || atividade.equalsIgnoreCase(Atividade.NATACAO);
    }
    
    
}
