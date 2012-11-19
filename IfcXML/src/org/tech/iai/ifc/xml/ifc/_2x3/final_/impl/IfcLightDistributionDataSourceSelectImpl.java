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

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExternalReference;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionDataSourceSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightIntensityDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Distribution Data Source Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightDistributionDataSourceSelectImpl#getIfcExternalReferenceGroup <em>Ifc External Reference Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightDistributionDataSourceSelectImpl#getIfcExternalReference <em>Ifc External Reference</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightDistributionDataSourceSelectImpl#getIfcLightIntensityDistribution <em>Ifc Light Intensity Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightDistributionDataSourceSelectImpl extends EObjectImpl implements IfcLightDistributionDataSourceSelect {
	/**
	 * The cached value of the '{@link #getIfcExternalReferenceGroup() <em>Ifc External Reference Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcExternalReferenceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcExternalReferenceGroup;

	/**
	 * The cached value of the '{@link #getIfcLightIntensityDistribution() <em>Ifc Light Intensity Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLightIntensityDistribution()
	 * @generated
	 * @ordered
	 */
	protected IfcLightIntensityDistribution ifcLightIntensityDistribution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightDistributionDataSourceSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcLightDistributionDataSourceSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcExternalReferenceGroup() {
		if (ifcExternalReferenceGroup == null) {
			ifcExternalReferenceGroup = new BasicFeatureMap(this, FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP);
		}
		return ifcExternalReferenceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternalReference getIfcExternalReference() {
		return (IfcExternalReference)getIfcExternalReferenceGroup().get(FinalPackage.eINSTANCE.getIfcLightDistributionDataSourceSelect_IfcExternalReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcExternalReference(IfcExternalReference newIfcExternalReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcExternalReferenceGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcLightDistributionDataSourceSelect_IfcExternalReference(), newIfcExternalReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightIntensityDistribution getIfcLightIntensityDistribution() {
		return ifcLightIntensityDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLightIntensityDistribution(IfcLightIntensityDistribution newIfcLightIntensityDistribution, NotificationChain msgs) {
		IfcLightIntensityDistribution oldIfcLightIntensityDistribution = ifcLightIntensityDistribution;
		ifcLightIntensityDistribution = newIfcLightIntensityDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_LIGHT_INTENSITY_DISTRIBUTION, oldIfcLightIntensityDistribution, newIfcLightIntensityDistribution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLightIntensityDistribution(IfcLightIntensityDistribution newIfcLightIntensityDistribution) {
		if (newIfcLightIntensityDistribution != ifcLightIntensityDistribution) {
			NotificationChain msgs = null;
			if (ifcLightIntensityDistribution != null)
				msgs = ((InternalEObject)ifcLightIntensityDistribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_LIGHT_INTENSITY_DISTRIBUTION, null, msgs);
			if (newIfcLightIntensityDistribution != null)
				msgs = ((InternalEObject)newIfcLightIntensityDistribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_LIGHT_INTENSITY_DISTRIBUTION, null, msgs);
			msgs = basicSetIfcLightIntensityDistribution(newIfcLightIntensityDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_LIGHT_INTENSITY_DISTRIBUTION, newIfcLightIntensityDistribution, newIfcLightIntensityDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP:
				return ((InternalEList<?>)getIfcExternalReferenceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_EXTERNAL_REFERENCE:
				return basicSetIfcExternalReference(null, msgs);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_LIGHT_INTENSITY_DISTRIBUTION:
				return basicSetIfcLightIntensityDistribution(null, msgs);
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
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP:
				if (coreType) return getIfcExternalReferenceGroup();
				return ((FeatureMap.Internal)getIfcExternalReferenceGroup()).getWrapper();
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_EXTERNAL_REFERENCE:
				return getIfcExternalReference();
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_LIGHT_INTENSITY_DISTRIBUTION:
				return getIfcLightIntensityDistribution();
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
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP:
				((FeatureMap.Internal)getIfcExternalReferenceGroup()).set(newValue);
				return;
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_LIGHT_INTENSITY_DISTRIBUTION:
				setIfcLightIntensityDistribution((IfcLightIntensityDistribution)newValue);
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
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP:
				getIfcExternalReferenceGroup().clear();
				return;
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_LIGHT_INTENSITY_DISTRIBUTION:
				setIfcLightIntensityDistribution((IfcLightIntensityDistribution)null);
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
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP:
				return ifcExternalReferenceGroup != null && !ifcExternalReferenceGroup.isEmpty();
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_EXTERNAL_REFERENCE:
				return getIfcExternalReference() != null;
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT__IFC_LIGHT_INTENSITY_DISTRIBUTION:
				return ifcLightIntensityDistribution != null;
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
		result.append(" (ifcExternalReferenceGroup: ");
		result.append(ifcExternalReferenceGroup);
		result.append(')');
		return result.toString();
	}

} //IfcLightDistributionDataSourceSelectImpl
