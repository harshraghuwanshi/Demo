import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args){
        //System.out.printf("Hello and welcome!");
        /* student s = new student();     VIA REFERENCE
        s.name = "Harsh";
        s.roll = Integer.parseInt("21");
        s.clgname = "oriental";
        System.out.println(s); */

       /* student s = new student();
        s.init("harsh" , 21 ,"LNCT");
 */         //VIA METHOD

        student s = new student("Harsh" , 21 , "lnvt");
        System.out.println(s.toString());
    }
}