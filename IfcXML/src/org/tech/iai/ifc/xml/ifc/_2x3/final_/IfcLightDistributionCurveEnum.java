/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Light Distribution Curve Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightDistributionCurveEnum()
 * @model extendedMetaData="name='IfcLightDistributionCurveEnum'"
 * @generated
 */
public enum IfcLightDistributionCurveEnum implements Enumerator {
	/**
	 * The '<em><b>Type A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_A_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_A(0, "typeA", "type_a"),

	/**
	 * The '<em><b>Type B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_B_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_B(1, "typeB", "type_b"),

	/**
	 * The '<em><b>Type C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_C_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_C(2, "typeC", "type_c"),

	/**
	 * The '<em><b>Notdefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(3, "notdefined", "notdefined");

	/**
	 * The '<em><b>Type A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Type A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPE_A
	 * @model name="typeA" literal="type_a"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_A_VALUE = 0;

	/**
	 * The '<em><b>Type B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Type B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPE_B
	 * @model name="typeB" literal="type_b"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_B_VALUE = 1;

	/**
	 * The '<em><b>Type C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Type C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPE_C
	 * @model name="typeC" literal="type_c"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_C_VALUE = 2;

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
	public static final int NOTDEFINED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Ifc Light Distribution Curve Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcLightDistributionCurveEnum[] VALUES_ARRAY =
		new IfcLightDistributionCurveEnum[] {
			TYPE_A,
			TYPE_B,
			TYPE_C,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Light Distribution Curve Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcLightDistributionCurveEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Light Distribution Curve Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLightDistributionCurveEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcLightDistributionCurveEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Light Distribution Curve Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLightDistributionCurveEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcLightDistributionCurveEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Light Distribution Curve Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLightDistributionCurveEnum get(int value) {
		switch (value) {
			case TYPE_A_VALUE: return TYPE_A;
			case TYPE_B_VALUE: return TYPE_B;
			case TYPE_C_VALUE: return TYPE_C;
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
	private IfcLightDistributionCurveEnum(int value, String name, String literal) {
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
	
} //IfcLightDistributionCurveEnum
