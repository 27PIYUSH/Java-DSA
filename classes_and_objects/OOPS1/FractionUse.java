package classes_and_objects.OOPS1;

public class FractionUse {
    
    public static void main(String[] args) throws ZeroDenominatorException{
        Fraction f1 = new Fraction(20, 30);
        f1.print();
        // 2/3

        f1.setNumerator(12);
        int d = f1.getDenomenator();
        System.out.println(d);
        f1.print();
        // 4/1

        f1.setNumerator(10);

        try{        
            f1.setDenomenator(0); // in case of no exception
        } catch(ZeroDenominatorException e){
            System.out.println("Hey don't input 0 as denominator! "); // in case of exception
        } finally{
            System.out.println("execute..."); // used for common task in try and catch
        }
        
        f1.print();
        // 1/3

        Fraction f2 = new Fraction(3, 4);
        f1.add(f2); // f1=f1+f2
        f1.print(); // 13/12
        f2.print  (); // 3/4

        Fraction f3 = new Fraction(4, 5);
        f3.multily(f2);
        f3.print(); // 3/5
        f2.print(); // 3/4

        Fraction f4 = Fraction.add(f1, f2); //f4=f1+f2
        f1.print();
        f3.print();
        f4.print(); // 101/60
    }
}
