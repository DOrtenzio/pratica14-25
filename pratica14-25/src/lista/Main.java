package lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ListeConcatenate<Integer> lista=new ListeConcatenate<Integer>();
        int scelta;
        do {
            System.out.println("Scegli una delle opzioni:" +
                    "0- esci\n" +
                    "1- toString\n" +
                    "2- inserimento in testa\n" +
                    "3- inserimento in coda\n" +
                    "4- inserimento in posizione prestabilita\n" +
                    "5- inserimento prima di un elemento cercato (sfruttare il metodo equals)\n" +
                    "6- cancellazione di un nodo");
            scelta=Integer.parseInt(in.nextLine().trim());
            System.out.println("------------------------------------------------------");
            switch (scelta){
                case 0:
                    System.out.println("CIAOOOOOO");
                    break;
                case 1:
                    System.out.println(lista);
                    break;
                case 2:
                    System.out.println("INSERIMENTO IN TESTA");
                    System.out.println("Inserisci il valore da inserire:");
                    System.out.println("Risultato Operazione: "+lista.addInTesta(Integer.parseInt(in.nextLine().trim())));
                    break;
                case 3:
                    System.out.println("INSERIMENTO IN CODA");
                    System.out.println("Inserisci il valore da inserire:");
                    System.out.println("Risultato Operazione: "+lista.addInCoda(Integer.parseInt(in.nextLine().trim())));
                    break;
                case 4:
                    System.out.println("INSERIMENTO IN POSIZIONE PRESTABILITA");
                    System.out.println("Inserisci la posizione (da 1 a n)");
                    int pos=Integer.parseInt(in.nextLine().trim())-1;
                    System.out.println("Inserisci il valore da inserire:");
                    System.out.println("Risultato Operazione: "+lista.addInPosizione(pos,Integer.parseInt(in.nextLine().trim())));
                    break;
                case 5:
                    System.out.println("INSERIMENTO PRIMA DI UN ELEMENTO");
                    System.out.println("Inserisci l'elemento che dovrà seguire il nuovo elemento");
                    Integer el=Integer.parseInt(in.nextLine().trim());
                    System.out.println("Inserisci il valore da inserire:");
                    System.out.println("Risultato Operazione: "+lista.addBeforeElement(el,Integer.parseInt(in.nextLine().trim())));
                    break;
                case 6:
                    System.out.println("CANCELLAZIONE ELEMENTO");
                    System.out.println("Inserisci il valore da cancellare:");
                    System.out.println("Risultato Operazione: "+lista.cancellazione(Integer.parseInt(in.nextLine().trim())));
                    break;
                default:
                    System.out.println("Scegli solo una delle opzioni proposte");
            }
            System.out.println("------------------------------------------------------");
        } while(scelta!=0);
    }
}