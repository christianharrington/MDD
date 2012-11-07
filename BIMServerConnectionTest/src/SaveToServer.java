
public class SaveToServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ATL2Java atj = new ATL2Java("../m2m/models/LightAST.ecore", "../bimserver-read-only/BimServer/models/models.ecore");
	    atj.transform("instance.xmi", "savable.xmi", "../m2m/transformations/light2ifc.asm");

	}

}
