/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationReference;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ReferencedSourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcClassificationReferenceImpl#getReferencedSource <em>Referenced Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationReferenceImpl extends IfcExternalReferenceImpl implements IfcClassificationReference {
	/**
	 * The cached value of the '{@link #getReferencedSource() <em>Referenced Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedSource()
	 * @generated
	 * @ordered
	 */
	protected ReferencedSourceType referencedSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcClassificationReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedSourceType getReferencedSource() {
		return referencedSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedSource(ReferencedSourceType newReferencedSource, NotificationChain msgs) {
		ReferencedSourceType oldReferencedSource = referencedSource;
		referencedSource = newReferencedSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE, oldReferencedSource, newReferencedSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedSource(ReferencedSourceType newReferencedSource) {
		if (newReferencedSource != referencedSource) {
			NotificationChain msgs = null;
			if (referencedSource != null)
				msgs = ((InternalEObject)referencedSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE, null, msgs);
			if (newReferencedSource != null)
				msgs = ((InternalEObject)newReferencedSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE, null, msgs);
			msgs = basicSetReferencedSource(newReferencedSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE, newReferencedSource, newReferencedSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE:
				return basicSetReferencedSource(null, msgs);
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
			case FinalPackage.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE:
				return getReferencedSource();
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
			case FinalPackage.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE:
				setReferencedSource((ReferencedSourceType)newValue);
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
			case FinalPackage.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE:
				setReferencedSource((ReferencedSourceType)null);
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
			case FinalPackage.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE:
				return referencedSource != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcClassificationReferenceImpl
