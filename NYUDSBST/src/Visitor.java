
public class Visitor implements Comparable{
  public String vname;
  public Visitor(String inname) {
	  vname = inname;
  }
  public int compareTo(Object inv) {
	 
	  return (vname.compareTo(((Visitor) inv).vname));
  }
 
}
