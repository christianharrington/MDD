/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcEdge;
import ifc2x3tc1.IfcOrientedEdge;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Oriented Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcOrientedEdgeImpl#getEdgeElement <em>Edge Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOrientedEdgeImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOrientedEdgeImpl extends IfcEdgeImpl implements IfcOrientedEdge {
	/**
	 * The cached value of the '{@link #getEdgeElement() <em>Edge Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeElement()
	 * @generated
	 * @ordered
	 */
	protected IfcEdge edgeElement;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate ORIENTATION_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Tristate orientation = ORIENTATION_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcOrientedEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEdge getEdgeElement() {
		if (edgeElement != null && edgeElement.eIsProxy()) {
			InternalEObject oldEdgeElement = (InternalEObject)edgeElement;
			edgeElement = (IfcEdge)eResolveProxy(oldEdgeElement);
			if (edgeElement != oldEdgeElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ORIENTED_EDGE__EDGE_ELEMENT, oldEdgeElement, edgeElement));
			}
		}
		return edgeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEdge basicGetEdgeElement() {
		return edgeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeElement(IfcEdge newEdgeElement) {
		IfcEdge oldEdgeElement = edgeElement;
		edgeElement = newEdgeElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ORIENTED_EDGE__EDGE_ELEMENT, oldEdgeElement, edgeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Tristate newOrientation) {
		Tristate oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ORIENTED_EDGE__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ORIENTED_EDGE__EDGE_ELEMENT:
				if (resolve) return getEdgeElement();
				return basicGetEdgeElement();
			case Ifc2x3tc1Package.IFC_ORIENTED_EDGE__ORIENTATION:
				return getOrientation();
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
			case Ifc2x3tc1Package.IFC_ORIENTED_EDGE__EDGE_ELEMENT:
				setEdgeElement((IfcEdge)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ORIENTED_EDGE__ORIENTATION:
				setOrientation((Tristate)newValue);
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
			case Ifc2x3tc1Package.IFC_ORIENTED_EDGE__EDGE_ELEMENT:
				setEdgeElement((IfcEdge)null);
				return;
			case Ifc2x3tc1Package.IFC_ORIENTED_EDGE__ORIENTATION:
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
			case Ifc2x3tc1Package.IFC_ORIENTED_EDGE__EDGE_ELEMENT:
				return edgeElement != null;
			case Ifc2x3tc1Package.IFC_ORIENTED_EDGE__ORIENTATION:
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
		result.append(" (Orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //IfcOrientedEdgeImpl
