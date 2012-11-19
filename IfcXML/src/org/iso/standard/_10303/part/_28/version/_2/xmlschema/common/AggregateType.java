/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aggregate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getAggregateType()
 * @model extendedMetaData="name='aggregateType'"
 * @generated
 */
public enum AggregateType implements Enumerator {
	/**
	 * The '<em><b>Array</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY(0, "array", "array"),

	/**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(1, "list", "list"),

	/**
	 * The '<em><b>Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_VALUE
	 * @generated
	 * @ordered
	 */
	SET(2, "set", "set"),

	/**
	 * The '<em><b>Bag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAG_VALUE
	 * @generated
	 * @ordered
	 */
	BAG(3, "bag", "bag"),

	/**
	 * The '<em><b>Array Unique</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY_UNIQUE(4, "arrayUnique", "array-unique"),

	/**
	 * The '<em><b>Array Optional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY_OPTIONAL(5, "arrayOptional", "array-optional"),

	/**
	 * The '<em><b>Array Optional Unique</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_OPTIONAL_UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY_OPTIONAL_UNIQUE(6, "arrayOptionalUnique", "array-optional-unique"),

	/**
	 * The '<em><b>List Unique</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	LIST_UNIQUE(7, "listUnique", "list-unique");

	/**
	 * The '<em><b>Array</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Array</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARRAY
	 * @model name="array"
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_VALUE = 0;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model name="list"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 1;

	/**
	 * The '<em><b>Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Set</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @model name="set"
	 * @generated
	 * @ordered
	 */
	public static final int SET_VALUE = 2;

	/**
	 * The '<em><b>Bag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bag</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAG
	 * @model name="bag"
	 * @generated
	 * @ordered
	 */
	public static final int BAG_VALUE = 3;

	/**
	 * The '<em><b>Array Unique</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Array Unique</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARRAY_UNIQUE
	 * @model name="arrayUnique" literal="array-unique"
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_UNIQUE_VALUE = 4;

	/**
	 * The '<em><b>Array Optional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Array Optional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARRAY_OPTIONAL
	 * @model name="arrayOptional" literal="array-optional"
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_OPTIONAL_VALUE = 5;

	/**
	 * The '<em><b>Array Optional Unique</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Array Optional Unique</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARRAY_OPTIONAL_UNIQUE
	 * @model name="arrayOptionalUnique" literal="array-optional-unique"
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_OPTIONAL_UNIQUE_VALUE = 6;

	/**
	 * The '<em><b>List Unique</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>List Unique</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST_UNIQUE
	 * @model name="listUnique" literal="list-unique"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_UNIQUE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Aggregate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AggregateType[] VALUES_ARRAY =
		new AggregateType[] {
			ARRAY,
			LIST,
			SET,
			BAG,
			ARRAY_UNIQUE,
			ARRAY_OPTIONAL,
			ARRAY_OPTIONAL_UNIQUE,
			LIST_UNIQUE,
		};

	/**
	 * A public read-only list of all the '<em><b>Aggregate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AggregateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aggregate Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggregateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregate Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggregateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregate Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggregateType get(int value) {
		switch (value) {
			case ARRAY_VALUE: return ARRAY;
			case LIST_VALUE: return LIST;
			case SET_VALUE: return SET;
			case BAG_VALUE: return BAG;
			case ARRAY_UNIQUE_VALUE: return ARRAY_UNIQUE;
			case ARRAY_OPTIONAL_VALUE: return ARRAY_OPTIONAL;
			case ARRAY_OPTIONAL_UNIQUE_VALUE: return ARRAY_OPTIONAL_UNIQUE;
			case LIST_UNIQUE_VALUE: return LIST_UNIQUE;
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
	private AggregateType(int value, String name, String literal) {
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
	
} //AggregateType
