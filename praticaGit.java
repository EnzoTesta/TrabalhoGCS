import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class praticaGit {

    // a. Método que retorna quantas ocorrências de um elemento estão na lista
    public static int nrOcorrencias(ArrayList<Integer> l, Integer el) {
        if (l == null || el == null) return 0;
        int count = 0;
        for (Integer num : l) {
            if (el.equals(num)) {
                count++;
            }
        }
        return count;
    }

    



    // d. Método que retorna uma lista de elementos repetidos de l
    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> repetidos = new ArrayList<>();
        if (l == null) return repetidos;

        Set<Integer> vistos = new HashSet<>();
        Set<Integer> adicionados = new HashSet<>();

        for (Integer num : l) {
            if (!vistos.add(num) && adicionados.add(num)) {
                repetidos.add(num);
            }
        }
        return repetidos;
    }



}