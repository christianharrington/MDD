/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReinforcingMesh;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcing Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingMeshImpl#getMeshLength <em>Mesh Length</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingMeshImpl#getMeshWidth <em>Mesh Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingMeshImpl#getLongitudinalBarNominalDiameter <em>Longitudinal Bar Nominal Diameter</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingMeshImpl#getTransverseBarNominalDiameter <em>Transverse Bar Nominal Diameter</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingMeshImpl#getLongitudinalBarCrossSectionArea <em>Longitudinal Bar Cross Section Area</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingMeshImpl#getTransverseBarCrossSectionArea <em>Transverse Bar Cross Section Area</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingMeshImpl#getLongitudinalBarSpacing <em>Longitudinal Bar Spacing</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingMeshImpl#getTransverseBarSpacing <em>Transverse Bar Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReinforcingMeshImpl extends IfcReinforcingElementImpl implements IfcReinforcingMesh {
	/**
	 * The default value of the '{@link #getMeshLength() <em>Mesh Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshLength()
	 * @generated
	 * @ordered
	 */
	protected static final Double MESH_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeshLength() <em>Mesh Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshLength()
	 * @generated
	 * @ordered
	 */
	protected Double meshLength = MESH_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeshWidth() <em>Mesh Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double MESH_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeshWidth() <em>Mesh Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshWidth()
	 * @generated
	 * @ordered
	 */
	protected Double meshWidth = MESH_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalBarNominalDiameter() <em>Longitudinal Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDINAL_BAR_NOMINAL_DIAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitudinalBarNominalDiameter() <em>Longitudinal Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected double longitudinalBarNominalDiameter = LONGITUDINAL_BAR_NOMINAL_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransverseBarNominalDiameter() <em>Transverse Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSVERSE_BAR_NOMINAL_DIAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransverseBarNominalDiameter() <em>Transverse Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected double transverseBarNominalDiameter = TRANSVERSE_BAR_NOMINAL_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalBarCrossSectionArea() <em>Longitudinal Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDINAL_BAR_CROSS_SECTION_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitudinalBarCrossSectionArea() <em>Longitudinal Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected double longitudinalBarCrossSectionArea = LONGITUDINAL_BAR_CROSS_SECTION_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransverseBarCrossSectionArea() <em>Transverse Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSVERSE_BAR_CROSS_SECTION_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransverseBarCrossSectionArea() <em>Transverse Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected double transverseBarCrossSectionArea = TRANSVERSE_BAR_CROSS_SECTION_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalBarSpacing() <em>Longitudinal Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDINAL_BAR_SPACING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitudinalBarSpacing() <em>Longitudinal Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalBarSpacing()
	 * @generated
	 * @ordered
	 */
	protected double longitudinalBarSpacing = LONGITUDINAL_BAR_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransverseBarSpacing() <em>Transverse Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSVERSE_BAR_SPACING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransverseBarSpacing() <em>Transverse Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransverseBarSpacing()
	 * @generated
	 * @ordered
	 */
	protected double transverseBarSpacing = TRANSVERSE_BAR_SPACING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcingMeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcReinforcingMesh();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMeshLength() {
		return meshLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshLength(Double newMeshLength) {
		Double oldMeshLength = meshLength;
		meshLength = newMeshLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_MESH__MESH_LENGTH, oldMeshLength, meshLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMeshWidth() {
		return meshWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshWidth(Double newMeshWidth) {
		Double oldMeshWidth = meshWidth;
		meshWidth = newMeshWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_MESH__MESH_WIDTH, oldMeshWidth, meshWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitudinalBarNominalDiameter() {
		return longitudinalBarNominalDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarNominalDiameter(double newLongitudinalBarNominalDiameter) {
		double oldLongitudinalBarNominalDiameter = longitudinalBarNominalDiameter;
		longitudinalBarNominalDiameter = newLongitudinalBarNominalDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER, oldLongitudinalBarNominalDiameter, longitudinalBarNominalDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransverseBarNominalDiameter() {
		return transverseBarNominalDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarNominalDiameter(double newTransverseBarNominalDiameter) {
		double oldTransverseBarNominalDiameter = transverseBarNominalDiameter;
		transverseBarNominalDiameter = newTransverseBarNominalDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER, oldTransverseBarNominalDiameter, transverseBarNominalDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitudinalBarCrossSectionArea() {
		return longitudinalBarCrossSectionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarCrossSectionArea(double newLongitudinalBarCrossSectionArea) {
		double oldLongitudinalBarCrossSectionArea = longitudinalBarCrossSectionArea;
		longitudinalBarCrossSectionArea = newLongitudinalBarCrossSectionArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA, oldLongitudinalBarCrossSectionArea, longitudinalBarCrossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransverseBarCrossSectionArea() {
		return transverseBarCrossSectionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarCrossSectionArea(double newTransverseBarCrossSectionArea) {
		double oldTransverseBarCrossSectionArea = transverseBarCrossSectionArea;
		transverseBarCrossSectionArea = newTransverseBarCrossSectionArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA, oldTransverseBarCrossSectionArea, transverseBarCrossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitudinalBarSpacing() {
		return longitudinalBarSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarSpacing(double newLongitudinalBarSpacing) {
		double oldLongitudinalBarSpacing = longitudinalBarSpacing;
		longitudinalBarSpacing = newLongitudinalBarSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING, oldLongitudinalBarSpacing, longitudinalBarSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransverseBarSpacing() {
		return transverseBarSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarSpacing(double newTransverseBarSpacing) {
		double oldTransverseBarSpacing = transverseBarSpacing;
		transverseBarSpacing = newTransverseBarSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING, oldTransverseBarSpacing, transverseBarSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_REINFORCING_MESH__MESH_LENGTH:
				return getMeshLength();
			case FinalPackage.IFC_REINFORCING_MESH__MESH_WIDTH:
				return getMeshWidth();
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER:
				return getLongitudinalBarNominalDiameter();
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER:
				return getTransverseBarNominalDiameter();
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA:
				return getLongitudinalBarCrossSectionArea();
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA:
				return getTransverseBarCrossSectionArea();
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING:
				return getLongitudinalBarSpacing();
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING:
				return getTransverseBarSpacing();
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
			case FinalPackage.IFC_REINFORCING_MESH__MESH_LENGTH:
				setMeshLength((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__MESH_WIDTH:
				setMeshWidth((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER:
				setLongitudinalBarNominalDiameter((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER:
				setTransverseBarNominalDiameter((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA:
				setLongitudinalBarCrossSectionArea((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA:
				setTransverseBarCrossSectionArea((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING:
				setLongitudinalBarSpacing((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING:
				setTransverseBarSpacing((Double)newValue);
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
			case FinalPackage.IFC_REINFORCING_MESH__MESH_LENGTH:
				setMeshLength(MESH_LENGTH_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__MESH_WIDTH:
				setMeshWidth(MESH_WIDTH_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER:
				setLongitudinalBarNominalDiameter(LONGITUDINAL_BAR_NOMINAL_DIAMETER_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER:
				setTransverseBarNominalDiameter(TRANSVERSE_BAR_NOMINAL_DIAMETER_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA:
				setLongitudinalBarCrossSectionArea(LONGITUDINAL_BAR_CROSS_SECTION_AREA_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA:
				setTransverseBarCrossSectionArea(TRANSVERSE_BAR_CROSS_SECTION_AREA_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING:
				setLongitudinalBarSpacing(LONGITUDINAL_BAR_SPACING_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING:
				setTransverseBarSpacing(TRANSVERSE_BAR_SPACING_EDEFAULT);
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
			case FinalPackage.IFC_REINFORCING_MESH__MESH_LENGTH:
				return MESH_LENGTH_EDEFAULT == null ? meshLength != null : !MESH_LENGTH_EDEFAULT.equals(meshLength);
			case FinalPackage.IFC_REINFORCING_MESH__MESH_WIDTH:
				return MESH_WIDTH_EDEFAULT == null ? meshWidth != null : !MESH_WIDTH_EDEFAULT.equals(meshWidth);
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_NOMINAL_DIAMETER:
				return longitudinalBarNominalDiameter != LONGITUDINAL_BAR_NOMINAL_DIAMETER_EDEFAULT;
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_NOMINAL_DIAMETER:
				return transverseBarNominalDiameter != TRANSVERSE_BAR_NOMINAL_DIAMETER_EDEFAULT;
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_CROSS_SECTION_AREA:
				return longitudinalBarCrossSectionArea != LONGITUDINAL_BAR_CROSS_SECTION_AREA_EDEFAULT;
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_CROSS_SECTION_AREA:
				return transverseBarCrossSectionArea != TRANSVERSE_BAR_CROSS_SECTION_AREA_EDEFAULT;
			case FinalPackage.IFC_REINFORCING_MESH__LONGITUDINAL_BAR_SPACING:
				return longitudinalBarSpacing != LONGITUDINAL_BAR_SPACING_EDEFAULT;
			case FinalPackage.IFC_REINFORCING_MESH__TRANSVERSE_BAR_SPACING:
				return transverseBarSpacing != TRANSVERSE_BAR_SPACING_EDEFAULT;
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
		result.append(" (meshLength: ");
		result.append(meshLength);
		result.append(", meshWidth: ");
		result.append(meshWidth);
		result.append(", longitudinalBarNominalDiameter: ");
		result.append(longitudinalBarNominalDiameter);
		result.append(", transverseBarNominalDiameter: ");
		result.append(transverseBarNominalDiameter);
		result.append(", longitudinalBarCrossSectionArea: ");
		result.append(longitudinalBarCrossSectionArea);
		result.append(", transverseBarCrossSectionArea: ");
		result.append(transverseBarCrossSectionArea);
		result.append(", longitudinalBarSpacing: ");
		result.append(longitudinalBarSpacing);
		result.append(", transverseBarSpacing: ");
		result.append(transverseBarSpacing);
		result.append(')');
		return result.toString();
	}

} //IfcReinforcingMeshImpl
