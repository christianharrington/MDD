/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProperty;
import ifc2x3tc1.IfcPropertySet;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertySetImpl#getHasProperties <em>Has Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertySetImpl extends IfcPropertySetDefinitionImpl implements IfcPropertySet {
	/**
	 * The cached value of the '{@link #getHasProperties() <em>Has Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcProperty> hasProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPropertySet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcProperty> getHasProperties() {
		if (hasProperties == null) {
			hasProperties = new EObjectResolvingEList<IfcProperty>(IfcProperty.class, this, Ifc2x3tc1Package.IFC_PROPERTY_SET__HAS_PROPERTIES);
		}
		return hasProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROPERTY_SET__HAS_PROPERTIES:
				return getHasProperties();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SET__HAS_PROPERTIES:
				getHasProperties().clear();
				getHasProperties().addAll((Collection<? extends IfcProperty>)newValue);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SET__HAS_PROPERTIES:
				getHasProperties().clear();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SET__HAS_PROPERTIES:
				return hasProperties != null && !hasProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcPropertySetImpl
