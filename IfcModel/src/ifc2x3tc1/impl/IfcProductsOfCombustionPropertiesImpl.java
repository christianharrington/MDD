/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProductsOfCombustionProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Products Of Combustion Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcProductsOfCombustionPropertiesImpl#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProductsOfCombustionPropertiesImpl#getSpecificHeatCapacityAsString <em>Specific Heat Capacity As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProductsOfCombustionPropertiesImpl#getN20Content <em>N20 Content</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProductsOfCombustionPropertiesImpl#getN20ContentAsString <em>N20 Content As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProductsOfCombustionPropertiesImpl#getCOContent <em>CO Content</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProductsOfCombustionPropertiesImpl#getCOContentAsString <em>CO Content As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProductsOfCombustionPropertiesImpl#getCO2Content <em>CO2 Content</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProductsOfCombustionPropertiesImpl#getCO2ContentAsString <em>CO2 Content As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcProductsOfCombustionPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcProductsOfCombustionProperties {
	/**
	 * The default value of the '{@link #getSpecificHeatCapacity() <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double SPECIFIC_HEAT_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpecificHeatCapacity() <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 * @ordered
	 */
	protected double specificHeatCapacity = SPECIFIC_HEAT_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Specific Heat Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specificHeatCapacityESet;

	/**
	 * The default value of the '{@link #getSpecificHeatCapacityAsString() <em>Specific Heat Capacity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatCapacityAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFIC_HEAT_CAPACITY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificHeatCapacityAsString() <em>Specific Heat Capacity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatCapacityAsString()
	 * @generated
	 * @ordered
	 */
	protected String specificHeatCapacityAsString = SPECIFIC_HEAT_CAPACITY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Specific Heat Capacity As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specificHeatCapacityAsStringESet;

	/**
	 * The default value of the '{@link #getN20Content() <em>N20 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN20Content()
	 * @generated
	 * @ordered
	 */
	protected static final double N20_CONTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getN20Content() <em>N20 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN20Content()
	 * @generated
	 * @ordered
	 */
	protected double n20Content = N20_CONTENT_EDEFAULT;

	/**
	 * This is true if the N20 Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean n20ContentESet;

	/**
	 * The default value of the '{@link #getN20ContentAsString() <em>N20 Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN20ContentAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String N20_CONTENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getN20ContentAsString() <em>N20 Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN20ContentAsString()
	 * @generated
	 * @ordered
	 */
	protected String n20ContentAsString = N20_CONTENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the N20 Content As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean n20ContentAsStringESet;

	/**
	 * The default value of the '{@link #getCOContent() <em>CO Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOContent()
	 * @generated
	 * @ordered
	 */
	protected static final double CO_CONTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCOContent() <em>CO Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOContent()
	 * @generated
	 * @ordered
	 */
	protected double coContent = CO_CONTENT_EDEFAULT;

	/**
	 * This is true if the CO Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coContentESet;

	/**
	 * The default value of the '{@link #getCOContentAsString() <em>CO Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOContentAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CO_CONTENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCOContentAsString() <em>CO Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOContentAsString()
	 * @generated
	 * @ordered
	 */
	protected String coContentAsString = CO_CONTENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the CO Content As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coContentAsStringESet;

	/**
	 * The default value of the '{@link #getCO2Content() <em>CO2 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCO2Content()
	 * @generated
	 * @ordered
	 */
	protected static final double CO2_CONTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCO2Content() <em>CO2 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCO2Content()
	 * @generated
	 * @ordered
	 */
	protected double co2Content = CO2_CONTENT_EDEFAULT;

	/**
	 * This is true if the CO2 Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean co2ContentESet;

	/**
	 * The default value of the '{@link #getCO2ContentAsString() <em>CO2 Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCO2ContentAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CO2_CONTENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCO2ContentAsString() <em>CO2 Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCO2ContentAsString()
	 * @generated
	 * @ordered
	 */
	protected String co2ContentAsString = CO2_CONTENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the CO2 Content As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean co2ContentAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProductsOfCombustionPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcProductsOfCombustionProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpecificHeatCapacity() {
		return specificHeatCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificHeatCapacity(double newSpecificHeatCapacity) {
		double oldSpecificHeatCapacity = specificHeatCapacity;
		specificHeatCapacity = newSpecificHeatCapacity;
		boolean oldSpecificHeatCapacityESet = specificHeatCapacityESet;
		specificHeatCapacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY, oldSpecificHeatCapacity, specificHeatCapacity, !oldSpecificHeatCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecificHeatCapacity() {
		double oldSpecificHeatCapacity = specificHeatCapacity;
		boolean oldSpecificHeatCapacityESet = specificHeatCapacityESet;
		specificHeatCapacity = SPECIFIC_HEAT_CAPACITY_EDEFAULT;
		specificHeatCapacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY, oldSpecificHeatCapacity, SPECIFIC_HEAT_CAPACITY_EDEFAULT, oldSpecificHeatCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecificHeatCapacity() {
		return specificHeatCapacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificHeatCapacityAsString() {
		return specificHeatCapacityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificHeatCapacityAsString(String newSpecificHeatCapacityAsString) {
		String oldSpecificHeatCapacityAsString = specificHeatCapacityAsString;
		specificHeatCapacityAsString = newSpecificHeatCapacityAsString;
		boolean oldSpecificHeatCapacityAsStringESet = specificHeatCapacityAsStringESet;
		specificHeatCapacityAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING, oldSpecificHeatCapacityAsString, specificHeatCapacityAsString, !oldSpecificHeatCapacityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecificHeatCapacityAsString() {
		String oldSpecificHeatCapacityAsString = specificHeatCapacityAsString;
		boolean oldSpecificHeatCapacityAsStringESet = specificHeatCapacityAsStringESet;
		specificHeatCapacityAsString = SPECIFIC_HEAT_CAPACITY_AS_STRING_EDEFAULT;
		specificHeatCapacityAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING, oldSpecificHeatCapacityAsString, SPECIFIC_HEAT_CAPACITY_AS_STRING_EDEFAULT, oldSpecificHeatCapacityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecificHeatCapacityAsString() {
		return specificHeatCapacityAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getN20Content() {
		return n20Content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setN20Content(double newN20Content) {
		double oldN20Content = n20Content;
		n20Content = newN20Content;
		boolean oldN20ContentESet = n20ContentESet;
		n20ContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT, oldN20Content, n20Content, !oldN20ContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetN20Content() {
		double oldN20Content = n20Content;
		boolean oldN20ContentESet = n20ContentESet;
		n20Content = N20_CONTENT_EDEFAULT;
		n20ContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT, oldN20Content, N20_CONTENT_EDEFAULT, oldN20ContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetN20Content() {
		return n20ContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getN20ContentAsString() {
		return n20ContentAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setN20ContentAsString(String newN20ContentAsString) {
		String oldN20ContentAsString = n20ContentAsString;
		n20ContentAsString = newN20ContentAsString;
		boolean oldN20ContentAsStringESet = n20ContentAsStringESet;
		n20ContentAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT_AS_STRING, oldN20ContentAsString, n20ContentAsString, !oldN20ContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetN20ContentAsString() {
		String oldN20ContentAsString = n20ContentAsString;
		boolean oldN20ContentAsStringESet = n20ContentAsStringESet;
		n20ContentAsString = N20_CONTENT_AS_STRING_EDEFAULT;
		n20ContentAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT_AS_STRING, oldN20ContentAsString, N20_CONTENT_AS_STRING_EDEFAULT, oldN20ContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetN20ContentAsString() {
		return n20ContentAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCOContent() {
		return coContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOContent(double newCOContent) {
		double oldCOContent = coContent;
		coContent = newCOContent;
		boolean oldCOContentESet = coContentESet;
		coContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT, oldCOContent, coContent, !oldCOContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCOContent() {
		double oldCOContent = coContent;
		boolean oldCOContentESet = coContentESet;
		coContent = CO_CONTENT_EDEFAULT;
		coContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT, oldCOContent, CO_CONTENT_EDEFAULT, oldCOContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCOContent() {
		return coContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCOContentAsString() {
		return coContentAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOContentAsString(String newCOContentAsString) {
		String oldCOContentAsString = coContentAsString;
		coContentAsString = newCOContentAsString;
		boolean oldCOContentAsStringESet = coContentAsStringESet;
		coContentAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT_AS_STRING, oldCOContentAsString, coContentAsString, !oldCOContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCOContentAsString() {
		String oldCOContentAsString = coContentAsString;
		boolean oldCOContentAsStringESet = coContentAsStringESet;
		coContentAsString = CO_CONTENT_AS_STRING_EDEFAULT;
		coContentAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT_AS_STRING, oldCOContentAsString, CO_CONTENT_AS_STRING_EDEFAULT, oldCOContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCOContentAsString() {
		return coContentAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCO2Content() {
		return co2Content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCO2Content(double newCO2Content) {
		double oldCO2Content = co2Content;
		co2Content = newCO2Content;
		boolean oldCO2ContentESet = co2ContentESet;
		co2ContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT, oldCO2Content, co2Content, !oldCO2ContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCO2Content() {
		double oldCO2Content = co2Content;
		boolean oldCO2ContentESet = co2ContentESet;
		co2Content = CO2_CONTENT_EDEFAULT;
		co2ContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT, oldCO2Content, CO2_CONTENT_EDEFAULT, oldCO2ContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCO2Content() {
		return co2ContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCO2ContentAsString() {
		return co2ContentAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCO2ContentAsString(String newCO2ContentAsString) {
		String oldCO2ContentAsString = co2ContentAsString;
		co2ContentAsString = newCO2ContentAsString;
		boolean oldCO2ContentAsStringESet = co2ContentAsStringESet;
		co2ContentAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT_AS_STRING, oldCO2ContentAsString, co2ContentAsString, !oldCO2ContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCO2ContentAsString() {
		String oldCO2ContentAsString = co2ContentAsString;
		boolean oldCO2ContentAsStringESet = co2ContentAsStringESet;
		co2ContentAsString = CO2_CONTENT_AS_STRING_EDEFAULT;
		co2ContentAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT_AS_STRING, oldCO2ContentAsString, CO2_CONTENT_AS_STRING_EDEFAULT, oldCO2ContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCO2ContentAsString() {
		return co2ContentAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				return getSpecificHeatCapacity();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING:
				return getSpecificHeatCapacityAsString();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT:
				return getN20Content();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT_AS_STRING:
				return getN20ContentAsString();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT:
				return getCOContent();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT_AS_STRING:
				return getCOContentAsString();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT:
				return getCO2Content();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT_AS_STRING:
				return getCO2ContentAsString();
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
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				setSpecificHeatCapacity((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING:
				setSpecificHeatCapacityAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT:
				setN20Content((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT_AS_STRING:
				setN20ContentAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT:
				setCOContent((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT_AS_STRING:
				setCOContentAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT:
				setCO2Content((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT_AS_STRING:
				setCO2ContentAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				unsetSpecificHeatCapacity();
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING:
				unsetSpecificHeatCapacityAsString();
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT:
				unsetN20Content();
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT_AS_STRING:
				unsetN20ContentAsString();
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT:
				unsetCOContent();
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT_AS_STRING:
				unsetCOContentAsString();
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT:
				unsetCO2Content();
				return;
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT_AS_STRING:
				unsetCO2ContentAsString();
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
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				return isSetSpecificHeatCapacity();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING:
				return isSetSpecificHeatCapacityAsString();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT:
				return isSetN20Content();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT_AS_STRING:
				return isSetN20ContentAsString();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT:
				return isSetCOContent();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT_AS_STRING:
				return isSetCOContentAsString();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT:
				return isSetCO2Content();
			case Ifc2x3tc1Package.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT_AS_STRING:
				return isSetCO2ContentAsString();
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
		result.append(" (SpecificHeatCapacity: ");
		if (specificHeatCapacityESet) result.append(specificHeatCapacity); else result.append("<unset>");
		result.append(", SpecificHeatCapacityAsString: ");
		if (specificHeatCapacityAsStringESet) result.append(specificHeatCapacityAsString); else result.append("<unset>");
		result.append(", N20Content: ");
		if (n20ContentESet) result.append(n20Content); else result.append("<unset>");
		result.append(", N20ContentAsString: ");
		if (n20ContentAsStringESet) result.append(n20ContentAsString); else result.append("<unset>");
		result.append(", COContent: ");
		if (coContentESet) result.append(coContent); else result.append("<unset>");
		result.append(", COContentAsString: ");
		if (coContentAsStringESet) result.append(coContentAsString); else result.append("<unset>");
		result.append(", CO2Content: ");
		if (co2ContentESet) result.append(co2Content); else result.append("<unset>");
		result.append(", CO2ContentAsString: ");
		if (co2ContentAsStringESet) result.append(co2ContentAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcProductsOfCombustionPropertiesImpl
