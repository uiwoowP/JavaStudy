package generic;

public class ThreeDPrinter {
	private Object material;
	
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return material;
	}
	
	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		
		Powder p1 = new Powder();
		printer.setMaterial(p1);
		
		Powder p2 = (Powder)printer.getMaterial();
	}
}
