/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.EdgeElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOrientedEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Oriented Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOrientedEdgeImpl#getEdgeElement <em>Edge Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOrientedEdgeImpl#isOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOrientedEdgeImpl extends IfcOrientedEdgeTempImpl implements IfcOrientedEdge {
	/**
	 * The cached value of the '{@link #getEdgeElement() <em>Edge Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeElement()
	 * @generated
	 * @ordered
	 */
	protected EdgeElementType edgeElement;

	/**
	 * The default value of the '{@link #isOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORIENTATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrientation()
	 * @generated
	 * @ordered
	 */
	protected boolean orientation = ORIENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOrientedEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcOrientedEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeElementType getEdgeElement() {
		return edgeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeElement(EdgeElementType newEdgeElement, NotificationChain msgs) {
		EdgeElementType oldEdgeElement = edgeElement;
		edgeElement = newEdgeElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ORIENTED_EDGE__EDGE_ELEMENT, oldEdgeElement, newEdgeElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeElement(EdgeElementType newEdgeElement) {
		if (newEdgeElement != edgeElement) {
			NotificationChain msgs = null;
			if (edgeElement != null)
				msgs = ((InternalEObject)edgeElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ORIENTED_EDGE__EDGE_ELEMENT, null, msgs);
			if (newEdgeElement != null)
				msgs = ((InternalEObject)newEdgeElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ORIENTED_EDGE__EDGE_ELEMENT, null, msgs);
			msgs = basicSetEdgeElement(newEdgeElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ORIENTED_EDGE__EDGE_ELEMENT, newEdgeElement, newEdgeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(boolean newOrientation) {
		boolean oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ORIENTED_EDGE__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_ORIENTED_EDGE__EDGE_ELEMENT:
				return basicSetEdgeElement(null, msgs);
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
			case FinalPackage.IFC_ORIENTED_EDGE__EDGE_ELEMENT:
				return getEdgeElement();
			case FinalPackage.IFC_ORIENTED_EDGE__ORIENTATION:
				return isOrientation();
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
			case FinalPackage.IFC_ORIENTED_EDGE__EDGE_ELEMENT:
				setEdgeElement((EdgeElementType)newValue);
				return;
			case FinalPackage.IFC_ORIENTED_EDGE__ORIENTATION:
				setOrientation((Boolean)newValue);
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
			case FinalPackage.IFC_ORIENTED_EDGE__EDGE_ELEMENT:
				setEdgeElement((EdgeElementType)null);
				return;
			case FinalPackage.IFC_ORIENTED_EDGE__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
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
			case FinalPackage.IFC_ORIENTED_EDGE__EDGE_ELEMENT:
				return edgeElement != null;
			case FinalPackage.IFC_ORIENTED_EDGE__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
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
		result.append(" (orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //IfcOrientedEdgeImpl
