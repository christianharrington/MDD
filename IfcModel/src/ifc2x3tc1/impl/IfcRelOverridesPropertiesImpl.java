/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProperty;
import ifc2x3tc1.IfcRelOverridesProperties;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Overrides Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelOverridesPropertiesImpl#getOverridingProperties <em>Overriding Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelOverridesPropertiesImpl extends IfcRelDefinesByPropertiesImpl implements IfcRelOverridesProperties {
	/**
	 * The cached value of the '{@link #getOverridingProperties() <em>Overriding Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverridingProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcProperty> overridingProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelOverridesPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelOverridesProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcProperty> getOverridingProperties() {
		if (overridingProperties == null) {
			overridingProperties = new EObjectResolvingEList<IfcProperty>(IfcProperty.class, this, Ifc2x3tc1Package.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES);
		}
		return overridingProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES:
				return getOverridingProperties();
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
			case Ifc2x3tc1Package.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES:
				getOverridingProperties().clear();
				getOverridingProperties().addAll((Collection<? extends IfcProperty>)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES:
				getOverridingProperties().clear();
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
			case Ifc2x3tc1Package.IFC_REL_OVERRIDES_PROPERTIES__OVERRIDING_PROPERTIES:
				return overridingProperties != null && !overridingProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcRelOverridesPropertiesImpl
