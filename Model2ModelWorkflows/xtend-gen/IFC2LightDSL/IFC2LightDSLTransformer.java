package IFC2LightDSL;

import IFC2LightDSL.WorkflowComponentWithSlot;
import java.util.Iterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class IFC2LightDSLTransformer extends WorkflowComponentWithSlot {
  public void invoke(final IWorkflowContext ctx) {
    String _slot = this.getSlot();
    Object _get = ctx.get(_slot);
    Resource modelResource = ((Resource) _get);
    Iterator<EObject> modelObjects = EcoreUtil.<EObject>getAllContents(modelResource, true);
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(modelObjects);
    for (final EObject e : _iterable) {
      EClass _eClass = e.eClass();
      InputOutput.<EClass>println(_eClass);
    }
  }
}
