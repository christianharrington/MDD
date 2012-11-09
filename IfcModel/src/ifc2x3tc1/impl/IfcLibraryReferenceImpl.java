/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcLibraryInformation;
import ifc2x3tc1.IfcLibraryReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Library Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLibraryReferenceImpl#getReferenceIntoLibrary <em>Reference Into Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLibraryReferenceImpl extends IfcExternalReferenceImpl implements IfcLibraryReference {
	/**
	 * The cached value of the '{@link #getReferenceIntoLibrary() <em>Reference Into Library</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceIntoLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcLibraryInformation> referenceIntoLibrary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLibraryReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcLibraryReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLibraryInformation> getReferenceIntoLibrary() {
		if (referenceIntoLibrary == null) {
			referenceIntoLibrary = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcLibraryInformation>(IfcLibraryInformation.class, this, Ifc2x3tc1Package.IFC_LIBRARY_REFERENCE__REFERENCE_INTO_LIBRARY, Ifc2x3tc1Package.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE);
		}
		return referenceIntoLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferenceIntoLibrary() {
		if (referenceIntoLibrary != null) ((InternalEList.Unsettable<?>)referenceIntoLibrary).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferenceIntoLibrary() {
		return referenceIntoLibrary != null && ((InternalEList.Unsettable<?>)referenceIntoLibrary).isSet();
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
			case Ifc2x3tc1Package.IFC_LIBRARY_REFERENCE__REFERENCE_INTO_LIBRARY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferenceIntoLibrary()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_LIBRARY_REFERENCE__REFERENCE_INTO_LIBRARY:
				return ((InternalEList<?>)getReferenceIntoLibrary()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_LIBRARY_REFERENCE__REFERENCE_INTO_LIBRARY:
				return getReferenceIntoLibrary();
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
			case Ifc2x3tc1Package.IFC_LIBRARY_REFERENCE__REFERENCE_INTO_LIBRARY:
				getReferenceIntoLibrary().clear();
				getReferenceIntoLibrary().addAll((Collection<? extends IfcLibraryInformation>)newValue);
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
			case Ifc2x3tc1Package.IFC_LIBRARY_REFERENCE__REFERENCE_INTO_LIBRARY:
				unsetReferenceIntoLibrary();
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
			case Ifc2x3tc1Package.IFC_LIBRARY_REFERENCE__REFERENCE_INTO_LIBRARY:
				return isSetReferenceIntoLibrary();
		}
		return super.eIsSet(featureID);
	}

} //IfcLibraryReferenceImpl
