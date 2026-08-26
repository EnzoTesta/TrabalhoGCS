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

    // b. Método que retorna true se l tem elementos repetidos
    public boolean hasRepeat(ArrayList<Integer> l){
        for (int i=0; i<l.size(); i++){
            for (int j=i+1; j<l.size(); j++){
                if(l.get(i).equals(l.get(j))){
                    return true;
                }
            }
        }
        return false;
    }

    //e) Método que retorna a união de l1 e l2

    public ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
    ArrayList<Integer> resultado = new ArrayList<Integer>();

    for (Integer elemento : l1) {
        if (!resultado.contains(elemento)) {
            resultado.add(elemento);
        }
    }

    for (Integer elemento : l2) {
        if (!resultado.contains(elemento)) {
            resultado.add(elemento);
        }
    }

    return resultado;
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