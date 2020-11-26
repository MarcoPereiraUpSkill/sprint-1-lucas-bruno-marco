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
public abstract class Atleta implements Comparable<Atleta> {
    
    private String nome;
    private int nic;
    private String genero;
    private int idade;
    private int fcr;
    private String atividade;
    private String objetivo;
    private double premios;

    private static final String NOME_POR_OMISSAO = "";
    private static final int NIC_POR_OMISSAO = 0;
    private static final String GENERO_POR_OMISSAO = "";
    private static final int IDADE_POR_OMISSAO = 0;
    private static final int FCR_POR_OMISSAO = 0;
    private static final String ATIVIDADE_POR_OMISSAO = "";
    private static final String OBJETIVO_POR_OMISSAO = "";
    private static final int PREMIOS_POR_OMISSAO = 0;
    
    /**
     *
     * @param itQueimaGordura Valor associado ao objetivo Queima de Gordura
     * @param itCapacidadeCardio Valor associado ao objetivo Capacidade Cardiorrespiratórioa
     */

    private static double itQueimaGordura = 0.6;
    private static double itCapacidadeCardio = 0.75;

    /**
     * Construtor completo
     * @param nome Nome do atleta.
     * @param nic Número de identificação civil do atleta.
     * @param genero Género do atleta.
     * @param idade Idade do atleta.
     * @param fcr Frequência cardíaca em repouso, valor que representa o número de batimentos cardíacos em repouso durante 1 minuto.
     * @param atividade Atividade associada ao atleta: caminhada, corrida, ciclismo ou natação.
     * @param objetivo Objetivo do atleta: queima de gordura ou capacidade cardiorrespiratória. Determina IT(Intensidade de Treino).
     * @param premios Prémios arrecadados pelo atleta durante um mês.
     */
    public Atleta(String nome, int nic, String genero, int idade, int fcr, String atividade, String objetivo, double premios) {
        this.nome = nome;
        this.nic = nic;
        this.genero = genero;
        this.idade = idade;
        this.fcr = fcr;
        this.atividade = atividade;
        this.objetivo = objetivo;
        this.premios = premios;
    }

    /**
     * Construtor vazio
     */
    public Atleta() {
        this.nome = NOME_POR_OMISSAO;
        this.nic = NIC_POR_OMISSAO;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = IDADE_POR_OMISSAO;
        this.fcr = FCR_POR_OMISSAO;
        this.atividade = ATIVIDADE_POR_OMISSAO;
        this.objetivo = OBJETIVO_POR_OMISSAO;
        this.premios = PREMIOS_POR_OMISSAO;
    }

    /**
     *Obter nome do atleta
     * @return Nome do atleta
     */
    public String getNome() {
        return nome;
    }
    
    /**
     *Obter Número de Identificação Civil
     * @return Número de Identificação Civil
     */
    public int getNic() {
        return nic;
    }
    
    /**
     *Obter Género do atleta
     * @return Género do atleta
     */
    public String getGenero() {
        return genero;
    }
    
    /**
     *Obter Idade do atleta
     * @return Idade do atleta
     */
    public int getIdade() {
        return idade;
    }
    
    /**
     *Obter FCR(Frequência Cardíaca em Repouso)
     * @return FCR(Frequência Cardíaca em Repouso)
     */
    public int getFcr() {
        return fcr;
    }
    
    /**
     *Obter Atividade associada ao atleta
     * @return Atividade associada ao atleta
     */
    public String getAtividade() {
        return atividade;
    }
    
    /**
     *Obter Objetivo do atleta
     * @return Objetivo do atleta
     */
    public String getObjetivo() {
        return objetivo;
    }
    
    /**
     *Obter Prémios do atleta durante um mês
     * @return Prémios do atleta durante um mês
     */
    public double getPremios() {
        return premios;
    }
    
    /**
     *Alterar Nome do atleta
     * @param nome Nome do atleta
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *Alterar Número de Identificação Civil
     * @param nic Número de Identificação Civil
     */
    public void setNic(int nic) {
        this.nic = nic;
    }

    /**
     *Alterar Género do atleta
     * @param genero Género do atleta
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *Alterar Idade do atleta
     * @param idade Idade do atleta
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *Alterar FCR(Frequência Cardíaca em Repouso)
     * @param fcr FCR(Frequência Cardíaca em Repouso)
     */
    public void setFcr(int fcr) {
        this.fcr = fcr;
    }

    /**
     *Alterar Atividade associada ao atleta
     * @param atividade Atividade associada ao atleta
     */
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    /**
     *Alterar Objetivo do atleta
     * @param objetivo Objetivo do atleta
     */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
 
    /**
     *Alterar Prémios do atleta durante um mês
     * @param premios Prémios do atleta durante um mês
     */
    public void setPremios(double premios) {
        this.premios = premios;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Atleta)) {
            return false;
        }

        Atleta atleta = (Atleta) obj;

        return nome.compareTo(atleta.getNome()) == 0
                && Integer.compare(nic, atleta.getNic()) == 0
                && genero.compareTo(atleta.getGenero()) == 0
                && Integer.compare(idade, atleta.getIdade()) == 0
                && Integer.compare(fcr, atleta.getFcr()) == 0
                && atividade.compareTo(atleta.getAtividade()) == 0
                && objetivo.compareTo(atleta.getObjetivo()) == 0
                && Double.compare(premios, atleta.getPremios()) == 0;
    }

    @Override
    public String toString() {
        return String.format("Atleta: nome: %s, nic: %d, genero: %s, idade: %d", nome, nic, genero, idade);
    }

    @Override
    public int compareTo(Atleta atleta) {
        return this.nome.compareTo(atleta.nome);
    }

    /**
     *
     * @return Valor de IT(Intensidade do Treino) mediante objetivo do atleta
     * Retorna valor de itQueimaGordura se o objetivo do atleta for QueimaGordura, senão retorna valor de itCapacidadeCardio
     */
    public double obterIT() {
        return getObjetivo().equalsIgnoreCase("QueimaGordura") ? itQueimaGordura : itCapacidadeCardio;
    }

    /**
     *
     * @return valor FCM(Frequência Cardíaca Máxima) mediante Tabela de cálculo FCM
     */
    public double calcularFCM() {
        if (atividade == Atividade.CAMINHADA || atividade == Atividade.CORRIDA) {
            return 208.75 - (0.73 * idade);
        }
        if (atividade == Atividade.CICLISMO) {
            return (genero.equalsIgnoreCase("Feminino")) ? 189 - (0.56 * idade) : 202 - (0.72 * idade);
        } else {
            return 204 - (1.7 * idade);
        }
    }

    /**
     *
     * @return valor FCT(Frequência Cardíaca de Trabalho) usando a fórmula FCT = FCR+[IT*(FCM-FCR)]
     */
    public double calcularFCT() {
        return fcr + (obterIT() * (calcularFCM() - fcr));
    }

    /**
     *Método abstrato para calcular valor mensal nas categorias AtletaPro, AtletaSemiPro e AtletaAmador
     * @return 
     */
    public abstract double calcularValorMensal();
    
    
}
