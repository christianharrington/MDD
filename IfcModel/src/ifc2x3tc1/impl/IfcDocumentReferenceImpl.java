/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDocumentInformation;
import ifc2x3tc1.IfcDocumentReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Document Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDocumentReferenceImpl#getReferenceToDocument <em>Reference To Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDocumentReferenceImpl extends IfcExternalReferenceImpl implements IfcDocumentReference {
	/**
	 * The cached value of the '{@link #getReferenceToDocument() <em>Reference To Document</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceToDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDocumentInformation> referenceToDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDocumentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDocumentReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDocumentInformation> getReferenceToDocument() {
		if (referenceToDocument == null) {
			referenceToDocument = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcDocumentInformation>(IfcDocumentInformation.class, this, Ifc2x3tc1Package.IFC_DOCUMENT_REFERENCE__REFERENCE_TO_DOCUMENT, Ifc2x3tc1Package.IFC_DOCUMENT_INFORMATION__DOCUMENT_REFERENCES);
		}
		return referenceToDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferenceToDocument() {
		if (referenceToDocument != null) ((InternalEList.Unsettable<?>)referenceToDocument).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferenceToDocument() {
		return referenceToDocument != null && ((InternalEList.Unsettable<?>)referenceToDocument).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DOCUMENT_REFERENCE__REFERENCE_TO_DOCUMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferenceToDocument()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DOCUMENT_REFERENCE__REFERENCE_TO_DOCUMENT:
				return ((InternalEList<?>)getReferenceToDocument()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_REFERENCE__REFERENCE_TO_DOCUMENT:
				return getReferenceToDocument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DOCUMENT_REFERENCE__REFERENCE_TO_DOCUMENT:
				getReferenceToDocument().clear();
				getReferenceToDocument().addAll((Collection<? extends IfcDocumentInformation>)newValue);
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_REFERENCE__REFERENCE_TO_DOCUMENT:
				unsetReferenceToDocument();
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
			case Ifc2x3tc1Package.IFC_DOCUMENT_REFERENCE__REFERENCE_TO_DOCUMENT:
				return isSetReferenceToDocument();
		}
		return super.eIsSet(featureID);
	}

} //IfcDocumentReferenceImpl
