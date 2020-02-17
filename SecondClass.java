
/**
 * Write a description of class SecondClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecondClass
{
    char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    char space = ' ';
    int counter = 0;
String questionj; 
    /**
     * Constructor for objects of class SecondClass
     */
    public SecondClass(String question)
    {
       questionj = question; 
    }
public int vowelCounter(){
  
  char boston;
  int counterSpace = 0; 
  for (int i = 0;i < questionj.length();i++){
      boston = questionj.charAt(i);
      for (int j = 0; j < vowel.length;j++){
          if (vowel[j] == boston){
              counter++; 
            }
        }
    }
    return counter;
}
public int spaceCounter () {
    char boston;
    for (int i = 0;i < questionj.length();i++){
      boston = questionj.charAt(i);
      
          if (space == boston){
              counter++; 
            }
        
    }
    return counter;
}
public boolean palindrome () {
    int i = 0, j = questionj.length() - 1;
    while (i < j) {
        if (questionj.charAt(i) != questionj.charAt(j)) 
                return false;
                i++; 
            j--;
    }
    return true;
}
public char firstVowel() {
}
}

