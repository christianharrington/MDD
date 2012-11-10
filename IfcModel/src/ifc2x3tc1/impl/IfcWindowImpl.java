/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcWindow;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowImpl#getOverallHeight <em>Overall Height</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowImpl#getOverallHeightAsString <em>Overall Height As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowImpl#getOverallWidth <em>Overall Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowImpl#getOverallWidthAsString <em>Overall Width As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcWindowImpl extends IfcBuildingElementImpl implements IfcWindow {
	/**
	 * The default value of the '{@link #getOverallHeight() <em>Overall Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double OVERALL_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOverallHeight() <em>Overall Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallHeight()
	 * @generated
	 * @ordered
	 */
	protected double overallHeight = OVERALL_HEIGHT_EDEFAULT;

	/**
	 * This is true if the Overall Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overallHeightESet;

	/**
	 * The default value of the '{@link #getOverallHeightAsString() <em>Overall Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERALL_HEIGHT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverallHeightAsString() <em>Overall Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected String overallHeightAsString = OVERALL_HEIGHT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Overall Height As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overallHeightAsStringESet;

	/**
	 * The default value of the '{@link #getOverallWidth() <em>Overall Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double OVERALL_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOverallWidth() <em>Overall Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWidth()
	 * @generated
	 * @ordered
	 */
	protected double overallWidth = OVERALL_WIDTH_EDEFAULT;

	/**
	 * This is true if the Overall Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overallWidthESet;

	/**
	 * The default value of the '{@link #getOverallWidthAsString() <em>Overall Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERALL_WIDTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverallWidthAsString() <em>Overall Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected String overallWidthAsString = OVERALL_WIDTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Overall Width As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overallWidthAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcWindow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOverallHeight() {
		return overallHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallHeight(double newOverallHeight) {
		double oldOverallHeight = overallHeight;
		overallHeight = newOverallHeight;
		boolean oldOverallHeightESet = overallHeightESet;
		overallHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT, oldOverallHeight, overallHeight, !oldOverallHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallHeight() {
		double oldOverallHeight = overallHeight;
		boolean oldOverallHeightESet = overallHeightESet;
		overallHeight = OVERALL_HEIGHT_EDEFAULT;
		overallHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT, oldOverallHeight, OVERALL_HEIGHT_EDEFAULT, oldOverallHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallHeight() {
		return overallHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverallHeightAsString() {
		return overallHeightAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallHeightAsString(String newOverallHeightAsString) {
		String oldOverallHeightAsString = overallHeightAsString;
		overallHeightAsString = newOverallHeightAsString;
		boolean oldOverallHeightAsStringESet = overallHeightAsStringESet;
		overallHeightAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT_AS_STRING, oldOverallHeightAsString, overallHeightAsString, !oldOverallHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallHeightAsString() {
		String oldOverallHeightAsString = overallHeightAsString;
		boolean oldOverallHeightAsStringESet = overallHeightAsStringESet;
		overallHeightAsString = OVERALL_HEIGHT_AS_STRING_EDEFAULT;
		overallHeightAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT_AS_STRING, oldOverallHeightAsString, OVERALL_HEIGHT_AS_STRING_EDEFAULT, oldOverallHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallHeightAsString() {
		return overallHeightAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOverallWidth() {
		return overallWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallWidth(double newOverallWidth) {
		double oldOverallWidth = overallWidth;
		overallWidth = newOverallWidth;
		boolean oldOverallWidthESet = overallWidthESet;
		overallWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH, oldOverallWidth, overallWidth, !oldOverallWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallWidth() {
		double oldOverallWidth = overallWidth;
		boolean oldOverallWidthESet = overallWidthESet;
		overallWidth = OVERALL_WIDTH_EDEFAULT;
		overallWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH, oldOverallWidth, OVERALL_WIDTH_EDEFAULT, oldOverallWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallWidth() {
		return overallWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverallWidthAsString() {
		return overallWidthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallWidthAsString(String newOverallWidthAsString) {
		String oldOverallWidthAsString = overallWidthAsString;
		overallWidthAsString = newOverallWidthAsString;
		boolean oldOverallWidthAsStringESet = overallWidthAsStringESet;
		overallWidthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH_AS_STRING, oldOverallWidthAsString, overallWidthAsString, !oldOverallWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallWidthAsString() {
		String oldOverallWidthAsString = overallWidthAsString;
		boolean oldOverallWidthAsStringESet = overallWidthAsStringESet;
		overallWidthAsString = OVERALL_WIDTH_AS_STRING_EDEFAULT;
		overallWidthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH_AS_STRING, oldOverallWidthAsString, OVERALL_WIDTH_AS_STRING_EDEFAULT, oldOverallWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallWidthAsString() {
		return overallWidthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT:
				return getOverallHeight();
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT_AS_STRING:
				return getOverallHeightAsString();
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH:
				return getOverallWidth();
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH_AS_STRING:
				return getOverallWidthAsString();
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
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT:
				setOverallHeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT_AS_STRING:
				setOverallHeightAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH:
				setOverallWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH_AS_STRING:
				setOverallWidthAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT:
				unsetOverallHeight();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT_AS_STRING:
				unsetOverallHeightAsString();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH:
				unsetOverallWidth();
				return;
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH_AS_STRING:
				unsetOverallWidthAsString();
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
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT:
				return isSetOverallHeight();
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_HEIGHT_AS_STRING:
				return isSetOverallHeightAsString();
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH:
				return isSetOverallWidth();
			case Ifc2x3tc1Package.IFC_WINDOW__OVERALL_WIDTH_AS_STRING:
				return isSetOverallWidthAsString();
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
		result.append(" (OverallHeight: ");
		if (overallHeightESet) result.append(overallHeight); else result.append("<unset>");
		result.append(", OverallHeightAsString: ");
		if (overallHeightAsStringESet) result.append(overallHeightAsString); else result.append("<unset>");
		result.append(", OverallWidth: ");
		if (overallWidthESet) result.append(overallWidth); else result.append("<unset>");
		result.append(", OverallWidthAsString: ");
		if (overallWidthAsStringESet) result.append(overallWidthAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcWindowImpl
