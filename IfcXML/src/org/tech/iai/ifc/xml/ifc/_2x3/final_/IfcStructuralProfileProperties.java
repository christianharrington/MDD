/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties()
 * @model extendedMetaData="name='IfcStructuralProfileProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcStructuralProfileProperties extends IfcGeneralProfileProperties {
	/**
	 * Returns the value of the '<em><b>Torsional Constant X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torsional Constant X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torsional Constant X</em>' attribute.
	 * @see #setTorsionalConstantX(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_TorsionalConstantX()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMomentOfInertiaMeasureObject"
	 *        extendedMetaData="kind='element' name='TorsionalConstantX' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getTorsionalConstantX();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torsional Constant X</em>' attribute.
	 * @see #getTorsionalConstantX()
	 * @generated
	 */
	void setTorsionalConstantX(Double value);

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia YZ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia YZ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia YZ</em>' attribute.
	 * @see #setMomentOfInertiaYZ(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_MomentOfInertiaYZ()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMomentOfInertiaMeasureObject"
	 *        extendedMetaData="kind='element' name='MomentOfInertiaYZ' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMomentOfInertiaYZ();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia YZ</em>' attribute.
	 * @see #getMomentOfInertiaYZ()
	 * @generated
	 */
	void setMomentOfInertiaYZ(Double value);

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia Y</em>' attribute.
	 * @see #setMomentOfInertiaY(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_MomentOfInertiaY()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMomentOfInertiaMeasureObject"
	 *        extendedMetaData="kind='element' name='MomentOfInertiaY' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMomentOfInertiaY();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia Y</em>' attribute.
	 * @see #getMomentOfInertiaY()
	 * @generated
	 */
	void setMomentOfInertiaY(Double value);

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia Z</em>' attribute.
	 * @see #setMomentOfInertiaZ(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_MomentOfInertiaZ()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMomentOfInertiaMeasureObject"
	 *        extendedMetaData="kind='element' name='MomentOfInertiaZ' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMomentOfInertiaZ();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia Z</em>' attribute.
	 * @see #getMomentOfInertiaZ()
	 * @generated
	 */
	void setMomentOfInertiaZ(Double value);

	/**
	 * Returns the value of the '<em><b>Warping Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warping Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warping Constant</em>' attribute.
	 * @see #setWarpingConstant(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_WarpingConstant()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWarpingConstantMeasureObject"
	 *        extendedMetaData="kind='element' name='WarpingConstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getWarpingConstant();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warping Constant</em>' attribute.
	 * @see #getWarpingConstant()
	 * @generated
	 */
	void setWarpingConstant(Double value);

	/**
	 * Returns the value of the '<em><b>Shear Centre Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Centre Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Centre Z</em>' attribute.
	 * @see #setShearCentreZ(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_ShearCentreZ()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='ShearCentreZ' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getShearCentreZ();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Centre Z</em>' attribute.
	 * @see #getShearCentreZ()
	 * @generated
	 */
	void setShearCentreZ(Double value);

	/**
	 * Returns the value of the '<em><b>Shear Centre Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Centre Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Centre Y</em>' attribute.
	 * @see #setShearCentreY(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_ShearCentreY()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='ShearCentreY' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getShearCentreY();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Centre Y</em>' attribute.
	 * @see #getShearCentreY()
	 * @generated
	 */
	void setShearCentreY(Double value);

	/**
	 * Returns the value of the '<em><b>Shear Deformation Area Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Deformation Area Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Deformation Area Z</em>' attribute.
	 * @see #setShearDeformationAreaZ(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_ShearDeformationAreaZ()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAreaMeasureObject"
	 *        extendedMetaData="kind='element' name='ShearDeformationAreaZ' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getShearDeformationAreaZ();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Deformation Area Z</em>' attribute.
	 * @see #getShearDeformationAreaZ()
	 * @generated
	 */
	void setShearDeformationAreaZ(Double value);

	/**
	 * Returns the value of the '<em><b>Shear Deformation Area Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Deformation Area Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Deformation Area Y</em>' attribute.
	 * @see #setShearDeformationAreaY(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_ShearDeformationAreaY()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAreaMeasureObject"
	 *        extendedMetaData="kind='element' name='ShearDeformationAreaY' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getShearDeformationAreaY();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Deformation Area Y</em>' attribute.
	 * @see #getShearDeformationAreaY()
	 * @generated
	 */
	void setShearDeformationAreaY(Double value);

	/**
	 * Returns the value of the '<em><b>Maximum Section Modulus Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Section Modulus Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Section Modulus Y</em>' attribute.
	 * @see #setMaximumSectionModulusY(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_MaximumSectionModulusY()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionModulusMeasureObject"
	 *        extendedMetaData="kind='element' name='MaximumSectionModulusY' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMaximumSectionModulusY();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Section Modulus Y</em>' attribute.
	 * @see #getMaximumSectionModulusY()
	 * @generated
	 */
	void setMaximumSectionModulusY(Double value);

	/**
	 * Returns the value of the '<em><b>Minimum Section Modulus Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Section Modulus Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Section Modulus Y</em>' attribute.
	 * @see #setMinimumSectionModulusY(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_MinimumSectionModulusY()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionModulusMeasureObject"
	 *        extendedMetaData="kind='element' name='MinimumSectionModulusY' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMinimumSectionModulusY();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Section Modulus Y</em>' attribute.
	 * @see #getMinimumSectionModulusY()
	 * @generated
	 */
	void setMinimumSectionModulusY(Double value);

	/**
	 * Returns the value of the '<em><b>Maximum Section Modulus Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Section Modulus Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Section Modulus Z</em>' attribute.
	 * @see #setMaximumSectionModulusZ(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_MaximumSectionModulusZ()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionModulusMeasureObject"
	 *        extendedMetaData="kind='element' name='MaximumSectionModulusZ' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMaximumSectionModulusZ();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Section Modulus Z</em>' attribute.
	 * @see #getMaximumSectionModulusZ()
	 * @generated
	 */
	void setMaximumSectionModulusZ(Double value);

	/**
	 * Returns the value of the '<em><b>Minimum Section Modulus Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Section Modulus Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Section Modulus Z</em>' attribute.
	 * @see #setMinimumSectionModulusZ(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_MinimumSectionModulusZ()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionModulusMeasureObject"
	 *        extendedMetaData="kind='element' name='MinimumSectionModulusZ' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMinimumSectionModulusZ();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Section Modulus Z</em>' attribute.
	 * @see #getMinimumSectionModulusZ()
	 * @generated
	 */
	void setMinimumSectionModulusZ(Double value);

	/**
	 * Returns the value of the '<em><b>Torsional Section Modulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torsional Section Modulus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torsional Section Modulus</em>' attribute.
	 * @see #setTorsionalSectionModulus(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_TorsionalSectionModulus()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionModulusMeasureObject"
	 *        extendedMetaData="kind='element' name='TorsionalSectionModulus' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getTorsionalSectionModulus();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torsional Section Modulus</em>' attribute.
	 * @see #getTorsionalSectionModulus()
	 * @generated
	 */
	void setTorsionalSectionModulus(Double value);

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In X</em>' attribute.
	 * @see #setCentreOfGravityInX(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_CentreOfGravityInX()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='CentreOfGravityInX' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getCentreOfGravityInX();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In X</em>' attribute.
	 * @see #getCentreOfGravityInX()
	 * @generated
	 */
	void setCentreOfGravityInX(Double value);

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #setCentreOfGravityInY(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralProfileProperties_CentreOfGravityInY()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='CentreOfGravityInY' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #getCentreOfGravityInY()
	 * @generated
	 */
	void setCentreOfGravityInY(Double value);

} // IfcStructuralProfileProperties
