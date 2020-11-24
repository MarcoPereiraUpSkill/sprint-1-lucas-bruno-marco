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
public class AtletaPro extends Atleta {

    private double parcelaFixa;

    //parcelaVariavel não está a ser usada
    private double parcelaVariavel;

    private static final double PARCELAFIXA_POR_OMISSAO = 0;
    private static final double PARCELAVARIAVEL_POR_OMISSAO = 0;

    private static double percParcelaVariavel = 20;
    private static int qtdAtletaPro = 0;

    public AtletaPro(double parcelaFixa, double parcelaVariavel, String nome, int nic, String genero, int idade, int fcr, String atividade, String objetivo, double premios) {
        super(nome, nic, genero, idade, fcr, atividade, objetivo, premios);
        this.parcelaFixa = parcelaFixa;
        this.parcelaVariavel = parcelaVariavel;
        qtdAtletaPro++;
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

        AtletaPro atletaPro = (AtletaPro) obj;
        
        return Double.compare(parcelaFixa, atletaPro.getParcelaFixa()) == 0
                && Double.compare(parcelaVariavel, atletaPro.getParcelaVariavel()) == 0;
    }

    @Override
    public String toString() {
        return "AtletaPro{" + "parcelaFixa=" + parcelaFixa + ", parcelaVariavel=" + parcelaVariavel + '}';
    }

    @Override
    public double calcularValorMensal() {
        return parcelaFixa + (getPremios() * (percParcelaVariavel / 100));
    }

    public static double getPercParcelaVariavel() {
        return percParcelaVariavel;
    }

    public static void setPercParcelaVariavel(double percParcelaVariavel) {
        AtletaPro.percParcelaVariavel = percParcelaVariavel;
    }

    public static int getQtdAtletaPro() {
        return qtdAtletaPro;
    }

}
