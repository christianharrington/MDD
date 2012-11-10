/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDistributionControlElement;
import ifc2x3tc1.IfcRelFlowControlElements;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Distribution Control Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDistributionControlElementImpl#getControlElementId <em>Control Element Id</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDistributionControlElementImpl#getAssignedToFlowElement <em>Assigned To Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDistributionControlElementImpl extends IfcDistributionElementImpl implements IfcDistributionControlElement {
	/**
	 * The default value of the '{@link #getControlElementId() <em>Control Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlElementId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlElementId() <em>Control Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlElementId()
	 * @generated
	 * @ordered
	 */
	protected String controlElementId = CONTROL_ELEMENT_ID_EDEFAULT;

	/**
	 * This is true if the Control Element Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlElementIdESet;

	/**
	 * The cached value of the '{@link #getAssignedToFlowElement() <em>Assigned To Flow Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedToFlowElement()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelFlowControlElements> assignedToFlowElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDistributionControlElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDistributionControlElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlElementId() {
		return controlElementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlElementId(String newControlElementId) {
		String oldControlElementId = controlElementId;
		controlElementId = newControlElementId;
		boolean oldControlElementIdESet = controlElementIdESet;
		controlElementIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__CONTROL_ELEMENT_ID, oldControlElementId, controlElementId, !oldControlElementIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetControlElementId() {
		String oldControlElementId = controlElementId;
		boolean oldControlElementIdESet = controlElementIdESet;
		controlElementId = CONTROL_ELEMENT_ID_EDEFAULT;
		controlElementIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__CONTROL_ELEMENT_ID, oldControlElementId, CONTROL_ELEMENT_ID_EDEFAULT, oldControlElementIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetControlElementId() {
		return controlElementIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelFlowControlElements> getAssignedToFlowElement() {
		if (assignedToFlowElement == null) {
			assignedToFlowElement = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcRelFlowControlElements>(IfcRelFlowControlElements.class, this, Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__ASSIGNED_TO_FLOW_ELEMENT, Ifc2x3tc1Package.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS);
		}
		return assignedToFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAssignedToFlowElement() {
		if (assignedToFlowElement != null) ((InternalEList.Unsettable<?>)assignedToFlowElement).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssignedToFlowElement() {
		return assignedToFlowElement != null && ((InternalEList.Unsettable<?>)assignedToFlowElement).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__ASSIGNED_TO_FLOW_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedToFlowElement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__ASSIGNED_TO_FLOW_ELEMENT:
				return ((InternalEList<?>)getAssignedToFlowElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__CONTROL_ELEMENT_ID:
				return getControlElementId();
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__ASSIGNED_TO_FLOW_ELEMENT:
				return getAssignedToFlowElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__CONTROL_ELEMENT_ID:
				setControlElementId((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__ASSIGNED_TO_FLOW_ELEMENT:
				getAssignedToFlowElement().clear();
				getAssignedToFlowElement().addAll((Collection<? extends IfcRelFlowControlElements>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__CONTROL_ELEMENT_ID:
				unsetControlElementId();
				return;
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__ASSIGNED_TO_FLOW_ELEMENT:
				unsetAssignedToFlowElement();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__CONTROL_ELEMENT_ID:
				return isSetControlElementId();
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_CONTROL_ELEMENT__ASSIGNED_TO_FLOW_ELEMENT:
				return isSetAssignedToFlowElement();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ControlElementId: ");
		if (controlElementIdESet) result.append(controlElementId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcDistributionControlElementImpl
