/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoundedCurve;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveOrEdgeCurve;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdgeCurve;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Or Edge Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveOrEdgeCurveImpl#getIfcBoundedCurveGroup <em>Ifc Bounded Curve Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveOrEdgeCurveImpl#getIfcBoundedCurve <em>Ifc Bounded Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveOrEdgeCurveImpl#getIfcEdgeCurve <em>Ifc Edge Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurveOrEdgeCurveImpl extends EObjectImpl implements IfcCurveOrEdgeCurve {
	/**
	 * The cached value of the '{@link #getIfcBoundedCurveGroup() <em>Ifc Bounded Curve Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcBoundedCurveGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcBoundedCurveGroup;

	/**
	 * The cached value of the '{@link #getIfcEdgeCurve() <em>Ifc Edge Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcEdgeCurve()
	 * @generated
	 * @ordered
	 */
	protected IfcEdgeCurve ifcEdgeCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveOrEdgeCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcCurveOrEdgeCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcBoundedCurveGroup() {
		if (ifcBoundedCurveGroup == null) {
			ifcBoundedCurveGroup = new BasicFeatureMap(this, FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_BOUNDED_CURVE_GROUP);
		}
		return ifcBoundedCurveGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundedCurve getIfcBoundedCurve() {
		return (IfcBoundedCurve)getIfcBoundedCurveGroup().get(FinalPackage.eINSTANCE.getIfcCurveOrEdgeCurve_IfcBoundedCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcBoundedCurve(IfcBoundedCurve newIfcBoundedCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcBoundedCurveGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcCurveOrEdgeCurve_IfcBoundedCurve(), newIfcBoundedCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEdgeCurve getIfcEdgeCurve() {
		return ifcEdgeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcEdgeCurve(IfcEdgeCurve newIfcEdgeCurve, NotificationChain msgs) {
		IfcEdgeCurve oldIfcEdgeCurve = ifcEdgeCurve;
		ifcEdgeCurve = newIfcEdgeCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_EDGE_CURVE, oldIfcEdgeCurve, newIfcEdgeCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcEdgeCurve(IfcEdgeCurve newIfcEdgeCurve) {
		if (newIfcEdgeCurve != ifcEdgeCurve) {
			NotificationChain msgs = null;
			if (ifcEdgeCurve != null)
				msgs = ((InternalEObject)ifcEdgeCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_EDGE_CURVE, null, msgs);
			if (newIfcEdgeCurve != null)
				msgs = ((InternalEObject)newIfcEdgeCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_EDGE_CURVE, null, msgs);
			msgs = basicSetIfcEdgeCurve(newIfcEdgeCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_EDGE_CURVE, newIfcEdgeCurve, newIfcEdgeCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_BOUNDED_CURVE_GROUP:
				return ((InternalEList<?>)getIfcBoundedCurveGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_BOUNDED_CURVE:
				return basicSetIfcBoundedCurve(null, msgs);
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_EDGE_CURVE:
				return basicSetIfcEdgeCurve(null, msgs);
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
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_BOUNDED_CURVE_GROUP:
				if (coreType) return getIfcBoundedCurveGroup();
				return ((FeatureMap.Internal)getIfcBoundedCurveGroup()).getWrapper();
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_BOUNDED_CURVE:
				return getIfcBoundedCurve();
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_EDGE_CURVE:
				return getIfcEdgeCurve();
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
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_BOUNDED_CURVE_GROUP:
				((FeatureMap.Internal)getIfcBoundedCurveGroup()).set(newValue);
				return;
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_EDGE_CURVE:
				setIfcEdgeCurve((IfcEdgeCurve)newValue);
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
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_BOUNDED_CURVE_GROUP:
				getIfcBoundedCurveGroup().clear();
				return;
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_EDGE_CURVE:
				setIfcEdgeCurve((IfcEdgeCurve)null);
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
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_BOUNDED_CURVE_GROUP:
				return ifcBoundedCurveGroup != null && !ifcBoundedCurveGroup.isEmpty();
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_BOUNDED_CURVE:
				return getIfcBoundedCurve() != null;
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE__IFC_EDGE_CURVE:
				return ifcEdgeCurve != null;
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
		result.append(" (ifcBoundedCurveGroup: ");
		result.append(ifcBoundedCurveGroup);
		result.append(')');
		return result.toString();
	}

} //IfcCurveOrEdgeCurveImpl
