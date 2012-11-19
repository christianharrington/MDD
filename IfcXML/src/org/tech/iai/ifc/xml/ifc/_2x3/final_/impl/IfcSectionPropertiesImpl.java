/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.EndProfileType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.StartProfileType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Section Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionPropertiesImpl#getSectionType <em>Section Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionPropertiesImpl#getStartProfile <em>Start Profile</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionPropertiesImpl#getEndProfile <em>End Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSectionPropertiesImpl extends EntityImpl implements IfcSectionProperties {
	/**
	 * The default value of the '{@link #getSectionType() <em>Section Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcSectionTypeEnum SECTION_TYPE_EDEFAULT = IfcSectionTypeEnum.UNIFORM;

	/**
	 * The cached value of the '{@link #getSectionType() <em>Section Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionType()
	 * @generated
	 * @ordered
	 */
	protected IfcSectionTypeEnum sectionType = SECTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartProfile() <em>Start Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartProfile()
	 * @generated
	 * @ordered
	 */
	protected StartProfileType startProfile;

	/**
	 * The cached value of the '{@link #getEndProfile() <em>End Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndProfile()
	 * @generated
	 * @ordered
	 */
	protected EndProfileType endProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSectionPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSectionProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionTypeEnum getSectionType() {
		return sectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionType(IfcSectionTypeEnum newSectionType) {
		IfcSectionTypeEnum oldSectionType = sectionType;
		sectionType = newSectionType == null ? SECTION_TYPE_EDEFAULT : newSectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_PROPERTIES__SECTION_TYPE, oldSectionType, sectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartProfileType getStartProfile() {
		return startProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartProfile(StartProfileType newStartProfile, NotificationChain msgs) {
		StartProfileType oldStartProfile = startProfile;
		startProfile = newStartProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_PROPERTIES__START_PROFILE, oldStartProfile, newStartProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartProfile(StartProfileType newStartProfile) {
		if (newStartProfile != startProfile) {
			NotificationChain msgs = null;
			if (startProfile != null)
				msgs = ((InternalEObject)startProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTION_PROPERTIES__START_PROFILE, null, msgs);
			if (newStartProfile != null)
				msgs = ((InternalEObject)newStartProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTION_PROPERTIES__START_PROFILE, null, msgs);
			msgs = basicSetStartProfile(newStartProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_PROPERTIES__START_PROFILE, newStartProfile, newStartProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProfileType getEndProfile() {
		return endProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndProfile(EndProfileType newEndProfile, NotificationChain msgs) {
		EndProfileType oldEndProfile = endProfile;
		endProfile = newEndProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_PROPERTIES__END_PROFILE, oldEndProfile, newEndProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndProfile(EndProfileType newEndProfile) {
		if (newEndProfile != endProfile) {
			NotificationChain msgs = null;
			if (endProfile != null)
				msgs = ((InternalEObject)endProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTION_PROPERTIES__END_PROFILE, null, msgs);
			if (newEndProfile != null)
				msgs = ((InternalEObject)newEndProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTION_PROPERTIES__END_PROFILE, null, msgs);
			msgs = basicSetEndProfile(newEndProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_PROPERTIES__END_PROFILE, newEndProfile, newEndProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SECTION_PROPERTIES__START_PROFILE:
				return basicSetStartProfile(null, msgs);
			case FinalPackage.IFC_SECTION_PROPERTIES__END_PROFILE:
				return basicSetEndProfile(null, msgs);
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
			case FinalPackage.IFC_SECTION_PROPERTIES__SECTION_TYPE:
				return getSectionType();
			case FinalPackage.IFC_SECTION_PROPERTIES__START_PROFILE:
				return getStartProfile();
			case FinalPackage.IFC_SECTION_PROPERTIES__END_PROFILE:
				return getEndProfile();
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
			case FinalPackage.IFC_SECTION_PROPERTIES__SECTION_TYPE:
				setSectionType((IfcSectionTypeEnum)newValue);
				return;
			case FinalPackage.IFC_SECTION_PROPERTIES__START_PROFILE:
				setStartProfile((StartProfileType)newValue);
				return;
			case FinalPackage.IFC_SECTION_PROPERTIES__END_PROFILE:
				setEndProfile((EndProfileType)newValue);
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
			case FinalPackage.IFC_SECTION_PROPERTIES__SECTION_TYPE:
				setSectionType(SECTION_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_SECTION_PROPERTIES__START_PROFILE:
				setStartProfile((StartProfileType)null);
				return;
			case FinalPackage.IFC_SECTION_PROPERTIES__END_PROFILE:
				setEndProfile((EndProfileType)null);
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
			case FinalPackage.IFC_SECTION_PROPERTIES__SECTION_TYPE:
				return sectionType != SECTION_TYPE_EDEFAULT;
			case FinalPackage.IFC_SECTION_PROPERTIES__START_PROFILE:
				return startProfile != null;
			case FinalPackage.IFC_SECTION_PROPERTIES__END_PROFILE:
				return endProfile != null;
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
		result.append(" (sectionType: ");
		result.append(sectionType);
		result.append(')');
		return result.toString();
	}

} //IfcSectionPropertiesImpl
