package Pizza;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.StyleSheet.ListPainter;

public class Main {

	public static void main(String[] args) {
//		/*
//		 * f)Funcția principală a programului creează două liste cu obiecte de tip Pizza. În prima listă se adaugă trei obiecte:două Pizza 
//		 * și o PizzaWithIngredients.În a doua listă se adauga trei obiecte (alegeți voi descrierea și prețul ): o Pizza și două PizzaWithIngredients.
//		 *Sortați cele două liste, folosind funcția de la c),
//		 * apoi formați din cele două liste o listă L folosind funcția de la b). La
//		 * final, tipăriți lista L folosind funcția de la punctul d).
//		 */
		Pizza diavola = new Pizza("salami", 30);
		Pizza fromagi = new Pizza("cuBranza", 25);
		PizzaWithIngredients fungi = new PizzaWithIngredients("cuCiuperci", 23, 15);
		
		List<Pizza> raw = new ArrayList<Pizza>();
		
		raw.add(fungi);
		raw.add(fromagi);
		raw.add(diavola);
		
		Pizza margherita = new Pizza("aluat", 30);
		PizzaWithIngredients hawaii = new PizzaWithIngredients("cuAnanas", 12, 15);
		PizzaWithIngredients rustica = new PizzaWithIngredients("mozarella", 7, 20);
		
		List<Pizza> cooked = new ArrayList<Pizza>();
		
		cooked.add(margherita);
		cooked.add(hawaii);
		cooked.add(rustica);
		
		
		List<Pizza> p= mergeList(raw, cooked);
		for (int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).toString());
			
		}
	}
	
//		/*
//		 * b) Definește o funcţie care având ca parametri două liste conținând obiecte
//		 * de tip Pizza ordonate descrescător după preț , returnează o nouă listă
//		 * conținând toate obiectele din cele două liste parametru, ordonată
//		 * descrescător după preț. Complexitatea timp a funcției trebuie să fie liniară
//		 * .
//		

	public static List<Pizza> mergeList(List<Pizza> raw, List<Pizza> cooked)  {
		

        List<Pizza> resultArray = new ArrayList<>();
       
        int indexArray1 = raw.size()-1;
        int indexArray2 = cooked.size()-1;
        int index =0;

        while ( (indexArray1 > 0) && (indexArray2 > 0) )
        {
            if (raw.get(indexArray1).getBasePrice() >= cooked.get(indexArray2).getBasePrice())
            {
                resultArray.add(index++, raw.get(indexArray1));
                indexArray1--;
              //  indexResult++;
            }
            else if ( cooked.get(indexArray2).getBasePrice() > raw.get(indexArray1).getBasePrice())
            {
                resultArray.add(index++, cooked.get(indexArray2));
                indexArray2--;
//                indexResult++;
            }
        }

        while (indexArray1 > 0)
        {
            resultArray.add(index++, raw.get(indexArray1));
            indexArray1--;
//            indexResult++;
        }

        while (indexArray2 >0)
        {
            resultArray.add(index++, cooked.get(indexArray2));
            indexArray2--;
//            indexResult++;
        }

        return resultArray;
    }

	

	/*
	 * c)
Definește o funcție care sortează, în ordine descrescătoare după pret, o listă conținând obiecte de tip Pizza. Sortarea se va face astfel:
elementele listei sunt parcurse secvențial (de la poziția a doua până la ultima); se va insera elementul de pe poziția i în sublista (deja sortată) conținând elementele de la
 prima poziție la poziția i-1.    
	 */
	public static List<Pizza> insertSorted(List<Pizza> myList){
		Pizza temp;

		for (int i = 1; i < myList.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (myList.get(j).getBasePrice() > myList.get(j-1).getBasePrice()) {
					temp = myList.get(j);
					myList.set(j, myList.get(j-1));
					myList.set(j-1,temp);

				}
			}
		}
		return myList;
	}




}
