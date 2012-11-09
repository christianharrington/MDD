/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCovering;
import ifc2x3tc1.IfcCoveringTypeEnum;
import ifc2x3tc1.IfcRelCoversBldgElements;
import ifc2x3tc1.IfcRelCoversSpaces;

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
 * An implementation of the model object '<em><b>Ifc Covering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCoveringImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCoveringImpl#getCoversSpaces <em>Covers Spaces</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCoveringImpl#getCovers <em>Covers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCoveringImpl extends IfcBuildingElementImpl implements IfcCovering {
	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcCoveringTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcCoveringTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcCoveringTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * This is true if the Predefined Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean predefinedTypeESet;

	/**
	 * The cached value of the '{@link #getCoversSpaces() <em>Covers Spaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoversSpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelCoversSpaces> coversSpaces;

	/**
	 * The cached value of the '{@link #getCovers() <em>Covers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovers()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelCoversBldgElements> covers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCoveringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCovering();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoveringTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcCoveringTypeEnum newPredefinedType) {
		IfcCoveringTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		boolean oldPredefinedTypeESet = predefinedTypeESet;
		predefinedTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COVERING__PREDEFINED_TYPE, oldPredefinedType, predefinedType, !oldPredefinedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		IfcCoveringTypeEnum oldPredefinedType = predefinedType;
		boolean oldPredefinedTypeESet = predefinedTypeESet;
		predefinedType = PREDEFINED_TYPE_EDEFAULT;
		predefinedTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_COVERING__PREDEFINED_TYPE, oldPredefinedType, PREDEFINED_TYPE_EDEFAULT, oldPredefinedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return predefinedTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelCoversSpaces> getCoversSpaces() {
		if (coversSpaces == null) {
			coversSpaces = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcRelCoversSpaces>(IfcRelCoversSpaces.class, this, Ifc2x3tc1Package.IFC_COVERING__COVERS_SPACES, Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_COVERINGS);
		}
		return coversSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoversSpaces() {
		if (coversSpaces != null) ((InternalEList.Unsettable<?>)coversSpaces).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoversSpaces() {
		return coversSpaces != null && ((InternalEList.Unsettable<?>)coversSpaces).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelCoversBldgElements> getCovers() {
		if (covers == null) {
			covers = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcRelCoversBldgElements>(IfcRelCoversBldgElements.class, this, Ifc2x3tc1Package.IFC_COVERING__COVERS, Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS);
		}
		return covers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCovers() {
		if (covers != null) ((InternalEList.Unsettable<?>)covers).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCovers() {
		return covers != null && ((InternalEList.Unsettable<?>)covers).isSet();
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
			case Ifc2x3tc1Package.IFC_COVERING__COVERS_SPACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoversSpaces()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_COVERING__COVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCovers()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_COVERING__COVERS_SPACES:
				return ((InternalEList<?>)getCoversSpaces()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_COVERING__COVERS:
				return ((InternalEList<?>)getCovers()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_COVERING__PREDEFINED_TYPE:
				return getPredefinedType();
			case Ifc2x3tc1Package.IFC_COVERING__COVERS_SPACES:
				return getCoversSpaces();
			case Ifc2x3tc1Package.IFC_COVERING__COVERS:
				return getCovers();
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
			case Ifc2x3tc1Package.IFC_COVERING__PREDEFINED_TYPE:
				setPredefinedType((IfcCoveringTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COVERING__COVERS_SPACES:
				getCoversSpaces().clear();
				getCoversSpaces().addAll((Collection<? extends IfcRelCoversSpaces>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COVERING__COVERS:
				getCovers().clear();
				getCovers().addAll((Collection<? extends IfcRelCoversBldgElements>)newValue);
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
			case Ifc2x3tc1Package.IFC_COVERING__PREDEFINED_TYPE:
				unsetPredefinedType();
				return;
			case Ifc2x3tc1Package.IFC_COVERING__COVERS_SPACES:
				unsetCoversSpaces();
				return;
			case Ifc2x3tc1Package.IFC_COVERING__COVERS:
				unsetCovers();
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
			case Ifc2x3tc1Package.IFC_COVERING__PREDEFINED_TYPE:
				return isSetPredefinedType();
			case Ifc2x3tc1Package.IFC_COVERING__COVERS_SPACES:
				return isSetCoversSpaces();
			case Ifc2x3tc1Package.IFC_COVERING__COVERS:
				return isSetCovers();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (PredefinedType: ");
		if (predefinedTypeESet) result.append(predefinedType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcCoveringImpl
