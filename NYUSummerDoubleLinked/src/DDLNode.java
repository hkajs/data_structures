
public class DDLNode {
	public class DLLNode<T> 
	{
	  private T info;
	  private DLLNode<T> forward, back;
	  
	  public DLLNode(T info)
	  {
	    this.info = info; forward = null; back = null;
	  }
	 
	  public void setInfo(T info){this.info = info;}
	  public T getInfo(){return info;}
	  
	  public void setForward(DLLNode<T> forward){this.forward = forward;}
	  public void setBack(DLLNode<T> back){this.back = back;}
	  
	  public DLLNode getForward(){return forward;}
	  public DLLNode getBack(){return back;}
	}
	 

}
