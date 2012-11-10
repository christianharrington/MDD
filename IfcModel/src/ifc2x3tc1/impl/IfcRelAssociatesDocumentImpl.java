/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDocumentSelect;
import ifc2x3tc1.IfcRelAssociatesDocument;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssociatesDocumentImpl#getRelatingDocument <em>Relating Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesDocumentImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesDocument {
	/**
	 * The cached value of the '{@link #getRelatingDocument() <em>Relating Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingDocument()
	 * @generated
	 * @ordered
	 */
	protected IfcDocumentSelect relatingDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssociatesDocument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentSelect getRelatingDocument() {
		if (relatingDocument != null && relatingDocument.eIsProxy()) {
			InternalEObject oldRelatingDocument = (InternalEObject)relatingDocument;
			relatingDocument = (IfcDocumentSelect)eResolveProxy(oldRelatingDocument);
			if (relatingDocument != oldRelatingDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_DOCUMENT__RELATING_DOCUMENT, oldRelatingDocument, relatingDocument));
			}
		}
		return relatingDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentSelect basicGetRelatingDocument() {
		return relatingDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingDocument(IfcDocumentSelect newRelatingDocument) {
		IfcDocumentSelect oldRelatingDocument = relatingDocument;
		relatingDocument = newRelatingDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_DOCUMENT__RELATING_DOCUMENT, oldRelatingDocument, relatingDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_DOCUMENT__RELATING_DOCUMENT:
				if (resolve) return getRelatingDocument();
				return basicGetRelatingDocument();
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_DOCUMENT__RELATING_DOCUMENT:
				setRelatingDocument((IfcDocumentSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_DOCUMENT__RELATING_DOCUMENT:
				setRelatingDocument((IfcDocumentSelect)null);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_DOCUMENT__RELATING_DOCUMENT:
				return relatingDocument != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesDocumentImpl
