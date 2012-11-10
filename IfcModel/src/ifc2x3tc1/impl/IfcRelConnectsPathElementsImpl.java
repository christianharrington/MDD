/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConnectionTypeEnum;
import ifc2x3tc1.IfcRelConnectsPathElements;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Path Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsPathElementsImpl#getRelatingPriorities <em>Relating Priorities</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsPathElementsImpl#getRelatedPriorities <em>Related Priorities</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsPathElementsImpl#getRelatedConnectionType <em>Related Connection Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsPathElementsImpl#getRelatingConnectionType <em>Relating Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsPathElementsImpl extends IfcRelConnectsElementsImpl implements IfcRelConnectsPathElements {
	/**
	 * The cached value of the '{@link #getRelatingPriorities() <em>Relating Priorities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingPriorities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> relatingPriorities;

	/**
	 * The cached value of the '{@link #getRelatedPriorities() <em>Related Priorities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedPriorities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> relatedPriorities;

	/**
	 * The default value of the '{@link #getRelatedConnectionType() <em>Related Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcConnectionTypeEnum RELATED_CONNECTION_TYPE_EDEFAULT = IfcConnectionTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getRelatedConnectionType() <em>Related Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedConnectionType()
	 * @generated
	 * @ordered
	 */
	protected IfcConnectionTypeEnum relatedConnectionType = RELATED_CONNECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelatingConnectionType() <em>Relating Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcConnectionTypeEnum RELATING_CONNECTION_TYPE_EDEFAULT = IfcConnectionTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getRelatingConnectionType() <em>Relating Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingConnectionType()
	 * @generated
	 * @ordered
	 */
	protected IfcConnectionTypeEnum relatingConnectionType = RELATING_CONNECTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsPathElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsPathElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getRelatingPriorities() {
		if (relatingPriorities == null) {
			relatingPriorities = new EDataTypeEList<Integer>(Integer.class, this, Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES);
		}
		return relatingPriorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getRelatedPriorities() {
		if (relatedPriorities == null) {
			relatedPriorities = new EDataTypeEList<Integer>(Integer.class, this, Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES);
		}
		return relatedPriorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum getRelatedConnectionType() {
		return relatedConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedConnectionType(IfcConnectionTypeEnum newRelatedConnectionType) {
		IfcConnectionTypeEnum oldRelatedConnectionType = relatedConnectionType;
		relatedConnectionType = newRelatedConnectionType == null ? RELATED_CONNECTION_TYPE_EDEFAULT : newRelatedConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE, oldRelatedConnectionType, relatedConnectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum getRelatingConnectionType() {
		return relatingConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingConnectionType(IfcConnectionTypeEnum newRelatingConnectionType) {
		IfcConnectionTypeEnum oldRelatingConnectionType = relatingConnectionType;
		relatingConnectionType = newRelatingConnectionType == null ? RELATING_CONNECTION_TYPE_EDEFAULT : newRelatingConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE, oldRelatingConnectionType, relatingConnectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES:
				return getRelatingPriorities();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES:
				return getRelatedPriorities();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE:
				return getRelatedConnectionType();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE:
				return getRelatingConnectionType();
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES:
				getRelatingPriorities().clear();
				getRelatingPriorities().addAll((Collection<? extends Integer>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES:
				getRelatedPriorities().clear();
				getRelatedPriorities().addAll((Collection<? extends Integer>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE:
				setRelatedConnectionType((IfcConnectionTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE:
				setRelatingConnectionType((IfcConnectionTypeEnum)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES:
				getRelatingPriorities().clear();
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES:
				getRelatedPriorities().clear();
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE:
				setRelatedConnectionType(RELATED_CONNECTION_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE:
				setRelatingConnectionType(RELATING_CONNECTION_TYPE_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES:
				return relatingPriorities != null && !relatingPriorities.isEmpty();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES:
				return relatedPriorities != null && !relatedPriorities.isEmpty();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE:
				return relatedConnectionType != RELATED_CONNECTION_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE:
				return relatingConnectionType != RELATING_CONNECTION_TYPE_EDEFAULT;
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
		result.append(" (RelatingPriorities: ");
		result.append(relatingPriorities);
		result.append(", RelatedPriorities: ");
		result.append(relatedPriorities);
		result.append(", RelatedConnectionType: ");
		result.append(relatedConnectionType);
		result.append(", RelatingConnectionType: ");
		result.append(relatingConnectionType);
		result.append(')');
		return result.toString();
	}

} //IfcRelConnectsPathElementsImpl
