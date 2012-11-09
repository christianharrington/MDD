package IFC2LightDSL;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;

@SuppressWarnings("all")
public abstract class WorkflowComponentWithSlot implements IWorkflowComponent {
  private String slot;
  
  public String getSlot() {
    return this.slot;
  }
  
  public String setSlot(final String slot) {
    String _slot = this.slot = slot;
    return _slot;
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
}
