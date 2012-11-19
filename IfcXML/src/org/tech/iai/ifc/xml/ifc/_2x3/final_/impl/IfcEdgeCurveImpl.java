/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.EdgeGeometryType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdgeCurve;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Edge Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcEdgeCurveImpl#getEdgeGeometry <em>Edge Geometry</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcEdgeCurveImpl#isSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEdgeCurveImpl extends IfcEdgeImpl implements IfcEdgeCurve {
	/**
	 * The cached value of the '{@link #getEdgeGeometry() <em>Edge Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeGeometry()
	 * @generated
	 * @ordered
	 */
	protected EdgeGeometryType edgeGeometry;

	/**
	 * The default value of the '{@link #isSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameSense()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAME_SENSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameSense()
	 * @generated
	 * @ordered
	 */
	protected boolean sameSense = SAME_SENSE_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcEdgeCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeGeometryType getEdgeGeometry() {
		return edgeGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeGeometry(EdgeGeometryType newEdgeGeometry, NotificationChain msgs) {
		EdgeGeometryType oldEdgeGeometry = edgeGeometry;
		edgeGeometry = newEdgeGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EDGE_CURVE__EDGE_GEOMETRY, oldEdgeGeometry, newEdgeGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeGeometry(EdgeGeometryType newEdgeGeometry) {
		if (newEdgeGeometry != edgeGeometry) {
			NotificationChain msgs = null;
			if (edgeGeometry != null)
				msgs = ((InternalEObject)edgeGeometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_EDGE_CURVE__EDGE_GEOMETRY, null, msgs);
			if (newEdgeGeometry != null)
				msgs = ((InternalEObject)newEdgeGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_EDGE_CURVE__EDGE_GEOMETRY, null, msgs);
			msgs = basicSetEdgeGeometry(newEdgeGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EDGE_CURVE__EDGE_GEOMETRY, newEdgeGeometry, newEdgeGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSameSense() {
		return sameSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameSense(boolean newSameSense) {
		boolean oldSameSense = sameSense;
		sameSense = newSameSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_EDGE_CURVE__SAME_SENSE, oldSameSense, sameSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_EDGE_CURVE__EDGE_GEOMETRY:
				return basicSetEdgeGeometry(null, msgs);
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
			case FinalPackage.IFC_EDGE_CURVE__EDGE_GEOMETRY:
				return getEdgeGeometry();
			case FinalPackage.IFC_EDGE_CURVE__SAME_SENSE:
				return isSameSense();
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
			case FinalPackage.IFC_EDGE_CURVE__EDGE_GEOMETRY:
				setEdgeGeometry((EdgeGeometryType)newValue);
				return;
			case FinalPackage.IFC_EDGE_CURVE__SAME_SENSE:
				setSameSense((Boolean)newValue);
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
			case FinalPackage.IFC_EDGE_CURVE__EDGE_GEOMETRY:
				setEdgeGeometry((EdgeGeometryType)null);
				return;
			case FinalPackage.IFC_EDGE_CURVE__SAME_SENSE:
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
			case FinalPackage.IFC_EDGE_CURVE__EDGE_GEOMETRY:
				return edgeGeometry != null;
			case FinalPackage.IFC_EDGE_CURVE__SAME_SENSE:
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
		result.append(" (sameSense: ");
		result.append(sameSense);
		result.append(')');
		return result.toString();
	}

} //IfcEdgeCurveImpl
