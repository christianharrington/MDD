package IFC2LightDSL;

import IFC2LightDSL.WorkflowComponentWithSlot;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

@SuppressWarnings("all")
public class Reader extends WorkflowComponentWithSlot {
  public void invoke(final IWorkflowContext ctx) {
    String _slot = this.getSlot();
    ctx.put(_slot, null);
  }
}
