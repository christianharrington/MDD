/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Cost Schedule Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCostScheduleTypeEnum()
 * @model extendedMetaData="name='IfcCostScheduleTypeEnum'"
 * @generated
 */
public enum IfcCostScheduleTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Budget</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUDGET_VALUE
	 * @generated
	 * @ordered
	 */
	BUDGET(0, "budget", "budget"),

	/**
	 * The '<em><b>Costplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSTPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	COSTPLAN(1, "costplan", "costplan"),

	/**
	 * The '<em><b>Estimate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTIMATE_VALUE
	 * @generated
	 * @ordered
	 */
	ESTIMATE(2, "estimate", "estimate"),

	/**
	 * The '<em><b>Tender</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENDER_VALUE
	 * @generated
	 * @ordered
	 */
	TENDER(3, "tender", "tender"),

	/**
	 * The '<em><b>Pricedbillofquantities</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRICEDBILLOFQUANTITIES_VALUE
	 * @generated
	 * @ordered
	 */
	PRICEDBILLOFQUANTITIES(4, "pricedbillofquantities", "pricedbillofquantities"),

	/**
	 * The '<em><b>Unpricedbillofquantities</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPRICEDBILLOFQUANTITIES_VALUE
	 * @generated
	 * @ordered
	 */
	UNPRICEDBILLOFQUANTITIES(5, "unpricedbillofquantities", "unpricedbillofquantities"),

	/**
	 * The '<em><b>Scheduleofrates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULEOFRATES_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULEOFRATES(6, "scheduleofrates", "scheduleofrates"),

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
	 * The '<em><b>Budget</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Budget</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUDGET
	 * @model name="budget"
	 * @generated
	 * @ordered
	 */
	public static final int BUDGET_VALUE = 0;

	/**
	 * The '<em><b>Costplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Costplan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COSTPLAN
	 * @model name="costplan"
	 * @generated
	 * @ordered
	 */
	public static final int COSTPLAN_VALUE = 1;

	/**
	 * The '<em><b>Estimate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Estimate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESTIMATE
	 * @model name="estimate"
	 * @generated
	 * @ordered
	 */
	public static final int ESTIMATE_VALUE = 2;

	/**
	 * The '<em><b>Tender</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tender</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TENDER
	 * @model name="tender"
	 * @generated
	 * @ordered
	 */
	public static final int TENDER_VALUE = 3;

	/**
	 * The '<em><b>Pricedbillofquantities</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pricedbillofquantities</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRICEDBILLOFQUANTITIES
	 * @model name="pricedbillofquantities"
	 * @generated
	 * @ordered
	 */
	public static final int PRICEDBILLOFQUANTITIES_VALUE = 4;

	/**
	 * The '<em><b>Unpricedbillofquantities</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unpricedbillofquantities</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNPRICEDBILLOFQUANTITIES
	 * @model name="unpricedbillofquantities"
	 * @generated
	 * @ordered
	 */
	public static final int UNPRICEDBILLOFQUANTITIES_VALUE = 5;

	/**
	 * The '<em><b>Scheduleofrates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scheduleofrates</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHEDULEOFRATES
	 * @model name="scheduleofrates"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULEOFRATES_VALUE = 6;

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
	 * An array of all the '<em><b>Ifc Cost Schedule Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcCostScheduleTypeEnum[] VALUES_ARRAY =
		new IfcCostScheduleTypeEnum[] {
			BUDGET,
			COSTPLAN,
			ESTIMATE,
			TENDER,
			PRICEDBILLOFQUANTITIES,
			UNPRICEDBILLOFQUANTITIES,
			SCHEDULEOFRATES,
			USERDEFINED,
			NOTDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Cost Schedule Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcCostScheduleTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Cost Schedule Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCostScheduleTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCostScheduleTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Cost Schedule Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCostScheduleTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCostScheduleTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Cost Schedule Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCostScheduleTypeEnum get(int value) {
		switch (value) {
			case BUDGET_VALUE: return BUDGET;
			case COSTPLAN_VALUE: return COSTPLAN;
			case ESTIMATE_VALUE: return ESTIMATE;
			case TENDER_VALUE: return TENDER;
			case PRICEDBILLOFQUANTITIES_VALUE: return PRICEDBILLOFQUANTITIES;
			case UNPRICEDBILLOFQUANTITIES_VALUE: return UNPRICEDBILLOFQUANTITIES;
			case SCHEDULEOFRATES_VALUE: return SCHEDULEOFRATES;
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
	private IfcCostScheduleTypeEnum(int value, String name, String literal) {
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
	
} //IfcCostScheduleTypeEnum
