package Practica7;

public  class Alumno extends Persona {
	//atributos
	private int legajo;
	
	public Alumno() {
		super();
		legajo =10;		
	}
	
//	public Alumno(int pLegajo) {
//		super(pLegajo);
//		legajo = pLegajo;
//	}	

	public Alumno(String pApellido, String pNombre, int pLegajo) {
		super(pApellido, pNombre);
		legajo = pLegajo;
	}

	public float getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public boolean equals(Object obj){		
		return super.equals(obj) 							&&
				obj instanceof Alumno 				&&
				legajo == ((Alumno)obj).getLegajo();
		
	}
	public int hashCoded(){
		return super.hashCode() + (int)legajo;
	}
	
    public String toString(){
    	StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",legajo=");
    	sb.append(legajo);
    	return sb.toString();
    }

}
