/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Geometric Projection Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeometricProjectionEnum()
 * @model extendedMetaData="name='IfcGeometricProjectionEnum'"
 * @generated
 */
public enum IfcGeometricProjectionEnum implements Enumerator {
	/**
	 * The '<em><b>Graph View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPH_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPH_VIEW(0, "graphView", "graph_view"),

	/**
	 * The '<em><b>Sketch View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKETCH_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	SKETCH_VIEW(1, "sketchView", "sketch_view"),

	/**
	 * The '<em><b>Model View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_VIEW(2, "modelView", "model_view"),

	/**
	 * The '<em><b>Plan View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN_VIEW(3, "planView", "plan_view"),

	/**
	 * The '<em><b>Reflected Plan View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFLECTED_PLAN_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	REFLECTED_PLAN_VIEW(4, "reflectedPlanView", "reflected_plan_view"),

	/**
	 * The '<em><b>Section View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECTION_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	SECTION_VIEW(5, "sectionView", "section_view"),

	/**
	 * The '<em><b>Elevation View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATION_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	ELEVATION_VIEW(6, "elevationView", "elevation_view"),

	/**
	 * The '<em><b>Userdefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(7, "userdefined", "userdefined"),

	/**
	 * The '<em><b>Notdefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(8, "notdefined", "notdefined");

	/**
	 * The '<em><b>Graph View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Graph View</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAPH_VIEW
	 * @model name="graphView" literal="graph_view"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPH_VIEW_VALUE = 0;

	/**
	 * The '<em><b>Sketch View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sketch View</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SKETCH_VIEW
	 * @model name="sketchView" literal="sketch_view"
	 * @generated
	 * @ordered
	 */
	public static final int SKETCH_VIEW_VALUE = 1;

	/**
	 * The '<em><b>Model View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Model View</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODEL_VIEW
	 * @model name="modelView" literal="model_view"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_VIEW_VALUE = 2;

	/**
	 * The '<em><b>Plan View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plan View</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAN_VIEW
	 * @model name="planView" literal="plan_view"
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_VIEW_VALUE = 3;

	/**
	 * The '<em><b>Reflected Plan View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reflected Plan View</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFLECTED_PLAN_VIEW
	 * @model name="reflectedPlanView" literal="reflected_plan_view"
	 * @generated
	 * @ordered
	 */
	public static final int REFLECTED_PLAN_VIEW_VALUE = 4;

	/**
	 * The '<em><b>Section View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Section View</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECTION_VIEW
	 * @model name="sectionView" literal="section_view"
	 * @generated
	 * @ordered
	 */
	public static final int SECTION_VIEW_VALUE = 5;

	/**
	 * The '<em><b>Elevation View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Elevation View</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELEVATION_VIEW
	 * @model name="elevationView" literal="elevation_view"
	 * @generated
	 * @ordered
	 */
	public static final int ELEVATION_VIEW_VALUE = 6;

	/**
	 * The '<em><b>Userdefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Userdefined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED
	 * @model name="userdefined"
	 * @generated
	 * @ordered
	 */
	public static final int USERDEFINED_VALUE = 7;

	/**
	 * The '<em><b>Notdefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Notdefined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED
	 * @model name="notdefined"
	 * @generated
	 * @ordered
	 */
	public static final int NOTDEFINED_VALUE = 8;

	/**
	 * An array of all the '<em><b>Ifc Geometric Projection Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcGeometricProjectionEnum[] VALUES_ARRAY =
		new IfcGeometricProjectionEnum[] {
			GRAPH_VIEW,
			SKETCH_VIEW,
			MODEL_VIEW,
			PLAN_VIEW,
			REFLECTED_PLAN_VIEW,
			SECTION_VIEW,
			ELEVATION_VIEW,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Geometric Projection Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcGeometricProjectionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Geometric Projection Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcGeometricProjectionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcGeometricProjectionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Geometric Projection Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcGeometricProjectionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcGeometricProjectionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Geometric Projection Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcGeometricProjectionEnum get(int value) {
		switch (value) {
			case GRAPH_VIEW_VALUE: return GRAPH_VIEW;
			case SKETCH_VIEW_VALUE: return SKETCH_VIEW;
			case MODEL_VIEW_VALUE: return MODEL_VIEW;
			case PLAN_VIEW_VALUE: return PLAN_VIEW;
			case REFLECTED_PLAN_VIEW_VALUE: return REFLECTED_PLAN_VIEW;
			case SECTION_VIEW_VALUE: return SECTION_VIEW;
			case ELEVATION_VIEW_VALUE: return ELEVATION_VIEW;
			case USERDEFINED_VALUE: return USERDEFINED;
			case NOTDEFINED_VALUE: return NOTDEFINED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IfcGeometricProjectionEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //IfcGeometricProjectionEnum
