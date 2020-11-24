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
public class AtletaNaoPro extends Atleta{
    private int antiguidade;
    
    private static final int ANTIGUIDADE_POR_OMISSAO=0;
    
    private static double percMinAntiguidade = 2;
    private static double percMedAntiguidade = 8;
    private static double percMaxAntiguidade = 20;
    private static int minAntiguidade = 5;
    private static int medAntiguidade = 10;
    private static int maxAntiguidade = 20;

    public AtletaNaoPro(int antiguidade, String nome, int nic, String genero, int idade, String atividade, int fcr) {
        super(nome, nic, genero, idade, atividade, fcr);
        this.antiguidade = antiguidade;
    }

    public int getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    @Override
    public String toString() {
        return "AtletaNaoPro{" + "antiguidade=" + antiguidade + '}';
    }

    public static double getPercMinAntiguidade() {
        return percMinAntiguidade;
    }

    public static void setPercMinAntiguidade(double percMinAntiguidade) {
        AtletaNaoPro.percMinAntiguidade = percMinAntiguidade;
    }

    public static double getPercMedAntiguidade() {
        return percMedAntiguidade;
    }

    public static void setPercMedAntiguidade(double percMedAntiguidade) {
        AtletaNaoPro.percMedAntiguidade = percMedAntiguidade;
    }

    public static double getPercMaxAntiguidade() {
        return percMaxAntiguidade;
    }

    public static void setPercMaxAntiguidade(double percMaxAntiguidade) {
        AtletaNaoPro.percMaxAntiguidade = percMaxAntiguidade;
    }

    public static int getMinAntiguidade() {
        return minAntiguidade;
    }

    public static void setMinAntiguidade(int minAntiguidade) {
        AtletaNaoPro.minAntiguidade = minAntiguidade;
    }

    public static int getMedAntiguidade() {
        return medAntiguidade;
    }

    public static void setMedAntiguidade(int medAntiguidade) {
        AtletaNaoPro.medAntiguidade = medAntiguidade;
    }

    public static int getMaxAntiguidade() {
        return maxAntiguidade;
    }

    public static void setMaxAntiguidade(int maxAntiguidade) {
        AtletaNaoPro.maxAntiguidade = maxAntiguidade;
    }


    
    
    
    
}
