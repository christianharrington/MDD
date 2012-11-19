/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonFactory;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClosedShell;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpenShell;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SbsmBoundaryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sbsm Boundary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SbsmBoundaryTypeImpl#getIfcShell <em>Ifc Shell</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SbsmBoundaryTypeImpl#getIfcClosedShell <em>Ifc Closed Shell</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SbsmBoundaryTypeImpl#getIfcOpenShell <em>Ifc Open Shell</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SbsmBoundaryTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SbsmBoundaryTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SbsmBoundaryTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SbsmBoundaryTypeImpl extends EObjectImpl implements SbsmBoundaryType {
	/**
	 * The cached value of the '{@link #getIfcShell() <em>Ifc Shell</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcShell()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcShell;

	/**
	 * The default value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected static final List<BigInteger> ARRAY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected List<BigInteger> arraySize = ARRAY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCType() <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCType()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final List<AggregateType> CTYPE_EDEFAULT = (List<AggregateType>)CommonFactory.eINSTANCE.createFromString(CommonPackage.eINSTANCE.getCTypeType(), "set");

	/**
	 * The cached value of the '{@link #getCType() <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCType()
	 * @generated
	 * @ordered
	 */
	protected List<AggregateType> cType = CTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcShell");

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected QName itemType = ITEM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbsmBoundaryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getSbsmBoundaryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcShell() {
		if (ifcShell == null) {
			ifcShell = new BasicFeatureMap(this, FinalPackage.SBSM_BOUNDARY_TYPE__IFC_SHELL);
		}
		return ifcShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcClosedShell> getIfcClosedShell() {
		return getIfcShell().list(FinalPackage.eINSTANCE.getSbsmBoundaryType_IfcClosedShell());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcOpenShell> getIfcOpenShell() {
		return getIfcShell().list(FinalPackage.eINSTANCE.getSbsmBoundaryType_IfcOpenShell());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> getArraySize() {
		return arraySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArraySize(List<BigInteger> newArraySize) {
		List<BigInteger> oldArraySize = arraySize;
		arraySize = newArraySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.SBSM_BOUNDARY_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AggregateType> getCType() {
		return cType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCType(List<AggregateType> newCType) {
		List<AggregateType> oldCType = cType;
		cType = newCType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.SBSM_BOUNDARY_TYPE__CTYPE, oldCType, cType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemType(QName newItemType) {
		QName oldItemType = itemType;
		itemType = newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.SBSM_BOUNDARY_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_SHELL:
				return ((InternalEList<?>)getIfcShell()).basicRemove(otherEnd, msgs);
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_CLOSED_SHELL:
				return ((InternalEList<?>)getIfcClosedShell()).basicRemove(otherEnd, msgs);
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_OPEN_SHELL:
				return ((InternalEList<?>)getIfcOpenShell()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_SHELL:
				if (coreType) return getIfcShell();
				return ((FeatureMap.Internal)getIfcShell()).getWrapper();
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_CLOSED_SHELL:
				return getIfcClosedShell();
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_OPEN_SHELL:
				return getIfcOpenShell();
			case FinalPackage.SBSM_BOUNDARY_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.SBSM_BOUNDARY_TYPE__CTYPE:
				return getCType();
			case FinalPackage.SBSM_BOUNDARY_TYPE__ITEM_TYPE:
				return getItemType();
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
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_SHELL:
				((FeatureMap.Internal)getIfcShell()).set(newValue);
				return;
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_CLOSED_SHELL:
				getIfcClosedShell().clear();
				getIfcClosedShell().addAll((Collection<? extends IfcClosedShell>)newValue);
				return;
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_OPEN_SHELL:
				getIfcOpenShell().clear();
				getIfcOpenShell().addAll((Collection<? extends IfcOpenShell>)newValue);
				return;
			case FinalPackage.SBSM_BOUNDARY_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.SBSM_BOUNDARY_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.SBSM_BOUNDARY_TYPE__ITEM_TYPE:
				setItemType((QName)newValue);
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
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_SHELL:
				getIfcShell().clear();
				return;
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_CLOSED_SHELL:
				getIfcClosedShell().clear();
				return;
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_OPEN_SHELL:
				getIfcOpenShell().clear();
				return;
			case FinalPackage.SBSM_BOUNDARY_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.SBSM_BOUNDARY_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.SBSM_BOUNDARY_TYPE__ITEM_TYPE:
				setItemType(ITEM_TYPE_EDEFAULT);
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
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_SHELL:
				return ifcShell != null && !ifcShell.isEmpty();
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_CLOSED_SHELL:
				return !getIfcClosedShell().isEmpty();
			case FinalPackage.SBSM_BOUNDARY_TYPE__IFC_OPEN_SHELL:
				return !getIfcOpenShell().isEmpty();
			case FinalPackage.SBSM_BOUNDARY_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.SBSM_BOUNDARY_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.SBSM_BOUNDARY_TYPE__ITEM_TYPE:
				return ITEM_TYPE_EDEFAULT == null ? itemType != null : !ITEM_TYPE_EDEFAULT.equals(itemType);
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
		result.append(" (ifcShell: ");
		result.append(ifcShell);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //SbsmBoundaryTypeImpl