/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CornerType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoundingBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Bounding Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundingBoxImpl#getCorner <em>Corner</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundingBoxImpl#getXDim <em>XDim</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundingBoxImpl#getYDim <em>YDim</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundingBoxImpl#getZDim <em>ZDim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundingBoxImpl extends IfcGeometricRepresentationItemImpl implements IfcBoundingBox {
	/**
	 * The cached value of the '{@link #getCorner() <em>Corner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorner()
	 * @generated
	 * @ordered
	 */
	protected CornerType corner;

	/**
	 * The default value of the '{@link #getXDim() <em>XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDim()
	 * @generated
	 * @ordered
	 */
	protected static final double XDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXDim() <em>XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDim()
	 * @generated
	 * @ordered
	 */
	protected double xDim = XDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getYDim() <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDim()
	 * @generated
	 * @ordered
	 */
	protected static final double YDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYDim() <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDim()
	 * @generated
	 * @ordered
	 */
	protected double yDim = YDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getZDim() <em>ZDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZDim()
	 * @generated
	 * @ordered
	 */
	protected static final double ZDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZDim() <em>ZDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZDim()
	 * @generated
	 * @ordered
	 */
	protected double zDim = ZDIM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundingBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcBoundingBox();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CornerType getCorner() {
		return corner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorner(CornerType newCorner, NotificationChain msgs) {
		CornerType oldCorner = corner;
		corner = newCorner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDING_BOX__CORNER, oldCorner, newCorner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorner(CornerType newCorner) {
		if (newCorner != corner) {
			NotificationChain msgs = null;
			if (corner != null)
				msgs = ((InternalEObject)corner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_BOUNDING_BOX__CORNER, null, msgs);
			if (newCorner != null)
				msgs = ((InternalEObject)newCorner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_BOUNDING_BOX__CORNER, null, msgs);
			msgs = basicSetCorner(newCorner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDING_BOX__CORNER, newCorner, newCorner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXDim() {
		return xDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDim(double newXDim) {
		double oldXDim = xDim;
		xDim = newXDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDING_BOX__XDIM, oldXDim, xDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYDim() {
		return yDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDim(double newYDim) {
		double oldYDim = yDim;
		yDim = newYDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDING_BOX__YDIM, oldYDim, yDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZDim() {
		return zDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZDim(double newZDim) {
		double oldZDim = zDim;
		zDim = newZDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDING_BOX__ZDIM, oldZDim, zDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_BOUNDING_BOX__CORNER:
				return basicSetCorner(null, msgs);
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
			case FinalPackage.IFC_BOUNDING_BOX__CORNER:
				return getCorner();
			case FinalPackage.IFC_BOUNDING_BOX__XDIM:
				return getXDim();
			case FinalPackage.IFC_BOUNDING_BOX__YDIM:
				return getYDim();
			case FinalPackage.IFC_BOUNDING_BOX__ZDIM:
				return getZDim();
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
			case FinalPackage.IFC_BOUNDING_BOX__CORNER:
				setCorner((CornerType)newValue);
				return;
			case FinalPackage.IFC_BOUNDING_BOX__XDIM:
				setXDim((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDING_BOX__YDIM:
				setYDim((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDING_BOX__ZDIM:
				setZDim((Double)newValue);
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
			case FinalPackage.IFC_BOUNDING_BOX__CORNER:
				setCorner((CornerType)null);
				return;
			case FinalPackage.IFC_BOUNDING_BOX__XDIM:
				setXDim(XDIM_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDING_BOX__YDIM:
				setYDim(YDIM_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDING_BOX__ZDIM:
				setZDim(ZDIM_EDEFAULT);
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
			case FinalPackage.IFC_BOUNDING_BOX__CORNER:
				return corner != null;
			case FinalPackage.IFC_BOUNDING_BOX__XDIM:
				return xDim != XDIM_EDEFAULT;
			case FinalPackage.IFC_BOUNDING_BOX__YDIM:
				return yDim != YDIM_EDEFAULT;
			case FinalPackage.IFC_BOUNDING_BOX__ZDIM:
				return zDim != ZDIM_EDEFAULT;
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
		result.append(" (xDim: ");
		result.append(xDim);
		result.append(", yDim: ");
		result.append(yDim);
		result.append(", zDim: ");
		result.append(zDim);
		result.append(')');
		return result.toString();
	}

} //IfcBoundingBoxImpl
