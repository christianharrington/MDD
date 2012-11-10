/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCartesianPoint;
import ifc2x3tc1.IfcLine;
import ifc2x3tc1.IfcVector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLineImpl#getPnt <em>Pnt</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLineImpl#getDir <em>Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLineImpl extends IfcCurveImpl implements IfcLine {
	/**
	 * The cached value of the '{@link #getPnt() <em>Pnt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPnt()
	 * @generated
	 * @ordered
	 */
	protected IfcCartesianPoint pnt;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected IfcVector dir;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcLine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getPnt() {
		if (pnt != null && pnt.eIsProxy()) {
			InternalEObject oldPnt = (InternalEObject)pnt;
			pnt = (IfcCartesianPoint)eResolveProxy(oldPnt);
			if (pnt != oldPnt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LINE__PNT, oldPnt, pnt));
			}
		}
		return pnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint basicGetPnt() {
		return pnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPnt(IfcCartesianPoint newPnt) {
		IfcCartesianPoint oldPnt = pnt;
		pnt = newPnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LINE__PNT, oldPnt, pnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVector getDir() {
		if (dir != null && dir.eIsProxy()) {
			InternalEObject oldDir = (InternalEObject)dir;
			dir = (IfcVector)eResolveProxy(oldDir);
			if (dir != oldDir) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LINE__DIR, oldDir, dir));
			}
		}
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVector basicGetDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(IfcVector newDir) {
		IfcVector oldDir = dir;
		dir = newDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LINE__DIR, oldDir, dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_LINE__PNT:
				if (resolve) return getPnt();
				return basicGetPnt();
			case Ifc2x3tc1Package.IFC_LINE__DIR:
				if (resolve) return getDir();
				return basicGetDir();
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
			case Ifc2x3tc1Package.IFC_LINE__PNT:
				setPnt((IfcCartesianPoint)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LINE__DIR:
				setDir((IfcVector)newValue);
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
			case Ifc2x3tc1Package.IFC_LINE__PNT:
				setPnt((IfcCartesianPoint)null);
				return;
			case Ifc2x3tc1Package.IFC_LINE__DIR:
				setDir((IfcVector)null);
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
			case Ifc2x3tc1Package.IFC_LINE__PNT:
				return pnt != null;
			case Ifc2x3tc1Package.IFC_LINE__DIR:
				return dir != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcLineImpl
