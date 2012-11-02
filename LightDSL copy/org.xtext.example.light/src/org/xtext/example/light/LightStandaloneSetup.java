
package org.xtext.example.light;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LightStandaloneSetup extends LightStandaloneSetupGenerated{

	public static void doSetup() {
		new LightStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

