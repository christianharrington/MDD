/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingSpaceProgramType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Space Program Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingSpaceProgramTypeImpl#getIfcSpaceProgram <em>Ifc Space Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingSpaceProgramTypeImpl extends EObjectImpl implements RelatingSpaceProgramType {
	/**
	 * The cached value of the '{@link #getIfcSpaceProgram() <em>Ifc Space Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSpaceProgram()
	 * @generated
	 * @ordered
	 */
	protected IfcSpaceProgram ifcSpaceProgram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingSpaceProgramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingSpaceProgramType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceProgram getIfcSpaceProgram() {
		return ifcSpaceProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSpaceProgram(IfcSpaceProgram newIfcSpaceProgram, NotificationChain msgs) {
		IfcSpaceProgram oldIfcSpaceProgram = ifcSpaceProgram;
		ifcSpaceProgram = newIfcSpaceProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_SPACE_PROGRAM_TYPE__IFC_SPACE_PROGRAM, oldIfcSpaceProgram, newIfcSpaceProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSpaceProgram(IfcSpaceProgram newIfcSpaceProgram) {
		if (newIfcSpaceProgram != ifcSpaceProgram) {
			NotificationChain msgs = null;
			if (ifcSpaceProgram != null)
				msgs = ((InternalEObject)ifcSpaceProgram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_SPACE_PROGRAM_TYPE__IFC_SPACE_PROGRAM, null, msgs);
			if (newIfcSpaceProgram != null)
				msgs = ((InternalEObject)newIfcSpaceProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_SPACE_PROGRAM_TYPE__IFC_SPACE_PROGRAM, null, msgs);
			msgs = basicSetIfcSpaceProgram(newIfcSpaceProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_SPACE_PROGRAM_TYPE__IFC_SPACE_PROGRAM, newIfcSpaceProgram, newIfcSpaceProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_SPACE_PROGRAM_TYPE__IFC_SPACE_PROGRAM:
				return basicSetIfcSpaceProgram(null, msgs);
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
			case FinalPackage.RELATING_SPACE_PROGRAM_TYPE__IFC_SPACE_PROGRAM:
				return getIfcSpaceProgram();
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
			case FinalPackage.RELATING_SPACE_PROGRAM_TYPE__IFC_SPACE_PROGRAM:
				setIfcSpaceProgram((IfcSpaceProgram)newValue);
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
			case FinalPackage.RELATING_SPACE_PROGRAM_TYPE__IFC_SPACE_PROGRAM:
				setIfcSpaceProgram((IfcSpaceProgram)null);
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
			case FinalPackage.RELATING_SPACE_PROGRAM_TYPE__IFC_SPACE_PROGRAM:
				return ifcSpaceProgram != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatingSpaceProgramTypeImpl
