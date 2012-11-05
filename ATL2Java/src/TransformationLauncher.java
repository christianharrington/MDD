public class TransformationLauncher {
	public static void main(String[] args) {
		ATL2Java a2j = new ATL2Java("../m2m/models/Room.ecore", "../m2m/models/LightAST.ecore");
		a2j.transform("../m2m/models/RoomInstance.xmi", "../m2m/models/TransformedInstance.xmi", "../m2m/transformations/lamp2lamp.asm");
	}
}