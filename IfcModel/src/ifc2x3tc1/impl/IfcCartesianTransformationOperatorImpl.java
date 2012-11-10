/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCartesianPoint;
import ifc2x3tc1.IfcCartesianTransformationOperator;
import ifc2x3tc1.IfcDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianTransformationOperatorImpl#getAxis1 <em>Axis1</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianTransformationOperatorImpl#getAxis2 <em>Axis2</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianTransformationOperatorImpl#getLocalOrigin <em>Local Origin</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianTransformationOperatorImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianTransformationOperatorImpl#getScaleAsString <em>Scale As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianTransformationOperatorImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCartesianTransformationOperatorImpl extends IfcGeometricRepresentationItemImpl implements IfcCartesianTransformationOperator {
	/**
	 * The cached value of the '{@link #getAxis1() <em>Axis1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis1()
	 * @generated
	 * @ordered
	 */
	protected IfcDirection axis1;

	/**
	 * This is true if the Axis1 reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean axis1ESet;

	/**
	 * The cached value of the '{@link #getAxis2() <em>Axis2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis2()
	 * @generated
	 * @ordered
	 */
	protected IfcDirection axis2;

	/**
	 * This is true if the Axis2 reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean axis2ESet;

	/**
	 * The cached value of the '{@link #getLocalOrigin() <em>Local Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOrigin()
	 * @generated
	 * @ordered
	 */
	protected IfcCartesianPoint localOrigin;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected double scale = SCALE_EDEFAULT;

	/**
	 * This is true if the Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scaleESet;

	/**
	 * The default value of the '{@link #getScaleAsString() <em>Scale As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleAsString() <em>Scale As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleAsString()
	 * @generated
	 * @ordered
	 */
	protected String scaleAsString = SCALE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Scale As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scaleAsStringESet;

	/**
	 * The default value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected static final int DIM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected int dim = DIM_EDEFAULT;

	/**
	 * This is true if the Dim attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dimESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getAxis1() {
		if (axis1 != null && axis1.eIsProxy()) {
			InternalEObject oldAxis1 = (InternalEObject)axis1;
			axis1 = (IfcDirection)eResolveProxy(oldAxis1);
			if (axis1 != oldAxis1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1, oldAxis1, axis1));
			}
		}
		return axis1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection basicGetAxis1() {
		return axis1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis1(IfcDirection newAxis1) {
		IfcDirection oldAxis1 = axis1;
		axis1 = newAxis1;
		boolean oldAxis1ESet = axis1ESet;
		axis1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1, oldAxis1, axis1, !oldAxis1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAxis1() {
		IfcDirection oldAxis1 = axis1;
		boolean oldAxis1ESet = axis1ESet;
		axis1 = null;
		axis1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1, oldAxis1, null, oldAxis1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAxis1() {
		return axis1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getAxis2() {
		if (axis2 != null && axis2.eIsProxy()) {
			InternalEObject oldAxis2 = (InternalEObject)axis2;
			axis2 = (IfcDirection)eResolveProxy(oldAxis2);
			if (axis2 != oldAxis2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2, oldAxis2, axis2));
			}
		}
		return axis2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection basicGetAxis2() {
		return axis2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis2(IfcDirection newAxis2) {
		IfcDirection oldAxis2 = axis2;
		axis2 = newAxis2;
		boolean oldAxis2ESet = axis2ESet;
		axis2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2, oldAxis2, axis2, !oldAxis2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAxis2() {
		IfcDirection oldAxis2 = axis2;
		boolean oldAxis2ESet = axis2ESet;
		axis2 = null;
		axis2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2, oldAxis2, null, oldAxis2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAxis2() {
		return axis2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getLocalOrigin() {
		if (localOrigin != null && localOrigin.eIsProxy()) {
			InternalEObject oldLocalOrigin = (InternalEObject)localOrigin;
			localOrigin = (IfcCartesianPoint)eResolveProxy(oldLocalOrigin);
			if (localOrigin != oldLocalOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN, oldLocalOrigin, localOrigin));
			}
		}
		return localOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint basicGetLocalOrigin() {
		return localOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalOrigin(IfcCartesianPoint newLocalOrigin) {
		IfcCartesianPoint oldLocalOrigin = localOrigin;
		localOrigin = newLocalOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN, oldLocalOrigin, localOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(double newScale) {
		double oldScale = scale;
		scale = newScale;
		boolean oldScaleESet = scaleESet;
		scaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE, oldScale, scale, !oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale() {
		double oldScale = scale;
		boolean oldScaleESet = scaleESet;
		scale = SCALE_EDEFAULT;
		scaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE, oldScale, SCALE_EDEFAULT, oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale() {
		return scaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScaleAsString() {
		return scaleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleAsString(String newScaleAsString) {
		String oldScaleAsString = scaleAsString;
		scaleAsString = newScaleAsString;
		boolean oldScaleAsStringESet = scaleAsStringESet;
		scaleAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE_AS_STRING, oldScaleAsString, scaleAsString, !oldScaleAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScaleAsString() {
		String oldScaleAsString = scaleAsString;
		boolean oldScaleAsStringESet = scaleAsStringESet;
		scaleAsString = SCALE_AS_STRING_EDEFAULT;
		scaleAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE_AS_STRING, oldScaleAsString, SCALE_AS_STRING_EDEFAULT, oldScaleAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScaleAsString() {
		return scaleAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDim() {
		return dim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDim(int newDim) {
		int oldDim = dim;
		dim = newDim;
		boolean oldDimESet = dimESet;
		dimESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__DIM, oldDim, dim, !oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDim() {
		int oldDim = dim;
		boolean oldDimESet = dimESet;
		dim = DIM_EDEFAULT;
		dimESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDim() {
		return dimESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1:
				if (resolve) return getAxis1();
				return basicGetAxis1();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2:
				if (resolve) return getAxis2();
				return basicGetAxis2();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN:
				if (resolve) return getLocalOrigin();
				return basicGetLocalOrigin();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE:
				return getScale();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE_AS_STRING:
				return getScaleAsString();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__DIM:
				return getDim();
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
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1:
				setAxis1((IfcDirection)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2:
				setAxis2((IfcDirection)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN:
				setLocalOrigin((IfcCartesianPoint)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE:
				setScale((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE_AS_STRING:
				setScaleAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__DIM:
				setDim((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1:
				unsetAxis1();
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2:
				unsetAxis2();
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN:
				setLocalOrigin((IfcCartesianPoint)null);
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE:
				unsetScale();
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE_AS_STRING:
				unsetScaleAsString();
				return;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__DIM:
				unsetDim();
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
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1:
				return isSetAxis1();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2:
				return isSetAxis2();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN:
				return localOrigin != null;
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE:
				return isSetScale();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE_AS_STRING:
				return isSetScaleAsString();
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__DIM:
				return isSetDim();
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
		result.append(" (Scale: ");
		if (scaleESet) result.append(scale); else result.append("<unset>");
		result.append(", ScaleAsString: ");
		if (scaleAsStringESet) result.append(scaleAsString); else result.append("<unset>");
		result.append(", Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcCartesianTransformationOperatorImpl
