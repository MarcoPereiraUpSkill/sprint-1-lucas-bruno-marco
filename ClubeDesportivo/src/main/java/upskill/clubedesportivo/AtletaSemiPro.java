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
public class AtletaSemiPro extends AtletaNaoPro implements IRS{
    
    private static final double PARCELAFIXA_POR_OMISSAO=0;
    private static final double PARCELAVARIAVEL_POR_OMISSAO=0;
    
    private static double parcelaFixa=500;
    private static double parcelaVariavel=0;

    public AtletaSemiPro(int antiguidade, String nome, int nic, String genero, int idade, int fcr, String atividade, String objetivo, double premios) {
        super(antiguidade, nome, nic, genero, idade, fcr, atividade, objetivo, premios);
    }
    
    public AtletaSemiPro() {
        super();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return obj instanceof Atleta;
    }

    @Override
    public String toString() {
        return "AtletaSemiPro{" + '}';
    }
    
    @Override
    public double calcularValorMensal(){
        return parcelaFixa+(parcelaFixa*(obterPercAntiguidade()/100));
    }
    
    @Override
    public double calcularIRS(){
     return parcelaFixa*(double)(IRS.taxaIRS/100);
    }

    public static double getParcelaFixa() {
        return parcelaFixa;
    }

    public static void setParcelaFixa(double parcelaFixa) {
        AtletaSemiPro.parcelaFixa = parcelaFixa;
    }

    public static double getParcelaVariavel() {
        return parcelaVariavel;
    }

    public static void setParcelaVariavel(double parcelaVariavel) {
        AtletaSemiPro.parcelaVariavel = parcelaVariavel;
    }

    
    
    
}
