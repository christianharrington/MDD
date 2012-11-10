/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcArbitraryProfileDefWithVoids;
import ifc2x3tc1.IfcCurve;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Arbitrary Profile Def With Voids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcArbitraryProfileDefWithVoidsImpl#getInnerCurves <em>Inner Curves</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcArbitraryProfileDefWithVoidsImpl extends IfcArbitraryClosedProfileDefImpl implements IfcArbitraryProfileDefWithVoids {
	/**
	 * The cached value of the '{@link #getInnerCurves() <em>Inner Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcCurve> innerCurves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcArbitraryProfileDefWithVoidsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcArbitraryProfileDefWithVoids();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCurve> getInnerCurves() {
		if (innerCurves == null) {
			innerCurves = new EObjectResolvingEList<IfcCurve>(IfcCurve.class, this, Ifc2x3tc1Package.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES);
		}
		return innerCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES:
				return getInnerCurves();
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
			case Ifc2x3tc1Package.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES:
				getInnerCurves().clear();
				getInnerCurves().addAll((Collection<? extends IfcCurve>)newValue);
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
			case Ifc2x3tc1Package.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES:
				getInnerCurves().clear();
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
			case Ifc2x3tc1Package.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES:
				return innerCurves != null && !innerCurves.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcArbitraryProfileDefWithVoidsImpl
