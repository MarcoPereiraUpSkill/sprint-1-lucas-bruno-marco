
package upskill.clubedesportivo;

import java.util.Comparator;

/**
 *
 * @author
 */
public class OrdenarPremios implements Comparator<Atleta>{

    @Override
    public int compare(Atleta atleta1, Atleta atleta2) {
        return Double.compare(atleta1.getPremios(), atleta2.getPremios());
    }
}
