
package upskill.clubedesportivo;

import java.util.Comparator;

public class OrdenarCategoriaModalidadeNome implements Comparator<Atleta>{

    @Override
    public int compare(Atleta atleta1, Atleta atleta2) {
        if(atleta1.getClass().getName().compareTo(atleta2.getClass().getName())== 0){
            if(atleta1.getAtividade().compareTo(atleta2.getAtividade()) == 0){
                if(atleta1.getNome().compareTo(atleta2.getNome()) == 0){
                    return 0;
                } else {
                    return atleta1.getNome().compareTo(atleta2.getNome());
                }
            } else {
                return atleta1.getAtividade().compareTo(atleta2.getAtividade());
            }
        } else {
            return atleta1.getClass().getName().compareTo(atleta2.getClass().getName());
        }
    }
    
}
