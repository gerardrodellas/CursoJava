package Practica7;

public class Profesor extends Persona {
	private String iosfa;
	
	public Profesor() {
		super();
		iosfa ="1000";
	}

	public Profesor(String pApellido, String pNombre, String pIosfa) {
		super(pApellido, pNombre);
		iosfa = pIosfa;
	}

	public String getIosfa() {
		return iosfa;
	}

	public void setIosfa(String iosfa) {
		this.iosfa = iosfa;
	}
	

	public boolean equals(Object obj){		
		return super.equals(obj) 							&&
				obj instanceof Profesor     				&&
				iosfa == ((Profesor)obj).getIosfa();
		
	}
	public String hashCoded(){
		return super.hashCode() + (String)iosfa;
	}
	
    public String toString(){
    	StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",iosfa=");
    	sb.append(iosfa);
    	return sb.toString();
    }
}
