/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationNotation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.NotationFacetsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Notation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcClassificationNotationImpl#getNotationFacets <em>Notation Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationNotationImpl extends EntityImpl implements IfcClassificationNotation {
	/**
	 * The cached value of the '{@link #getNotationFacets() <em>Notation Facets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationFacets()
	 * @generated
	 * @ordered
	 */
	protected NotationFacetsType notationFacets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationNotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcClassificationNotation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationFacetsType getNotationFacets() {
		return notationFacets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotationFacets(NotationFacetsType newNotationFacets, NotificationChain msgs) {
		NotationFacetsType oldNotationFacets = notationFacets;
		notationFacets = newNotationFacets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS, oldNotationFacets, newNotationFacets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotationFacets(NotationFacetsType newNotationFacets) {
		if (newNotationFacets != notationFacets) {
			NotificationChain msgs = null;
			if (notationFacets != null)
				msgs = ((InternalEObject)notationFacets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS, null, msgs);
			if (newNotationFacets != null)
				msgs = ((InternalEObject)newNotationFacets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS, null, msgs);
			msgs = basicSetNotationFacets(newNotationFacets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS, newNotationFacets, newNotationFacets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS:
				return basicSetNotationFacets(null, msgs);
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
			case FinalPackage.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS:
				return getNotationFacets();
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
			case FinalPackage.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS:
				setNotationFacets((NotationFacetsType)newValue);
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
			case FinalPackage.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS:
				setNotationFacets((NotationFacetsType)null);
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
			case FinalPackage.IFC_CLASSIFICATION_NOTATION__NOTATION_FACETS:
				return notationFacets != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcClassificationNotationImpl
