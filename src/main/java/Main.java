

public class Main {
 
	public static void main(final String[] args) {
		PalindromeChecker sim = new PalindromeChecker();
        	sim.tester();
		
	}
	public void setup()
  {
    String lines[] = loadStrings("palindromes.txt");
    System.out.println("there are " + lines.length + " lines");
    for (int i=0; i < lines.length; i++) 
    {
      if(palindrome(lines[i])==true)
      {
        System.out.println(lines[i] + " IS a palindrome.");
      }
      else
      {
        System.out.println(lines[i] + " is NOT a palindrome.");
      }
    }
  }
  public boolean palindrome(String word)
  {
    String iL= isLetter(word);
    String NoCap = noCap(iL);
    String backwards = reverse(NoCap);
    System.out.print(backwards);
    if (backwards.equals(NoCap)) {
      return true;}
      return false;
  }
  public String noCap(String s){
    return s.toLowerCase();
  }
  public String isLetter(String nLetter){
    String s= "";
    for (int i=0;i<nLetter.length();i++){
      if(Character.isLetter(nLetter.charAt(i))){
        s=s+nLetter.charAt(i);
      }
    }
    return s;
  }
  public String reverse(String str)
  {
      String sNew = new String();
      for(int i=str.length()-1;i>=0;i--) sNew=sNew+str.substring(i,i+1);
      return sNew;
  }

}

