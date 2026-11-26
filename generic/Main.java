package generic;


public class Main{
    public static <T> void  display(T[] array){
        for (T items: array){
            System.out.println(items);
        }
    }
    public static void main(String[] args){
      Double[] array1={2.5,3.5,4.5};
      Character[] array2={'A','B','C'};
     Main.display(array1);
     Main.display(array2);

    }
}