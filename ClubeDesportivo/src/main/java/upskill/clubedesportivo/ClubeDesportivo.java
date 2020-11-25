package upskill.clubedesportivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class ClubeDesportivo {

    private String nome;
    private Date data;
    private ArrayList<Atleta> atletas;

    private static final String NOME_POR_OMISSAO = "";
    private static final Date DATA_POR_OMISSAO = new Date();
    private static final ArrayList<Atleta> ATLETAS_POR_OMISSAO = new ArrayList<Atleta>();

    public ClubeDesportivo(String nome, Date data, ArrayList<Atleta> atletas) {
        this.nome = nome;
        this.data = data;
        this.atletas = atletas;
    }

    public ClubeDesportivo(String nome) {
        this.nome = nome;
        data = DATA_POR_OMISSAO;
        atletas = ATLETAS_POR_OMISSAO;
    }

    public ClubeDesportivo() {
        nome = NOME_POR_OMISSAO;
        data = DATA_POR_OMISSAO;
        atletas = ATLETAS_POR_OMISSAO;
    }

    public String getNome() {
        return nome;
    }

    public Date getData() {
        return data;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = atletas;
    }

    @Override
    public String toString() {
        return "ClubeDesportivo{" + "nome=" + nome + ", data=" + data + ", atletas=" + atletas + '}';
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

    public void inserirAtleta(Atleta atleta) {
        atletas.add(atleta);
    }

    public ArrayList<Atleta> ordenarAlfabeticamenteNome() {
        Collections.sort(atletas);
        return atletas;
    }

    public ArrayList<Atleta> ordenarInversamentePremios() {
        OrdenarPremios ordenarPremios = new OrdenarPremios();
        Collections.sort(atletas, ordenarPremios.reversed());

        return atletas;
    }

    public ArrayList<Atleta> ordenarCategoriaModalidadeNome() {
        OrdenarCategoriaModalidadeNome ordenarCategoriaModalidadeNome = new OrdenarCategoriaModalidadeNome();
        Collections.sort(atletas, ordenarCategoriaModalidadeNome);

        return atletas;
    }

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
