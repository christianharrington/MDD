import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

public class ATL2Java {
	private IReferenceModel sourceModel, targetModel;
	private IModel sourceTransformationModel, targetTransformationModel;
	private ILauncher transformationLauncher;
	private EMFInjector injector;
	private IExtractor extractor;
	private ModelFactory modelFactory;

	public ATL2Java(String sourceModelUri, String targetModelUri) {
		transformationLauncher = new EMFVMLauncher();
		modelFactory = new EMFModelFactory();
		injector = new EMFInjector();
		extractor = new EMFExtractor();
		
		try {
			sourceModel = modelFactory.newReferenceModel();		
			injector.inject(sourceModel, sourceModelUri);
			targetModel = modelFactory.newReferenceModel();
			injector.inject(targetModel, targetModelUri);
		
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}
  
	public void transform(String sourceInstanceUri, String targetInstanceUri, String transformationUri) {
		
		try {
			sourceTransformationModel = modelFactory.newModel(sourceModel);
			targetTransformationModel = modelFactory.newModel(targetModel);
			injector.inject(sourceTransformationModel, sourceInstanceUri);

			transformationLauncher.initialize(new HashMap<String,Object>());
			transformationLauncher.addInModel(sourceTransformationModel, "IN", "Source");
			transformationLauncher.addOutModel(targetTransformationModel, "OUT", "Target");
			transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String,Object>(), new FileInputStream(transformationUri));

			extractor.extract(targetTransformationModel, targetInstanceUri);
			
			EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
			emfModelFactory.unload((EMFModel) sourceTransformationModel);
			emfModelFactory.unload((EMFModel) targetTransformationModel);
			emfModelFactory.unload((EMFReferenceModel) sourceModel);
			emfModelFactory.unload((EMFReferenceModel) targetModel);

		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void transform(Resource resource, String targetInstanceUri, String transformationUri) {
		
		try {
			sourceTransformationModel = modelFactory.newModel(sourceModel);
			targetTransformationModel = modelFactory.newModel(targetModel);
			injector.inject(sourceTransformationModel, resource);

			transformationLauncher.initialize(new HashMap<String,Object>());
			transformationLauncher.addInModel(sourceTransformationModel, "IN", "Source");
			transformationLauncher.addOutModel(targetTransformationModel, "OUT", "Target");
			transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String,Object>(), new FileInputStream(transformationUri));

			extractor.extract(targetTransformationModel, targetInstanceUri);
			
			EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
			emfModelFactory.unload((EMFModel) sourceTransformationModel);
			emfModelFactory.unload((EMFModel) targetTransformationModel);
			emfModelFactory.unload((EMFReferenceModel) sourceModel);
			emfModelFactory.unload((EMFReferenceModel) targetModel);

		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}