/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.clubedesportivo;

/**
 *
 * @author
 */
public abstract class AtletaNaoPro extends Atleta {

    private int antiguidade;

    private static final int ANTIGUIDADE_POR_OMISSAO = 0;

    private static double percMinAntiguidade = 2;
    private static double percMedAntiguidade = 8;
    private static double percMaxAntiguidade = 20;
    private static int minAntiguidade = 5;
    private static int medAntiguidade = 10;
    private static int maxAntiguidade = 20;

    /**
     *Construtor completo
     * @param antiguidade Número de anos que o atleta está afiliado ao clube.
     * @param nome Nome do atleta.
     * @param nic Número de identificação civil do atleta.
     * @param genero Género do atleta.
     * @param idade Idade do atleta.
     * @param fcr Frequência cardíaca em repouso, valor que representa o número de batimentos cardíacos em repouso durante 1 minuto.
     * @param atividade Atividade associada ao atleta: caminhada, corrida, ciclismo ou natação.
     * @param objetivo Objetivo do atleta: queima de gordura ou capacidade cardiorrespiratória. Determina IT(Intensidade de Treino).
     * @param premios Prémios arrecadados pelo atleta durante um mês.
     */
    public AtletaNaoPro(int antiguidade, String nome, int nic, String genero, int idade, int fcr, String atividade, String objetivo, double premios) {
        super(nome, nic, genero, idade, fcr, atividade, objetivo, premios);
        this.antiguidade = antiguidade;
    }
    
    /**
     *Construtor vazio
     */
    public AtletaNaoPro() {
        super();
        this.antiguidade = ANTIGUIDADE_POR_OMISSAO;
    }

    /**
     *Obter antiguidade
     * @return Antiguidade
     */
    public int getAntiguidade() {
        return antiguidade;
    }

    /**
     *Alterar antiguidade
     * @param antiguidade Antiguidade
     */
    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AtletaNaoPro)) {
            return false;
        }

        AtletaNaoPro atletaNaoPro = (AtletaNaoPro) obj;

        return Integer.compare(antiguidade, atletaNaoPro.getAntiguidade()) == 0;
    }

    @Override
    public String toString() {
        return String.format("Atleta não profissional: Nome: %s, Antiguidade: %d", super.getNome(), antiguidade);
    }

    /**
     *Obter percentagem de antiguidade mediante anos de antiguidade do atleta
     * @return Percentagem de antiguidade
     */
    public double obterPercAntiguidade() {
        return (antiguidade < minAntiguidade) ? 1 : (antiguidade >= minAntiguidade && antiguidade <= medAntiguidade) ? percMinAntiguidade
                : (antiguidade > medAntiguidade && antiguidade <= maxAntiguidade) ? percMedAntiguidade : percMaxAntiguidade;
    }

    /**
     *Obter percentagem mediante o intervalo de antiguidade de [5,10] anos
     * @return Percentagem mínima de antiguidade
     */ 
    public static double getPercMinAntiguidade() {
        return percMinAntiguidade;
    }
    
    /**
     *Obter percentagem mediante o intervalo de antiguidade de ]10,20] anos
     * @return Segunda percentagem de antiguidade
     */
    public static double getPercMedAntiguidade() {
        return percMedAntiguidade;
    }
    
    /**
     *Obter percentagem mediante antiguidades superiores a 20 anos
     * @return Percentagem máxima de antiguidade
     */
    public static double getPercMaxAntiguidade() {
        return percMaxAntiguidade;
    }
    
    /**
     *Obter valor que determina o intervalo mínimo da primeira percentagem da Tabela 
     * @return Valor que determina o intervalo mínimo da primeira percentagem da Tabela 
     */
    public static int getMinAntiguidade() {
        return minAntiguidade;
    }
    
    /**
     *Obter valor que determina o intervalo máximo da primeira percentagem da Tabela e
     * o intervalo mínimo da segunda tabela
     * @return Valor que determina o intervalo máximo da primeira percentagem da Tabela e
     * o intervalo mínimo da segunda tabela
     */
    public static int getMedAntiguidade() {
        return medAntiguidade;
    }
    
    /**
     *Obter valor que determina o intervalo mínimo da terceira percentagem da Tabela 
     * @return Valor que determina o intervalo mínimo da terceira percentagem da Tabela 
     */
    public static int getMaxAntiguidade() {
        return maxAntiguidade;
    }
    
    /**
     *Obter percentagem mediante o intervalo de antiguidade de [5,10] anos
     * @param percMinAntiguidade Percentagem mínima de antiguidade
     */
    public static void setPercMinAntiguidade(double percMinAntiguidade) {
        AtletaNaoPro.percMinAntiguidade = percMinAntiguidade;
    }

    /**
     *Obter percentagem mediante o intervalo de antiguidade de ]10,20] anos
     * @param percMedAntiguidade Segunda percentagem de antiguidade
     */
    public static void setPercMedAntiguidade(double percMedAntiguidade) {
        AtletaNaoPro.percMedAntiguidade = percMedAntiguidade;
    }

    /**
     *Obter percentagem mediante antiguidades superiores a 20 anos
     * @param percMaxAntiguidade Percentagem máxima de antiguidade
     */
    public static void setPercMaxAntiguidade(double percMaxAntiguidade) {
        AtletaNaoPro.percMaxAntiguidade = percMaxAntiguidade;
    }

    /**
     *Altera valor que determina o intervalo mínimo da primeira percentagem da Tabela 
     * @param minAntiguidade Valor que determina o intervalo mínimo da primeira percentagem da Tabela 
     */
    public static void setMinAntiguidade(int minAntiguidade) {
        AtletaNaoPro.minAntiguidade = minAntiguidade;
    }

    /**
     *Altera valor que determina o intervalo máximo da primeira percentagem da Tabela e
     * o intervalo mínimo da segunda tabela
     * @param medAntiguidade Valor que determina o intervalo máximo da primeira percentagem da Tabela e
     * o intervalo mínimo da segunda tabela
     */
    public static void setMedAntiguidade(int medAntiguidade) {
        AtletaNaoPro.medAntiguidade = medAntiguidade;
    }

    /**
     *Altera valor que determina o intervalo mínimo da terceira percentagem da Tabela 
     * @param maxAntiguidade Valor que determina o intervalo mínimo da terceira percentagem da Tabela 
     */
    public static void setMaxAntiguidade(int maxAntiguidade) {
        AtletaNaoPro.maxAntiguidade = maxAntiguidade;
    }

}
