/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCurve;
import ifc2x3tc1.IfcEdgeCurve;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Edge Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcEdgeCurveImpl#getEdgeGeometry <em>Edge Geometry</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcEdgeCurveImpl#getSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEdgeCurveImpl extends IfcEdgeImpl implements IfcEdgeCurve {
	/**
	 * The cached value of the '{@link #getEdgeGeometry() <em>Edge Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeGeometry()
	 * @generated
	 * @ordered
	 */
	protected IfcCurve edgeGeometry;

	/**
	 * The default value of the '{@link #getSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameSense()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate SAME_SENSE_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameSense()
	 * @generated
	 * @ordered
	 */
	protected Tristate sameSense = SAME_SENSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEdgeCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcEdgeCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getEdgeGeometry() {
		if (edgeGeometry != null && edgeGeometry.eIsProxy()) {
			InternalEObject oldEdgeGeometry = (InternalEObject)edgeGeometry;
			edgeGeometry = (IfcCurve)eResolveProxy(oldEdgeGeometry);
			if (edgeGeometry != oldEdgeGeometry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_EDGE_CURVE__EDGE_GEOMETRY, oldEdgeGeometry, edgeGeometry));
			}
		}
		return edgeGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve basicGetEdgeGeometry() {
		return edgeGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeGeometry(IfcCurve newEdgeGeometry) {
		IfcCurve oldEdgeGeometry = edgeGeometry;
		edgeGeometry = newEdgeGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_EDGE_CURVE__EDGE_GEOMETRY, oldEdgeGeometry, edgeGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getSameSense() {
		return sameSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameSense(Tristate newSameSense) {
		Tristate oldSameSense = sameSense;
		sameSense = newSameSense == null ? SAME_SENSE_EDEFAULT : newSameSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_EDGE_CURVE__SAME_SENSE, oldSameSense, sameSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_EDGE_CURVE__EDGE_GEOMETRY:
				if (resolve) return getEdgeGeometry();
				return basicGetEdgeGeometry();
			case Ifc2x3tc1Package.IFC_EDGE_CURVE__SAME_SENSE:
				return getSameSense();
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
			case Ifc2x3tc1Package.IFC_EDGE_CURVE__EDGE_GEOMETRY:
				setEdgeGeometry((IfcCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_EDGE_CURVE__SAME_SENSE:
				setSameSense((Tristate)newValue);
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
			case Ifc2x3tc1Package.IFC_EDGE_CURVE__EDGE_GEOMETRY:
				setEdgeGeometry((IfcCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_EDGE_CURVE__SAME_SENSE:
				setSameSense(SAME_SENSE_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_EDGE_CURVE__EDGE_GEOMETRY:
				return edgeGeometry != null;
			case Ifc2x3tc1Package.IFC_EDGE_CURVE__SAME_SENSE:
				return sameSense != SAME_SENSE_EDEFAULT;
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
		result.append(" (SameSense: ");
		result.append(sameSense);
		result.append(')');
		return result.toString();
	}

} //IfcEdgeCurveImpl
