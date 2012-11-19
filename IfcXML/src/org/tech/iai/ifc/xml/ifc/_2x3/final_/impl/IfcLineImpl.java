/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DirType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLine;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PntType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLineImpl#getPnt <em>Pnt</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLineImpl#getDir <em>Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLineImpl extends IfcCurveImpl implements IfcLine {
	/**
	 * The cached value of the '{@link #getPnt() <em>Pnt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPnt()
	 * @generated
	 * @ordered
	 */
	protected PntType pnt;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected DirType dir;

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
		return FinalPackage.eINSTANCE.getIfcLine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PntType getPnt() {
		return pnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPnt(PntType newPnt, NotificationChain msgs) {
		PntType oldPnt = pnt;
		pnt = newPnt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LINE__PNT, oldPnt, newPnt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPnt(PntType newPnt) {
		if (newPnt != pnt) {
			NotificationChain msgs = null;
			if (pnt != null)
				msgs = ((InternalEObject)pnt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LINE__PNT, null, msgs);
			if (newPnt != null)
				msgs = ((InternalEObject)newPnt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LINE__PNT, null, msgs);
			msgs = basicSetPnt(newPnt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LINE__PNT, newPnt, newPnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDir(DirType newDir, NotificationChain msgs) {
		DirType oldDir = dir;
		dir = newDir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LINE__DIR, oldDir, newDir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(DirType newDir) {
		if (newDir != dir) {
			NotificationChain msgs = null;
			if (dir != null)
				msgs = ((InternalEObject)dir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LINE__DIR, null, msgs);
			if (newDir != null)
				msgs = ((InternalEObject)newDir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LINE__DIR, null, msgs);
			msgs = basicSetDir(newDir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LINE__DIR, newDir, newDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LINE__PNT:
				return basicSetPnt(null, msgs);
			case FinalPackage.IFC_LINE__DIR:
				return basicSetDir(null, msgs);
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
			case FinalPackage.IFC_LINE__PNT:
				return getPnt();
			case FinalPackage.IFC_LINE__DIR:
				return getDir();
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
			case FinalPackage.IFC_LINE__PNT:
				setPnt((PntType)newValue);
				return;
			case FinalPackage.IFC_LINE__DIR:
				setDir((DirType)newValue);
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
			case FinalPackage.IFC_LINE__PNT:
				setPnt((PntType)null);
				return;
			case FinalPackage.IFC_LINE__DIR:
				setDir((DirType)null);
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
			case FinalPackage.IFC_LINE__PNT:
				return pnt != null;
			case FinalPackage.IFC_LINE__DIR:
				return dir != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcLineImpl
