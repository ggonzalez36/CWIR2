package code;



/**
 * @author kostolom
 * @version 1.0
 * @since 12/12/2017
 */
public class Action {
	
	
	
	int idAction;
	boolean typeofaction;
		
	
		public int getIdAction() {
		return idAction;
	}
	public void setIdAction(int idAction) {
		this.idAction = idAction;
	}
	public boolean isTypeofaction() {
		return typeofaction;
	}
	public void setTypeofaction(boolean typeofaction) {
		this.typeofaction = typeofaction;
	}
	
	
	@Override
	public String toString() {
		return "Action [idAction=" + idAction + "]";
	}
	 

	 

}
