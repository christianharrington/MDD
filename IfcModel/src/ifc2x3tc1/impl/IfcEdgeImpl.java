/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcEdge;
import ifc2x3tc1.IfcVertex;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcEdgeImpl#getEdgeStart <em>Edge Start</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcEdgeImpl#getEdgeEnd <em>Edge End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEdgeImpl extends IfcTopologicalRepresentationItemImpl implements IfcEdge {
	/**
	 * The cached value of the '{@link #getEdgeStart() <em>Edge Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeStart()
	 * @generated
	 * @ordered
	 */
	protected IfcVertex edgeStart;

	/**
	 * The cached value of the '{@link #getEdgeEnd() <em>Edge End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeEnd()
	 * @generated
	 * @ordered
	 */
	protected IfcVertex edgeEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex getEdgeStart() {
		if (edgeStart != null && edgeStart.eIsProxy()) {
			InternalEObject oldEdgeStart = (InternalEObject)edgeStart;
			edgeStart = (IfcVertex)eResolveProxy(oldEdgeStart);
			if (edgeStart != oldEdgeStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_EDGE__EDGE_START, oldEdgeStart, edgeStart));
			}
		}
		return edgeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex basicGetEdgeStart() {
		return edgeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeStart(IfcVertex newEdgeStart) {
		IfcVertex oldEdgeStart = edgeStart;
		edgeStart = newEdgeStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_EDGE__EDGE_START, oldEdgeStart, edgeStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex getEdgeEnd() {
		if (edgeEnd != null && edgeEnd.eIsProxy()) {
			InternalEObject oldEdgeEnd = (InternalEObject)edgeEnd;
			edgeEnd = (IfcVertex)eResolveProxy(oldEdgeEnd);
			if (edgeEnd != oldEdgeEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_EDGE__EDGE_END, oldEdgeEnd, edgeEnd));
			}
		}
		return edgeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex basicGetEdgeEnd() {
		return edgeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeEnd(IfcVertex newEdgeEnd) {
		IfcVertex oldEdgeEnd = edgeEnd;
		edgeEnd = newEdgeEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_EDGE__EDGE_END, oldEdgeEnd, edgeEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_EDGE__EDGE_START:
				if (resolve) return getEdgeStart();
				return basicGetEdgeStart();
			case Ifc2x3tc1Package.IFC_EDGE__EDGE_END:
				if (resolve) return getEdgeEnd();
				return basicGetEdgeEnd();
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
			case Ifc2x3tc1Package.IFC_EDGE__EDGE_START:
				setEdgeStart((IfcVertex)newValue);
				return;
			case Ifc2x3tc1Package.IFC_EDGE__EDGE_END:
				setEdgeEnd((IfcVertex)newValue);
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
			case Ifc2x3tc1Package.IFC_EDGE__EDGE_START:
				setEdgeStart((IfcVertex)null);
				return;
			case Ifc2x3tc1Package.IFC_EDGE__EDGE_END:
				setEdgeEnd((IfcVertex)null);
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
			case Ifc2x3tc1Package.IFC_EDGE__EDGE_START:
				return edgeStart != null;
			case Ifc2x3tc1Package.IFC_EDGE__EDGE_END:
				return edgeEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcEdgeImpl
