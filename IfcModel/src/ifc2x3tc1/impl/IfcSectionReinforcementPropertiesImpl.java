/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcReinforcementBarProperties;
import ifc2x3tc1.IfcReinforcingBarRoleEnum;
import ifc2x3tc1.IfcSectionProperties;
import ifc2x3tc1.IfcSectionReinforcementProperties;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Section Reinforcement Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionReinforcementPropertiesImpl#getLongitudinalStartPosition <em>Longitudinal Start Position</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionReinforcementPropertiesImpl#getLongitudinalStartPositionAsString <em>Longitudinal Start Position As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionReinforcementPropertiesImpl#getLongitudinalEndPosition <em>Longitudinal End Position</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionReinforcementPropertiesImpl#getLongitudinalEndPositionAsString <em>Longitudinal End Position As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionReinforcementPropertiesImpl#getTransversePosition <em>Transverse Position</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionReinforcementPropertiesImpl#getTransversePositionAsString <em>Transverse Position As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionReinforcementPropertiesImpl#getReinforcementRole <em>Reinforcement Role</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionReinforcementPropertiesImpl#getSectionDefinition <em>Section Definition</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionReinforcementPropertiesImpl#getCrossSectionReinforcementDefinitions <em>Cross Section Reinforcement Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSectionReinforcementPropertiesImpl extends EObjectImpl implements IfcSectionReinforcementProperties {
	/**
	 * The default value of the '{@link #getLongitudinalStartPosition() <em>Longitudinal Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalStartPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDINAL_START_POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitudinalStartPosition() <em>Longitudinal Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalStartPosition()
	 * @generated
	 * @ordered
	 */
	protected double longitudinalStartPosition = LONGITUDINAL_START_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalStartPositionAsString() <em>Longitudinal Start Position As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalStartPositionAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGITUDINAL_START_POSITION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongitudinalStartPositionAsString() <em>Longitudinal Start Position As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalStartPositionAsString()
	 * @generated
	 * @ordered
	 */
	protected String longitudinalStartPositionAsString = LONGITUDINAL_START_POSITION_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalEndPosition() <em>Longitudinal End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalEndPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDINAL_END_POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitudinalEndPosition() <em>Longitudinal End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalEndPosition()
	 * @generated
	 * @ordered
	 */
	protected double longitudinalEndPosition = LONGITUDINAL_END_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalEndPositionAsString() <em>Longitudinal End Position As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalEndPositionAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGITUDINAL_END_POSITION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongitudinalEndPositionAsString() <em>Longitudinal End Position As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalEndPositionAsString()
	 * @generated
	 * @ordered
	 */
	protected String longitudinalEndPositionAsString = LONGITUDINAL_END_POSITION_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransversePosition() <em>Transverse Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransversePosition()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSVERSE_POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransversePosition() <em>Transverse Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransversePosition()
	 * @generated
	 * @ordered
	 */
	protected double transversePosition = TRANSVERSE_POSITION_EDEFAULT;

	/**
	 * This is true if the Transverse Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transversePositionESet;

	/**
	 * The default value of the '{@link #getTransversePositionAsString() <em>Transverse Position As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransversePositionAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSVERSE_POSITION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransversePositionAsString() <em>Transverse Position As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransversePositionAsString()
	 * @generated
	 * @ordered
	 */
	protected String transversePositionAsString = TRANSVERSE_POSITION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Transverse Position As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transversePositionAsStringESet;

	/**
	 * The default value of the '{@link #getReinforcementRole() <em>Reinforcement Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinforcementRole()
	 * @generated
	 * @ordered
	 */
	protected static final IfcReinforcingBarRoleEnum REINFORCEMENT_ROLE_EDEFAULT = IfcReinforcingBarRoleEnum.NULL;

	/**
	 * The cached value of the '{@link #getReinforcementRole() <em>Reinforcement Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinforcementRole()
	 * @generated
	 * @ordered
	 */
	protected IfcReinforcingBarRoleEnum reinforcementRole = REINFORCEMENT_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSectionDefinition() <em>Section Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionDefinition()
	 * @generated
	 * @ordered
	 */
	protected IfcSectionProperties sectionDefinition;

	/**
	 * The cached value of the '{@link #getCrossSectionReinforcementDefinitions() <em>Cross Section Reinforcement Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionReinforcementDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcReinforcementBarProperties> crossSectionReinforcementDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSectionReinforcementPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSectionReinforcementProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitudinalStartPosition() {
		return longitudinalStartPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalStartPosition(double newLongitudinalStartPosition) {
		double oldLongitudinalStartPosition = longitudinalStartPosition;
		longitudinalStartPosition = newLongitudinalStartPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION, oldLongitudinalStartPosition, longitudinalStartPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongitudinalStartPositionAsString() {
		return longitudinalStartPositionAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalStartPositionAsString(String newLongitudinalStartPositionAsString) {
		String oldLongitudinalStartPositionAsString = longitudinalStartPositionAsString;
		longitudinalStartPositionAsString = newLongitudinalStartPositionAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION_AS_STRING, oldLongitudinalStartPositionAsString, longitudinalStartPositionAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitudinalEndPosition() {
		return longitudinalEndPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalEndPosition(double newLongitudinalEndPosition) {
		double oldLongitudinalEndPosition = longitudinalEndPosition;
		longitudinalEndPosition = newLongitudinalEndPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION, oldLongitudinalEndPosition, longitudinalEndPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongitudinalEndPositionAsString() {
		return longitudinalEndPositionAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalEndPositionAsString(String newLongitudinalEndPositionAsString) {
		String oldLongitudinalEndPositionAsString = longitudinalEndPositionAsString;
		longitudinalEndPositionAsString = newLongitudinalEndPositionAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION_AS_STRING, oldLongitudinalEndPositionAsString, longitudinalEndPositionAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransversePosition() {
		return transversePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransversePosition(double newTransversePosition) {
		double oldTransversePosition = transversePosition;
		transversePosition = newTransversePosition;
		boolean oldTransversePositionESet = transversePositionESet;
		transversePositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION, oldTransversePosition, transversePosition, !oldTransversePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransversePosition() {
		double oldTransversePosition = transversePosition;
		boolean oldTransversePositionESet = transversePositionESet;
		transversePosition = TRANSVERSE_POSITION_EDEFAULT;
		transversePositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION, oldTransversePosition, TRANSVERSE_POSITION_EDEFAULT, oldTransversePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransversePosition() {
		return transversePositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransversePositionAsString() {
		return transversePositionAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransversePositionAsString(String newTransversePositionAsString) {
		String oldTransversePositionAsString = transversePositionAsString;
		transversePositionAsString = newTransversePositionAsString;
		boolean oldTransversePositionAsStringESet = transversePositionAsStringESet;
		transversePositionAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION_AS_STRING, oldTransversePositionAsString, transversePositionAsString, !oldTransversePositionAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransversePositionAsString() {
		String oldTransversePositionAsString = transversePositionAsString;
		boolean oldTransversePositionAsStringESet = transversePositionAsStringESet;
		transversePositionAsString = TRANSVERSE_POSITION_AS_STRING_EDEFAULT;
		transversePositionAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION_AS_STRING, oldTransversePositionAsString, TRANSVERSE_POSITION_AS_STRING_EDEFAULT, oldTransversePositionAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransversePositionAsString() {
		return transversePositionAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarRoleEnum getReinforcementRole() {
		return reinforcementRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReinforcementRole(IfcReinforcingBarRoleEnum newReinforcementRole) {
		IfcReinforcingBarRoleEnum oldReinforcementRole = reinforcementRole;
		reinforcementRole = newReinforcementRole == null ? REINFORCEMENT_ROLE_EDEFAULT : newReinforcementRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__REINFORCEMENT_ROLE, oldReinforcementRole, reinforcementRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionProperties getSectionDefinition() {
		if (sectionDefinition != null && sectionDefinition.eIsProxy()) {
			InternalEObject oldSectionDefinition = (InternalEObject)sectionDefinition;
			sectionDefinition = (IfcSectionProperties)eResolveProxy(oldSectionDefinition);
			if (sectionDefinition != oldSectionDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION, oldSectionDefinition, sectionDefinition));
			}
		}
		return sectionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionProperties basicGetSectionDefinition() {
		return sectionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionDefinition(IfcSectionProperties newSectionDefinition) {
		IfcSectionProperties oldSectionDefinition = sectionDefinition;
		sectionDefinition = newSectionDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION, oldSectionDefinition, sectionDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions() {
		if (crossSectionReinforcementDefinitions == null) {
			crossSectionReinforcementDefinitions = new EObjectResolvingEList<IfcReinforcementBarProperties>(IfcReinforcementBarProperties.class, this, Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS);
		}
		return crossSectionReinforcementDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION:
				return getLongitudinalStartPosition();
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION_AS_STRING:
				return getLongitudinalStartPositionAsString();
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION:
				return getLongitudinalEndPosition();
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION_AS_STRING:
				return getLongitudinalEndPositionAsString();
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION:
				return getTransversePosition();
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION_AS_STRING:
				return getTransversePositionAsString();
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__REINFORCEMENT_ROLE:
				return getReinforcementRole();
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION:
				if (resolve) return getSectionDefinition();
				return basicGetSectionDefinition();
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS:
				return getCrossSectionReinforcementDefinitions();
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
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION:
				setLongitudinalStartPosition((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION_AS_STRING:
				setLongitudinalStartPositionAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION:
				setLongitudinalEndPosition((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION_AS_STRING:
				setLongitudinalEndPositionAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION:
				setTransversePosition((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION_AS_STRING:
				setTransversePositionAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__REINFORCEMENT_ROLE:
				setReinforcementRole((IfcReinforcingBarRoleEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION:
				setSectionDefinition((IfcSectionProperties)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS:
				getCrossSectionReinforcementDefinitions().clear();
				getCrossSectionReinforcementDefinitions().addAll((Collection<? extends IfcReinforcementBarProperties>)newValue);
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
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION:
				setLongitudinalStartPosition(LONGITUDINAL_START_POSITION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION_AS_STRING:
				setLongitudinalStartPositionAsString(LONGITUDINAL_START_POSITION_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION:
				setLongitudinalEndPosition(LONGITUDINAL_END_POSITION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION_AS_STRING:
				setLongitudinalEndPositionAsString(LONGITUDINAL_END_POSITION_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION:
				unsetTransversePosition();
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION_AS_STRING:
				unsetTransversePositionAsString();
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__REINFORCEMENT_ROLE:
				setReinforcementRole(REINFORCEMENT_ROLE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION:
				setSectionDefinition((IfcSectionProperties)null);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS:
				getCrossSectionReinforcementDefinitions().clear();
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
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION:
				return longitudinalStartPosition != LONGITUDINAL_START_POSITION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION_AS_STRING:
				return LONGITUDINAL_START_POSITION_AS_STRING_EDEFAULT == null ? longitudinalStartPositionAsString != null : !LONGITUDINAL_START_POSITION_AS_STRING_EDEFAULT.equals(longitudinalStartPositionAsString);
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION:
				return longitudinalEndPosition != LONGITUDINAL_END_POSITION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION_AS_STRING:
				return LONGITUDINAL_END_POSITION_AS_STRING_EDEFAULT == null ? longitudinalEndPositionAsString != null : !LONGITUDINAL_END_POSITION_AS_STRING_EDEFAULT.equals(longitudinalEndPositionAsString);
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION:
				return isSetTransversePosition();
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION_AS_STRING:
				return isSetTransversePositionAsString();
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__REINFORCEMENT_ROLE:
				return reinforcementRole != REINFORCEMENT_ROLE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION:
				return sectionDefinition != null;
			case Ifc2x3tc1Package.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS:
				return crossSectionReinforcementDefinitions != null && !crossSectionReinforcementDefinitions.isEmpty();
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
		result.append(" (LongitudinalStartPosition: ");
		result.append(longitudinalStartPosition);
		result.append(", LongitudinalStartPositionAsString: ");
		result.append(longitudinalStartPositionAsString);
		result.append(", LongitudinalEndPosition: ");
		result.append(longitudinalEndPosition);
		result.append(", LongitudinalEndPositionAsString: ");
		result.append(longitudinalEndPositionAsString);
		result.append(", TransversePosition: ");
		if (transversePositionESet) result.append(transversePosition); else result.append("<unset>");
		result.append(", TransversePositionAsString: ");
		if (transversePositionAsStringESet) result.append(transversePositionAsString); else result.append("<unset>");
		result.append(", ReinforcementRole: ");
		result.append(reinforcementRole);
		result.append(')');
		return result.toString();
	}

} //IfcSectionReinforcementPropertiesImpl
