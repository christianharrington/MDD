/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcClassification;
import ifc2x3tc1.IfcClassificationReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationReferenceImpl#getReferencedSource <em>Referenced Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationReferenceImpl extends IfcExternalReferenceImpl implements IfcClassificationReference {
	/**
	 * The cached value of the '{@link #getReferencedSource() <em>Referenced Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedSource()
	 * @generated
	 * @ordered
	 */
	protected IfcClassification referencedSource;

	/**
	 * This is true if the Referenced Source reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referencedSourceESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcClassificationReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassification getReferencedSource() {
		if (referencedSource != null && referencedSource.eIsProxy()) {
			InternalEObject oldReferencedSource = (InternalEObject)referencedSource;
			referencedSource = (IfcClassification)eResolveProxy(oldReferencedSource);
			if (referencedSource != oldReferencedSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE, oldReferencedSource, referencedSource));
			}
		}
		return referencedSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassification basicGetReferencedSource() {
		return referencedSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedSource(IfcClassification newReferencedSource) {
		IfcClassification oldReferencedSource = referencedSource;
		referencedSource = newReferencedSource;
		boolean oldReferencedSourceESet = referencedSourceESet;
		referencedSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE, oldReferencedSource, referencedSource, !oldReferencedSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferencedSource() {
		IfcClassification oldReferencedSource = referencedSource;
		boolean oldReferencedSourceESet = referencedSourceESet;
		referencedSource = null;
		referencedSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE, oldReferencedSource, null, oldReferencedSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencedSource() {
		return referencedSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE:
				if (resolve) return getReferencedSource();
				return basicGetReferencedSource();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE:
				setReferencedSource((IfcClassification)newValue);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE:
				unsetReferencedSource();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION_REFERENCE__REFERENCED_SOURCE:
				return isSetReferencedSource();
		}
		return super.eIsSet(featureID);
	}

} //IfcClassificationReferenceImpl
