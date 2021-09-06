package Generic;

public class GenericPrinter<T extends Material> {
	private T material; 
	
	public void setMaterial(T metarial) {
		this.material  = metarial;
	}
	
	public T getMaterial() {
		return material; 
	}
	
	public String toString() {
		return material.toString();
	}
	public void printing() {
		material.doPrinting();
	}

}
