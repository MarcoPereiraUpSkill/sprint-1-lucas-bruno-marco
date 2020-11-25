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
public class AtletaNaoPro extends Atleta {

    private int antiguidade;

    private static final int ANTIGUIDADE_POR_OMISSAO = 0;

    private static double percMinAntiguidade = 2;
    private static double percMedAntiguidade = 8;
    private static double percMaxAntiguidade = 20;
    private static int minAntiguidade = 5;
    private static int medAntiguidade = 10;
    private static int maxAntiguidade = 20;

    /**
     *
     * @param antiguidade
     * @param nome
     * @param nic
     * @param genero
     * @param idade
     * @param fcr
     * @param atividade
     * @param objetivo
     * @param premios
     */
    public AtletaNaoPro(int antiguidade, String nome, int nic, String genero, int idade, int fcr, String atividade, String objetivo, double premios) {
        super(nome, nic, genero, idade, fcr, atividade, objetivo, premios);
        this.antiguidade = antiguidade;
    }
    
    /**
     *
     */
    public AtletaNaoPro() {
        super();
        this.antiguidade = ANTIGUIDADE_POR_OMISSAO;
    }

    /**
     *
     * @return
     */
    public int getAntiguidade() {
        return antiguidade;
    }

    /**
     *
     * @param antiguidade
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
        if (!(obj instanceof Atleta)) {
            return false;
        }

        AtletaNaoPro atletaNaoPro = (AtletaNaoPro) obj;

        return Integer.compare(antiguidade, atletaNaoPro.getAntiguidade()) == 0;
    }

    @Override
    public String toString() {
        return "AtletaNaoPro{" + "antiguidade=" + antiguidade + '}';
    }

    /**
     *
     * @return
     */
    public double obterPercAntiguidade() {
        return (antiguidade >= minAntiguidade && antiguidade <= medAntiguidade) ? percMinAntiguidade
                : (antiguidade > medAntiguidade && antiguidade <= maxAntiguidade) ? percMedAntiguidade : percMaxAntiguidade;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularValorMensal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public static double getPercMinAntiguidade() {
        return percMinAntiguidade;
    }

    /**
     *
     * @param percMinAntiguidade
     */
    public static void setPercMinAntiguidade(double percMinAntiguidade) {
        AtletaNaoPro.percMinAntiguidade = percMinAntiguidade;
    }

    /**
     *
     * @return
     */
    public static double getPercMedAntiguidade() {
        return percMedAntiguidade;
    }

    /**
     *
     * @param percMedAntiguidade
     */
    public static void setPercMedAntiguidade(double percMedAntiguidade) {
        AtletaNaoPro.percMedAntiguidade = percMedAntiguidade;
    }

    /**
     *
     * @return
     */
    public static double getPercMaxAntiguidade() {
        return percMaxAntiguidade;
    }

    /**
     *
     * @param percMaxAntiguidade
     */
    public static void setPercMaxAntiguidade(double percMaxAntiguidade) {
        AtletaNaoPro.percMaxAntiguidade = percMaxAntiguidade;
    }

    /**
     *
     * @return
     */
    public static int getMinAntiguidade() {
        return minAntiguidade;
    }

    /**
     *
     * @param minAntiguidade
     */
    public static void setMinAntiguidade(int minAntiguidade) {
        AtletaNaoPro.minAntiguidade = minAntiguidade;
    }

    /**
     *
     * @return
     */
    public static int getMedAntiguidade() {
        return medAntiguidade;
    }

    /**
     *
     * @param medAntiguidade
     */
    public static void setMedAntiguidade(int medAntiguidade) {
        AtletaNaoPro.medAntiguidade = medAntiguidade;
    }

    /**
     *
     * @return
     */
    public static int getMaxAntiguidade() {
        return maxAntiguidade;
    }

    /**
     *
     * @param maxAntiguidade
     */
    public static void setMaxAntiguidade(int maxAntiguidade) {
        AtletaNaoPro.maxAntiguidade = maxAntiguidade;
    }

}
