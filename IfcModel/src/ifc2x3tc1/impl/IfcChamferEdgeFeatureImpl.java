/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcChamferEdgeFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Chamfer Edge Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcChamferEdgeFeatureImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcChamferEdgeFeatureImpl#getWidthAsString <em>Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcChamferEdgeFeatureImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcChamferEdgeFeatureImpl#getHeightAsString <em>Height As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcChamferEdgeFeatureImpl extends IfcEdgeFeatureImpl implements IfcChamferEdgeFeature {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * This is true if the Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthESet;

	/**
	 * The default value of the '{@link #getWidthAsString() <em>Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidthAsString() <em>Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected String widthAsString = WIDTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Width As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthAsStringESet;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * This is true if the Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heightESet;

	/**
	 * The default value of the '{@link #getHeightAsString() <em>Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeightAsString() <em>Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected String heightAsString = HEIGHT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Height As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heightAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcChamferEdgeFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcChamferEdgeFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		boolean oldWidthESet = widthESet;
		widthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH, oldWidth, width, !oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidth() {
		double oldWidth = width;
		boolean oldWidthESet = widthESet;
		width = WIDTH_EDEFAULT;
		widthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH, oldWidth, WIDTH_EDEFAULT, oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidth() {
		return widthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidthAsString() {
		return widthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidthAsString(String newWidthAsString) {
		String oldWidthAsString = widthAsString;
		widthAsString = newWidthAsString;
		boolean oldWidthAsStringESet = widthAsStringESet;
		widthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH_AS_STRING, oldWidthAsString, widthAsString, !oldWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidthAsString() {
		String oldWidthAsString = widthAsString;
		boolean oldWidthAsStringESet = widthAsStringESet;
		widthAsString = WIDTH_AS_STRING_EDEFAULT;
		widthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH_AS_STRING, oldWidthAsString, WIDTH_AS_STRING_EDEFAULT, oldWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidthAsString() {
		return widthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		boolean oldHeightESet = heightESet;
		heightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT, oldHeight, height, !oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeight() {
		double oldHeight = height;
		boolean oldHeightESet = heightESet;
		height = HEIGHT_EDEFAULT;
		heightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT, oldHeight, HEIGHT_EDEFAULT, oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeight() {
		return heightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeightAsString() {
		return heightAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeightAsString(String newHeightAsString) {
		String oldHeightAsString = heightAsString;
		heightAsString = newHeightAsString;
		boolean oldHeightAsStringESet = heightAsStringESet;
		heightAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT_AS_STRING, oldHeightAsString, heightAsString, !oldHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeightAsString() {
		String oldHeightAsString = heightAsString;
		boolean oldHeightAsStringESet = heightAsStringESet;
		heightAsString = HEIGHT_AS_STRING_EDEFAULT;
		heightAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT_AS_STRING, oldHeightAsString, HEIGHT_AS_STRING_EDEFAULT, oldHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeightAsString() {
		return heightAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH:
				return getWidth();
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH_AS_STRING:
				return getWidthAsString();
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT:
				return getHeight();
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT_AS_STRING:
				return getHeightAsString();
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
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH:
				setWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH_AS_STRING:
				setWidthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT:
				setHeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT_AS_STRING:
				setHeightAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH:
				unsetWidth();
				return;
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH_AS_STRING:
				unsetWidthAsString();
				return;
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT:
				unsetHeight();
				return;
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT_AS_STRING:
				unsetHeightAsString();
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
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH:
				return isSetWidth();
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__WIDTH_AS_STRING:
				return isSetWidthAsString();
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT:
				return isSetHeight();
			case Ifc2x3tc1Package.IFC_CHAMFER_EDGE_FEATURE__HEIGHT_AS_STRING:
				return isSetHeightAsString();
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
		result.append(" (Width: ");
		if (widthESet) result.append(width); else result.append("<unset>");
		result.append(", WidthAsString: ");
		if (widthAsStringESet) result.append(widthAsString); else result.append("<unset>");
		result.append(", Height: ");
		if (heightESet) result.append(height); else result.append("<unset>");
		result.append(", HeightAsString: ");
		if (heightAsStringESet) result.append(heightAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcChamferEdgeFeatureImpl
