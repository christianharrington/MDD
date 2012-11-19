/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DefinitionType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExternallyDefinedSymbol;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPreDefinedSymbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.DefinitionTypeImpl#getIfcPreDefinedSymbolGroup <em>Ifc Pre Defined Symbol Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.DefinitionTypeImpl#getIfcPreDefinedSymbol <em>Ifc Pre Defined Symbol</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.DefinitionTypeImpl#getIfcExternallyDefinedSymbol <em>Ifc Externally Defined Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionTypeImpl extends EObjectImpl implements DefinitionType {
	/**
	 * The cached value of the '{@link #getIfcPreDefinedSymbolGroup() <em>Ifc Pre Defined Symbol Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPreDefinedSymbolGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPreDefinedSymbolGroup;

	/**
	 * The cached value of the '{@link #getIfcExternallyDefinedSymbol() <em>Ifc Externally Defined Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcExternallyDefinedSymbol()
	 * @generated
	 * @ordered
	 */
	protected IfcExternallyDefinedSymbol ifcExternallyDefinedSymbol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPreDefinedSymbolGroup() {
		if (ifcPreDefinedSymbolGroup == null) {
			ifcPreDefinedSymbolGroup = new BasicFeatureMap(this, FinalPackage.DEFINITION_TYPE__IFC_PRE_DEFINED_SYMBOL_GROUP);
		}
		return ifcPreDefinedSymbolGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPreDefinedSymbol getIfcPreDefinedSymbol() {
		return (IfcPreDefinedSymbol)getIfcPreDefinedSymbolGroup().get(FinalPackage.eINSTANCE.getDefinitionType_IfcPreDefinedSymbol(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPreDefinedSymbol(IfcPreDefinedSymbol newIfcPreDefinedSymbol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPreDefinedSymbolGroup()).basicAdd(FinalPackage.eINSTANCE.getDefinitionType_IfcPreDefinedSymbol(), newIfcPreDefinedSymbol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternallyDefinedSymbol getIfcExternallyDefinedSymbol() {
		return ifcExternallyDefinedSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcExternallyDefinedSymbol(IfcExternallyDefinedSymbol newIfcExternallyDefinedSymbol, NotificationChain msgs) {
		IfcExternallyDefinedSymbol oldIfcExternallyDefinedSymbol = ifcExternallyDefinedSymbol;
		ifcExternallyDefinedSymbol = newIfcExternallyDefinedSymbol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.DEFINITION_TYPE__IFC_EXTERNALLY_DEFINED_SYMBOL, oldIfcExternallyDefinedSymbol, newIfcExternallyDefinedSymbol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcExternallyDefinedSymbol(IfcExternallyDefinedSymbol newIfcExternallyDefinedSymbol) {
		if (newIfcExternallyDefinedSymbol != ifcExternallyDefinedSymbol) {
			NotificationChain msgs = null;
			if (ifcExternallyDefinedSymbol != null)
				msgs = ((InternalEObject)ifcExternallyDefinedSymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DEFINITION_TYPE__IFC_EXTERNALLY_DEFINED_SYMBOL, null, msgs);
			if (newIfcExternallyDefinedSymbol != null)
				msgs = ((InternalEObject)newIfcExternallyDefinedSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DEFINITION_TYPE__IFC_EXTERNALLY_DEFINED_SYMBOL, null, msgs);
			msgs = basicSetIfcExternallyDefinedSymbol(newIfcExternallyDefinedSymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.DEFINITION_TYPE__IFC_EXTERNALLY_DEFINED_SYMBOL, newIfcExternallyDefinedSymbol, newIfcExternallyDefinedSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.DEFINITION_TYPE__IFC_PRE_DEFINED_SYMBOL_GROUP:
				return ((InternalEList<?>)getIfcPreDefinedSymbolGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.DEFINITION_TYPE__IFC_PRE_DEFINED_SYMBOL:
				return basicSetIfcPreDefinedSymbol(null, msgs);
			case FinalPackage.DEFINITION_TYPE__IFC_EXTERNALLY_DEFINED_SYMBOL:
				return basicSetIfcExternallyDefinedSymbol(null, msgs);
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
			case FinalPackage.DEFINITION_TYPE__IFC_PRE_DEFINED_SYMBOL_GROUP:
				if (coreType) return getIfcPreDefinedSymbolGroup();
				return ((FeatureMap.Internal)getIfcPreDefinedSymbolGroup()).getWrapper();
			case FinalPackage.DEFINITION_TYPE__IFC_PRE_DEFINED_SYMBOL:
				return getIfcPreDefinedSymbol();
			case FinalPackage.DEFINITION_TYPE__IFC_EXTERNALLY_DEFINED_SYMBOL:
				return getIfcExternallyDefinedSymbol();
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
			case FinalPackage.DEFINITION_TYPE__IFC_PRE_DEFINED_SYMBOL_GROUP:
				((FeatureMap.Internal)getIfcPreDefinedSymbolGroup()).set(newValue);
				return;
			case FinalPackage.DEFINITION_TYPE__IFC_EXTERNALLY_DEFINED_SYMBOL:
				setIfcExternallyDefinedSymbol((IfcExternallyDefinedSymbol)newValue);
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
			case FinalPackage.DEFINITION_TYPE__IFC_PRE_DEFINED_SYMBOL_GROUP:
				getIfcPreDefinedSymbolGroup().clear();
				return;
			case FinalPackage.DEFINITION_TYPE__IFC_EXTERNALLY_DEFINED_SYMBOL:
				setIfcExternallyDefinedSymbol((IfcExternallyDefinedSymbol)null);
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
			case FinalPackage.DEFINITION_TYPE__IFC_PRE_DEFINED_SYMBOL_GROUP:
				return ifcPreDefinedSymbolGroup != null && !ifcPreDefinedSymbolGroup.isEmpty();
			case FinalPackage.DEFINITION_TYPE__IFC_PRE_DEFINED_SYMBOL:
				return getIfcPreDefinedSymbol() != null;
			case FinalPackage.DEFINITION_TYPE__IFC_EXTERNALLY_DEFINED_SYMBOL:
				return ifcExternallyDefinedSymbol != null;
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
		result.append(" (ifcPreDefinedSymbolGroup: ");
		result.append(ifcPreDefinedSymbolGroup);
		result.append(')');
		return result.toString();
	}

} //DefinitionTypeImpl
