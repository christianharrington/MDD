/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCovering;
import ifc2x3tc1.IfcRelCoversSpaces;
import ifc2x3tc1.IfcSpace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Covers Spaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelCoversSpacesImpl#getRelatedSpace <em>Related Space</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelCoversSpacesImpl#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelCoversSpacesImpl extends IfcRelConnectsImpl implements IfcRelCoversSpaces {
	/**
	 * The cached value of the '{@link #getRelatedSpace() <em>Related Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedSpace()
	 * @generated
	 * @ordered
	 */
	protected IfcSpace relatedSpace;

	/**
	 * The cached value of the '{@link #getRelatedCoverings() <em>Related Coverings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedCoverings()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcCovering> relatedCoverings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelCoversSpacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelCoversSpaces();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpace getRelatedSpace() {
		if (relatedSpace != null && relatedSpace.eIsProxy()) {
			InternalEObject oldRelatedSpace = (InternalEObject)relatedSpace;
			relatedSpace = (IfcSpace)eResolveProxy(oldRelatedSpace);
			if (relatedSpace != oldRelatedSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_SPACE, oldRelatedSpace, relatedSpace));
			}
		}
		return relatedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpace basicGetRelatedSpace() {
		return relatedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedSpace(IfcSpace newRelatedSpace, NotificationChain msgs) {
		IfcSpace oldRelatedSpace = relatedSpace;
		relatedSpace = newRelatedSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_SPACE, oldRelatedSpace, newRelatedSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedSpace(IfcSpace newRelatedSpace) {
		if (newRelatedSpace != relatedSpace) {
			NotificationChain msgs = null;
			if (relatedSpace != null)
				msgs = ((InternalEObject)relatedSpace).eInverseRemove(this, Ifc2x3tc1Package.IFC_SPACE__HAS_COVERINGS, IfcSpace.class, msgs);
			if (newRelatedSpace != null)
				msgs = ((InternalEObject)newRelatedSpace).eInverseAdd(this, Ifc2x3tc1Package.IFC_SPACE__HAS_COVERINGS, IfcSpace.class, msgs);
			msgs = basicSetRelatedSpace(newRelatedSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_SPACE, newRelatedSpace, newRelatedSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCovering> getRelatedCoverings() {
		if (relatedCoverings == null) {
			relatedCoverings = new EObjectWithInverseResolvingEList.ManyInverse<IfcCovering>(IfcCovering.class, this, Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_COVERINGS, Ifc2x3tc1Package.IFC_COVERING__COVERS_SPACES);
		}
		return relatedCoverings;
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_SPACE:
				if (relatedSpace != null)
					msgs = ((InternalEObject)relatedSpace).eInverseRemove(this, Ifc2x3tc1Package.IFC_SPACE__HAS_COVERINGS, IfcSpace.class, msgs);
				return basicSetRelatedSpace((IfcSpace)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_COVERINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedCoverings()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_SPACE:
				return basicSetRelatedSpace(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_COVERINGS:
				return ((InternalEList<?>)getRelatedCoverings()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_SPACE:
				if (resolve) return getRelatedSpace();
				return basicGetRelatedSpace();
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_COVERINGS:
				return getRelatedCoverings();
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_SPACE:
				setRelatedSpace((IfcSpace)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_COVERINGS:
				getRelatedCoverings().clear();
				getRelatedCoverings().addAll((Collection<? extends IfcCovering>)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_SPACE:
				setRelatedSpace((IfcSpace)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_COVERINGS:
				getRelatedCoverings().clear();
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
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_SPACE:
				return relatedSpace != null;
			case Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_COVERINGS:
				return relatedCoverings != null && !relatedCoverings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcRelCoversSpacesImpl
