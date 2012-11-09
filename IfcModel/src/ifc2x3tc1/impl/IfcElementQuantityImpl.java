/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcElementQuantity;
import ifc2x3tc1.IfcPhysicalQuantity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Element Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcElementQuantityImpl#getMethodOfMeasurement <em>Method Of Measurement</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementQuantityImpl#getQuantities <em>Quantities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcElementQuantityImpl extends IfcPropertySetDefinitionImpl implements IfcElementQuantity {
	/**
	 * The default value of the '{@link #getMethodOfMeasurement() <em>Method Of Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodOfMeasurement()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_OF_MEASUREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodOfMeasurement() <em>Method Of Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodOfMeasurement()
	 * @generated
	 * @ordered
	 */
	protected String methodOfMeasurement = METHOD_OF_MEASUREMENT_EDEFAULT;

	/**
	 * This is true if the Method Of Measurement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodOfMeasurementESet;

	/**
	 * The cached value of the '{@link #getQuantities() <em>Quantities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantities()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPhysicalQuantity> quantities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElementQuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcElementQuantity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodOfMeasurement() {
		return methodOfMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodOfMeasurement(String newMethodOfMeasurement) {
		String oldMethodOfMeasurement = methodOfMeasurement;
		methodOfMeasurement = newMethodOfMeasurement;
		boolean oldMethodOfMeasurementESet = methodOfMeasurementESet;
		methodOfMeasurementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELEMENT_QUANTITY__METHOD_OF_MEASUREMENT, oldMethodOfMeasurement, methodOfMeasurement, !oldMethodOfMeasurementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMethodOfMeasurement() {
		String oldMethodOfMeasurement = methodOfMeasurement;
		boolean oldMethodOfMeasurementESet = methodOfMeasurementESet;
		methodOfMeasurement = METHOD_OF_MEASUREMENT_EDEFAULT;
		methodOfMeasurementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELEMENT_QUANTITY__METHOD_OF_MEASUREMENT, oldMethodOfMeasurement, METHOD_OF_MEASUREMENT_EDEFAULT, oldMethodOfMeasurementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMethodOfMeasurement() {
		return methodOfMeasurementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPhysicalQuantity> getQuantities() {
		if (quantities == null) {
			quantities = new EObjectResolvingEList<IfcPhysicalQuantity>(IfcPhysicalQuantity.class, this, Ifc2x3tc1Package.IFC_ELEMENT_QUANTITY__QUANTITIES);
		}
		return quantities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ELEMENT_QUANTITY__METHOD_OF_MEASUREMENT:
				return getMethodOfMeasurement();
			case Ifc2x3tc1Package.IFC_ELEMENT_QUANTITY__QUANTITIES:
				return getQuantities();
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
			case Ifc2x3tc1Package.IFC_ELEMENT_QUANTITY__METHOD_OF_MEASUREMENT:
				setMethodOfMeasurement((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT_QUANTITY__QUANTITIES:
				getQuantities().clear();
				getQuantities().addAll((Collection<? extends IfcPhysicalQuantity>)newValue);
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
			case Ifc2x3tc1Package.IFC_ELEMENT_QUANTITY__METHOD_OF_MEASUREMENT:
				unsetMethodOfMeasurement();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT_QUANTITY__QUANTITIES:
				getQuantities().clear();
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
			case Ifc2x3tc1Package.IFC_ELEMENT_QUANTITY__METHOD_OF_MEASUREMENT:
				return isSetMethodOfMeasurement();
			case Ifc2x3tc1Package.IFC_ELEMENT_QUANTITY__QUANTITIES:
				return quantities != null && !quantities.isEmpty();
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
		result.append(" (MethodOfMeasurement: ");
		if (methodOfMeasurementESet) result.append(methodOfMeasurement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcElementQuantityImpl
