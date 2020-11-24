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
public class AtletaSemiPro extends AtletaNaoPro{
    
    private static final double PARCELAFIXA_POR_OMISSAO=0;
    private static final double PARCELAVARIAVEL_POR_OMISSAO=0;
    
    private static double parcelaFixa=0;
    private static double parcelaVariavel=0;

    public AtletaSemiPro(int antiguidade, String nome, int nic, String genero, int idade, int fcr, String atividade) {
        super(antiguidade, nome, nic, genero, idade, fcr, atividade);
    }

    @Override
    public String toString() {
        return "AtletaSemiPro{" + '}';
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
