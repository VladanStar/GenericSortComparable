package com.company;

import static java.util.Arrays.sort;
import static jdk.internal.org.objectweb.asm.util.Printer.printList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // kreiranje niza sa Integer elementima
        Integer[] inArray = {new Integer(1), new Integer(2), new Integer(3)};


        // kreiranje niza sa Double elementima

        Double[] doArray = {new Double(2.5), new Double(3.5), new Double(4.5)};

        // Kreiranje niza Character
        Character[] chArray = {new Character("a"), new Character('b'), new Character("c")};

        // kreiranje niza stringova
        String[] stArray = {new String("Vlada"), new String("Veliki"), new String("Dalibor")};

        // sortiranje nizova
        sort(inArray);
        sort(doArray);
        sort(chArray);
        sort(stArray);

        // Prikaz sortiranih nizova
        System.out.print("Sorted Integer objects: ");
        public static void printList printList(inArray);
        System.out.print("Sorted Double objects: ");
        printList(doArray);
        System.out.print("Sorted Character objects: ");
        printList(chArray);
        System.out.print("Sorted String objects: ");
        printList(stArray);

        /** Sortiranje niza sa uoredljivim (Comparable) elementima */
        public static <E extends Comparable<E>>void sort (E[]list){
            E currentMin;
            int currentMinIndex;

            for (int i = 0; i < list.length - 1; i++) {
                // Nalaženje minimuma u listi list[i+1..list.length-2]
                currentMin = list[i];
                currentMinIndex = i;

                for (int j = i + 1; j < list.length; j++) {
                    if (currentMin.compareTo(list[j]) > 0) {
                        currentMin = list[j];
                        currentMinIndex = j;
                    }
                }

                // Zamena list[i] sa list[currentMinIndex]ako je potrebno;
                if (currentMinIndex != i) {
                    list[currentMinIndex] = list[i];
                    list[i] = currentMin;
                }
            }
        }

        /** Štampanje niza objekata */
        (Object[]list){
            for (int i = 0; i < list.length; i++)
                System.out.print(list[i] + " ");
            System.out.println();
        }


    }
}
