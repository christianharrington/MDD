/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis2Placement;
import ifc2x3tc1.IfcDirection;
import ifc2x3tc1.IfcGeometricRepresentationContext;
import ifc2x3tc1.IfcGeometricRepresentationSubContext;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Representation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcGeometricRepresentationContextImpl#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeometricRepresentationContextImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeometricRepresentationContextImpl#getPrecisionAsString <em>Precision As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeometricRepresentationContextImpl#getWorldCoordinateSystem <em>World Coordinate System</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeometricRepresentationContextImpl#getTrueNorth <em>True North</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeometricRepresentationContextImpl#getHasSubContexts <em>Has Sub Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGeometricRepresentationContextImpl extends IfcRepresentationContextImpl implements IfcGeometricRepresentationContext {
	/**
	 * The default value of the '{@link #getCoordinateSpaceDimension() <em>Coordinate Space Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSpaceDimension()
	 * @generated
	 * @ordered
	 */
	protected static final int COORDINATE_SPACE_DIMENSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoordinateSpaceDimension() <em>Coordinate Space Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSpaceDimension()
	 * @generated
	 * @ordered
	 */
	protected int coordinateSpaceDimension = COORDINATE_SPACE_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final double PRECISION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected double precision = PRECISION_EDEFAULT;

	/**
	 * This is true if the Precision attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionESet;

	/**
	 * The default value of the '{@link #getPrecisionAsString() <em>Precision As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECISION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecisionAsString() <em>Precision As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionAsString()
	 * @generated
	 * @ordered
	 */
	protected String precisionAsString = PRECISION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Precision As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionAsStringESet;

	/**
	 * The cached value of the '{@link #getWorldCoordinateSystem() <em>World Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement worldCoordinateSystem;

	/**
	 * The cached value of the '{@link #getTrueNorth() <em>True North</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueNorth()
	 * @generated
	 * @ordered
	 */
	protected IfcDirection trueNorth;

	/**
	 * This is true if the True North reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trueNorthESet;

	/**
	 * The cached value of the '{@link #getHasSubContexts() <em>Has Sub Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSubContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcGeometricRepresentationSubContext> hasSubContexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeometricRepresentationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcGeometricRepresentationContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoordinateSpaceDimension() {
		return coordinateSpaceDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSpaceDimension(int newCoordinateSpaceDimension) {
		int oldCoordinateSpaceDimension = coordinateSpaceDimension;
		coordinateSpaceDimension = newCoordinateSpaceDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION, oldCoordinateSpaceDimension, coordinateSpaceDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(double newPrecision) {
		double oldPrecision = precision;
		precision = newPrecision;
		boolean oldPrecisionESet = precisionESet;
		precisionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION, oldPrecision, precision, !oldPrecisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecision() {
		double oldPrecision = precision;
		boolean oldPrecisionESet = precisionESet;
		precision = PRECISION_EDEFAULT;
		precisionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION, oldPrecision, PRECISION_EDEFAULT, oldPrecisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecision() {
		return precisionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecisionAsString() {
		return precisionAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionAsString(String newPrecisionAsString) {
		String oldPrecisionAsString = precisionAsString;
		precisionAsString = newPrecisionAsString;
		boolean oldPrecisionAsStringESet = precisionAsStringESet;
		precisionAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION_AS_STRING, oldPrecisionAsString, precisionAsString, !oldPrecisionAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionAsString() {
		String oldPrecisionAsString = precisionAsString;
		boolean oldPrecisionAsStringESet = precisionAsStringESet;
		precisionAsString = PRECISION_AS_STRING_EDEFAULT;
		precisionAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION_AS_STRING, oldPrecisionAsString, PRECISION_AS_STRING_EDEFAULT, oldPrecisionAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionAsString() {
		return precisionAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getWorldCoordinateSystem() {
		if (worldCoordinateSystem != null && worldCoordinateSystem.eIsProxy()) {
			InternalEObject oldWorldCoordinateSystem = (InternalEObject)worldCoordinateSystem;
			worldCoordinateSystem = (IfcAxis2Placement)eResolveProxy(oldWorldCoordinateSystem);
			if (worldCoordinateSystem != oldWorldCoordinateSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM, oldWorldCoordinateSystem, worldCoordinateSystem));
			}
		}
		return worldCoordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement basicGetWorldCoordinateSystem() {
		return worldCoordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldCoordinateSystem(IfcAxis2Placement newWorldCoordinateSystem) {
		IfcAxis2Placement oldWorldCoordinateSystem = worldCoordinateSystem;
		worldCoordinateSystem = newWorldCoordinateSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM, oldWorldCoordinateSystem, worldCoordinateSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getTrueNorth() {
		if (trueNorth != null && trueNorth.eIsProxy()) {
			InternalEObject oldTrueNorth = (InternalEObject)trueNorth;
			trueNorth = (IfcDirection)eResolveProxy(oldTrueNorth);
			if (trueNorth != oldTrueNorth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH, oldTrueNorth, trueNorth));
			}
		}
		return trueNorth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection basicGetTrueNorth() {
		return trueNorth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueNorth(IfcDirection newTrueNorth) {
		IfcDirection oldTrueNorth = trueNorth;
		trueNorth = newTrueNorth;
		boolean oldTrueNorthESet = trueNorthESet;
		trueNorthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH, oldTrueNorth, trueNorth, !oldTrueNorthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrueNorth() {
		IfcDirection oldTrueNorth = trueNorth;
		boolean oldTrueNorthESet = trueNorthESet;
		trueNorth = null;
		trueNorthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH, oldTrueNorth, null, oldTrueNorthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrueNorth() {
		return trueNorthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcGeometricRepresentationSubContext> getHasSubContexts() {
		if (hasSubContexts == null) {
			hasSubContexts = new EObjectWithInverseResolvingEList.Unsettable<IfcGeometricRepresentationSubContext>(IfcGeometricRepresentationSubContext.class, this, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS, Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT__PARENT_CONTEXT);
		}
		return hasSubContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasSubContexts() {
		if (hasSubContexts != null) ((InternalEList.Unsettable<?>)hasSubContexts).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasSubContexts() {
		return hasSubContexts != null && ((InternalEList.Unsettable<?>)hasSubContexts).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasSubContexts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS:
				return ((InternalEList<?>)getHasSubContexts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION:
				return getCoordinateSpaceDimension();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION:
				return getPrecision();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION_AS_STRING:
				return getPrecisionAsString();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM:
				if (resolve) return getWorldCoordinateSystem();
				return basicGetWorldCoordinateSystem();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH:
				if (resolve) return getTrueNorth();
				return basicGetTrueNorth();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS:
				return getHasSubContexts();
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
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION:
				setCoordinateSpaceDimension((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION:
				setPrecision((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION_AS_STRING:
				setPrecisionAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM:
				setWorldCoordinateSystem((IfcAxis2Placement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH:
				setTrueNorth((IfcDirection)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS:
				getHasSubContexts().clear();
				getHasSubContexts().addAll((Collection<? extends IfcGeometricRepresentationSubContext>)newValue);
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
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION:
				setCoordinateSpaceDimension(COORDINATE_SPACE_DIMENSION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION:
				unsetPrecision();
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION_AS_STRING:
				unsetPrecisionAsString();
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM:
				setWorldCoordinateSystem((IfcAxis2Placement)null);
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH:
				unsetTrueNorth();
				return;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS:
				unsetHasSubContexts();
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
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__COORDINATE_SPACE_DIMENSION:
				return coordinateSpaceDimension != COORDINATE_SPACE_DIMENSION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION:
				return isSetPrecision();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__PRECISION_AS_STRING:
				return isSetPrecisionAsString();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__WORLD_COORDINATE_SYSTEM:
				return worldCoordinateSystem != null;
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__TRUE_NORTH:
				return isSetTrueNorth();
			case Ifc2x3tc1Package.IFC_GEOMETRIC_REPRESENTATION_CONTEXT__HAS_SUB_CONTEXTS:
				return isSetHasSubContexts();
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
		result.append(" (CoordinateSpaceDimension: ");
		result.append(coordinateSpaceDimension);
		result.append(", Precision: ");
		if (precisionESet) result.append(precision); else result.append("<unset>");
		result.append(", PrecisionAsString: ");
		if (precisionAsStringESet) result.append(precisionAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcGeometricRepresentationContextImpl
