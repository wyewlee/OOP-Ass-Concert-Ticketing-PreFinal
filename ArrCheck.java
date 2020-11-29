/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ArrCheck {

    public static int checkArrayNEmpty(Object obj[]) {
        int emptyN = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] == null) {
                emptyN++;
            }
        }
        return obj.length - emptyN;
    }

        //Concert conArr[] = new Concert[99];
        //conArr[0] = new Concert("BC One", "Axiata Arena Bukit Jalil", "02-JAN-2020", "08:00PM");
        //conArr[1] = new Concert("BC One", "Axiata Arena Bukit Jalil", "22-AUG-2020", "05:00PM");
        //System.out.print(checkArrayNEmpty(conArr));  return which n is empty

}
