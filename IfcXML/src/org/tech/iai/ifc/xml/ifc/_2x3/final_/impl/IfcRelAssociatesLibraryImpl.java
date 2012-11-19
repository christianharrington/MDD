/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesLibrary;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingLibraryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssociatesLibraryImpl#getRelatingLibrary <em>Relating Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesLibraryImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesLibrary {
	/**
	 * The cached value of the '{@link #getRelatingLibrary() <em>Relating Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingLibrary()
	 * @generated
	 * @ordered
	 */
	protected RelatingLibraryType relatingLibrary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelAssociatesLibrary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingLibraryType getRelatingLibrary() {
		return relatingLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingLibrary(RelatingLibraryType newRelatingLibrary, NotificationChain msgs) {
		RelatingLibraryType oldRelatingLibrary = relatingLibrary;
		relatingLibrary = newRelatingLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY, oldRelatingLibrary, newRelatingLibrary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingLibrary(RelatingLibraryType newRelatingLibrary) {
		if (newRelatingLibrary != relatingLibrary) {
			NotificationChain msgs = null;
			if (relatingLibrary != null)
				msgs = ((InternalEObject)relatingLibrary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY, null, msgs);
			if (newRelatingLibrary != null)
				msgs = ((InternalEObject)newRelatingLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY, null, msgs);
			msgs = basicSetRelatingLibrary(newRelatingLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY, newRelatingLibrary, newRelatingLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY:
				return basicSetRelatingLibrary(null, msgs);
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
			case FinalPackage.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY:
				return getRelatingLibrary();
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
			case FinalPackage.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY:
				setRelatingLibrary((RelatingLibraryType)newValue);
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
			case FinalPackage.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY:
				setRelatingLibrary((RelatingLibraryType)null);
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
			case FinalPackage.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY:
				return relatingLibrary != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesLibraryImpl
