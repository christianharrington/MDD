/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurve;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricSetSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPoint;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Set Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricSetSelectImpl#getIfcPointGroup <em>Ifc Point Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricSetSelectImpl#getIfcPoint <em>Ifc Point</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricSetSelectImpl#getIfcCurveGroup <em>Ifc Curve Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricSetSelectImpl#getIfcCurve <em>Ifc Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricSetSelectImpl#getIfcSurfaceGroup <em>Ifc Surface Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeometricSetSelectImpl#getIfcSurface <em>Ifc Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGeometricSetSelectImpl extends EObjectImpl implements IfcGeometricSetSelect {
	/**
	 * The cached value of the '{@link #getIfcPointGroup() <em>Ifc Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPointGroup;

	/**
	 * The cached value of the '{@link #getIfcCurveGroup() <em>Ifc Curve Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCurveGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcCurveGroup;

	/**
	 * The cached value of the '{@link #getIfcSurfaceGroup() <em>Ifc Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeometricSetSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcGeometricSetSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPointGroup() {
		if (ifcPointGroup == null) {
			ifcPointGroup = new BasicFeatureMap(this, FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_POINT_GROUP);
		}
		return ifcPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPoint getIfcPoint() {
		return (IfcPoint)getIfcPointGroup().get(FinalPackage.eINSTANCE.getIfcGeometricSetSelect_IfcPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPoint(IfcPoint newIfcPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPointGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcGeometricSetSelect_IfcPoint(), newIfcPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcCurveGroup() {
		if (ifcCurveGroup == null) {
			ifcCurveGroup = new BasicFeatureMap(this, FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_CURVE_GROUP);
		}
		return ifcCurveGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getIfcCurve() {
		return (IfcCurve)getIfcCurveGroup().get(FinalPackage.eINSTANCE.getIfcGeometricSetSelect_IfcCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCurve(IfcCurve newIfcCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcCurveGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcGeometricSetSelect_IfcCurve(), newIfcCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcSurfaceGroup() {
		if (ifcSurfaceGroup == null) {
			ifcSurfaceGroup = new BasicFeatureMap(this, FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_SURFACE_GROUP);
		}
		return ifcSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getIfcSurface() {
		return (IfcSurface)getIfcSurfaceGroup().get(FinalPackage.eINSTANCE.getIfcGeometricSetSelect_IfcSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSurface(IfcSurface newIfcSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcSurfaceGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcGeometricSetSelect_IfcSurface(), newIfcSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_POINT_GROUP:
				return ((InternalEList<?>)getIfcPointGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_POINT:
				return basicSetIfcPoint(null, msgs);
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_CURVE_GROUP:
				return ((InternalEList<?>)getIfcCurveGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_CURVE:
				return basicSetIfcCurve(null, msgs);
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_SURFACE_GROUP:
				return ((InternalEList<?>)getIfcSurfaceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_SURFACE:
				return basicSetIfcSurface(null, msgs);
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
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_POINT_GROUP:
				if (coreType) return getIfcPointGroup();
				return ((FeatureMap.Internal)getIfcPointGroup()).getWrapper();
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_POINT:
				return getIfcPoint();
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_CURVE_GROUP:
				if (coreType) return getIfcCurveGroup();
				return ((FeatureMap.Internal)getIfcCurveGroup()).getWrapper();
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_CURVE:
				return getIfcCurve();
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_SURFACE_GROUP:
				if (coreType) return getIfcSurfaceGroup();
				return ((FeatureMap.Internal)getIfcSurfaceGroup()).getWrapper();
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_SURFACE:
				return getIfcSurface();
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
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_POINT_GROUP:
				((FeatureMap.Internal)getIfcPointGroup()).set(newValue);
				return;
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_CURVE_GROUP:
				((FeatureMap.Internal)getIfcCurveGroup()).set(newValue);
				return;
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_SURFACE_GROUP:
				((FeatureMap.Internal)getIfcSurfaceGroup()).set(newValue);
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
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_POINT_GROUP:
				getIfcPointGroup().clear();
				return;
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_CURVE_GROUP:
				getIfcCurveGroup().clear();
				return;
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_SURFACE_GROUP:
				getIfcSurfaceGroup().clear();
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
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_POINT_GROUP:
				return ifcPointGroup != null && !ifcPointGroup.isEmpty();
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_POINT:
				return getIfcPoint() != null;
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_CURVE_GROUP:
				return ifcCurveGroup != null && !ifcCurveGroup.isEmpty();
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_CURVE:
				return getIfcCurve() != null;
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_SURFACE_GROUP:
				return ifcSurfaceGroup != null && !ifcSurfaceGroup.isEmpty();
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT__IFC_SURFACE:
				return getIfcSurface() != null;
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
		result.append(" (ifcPointGroup: ");
		result.append(ifcPointGroup);
		result.append(", ifcCurveGroup: ");
		result.append(ifcCurveGroup);
		result.append(", ifcSurfaceGroup: ");
		result.append(ifcSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //IfcGeometricSetSelectImpl
