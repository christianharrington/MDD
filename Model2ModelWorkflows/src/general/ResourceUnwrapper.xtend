package general

import org.tech.iai.ifc.xml.ifc._2x3.final_.util.FinalResourceImpl

abstract class ResourceUnwrapper {
	def static unwrap(FinalResourceImpl resource) {
		resource.contents.get(0).eAllContents
	}
	
	def static unwrap(Object resource) {
		unwrap(resource as FinalResourceImpl)
	}
}