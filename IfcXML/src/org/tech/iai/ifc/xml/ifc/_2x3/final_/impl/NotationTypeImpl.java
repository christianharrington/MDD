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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationNotationFacet;
import org.tech.iai.ifc.xml.ifc._2x3.final_.NotationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.NotationTypeImpl#getIfcClassificationNotationFacet <em>Ifc Classification Notation Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotationTypeImpl extends EObjectImpl implements NotationType {
	/**
	 * The cached value of the '{@link #getIfcClassificationNotationFacet() <em>Ifc Classification Notation Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcClassificationNotationFacet()
	 * @generated
	 * @ordered
	 */
	protected IfcClassificationNotationFacet ifcClassificationNotationFacet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getNotationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotationFacet getIfcClassificationNotationFacet() {
		return ifcClassificationNotationFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcClassificationNotationFacet(IfcClassificationNotationFacet newIfcClassificationNotationFacet, NotificationChain msgs) {
		IfcClassificationNotationFacet oldIfcClassificationNotationFacet = ifcClassificationNotationFacet;
		ifcClassificationNotationFacet = newIfcClassificationNotationFacet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.NOTATION_TYPE__IFC_CLASSIFICATION_NOTATION_FACET, oldIfcClassificationNotationFacet, newIfcClassificationNotationFacet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcClassificationNotationFacet(IfcClassificationNotationFacet newIfcClassificationNotationFacet) {
		if (newIfcClassificationNotationFacet != ifcClassificationNotationFacet) {
			NotificationChain msgs = null;
			if (ifcClassificationNotationFacet != null)
				msgs = ((InternalEObject)ifcClassificationNotationFacet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.NOTATION_TYPE__IFC_CLASSIFICATION_NOTATION_FACET, null, msgs);
			if (newIfcClassificationNotationFacet != null)
				msgs = ((InternalEObject)newIfcClassificationNotationFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.NOTATION_TYPE__IFC_CLASSIFICATION_NOTATION_FACET, null, msgs);
			msgs = basicSetIfcClassificationNotationFacet(newIfcClassificationNotationFacet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.NOTATION_TYPE__IFC_CLASSIFICATION_NOTATION_FACET, newIfcClassificationNotationFacet, newIfcClassificationNotationFacet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.NOTATION_TYPE__IFC_CLASSIFICATION_NOTATION_FACET:
				return basicSetIfcClassificationNotationFacet(null, msgs);
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
			case FinalPackage.NOTATION_TYPE__IFC_CLASSIFICATION_NOTATION_FACET:
				return getIfcClassificationNotationFacet();
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
			case FinalPackage.NOTATION_TYPE__IFC_CLASSIFICATION_NOTATION_FACET:
				setIfcClassificationNotationFacet((IfcClassificationNotationFacet)newValue);
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
			case FinalPackage.NOTATION_TYPE__IFC_CLASSIFICATION_NOTATION_FACET:
				setIfcClassificationNotationFacet((IfcClassificationNotationFacet)null);
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
			case FinalPackage.NOTATION_TYPE__IFC_CLASSIFICATION_NOTATION_FACET:
				return ifcClassificationNotationFacet != null;
		}
		return super.eIsSet(featureID);
	}

} //NotationTypeImpl
