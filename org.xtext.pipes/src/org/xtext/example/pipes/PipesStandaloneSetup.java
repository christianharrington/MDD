
package org.xtext.example.pipes;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PipesStandaloneSetup extends PipesStandaloneSetupGenerated{

	public static void doSetup() {
		new PipesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

