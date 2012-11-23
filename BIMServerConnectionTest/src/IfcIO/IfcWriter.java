package IfcIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.step.serializer.IfcStepSerializer;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Factory;
import org.bimserver.models.ifc2x3tc1.IfcLightSource;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;


public class IfcWriter {



	// Write a model example. File name is hardcoded and an added IfcLightSource object
	// is added to the model to show how it can be done
	public static void SaveModel(IfcModel model){
		//The serializer wants a ProjectInfo object
		ProjectInfo projectInfo = new ProjectInfo();
		projectInfo.setName("Group 1337");
		// projectInfo.set...

		File out = new File("our_light_output.EXP");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(out);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		// Create additional eInstance
		IfcLightSource light = Ifc2x3tc1Factory.eINSTANCE.createIfcLightSource();
		light.setAmbientIntensity(12);
		light.setName("lamp");

		// Generate a unique key for the new IfcLightSource, not sure
		// if there is an easier way, but here we simply find a key
		// that does not already exist.
		long key = 0;
		for (int i = 0; i < model.getObjects().size() + 1; i++) {
			if (!model.getObjects().containsKey(i)) {
				key = i;
				break;
			}
		}

		try {
			model.add(key, light);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// The serializer only works with a PluginManager. It gets the
		// schema from there.
		// The LocalDevPluginLoader has been modified to lookup the plugins in the IfcPlugins project
		PluginManager pm = null;
		try {
			File home = new File("leetFolder");
			if (!home.exists()) {
				home.mkdir();
			}
			pm = new PluginManager(home, System.getProperty("java.class.path"));
			pm.loadAllPluginsFromDirectoryOfJars(new File("lib/"));
			pm.initAllLoadedPlugins();
			
//			
//			pm = LocalDevPluginLoader.createPluginManager();
//			LocalDevPluginLoader.loadPlugins(pm);
		} catch (Exception e) {
			e.printStackTrace();
		}

		IfcStepSerializer iss = new IfcStepSerializer();		
		try {
			// null would be an IfcEngine used for geometry (no idea how it is used)
			iss.init(model, projectInfo, pm, null);
			iss.writeToOutputStream(fos);
		} catch (SerializerException e) {
			e.printStackTrace();
		}
	}
}
