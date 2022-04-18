package exercise2_2;

import java.sql.SQLOutput;

public class LogicalOpTable {

    public void OutputTable(){
        boolean p, q;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true; q = true;
        System.out.println("");

        System.out.print(convert(p) + "\t" + convert(q) + "\t");
        System.out.print(convert(p&q) + "\t" + convert(p|q) + "\t");
        System.out.println(convert(p^q) + "\t" + convert((!p)));

        p = true; q = false;
        System.out.print(convert(p) + "\t" + convert(q) + "\t");
        System.out.print(convert(p&q) + "\t" + convert(p|q) + "\t");
        System.out.println(convert(p^q) + "\t" + convert(!p) + "\t");

        p = false; q = true;
        System.out.print(convert(p) + "\t" + convert(q) + "\t");
        System.out.print(convert(p&q) + "\t" + convert(p|q) + "\t");
        System.out.println(convert(p^q) + "\t" + convert(!p) + "\t");

        p = false; q = false;
        System.out.print(convert(p) + "\t" + convert(q) + "\t");
        System.out.print(convert(p&q) + "\t" + convert(p|q) + "\t");
        System.out.println(convert(p^q) + "\t" + convert(!p) + "\t");
    }

    public int convert (boolean crazy){

        if (crazy) {
            return 1;
        } else {
            return 0;
        }
    }

}
