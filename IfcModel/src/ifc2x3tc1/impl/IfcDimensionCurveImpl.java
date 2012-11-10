/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDimensionCurve;
import ifc2x3tc1.IfcTerminatorSymbol;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Dimension Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDimensionCurveImpl#getAnnotatedBySymbols <em>Annotated By Symbols</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDimensionCurveImpl extends IfcAnnotationCurveOccurrenceImpl implements IfcDimensionCurve {
	/**
	 * The cached value of the '{@link #getAnnotatedBySymbols() <em>Annotated By Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedBySymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcTerminatorSymbol> annotatedBySymbols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDimensionCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDimensionCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTerminatorSymbol> getAnnotatedBySymbols() {
		if (annotatedBySymbols == null) {
			annotatedBySymbols = new EObjectResolvingEList.Unsettable<IfcTerminatorSymbol>(IfcTerminatorSymbol.class, this, Ifc2x3tc1Package.IFC_DIMENSION_CURVE__ANNOTATED_BY_SYMBOLS);
		}
		return annotatedBySymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnnotatedBySymbols() {
		if (annotatedBySymbols != null) ((InternalEList.Unsettable<?>)annotatedBySymbols).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnnotatedBySymbols() {
		return annotatedBySymbols != null && ((InternalEList.Unsettable<?>)annotatedBySymbols).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DIMENSION_CURVE__ANNOTATED_BY_SYMBOLS:
				return getAnnotatedBySymbols();
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
			case Ifc2x3tc1Package.IFC_DIMENSION_CURVE__ANNOTATED_BY_SYMBOLS:
				getAnnotatedBySymbols().clear();
				getAnnotatedBySymbols().addAll((Collection<? extends IfcTerminatorSymbol>)newValue);
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
			case Ifc2x3tc1Package.IFC_DIMENSION_CURVE__ANNOTATED_BY_SYMBOLS:
				unsetAnnotatedBySymbols();
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
			case Ifc2x3tc1Package.IFC_DIMENSION_CURVE__ANNOTATED_BY_SYMBOLS:
				return isSetAnnotatedBySymbols();
		}
		return super.eIsSet(featureID);
	}

} //IfcDimensionCurveImpl
