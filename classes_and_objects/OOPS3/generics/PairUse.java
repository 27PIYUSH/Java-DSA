package classes_and_objects.OOPS3.generics;

public class PairUse {
    
    public static void main(String[] args) {
        Pair<String,String> p = new Pair<String,String>("ab","cd");
        p.setFirst("AB");
        String s = p.getFirst();

        Pair<Integer,Character> p1 = new Pair<>(1,'2');

        Pair<Character,String> p2 = new Pair<>('a',"wow");

        int a = 10;
        int b = 20;
        int c = 30;
        Pair<Integer,Integer> internalPair = new Pair<>(a,b);
        Pair<Pair<Integer,Integer>,Integer> p3 = new Pair<>(internalPair,c);
        System.out.println(p3.getFirst().getFirst());
        System.out.println(p3.getFirst().getSecond());
        System.out.println(p3.getSecond());
    }
}
