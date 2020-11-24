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
public class AtletaPro extends Atleta{
    private double parcelaFixa;
    private double parcelaVariavel;
    
    private static final double PARCELAFIXA_POR_OMISSAO=0;
    private static final double PARCELAVARIAVEL_POR_OMISSAO=0;
    
    private static double percParcelaVariavel=20;

    public AtletaPro(double parcelaFixa, double parcelaVariavel, String nome, int nic, String genero, int idade, int fcr, String atividade, String objetivo) {
        super(nome, nic, genero, idade, fcr, atividade, objetivo);
        this.parcelaFixa = parcelaFixa;
        this.parcelaVariavel = parcelaVariavel;
    }

    public double getParcelaFixa() {
        return parcelaFixa;
    }

    public void setParcelaFixa(double parcelaFixa) {
        this.parcelaFixa = parcelaFixa;
    }

    public double getParcelaVariavel() {
        return parcelaVariavel;
    }

    public void setParcelaVariavel(double parcelaVariavel) {
        this.parcelaVariavel = parcelaVariavel;
    }

    @Override
    public String toString() {
        return "AtletaPro{" + "parcelaFixa=" + parcelaFixa + ", parcelaVariavel=" + parcelaVariavel + '}';
    }

    public static double getPercParcelaVariavel() {
        return percParcelaVariavel;
    }

    public static void setPercParcelaVariavel(double percParcelaVariavel) {
        AtletaPro.percParcelaVariavel = percParcelaVariavel;
    }
    
    
}
