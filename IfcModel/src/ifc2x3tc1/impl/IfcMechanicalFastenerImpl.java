/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMechanicalFastener;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Fastener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalFastenerImpl#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalFastenerImpl#getNominalDiameterAsString <em>Nominal Diameter As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalFastenerImpl#getNominalLength <em>Nominal Length</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalFastenerImpl#getNominalLengthAsString <em>Nominal Length As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMechanicalFastenerImpl extends IfcFastenerImpl implements IfcMechanicalFastener {
	/**
	 * The default value of the '{@link #getNominalDiameter() <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_DIAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominalDiameter() <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected double nominalDiameter = NOMINAL_DIAMETER_EDEFAULT;

	/**
	 * This is true if the Nominal Diameter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalDiameterESet;

	/**
	 * The default value of the '{@link #getNominalDiameterAsString() <em>Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMINAL_DIAMETER_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominalDiameterAsString() <em>Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected String nominalDiameterAsString = NOMINAL_DIAMETER_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Nominal Diameter As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalDiameterAsStringESet;

	/**
	 * The default value of the '{@link #getNominalLength() <em>Nominal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalLength()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominalLength() <em>Nominal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalLength()
	 * @generated
	 * @ordered
	 */
	protected double nominalLength = NOMINAL_LENGTH_EDEFAULT;

	/**
	 * This is true if the Nominal Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalLengthESet;

	/**
	 * The default value of the '{@link #getNominalLengthAsString() <em>Nominal Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMINAL_LENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominalLengthAsString() <em>Nominal Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String nominalLengthAsString = NOMINAL_LENGTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Nominal Length As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalLengthAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalFastenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalFastener();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalDiameter() {
		return nominalDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameter(double newNominalDiameter) {
		double oldNominalDiameter = nominalDiameter;
		nominalDiameter = newNominalDiameter;
		boolean oldNominalDiameterESet = nominalDiameterESet;
		nominalDiameterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER, oldNominalDiameter, nominalDiameter, !oldNominalDiameterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalDiameter() {
		double oldNominalDiameter = nominalDiameter;
		boolean oldNominalDiameterESet = nominalDiameterESet;
		nominalDiameter = NOMINAL_DIAMETER_EDEFAULT;
		nominalDiameterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER, oldNominalDiameter, NOMINAL_DIAMETER_EDEFAULT, oldNominalDiameterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalDiameter() {
		return nominalDiameterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominalDiameterAsString() {
		return nominalDiameterAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameterAsString(String newNominalDiameterAsString) {
		String oldNominalDiameterAsString = nominalDiameterAsString;
		nominalDiameterAsString = newNominalDiameterAsString;
		boolean oldNominalDiameterAsStringESet = nominalDiameterAsStringESet;
		nominalDiameterAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER_AS_STRING, oldNominalDiameterAsString, nominalDiameterAsString, !oldNominalDiameterAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalDiameterAsString() {
		String oldNominalDiameterAsString = nominalDiameterAsString;
		boolean oldNominalDiameterAsStringESet = nominalDiameterAsStringESet;
		nominalDiameterAsString = NOMINAL_DIAMETER_AS_STRING_EDEFAULT;
		nominalDiameterAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER_AS_STRING, oldNominalDiameterAsString, NOMINAL_DIAMETER_AS_STRING_EDEFAULT, oldNominalDiameterAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalDiameterAsString() {
		return nominalDiameterAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalLength() {
		return nominalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalLength(double newNominalLength) {
		double oldNominalLength = nominalLength;
		nominalLength = newNominalLength;
		boolean oldNominalLengthESet = nominalLengthESet;
		nominalLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH, oldNominalLength, nominalLength, !oldNominalLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalLength() {
		double oldNominalLength = nominalLength;
		boolean oldNominalLengthESet = nominalLengthESet;
		nominalLength = NOMINAL_LENGTH_EDEFAULT;
		nominalLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH, oldNominalLength, NOMINAL_LENGTH_EDEFAULT, oldNominalLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalLength() {
		return nominalLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominalLengthAsString() {
		return nominalLengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalLengthAsString(String newNominalLengthAsString) {
		String oldNominalLengthAsString = nominalLengthAsString;
		nominalLengthAsString = newNominalLengthAsString;
		boolean oldNominalLengthAsStringESet = nominalLengthAsStringESet;
		nominalLengthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH_AS_STRING, oldNominalLengthAsString, nominalLengthAsString, !oldNominalLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalLengthAsString() {
		String oldNominalLengthAsString = nominalLengthAsString;
		boolean oldNominalLengthAsStringESet = nominalLengthAsStringESet;
		nominalLengthAsString = NOMINAL_LENGTH_AS_STRING_EDEFAULT;
		nominalLengthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH_AS_STRING, oldNominalLengthAsString, NOMINAL_LENGTH_AS_STRING_EDEFAULT, oldNominalLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalLengthAsString() {
		return nominalLengthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER:
				return getNominalDiameter();
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER_AS_STRING:
				return getNominalDiameterAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH:
				return getNominalLength();
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH_AS_STRING:
				return getNominalLengthAsString();
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
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER:
				setNominalDiameter((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER_AS_STRING:
				setNominalDiameterAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH:
				setNominalLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH_AS_STRING:
				setNominalLengthAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER:
				unsetNominalDiameter();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER_AS_STRING:
				unsetNominalDiameterAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH:
				unsetNominalLength();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH_AS_STRING:
				unsetNominalLengthAsString();
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
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER:
				return isSetNominalDiameter();
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER_AS_STRING:
				return isSetNominalDiameterAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH:
				return isSetNominalLength();
			case Ifc2x3tc1Package.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH_AS_STRING:
				return isSetNominalLengthAsString();
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
		result.append(" (NominalDiameter: ");
		if (nominalDiameterESet) result.append(nominalDiameter); else result.append("<unset>");
		result.append(", NominalDiameterAsString: ");
		if (nominalDiameterAsStringESet) result.append(nominalDiameterAsString); else result.append("<unset>");
		result.append(", NominalLength: ");
		if (nominalLengthESet) result.append(nominalLength); else result.append("<unset>");
		result.append(", NominalLengthAsString: ");
		if (nominalLengthAsStringESet) result.append(nominalLengthAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcMechanicalFastenerImpl
