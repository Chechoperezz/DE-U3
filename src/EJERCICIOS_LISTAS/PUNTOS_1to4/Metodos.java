package EJERCICIOS_LISTAS.PUNTOS_1to4;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Metodos {

    public void Mezcla2(@NotNull List<Integer>list1, List<Integer> list2){

        List<Integer> Lista3 = new ArrayList<>();
        boolean MenorAMayor=true; // VERIFCA SI LAS LISTAS ESTAN DE MENOR A MAYOR
        for (int i =0 ; i<list1.size()-1;i++) {
            if (list1.get(i) >list1.get(i+1) || list2.get(i)>list2.get(i+1)) {
                MenorAMayor = false;
                System.out.println("LISTAS NO ESTAN ORDENADAS DE MENOR A MAYOR");
                break;
            }

        }

        if (MenorAMayor){
            //SE AGRUPON TODOS LOS ELEMENTOS EN OTRA LISTA
            Lista3.addAll(list1);
            Lista3.addAll(list2);

            //EL METODO SORT ORDENA DE MENOR A MAYOR LOS ELEMENTOS AGRUPADOS
            Collections.sort(Lista3);
        }
        System.out.println("MEZCLA DE DOS LISTAS ASCENDENTES");
        System.out.println(Lista3); // SE MUESTRAN LOS ELEMENTOS

    }

    public int sumaRecursiva(List<Integer> list){
        if (list.isEmpty()){
            return 0 ;
        }else {
            /*
            SE SUMA LA PRIMERA POSICION CON LA SUMA RECURSIVA DE VARIAS
            SUBLISTAS DE LA MISMA LISTA HASTA QUE LA LISTA ESTE VACIA
             */
            return list.get(0) + sumaRecursiva(list.subList(1,list.size()));
        }

    }

    public void imprimeInverso(LinkedList<Integer> linkedList, int p ){

       if (p >= 0 && p < linkedList.size()){   //EL INDEX DEBE ESTAR DENTRO DE LOS LIMITES
           System.out.println("LISTA INVERSA: ");
           for (int i = p;i>=0;i--){          //SE ITERA EN "REVERSA DESDE LA POSICION DADA"
               System.out.println(linkedList.get(i));
           }
       }else {
           // EL LIMITE ESTA FUERA DE LOS LIMITES SE ROMPE EL CICLO
           System.out.println("POSICION FUERA DE LOS LIMITES");
       }

    }

    public Integer buscarXenLinkedList(@NotNull LinkedList<Integer> linkedList, int num) {

        // SE BUSCA LA POSICION DEL NUMERO RECIBIDO
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) == num) {
                //SI LO ENCUENTRA DEVUELVE LA POSICION, NO EL NUMERO
                return i;
            }
        }
        //NO LO ENCUENTRA DEVUELVE NULL
        return null;
    }

}
