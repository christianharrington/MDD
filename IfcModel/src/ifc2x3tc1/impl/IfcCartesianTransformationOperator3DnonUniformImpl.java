/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCartesianTransformationOperator3DnonUniform;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator3 Dnon Uniform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianTransformationOperator3DnonUniformImpl#getScale2 <em>Scale2</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianTransformationOperator3DnonUniformImpl#getScale2AsString <em>Scale2 As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianTransformationOperator3DnonUniformImpl#getScale3 <em>Scale3</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianTransformationOperator3DnonUniformImpl#getScale3AsString <em>Scale3 As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCartesianTransformationOperator3DnonUniformImpl extends IfcCartesianTransformationOperator3DImpl implements IfcCartesianTransformationOperator3DnonUniform {
	/**
	 * The default value of the '{@link #getScale2() <em>Scale2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale2()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScale2() <em>Scale2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale2()
	 * @generated
	 * @ordered
	 */
	protected double scale2 = SCALE2_EDEFAULT;

	/**
	 * This is true if the Scale2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scale2ESet;

	/**
	 * The default value of the '{@link #getScale2AsString() <em>Scale2 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale2AsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE2_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale2AsString() <em>Scale2 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale2AsString()
	 * @generated
	 * @ordered
	 */
	protected String scale2AsString = SCALE2_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Scale2 As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scale2AsStringESet;

	/**
	 * The default value of the '{@link #getScale3() <em>Scale3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale3()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScale3() <em>Scale3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale3()
	 * @generated
	 * @ordered
	 */
	protected double scale3 = SCALE3_EDEFAULT;

	/**
	 * This is true if the Scale3 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scale3ESet;

	/**
	 * The default value of the '{@link #getScale3AsString() <em>Scale3 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale3AsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE3_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale3AsString() <em>Scale3 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale3AsString()
	 * @generated
	 * @ordered
	 */
	protected String scale3AsString = SCALE3_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Scale3 As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scale3AsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperator3DnonUniformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScale2() {
		return scale2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale2(double newScale2) {
		double oldScale2 = scale2;
		scale2 = newScale2;
		boolean oldScale2ESet = scale2ESet;
		scale2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2, oldScale2, scale2, !oldScale2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale2() {
		double oldScale2 = scale2;
		boolean oldScale2ESet = scale2ESet;
		scale2 = SCALE2_EDEFAULT;
		scale2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2, oldScale2, SCALE2_EDEFAULT, oldScale2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale2() {
		return scale2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScale2AsString() {
		return scale2AsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale2AsString(String newScale2AsString) {
		String oldScale2AsString = scale2AsString;
		scale2AsString = newScale2AsString;
		boolean oldScale2AsStringESet = scale2AsStringESet;
		scale2AsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2_AS_STRING, oldScale2AsString, scale2AsString, !oldScale2AsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale2AsString() {
		String oldScale2AsString = scale2AsString;
		boolean oldScale2AsStringESet = scale2AsStringESet;
		scale2AsString = SCALE2_AS_STRING_EDEFAULT;
		scale2AsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2_AS_STRING, oldScale2AsString, SCALE2_AS_STRING_EDEFAULT, oldScale2AsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale2AsString() {
		return scale2AsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScale3() {
		return scale3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale3(double newScale3) {
		double oldScale3 = scale3;
		scale3 = newScale3;
		boolean oldScale3ESet = scale3ESet;
		scale3ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3, oldScale3, scale3, !oldScale3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale3() {
		double oldScale3 = scale3;
		boolean oldScale3ESet = scale3ESet;
		scale3 = SCALE3_EDEFAULT;
		scale3ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3, oldScale3, SCALE3_EDEFAULT, oldScale3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale3() {
		return scale3ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScale3AsString() {
		return scale3AsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale3AsString(String newScale3AsString) {
		String oldScale3AsString = scale3AsString;
		scale3AsString = newScale3AsString;
		boolean oldScale3AsStringESet = scale3AsStringESet;
		scale3AsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3_AS_STRING, oldScale3AsString, scale3AsString, !oldScale3AsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale3AsString() {
		String oldScale3AsString = scale3AsString;
		boolean oldScale3AsStringESet = scale3AsStringESet;
		scale3AsString = SCALE3_AS_STRING_EDEFAULT;
		scale3AsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3_AS_STRING, oldScale3AsString, SCALE3_AS_STRING_EDEFAULT, oldScale3AsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale3AsString() {
		return scale3AsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2:
				return getScale2();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2_AS_STRING:
				return getScale2AsString();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3:
				return getScale3();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3_AS_STRING:
				return getScale3AsString();
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
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2:
				setScale2((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2_AS_STRING:
				setScale2AsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3:
				setScale3((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3_AS_STRING:
				setScale3AsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2:
				unsetScale2();
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2_AS_STRING:
				unsetScale2AsString();
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3:
				unsetScale3();
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3_AS_STRING:
				unsetScale3AsString();
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
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2:
				return isSetScale2();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2_AS_STRING:
				return isSetScale2AsString();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3:
				return isSetScale3();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3_AS_STRING:
				return isSetScale3AsString();
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
		result.append(" (Scale2: ");
		if (scale2ESet) result.append(scale2); else result.append("<unset>");
		result.append(", Scale2AsString: ");
		if (scale2AsStringESet) result.append(scale2AsString); else result.append("<unset>");
		result.append(", Scale3: ");
		if (scale3ESet) result.append(scale3); else result.append("<unset>");
		result.append(", Scale3AsString: ");
		if (scale3AsStringESet) result.append(scale3AsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcCartesianTransformationOperator3DnonUniformImpl
