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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationNotation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationNotationSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Notation Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcClassificationNotationSelectImpl#getIfcClassificationNotation <em>Ifc Classification Notation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcClassificationNotationSelectImpl#getIfcClassificationReference <em>Ifc Classification Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationNotationSelectImpl extends EObjectImpl implements IfcClassificationNotationSelect {
	/**
	 * The cached value of the '{@link #getIfcClassificationNotation() <em>Ifc Classification Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcClassificationNotation()
	 * @generated
	 * @ordered
	 */
	protected IfcClassificationNotation ifcClassificationNotation;

	/**
	 * The cached value of the '{@link #getIfcClassificationReference() <em>Ifc Classification Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcClassificationReference()
	 * @generated
	 * @ordered
	 */
	protected IfcClassificationReference ifcClassificationReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationNotationSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcClassificationNotationSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotation getIfcClassificationNotation() {
		return ifcClassificationNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcClassificationNotation(IfcClassificationNotation newIfcClassificationNotation, NotificationChain msgs) {
		IfcClassificationNotation oldIfcClassificationNotation = ifcClassificationNotation;
		ifcClassificationNotation = newIfcClassificationNotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_NOTATION, oldIfcClassificationNotation, newIfcClassificationNotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcClassificationNotation(IfcClassificationNotation newIfcClassificationNotation) {
		if (newIfcClassificationNotation != ifcClassificationNotation) {
			NotificationChain msgs = null;
			if (ifcClassificationNotation != null)
				msgs = ((InternalEObject)ifcClassificationNotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_NOTATION, null, msgs);
			if (newIfcClassificationNotation != null)
				msgs = ((InternalEObject)newIfcClassificationNotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_NOTATION, null, msgs);
			msgs = basicSetIfcClassificationNotation(newIfcClassificationNotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_NOTATION, newIfcClassificationNotation, newIfcClassificationNotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationReference getIfcClassificationReference() {
		return ifcClassificationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcClassificationReference(IfcClassificationReference newIfcClassificationReference, NotificationChain msgs) {
		IfcClassificationReference oldIfcClassificationReference = ifcClassificationReference;
		ifcClassificationReference = newIfcClassificationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_REFERENCE, oldIfcClassificationReference, newIfcClassificationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcClassificationReference(IfcClassificationReference newIfcClassificationReference) {
		if (newIfcClassificationReference != ifcClassificationReference) {
			NotificationChain msgs = null;
			if (ifcClassificationReference != null)
				msgs = ((InternalEObject)ifcClassificationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_REFERENCE, null, msgs);
			if (newIfcClassificationReference != null)
				msgs = ((InternalEObject)newIfcClassificationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_REFERENCE, null, msgs);
			msgs = basicSetIfcClassificationReference(newIfcClassificationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_REFERENCE, newIfcClassificationReference, newIfcClassificationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_NOTATION:
				return basicSetIfcClassificationNotation(null, msgs);
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_REFERENCE:
				return basicSetIfcClassificationReference(null, msgs);
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
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_NOTATION:
				return getIfcClassificationNotation();
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_REFERENCE:
				return getIfcClassificationReference();
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
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_NOTATION:
				setIfcClassificationNotation((IfcClassificationNotation)newValue);
				return;
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_REFERENCE:
				setIfcClassificationReference((IfcClassificationReference)newValue);
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
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_NOTATION:
				setIfcClassificationNotation((IfcClassificationNotation)null);
				return;
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_REFERENCE:
				setIfcClassificationReference((IfcClassificationReference)null);
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
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_NOTATION:
				return ifcClassificationNotation != null;
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT__IFC_CLASSIFICATION_REFERENCE:
				return ifcClassificationReference != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcClassificationNotationSelectImpl
