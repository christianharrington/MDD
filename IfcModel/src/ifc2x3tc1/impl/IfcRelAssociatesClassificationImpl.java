/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcClassificationNotationSelect;
import ifc2x3tc1.IfcRelAssociatesClassification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssociatesClassificationImpl#getRelatingClassification <em>Relating Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesClassificationImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesClassification {
	/**
	 * The cached value of the '{@link #getRelatingClassification() <em>Relating Classification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingClassification()
	 * @generated
	 * @ordered
	 */
	protected IfcClassificationNotationSelect relatingClassification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssociatesClassification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotationSelect getRelatingClassification() {
		if (relatingClassification != null && relatingClassification.eIsProxy()) {
			InternalEObject oldRelatingClassification = (InternalEObject)relatingClassification;
			relatingClassification = (IfcClassificationNotationSelect)eResolveProxy(oldRelatingClassification);
			if (relatingClassification != oldRelatingClassification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION, oldRelatingClassification, relatingClassification));
			}
		}
		return relatingClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotationSelect basicGetRelatingClassification() {
		return relatingClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingClassification(IfcClassificationNotationSelect newRelatingClassification) {
		IfcClassificationNotationSelect oldRelatingClassification = relatingClassification;
		relatingClassification = newRelatingClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION, oldRelatingClassification, relatingClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION:
				if (resolve) return getRelatingClassification();
				return basicGetRelatingClassification();
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION:
				setRelatingClassification((IfcClassificationNotationSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION:
				setRelatingClassification((IfcClassificationNotationSelect)null);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CLASSIFICATION__RELATING_CLASSIFICATION:
				return relatingClassification != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesClassificationImpl
