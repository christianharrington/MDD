/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcLibrarySelect;
import ifc2x3tc1.IfcRelAssociatesLibrary;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssociatesLibraryImpl#getRelatingLibrary <em>Relating Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesLibraryImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesLibrary {
	/**
	 * The cached value of the '{@link #getRelatingLibrary() <em>Relating Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingLibrary()
	 * @generated
	 * @ordered
	 */
	protected IfcLibrarySelect relatingLibrary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssociatesLibrary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLibrarySelect getRelatingLibrary() {
		if (relatingLibrary != null && relatingLibrary.eIsProxy()) {
			InternalEObject oldRelatingLibrary = (InternalEObject)relatingLibrary;
			relatingLibrary = (IfcLibrarySelect)eResolveProxy(oldRelatingLibrary);
			if (relatingLibrary != oldRelatingLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY, oldRelatingLibrary, relatingLibrary));
			}
		}
		return relatingLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLibrarySelect basicGetRelatingLibrary() {
		return relatingLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingLibrary(IfcLibrarySelect newRelatingLibrary) {
		IfcLibrarySelect oldRelatingLibrary = relatingLibrary;
		relatingLibrary = newRelatingLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY, oldRelatingLibrary, relatingLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY:
				if (resolve) return getRelatingLibrary();
				return basicGetRelatingLibrary();
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY:
				setRelatingLibrary((IfcLibrarySelect)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY:
				setRelatingLibrary((IfcLibrarySelect)null);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_LIBRARY__RELATING_LIBRARY:
				return relatingLibrary != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesLibraryImpl
