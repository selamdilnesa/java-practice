public class StringBuilderpractice {
    public static void main (String[] args){
        StringBuilder word = new StringBuilder("i java");
        word.append(" programming");
        word.insert(2," love");
        word.delete(11,23);
        word.replace(7,11,"  phyton");
        StringBuilder country = new StringBuilder("Ethiopia");  
        country.reverse();
        System.out.println("StringBuilder: " + country);
        System.out.println("StringBuilder: " + word);
        
    }    
}
