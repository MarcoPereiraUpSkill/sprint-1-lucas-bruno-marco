package upskill.clubedesportivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Vicious
 */
public class ClubeDesportivo {

    private String nome;
    private Date data;
    private ArrayList<Atleta> atletas;

    private static final String NOME_POR_OMISSAO = "";
    private static final Date DATA_POR_OMISSAO = new Date();
    private static final ArrayList<Atleta> ATLETAS_POR_OMISSAO = new ArrayList<Atleta>();

    /**
     *Construtor Completo
     * @param nome Nome do clube desportivo
     * @param data Data de fundação do clube
     * @param atletas Contentor para armazentar os atletas
     */
    public ClubeDesportivo(String nome, Date data, ArrayList<Atleta> atletas) {
        this.nome = nome;
        this.data = data;
        this.atletas = atletas;
    }

    /**
     *Construtor com variável nome como parâmetro
     * @param nome Nome do clube desportivo
     */
    public ClubeDesportivo(String nome) {
        this.nome = nome;
        data = DATA_POR_OMISSAO;
        atletas = ATLETAS_POR_OMISSAO;
    }

    /**
     *Construtor vazio
     */
    public ClubeDesportivo() {
        nome = NOME_POR_OMISSAO;
        data = DATA_POR_OMISSAO;
        atletas = ATLETAS_POR_OMISSAO;
    }

    /**
     *Obter nome do clube
     * @return Nome do clube
     */
    public String getNome() {
        return nome;
    }

    /**
     *Obter data de fundação
     * @return Data de fundação
     */
    public Date getData() {
        return data;
    }

    /**
     *Obter contentor de atletas
     * @return Contentor de atletas
     */
    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    /**
     *Alterar nome do clube
     * @param nome Nome do clube
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *Alterar data de fundação
     * @param data Data de fundação
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     *Alterar contentor de atletas
     * @param atletas Contentor de atletas
     */
    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = atletas;
    }

    @Override
    public String toString() {
        return String.format("Clube Desportivo: nome: %s, data: %d", nome, data);
    }

    @Override
    public boolean equals(Object obj) {
         if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClubeDesportivo)) {
            return false;
        }

        ClubeDesportivo clubeDesportivo = (ClubeDesportivo) obj;

        return nome.compareTo(clubeDesportivo.getNome()) == 0
                && data.compareTo(clubeDesportivo.getData()) == 0
                && atletas.equals(clubeDesportivo.getAtletas());
    }

    /**
     *Insere atleta ao contentor de atletas do ClubeDesportivo
     * @param atleta Contentor com dados do atleta
     */
    public void inserirAtleta(Atleta atleta) {
        atletas.add(atleta);
    }

    /**
     *Ordena o contentor de atletas alfabeticamente por nome
     * @return Contentor de atletas
     */
    public ArrayList<Atleta> ordenarAlfabeticamenteNome() {
        Collections.sort(atletas);
        return atletas;
    }

    /**
     *
     * @return
     */
    public ArrayList<Atleta> ordenarInversamentePremios() {
        OrdenarPremios ordenarPremios = new OrdenarPremios();
        Collections.sort(atletas, ordenarPremios.reversed());

        return atletas;
    }

    /**
     *
     * @return
     */
    public ArrayList<Atleta> ordenarCategoriaModalidadeNome() {
        OrdenarCategoriaModalidadeNome ordenarCategoriaModalidadeNome = new OrdenarCategoriaModalidadeNome();
        Collections.sort(atletas, ordenarCategoriaModalidadeNome);

        return atletas;
    }

    /**
     *
     * @return
     */
    public double calcularTotalIRS() {
        double valorTotalIRS = 0;
        
        for (Atleta atleta : atletas) {
            if (atleta instanceof IRS) {
                valorTotalIRS = valorTotalIRS + ((IRS) atleta).calcularIRS();
            }
        }

        return valorTotalIRS;
    }

}
