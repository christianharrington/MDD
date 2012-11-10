/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcFillAreaStyle;
import ifc2x3tc1.IfcFillStyleSelect;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fill Area Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcFillAreaStyleImpl#getFillStyles <em>Fill Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFillAreaStyleImpl extends IfcPresentationStyleImpl implements IfcFillAreaStyle {
	/**
	 * The cached value of the '{@link #getFillStyles() <em>Fill Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcFillStyleSelect> fillStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFillAreaStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcFillAreaStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcFillStyleSelect> getFillStyles() {
		if (fillStyles == null) {
			fillStyles = new EObjectResolvingEList<IfcFillStyleSelect>(IfcFillStyleSelect.class, this, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE__FILL_STYLES);
		}
		return fillStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE__FILL_STYLES:
				return getFillStyles();
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
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE__FILL_STYLES:
				getFillStyles().clear();
				getFillStyles().addAll((Collection<? extends IfcFillStyleSelect>)newValue);
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
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE__FILL_STYLES:
				getFillStyles().clear();
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
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE__FILL_STYLES:
				return fillStyles != null && !fillStyles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcFillAreaStyleImpl
