/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRepresentationMap;
import ifc2x3tc1.IfcTypeProduct;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Type Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTypeProductImpl#getRepresentationMaps <em>Representation Maps</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTypeProductImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTypeProductImpl extends IfcTypeObjectImpl implements IfcTypeProduct {
	/**
	 * The cached value of the '{@link #getRepresentationMaps() <em>Representation Maps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRepresentationMap> representationMaps;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * This is true if the Tag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tagESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTypeProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTypeProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRepresentationMap> getRepresentationMaps() {
		if (representationMaps == null) {
			representationMaps = new EObjectResolvingEList.Unsettable<IfcRepresentationMap>(IfcRepresentationMap.class, this, Ifc2x3tc1Package.IFC_TYPE_PRODUCT__REPRESENTATION_MAPS);
		}
		return representationMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepresentationMaps() {
		if (representationMaps != null) ((InternalEList.Unsettable<?>)representationMaps).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentationMaps() {
		return representationMaps != null && ((InternalEList.Unsettable<?>)representationMaps).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		boolean oldTagESet = tagESet;
		tagESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TYPE_PRODUCT__TAG, oldTag, tag, !oldTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTag() {
		String oldTag = tag;
		boolean oldTagESet = tagESet;
		tag = TAG_EDEFAULT;
		tagESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TYPE_PRODUCT__TAG, oldTag, TAG_EDEFAULT, oldTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTag() {
		return tagESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TYPE_PRODUCT__REPRESENTATION_MAPS:
				return getRepresentationMaps();
			case Ifc2x3tc1Package.IFC_TYPE_PRODUCT__TAG:
				return getTag();
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
			case Ifc2x3tc1Package.IFC_TYPE_PRODUCT__REPRESENTATION_MAPS:
				getRepresentationMaps().clear();
				getRepresentationMaps().addAll((Collection<? extends IfcRepresentationMap>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TYPE_PRODUCT__TAG:
				setTag((String)newValue);
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
			case Ifc2x3tc1Package.IFC_TYPE_PRODUCT__REPRESENTATION_MAPS:
				unsetRepresentationMaps();
				return;
			case Ifc2x3tc1Package.IFC_TYPE_PRODUCT__TAG:
				unsetTag();
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
			case Ifc2x3tc1Package.IFC_TYPE_PRODUCT__REPRESENTATION_MAPS:
				return isSetRepresentationMaps();
			case Ifc2x3tc1Package.IFC_TYPE_PRODUCT__TAG:
				return isSetTag();
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
		result.append(" (Tag: ");
		if (tagESet) result.append(tag); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcTypeProductImpl
