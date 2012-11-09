/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcEdge;
import ifc2x3tc1.IfcSubedge;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Subedge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSubedgeImpl#getParentEdge <em>Parent Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSubedgeImpl extends IfcEdgeImpl implements IfcSubedge {
	/**
	 * The cached value of the '{@link #getParentEdge() <em>Parent Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentEdge()
	 * @generated
	 * @ordered
	 */
	protected IfcEdge parentEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSubedgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSubedge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEdge getParentEdge() {
		if (parentEdge != null && parentEdge.eIsProxy()) {
			InternalEObject oldParentEdge = (InternalEObject)parentEdge;
			parentEdge = (IfcEdge)eResolveProxy(oldParentEdge);
			if (parentEdge != oldParentEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SUBEDGE__PARENT_EDGE, oldParentEdge, parentEdge));
			}
		}
		return parentEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEdge basicGetParentEdge() {
		return parentEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEdge(IfcEdge newParentEdge) {
		IfcEdge oldParentEdge = parentEdge;
		parentEdge = newParentEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SUBEDGE__PARENT_EDGE, oldParentEdge, parentEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SUBEDGE__PARENT_EDGE:
				if (resolve) return getParentEdge();
				return basicGetParentEdge();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SUBEDGE__PARENT_EDGE:
				setParentEdge((IfcEdge)newValue);
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
			case Ifc2x3tc1Package.IFC_SUBEDGE__PARENT_EDGE:
				setParentEdge((IfcEdge)null);
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
			case Ifc2x3tc1Package.IFC_SUBEDGE__PARENT_EDGE:
				return parentEdge != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSubedgeImpl
