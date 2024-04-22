package EJERCICIOS.EJERCICIOS_LISTAS.PUNTOS_1to4;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Metodos {

    public void Mezcla2(@NotNull List<Integer>list1, List<Integer> list2){

        List<Integer> Lista3 = new ArrayList<>();
        boolean MenorAMayor=true;
        for (int i =0 ; i<list1.size()-1;i++) {
            if (list1.get(i) >list1.get(i+1) || list2.get(i)>list2.get(i+1)) {
                MenorAMayor = false;
                System.out.println("LISTAS NO ESTAN ORDENADAS DE MENOR A MAYOR");
                break;
            }

        }

        if (MenorAMayor){
            Lista3.addAll(list1);
            Lista3.addAll(list2);
            Collections.sort(Lista3);
        }
        
        System.out.println(Lista3);

    }

    public int sumaRecursiva(List<Integer> list){
        if (list.isEmpty()){
            return 0 ;
        }else {
            return list.get(0) + sumaRecursiva(list.subList(1,list.size()));
        }

    }

    public void imprimeInverso(LinkedList<Integer> linkedList, int p){
       if (p >= 0 && p < linkedList.size()){
           for (int i = p;i>=0;i--){
               System.out.println(linkedList.get(i));
           }
       }else {
           System.out.println("POSICION FUERA DE LOS LIMITES");
       }

    }

    public Integer buscarXenLinkedList(@NotNull LinkedList<Integer> linkedList, int num) {

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) == num) {
                return i;
            }
        }
        return null;
    }










}
