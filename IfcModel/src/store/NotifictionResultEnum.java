/**
 */
package store;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Notifiction Result Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see store.StorePackage#getNotifictionResultEnum()
 * @model
 * @generated
 */
public enum NotifictionResultEnum implements Enumerator {
	/**
	 * The '<em><b>ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(0, "ERROR", "ERROR"),

	/**
	 * The '<em><b>SUCCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESS(1, "SUCCESS", "SUCCESS"),

	/**
	 * The '<em><b>PROGRESS UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRESS_UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRESS_UNKNOWN(2, "PROGRESS_UNKNOWN", "PROGRESS_UNKNOWN"),

	/**
	 * The '<em><b>PROGRESS PERCENTAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRESS_PERCENTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRESS_PERCENTAGE(3, "PROGRESS_PERCENTAGE", "PROGRESS_PERCENTAGE");

	/**
	 * The '<em><b>ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 0;

	/**
	 * The '<em><b>SUCCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUCCESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESS_VALUE = 1;

	/**
	 * The '<em><b>PROGRESS UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROGRESS UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROGRESS_UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROGRESS_UNKNOWN_VALUE = 2;

	/**
	 * The '<em><b>PROGRESS PERCENTAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROGRESS PERCENTAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROGRESS_PERCENTAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROGRESS_PERCENTAGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Notifiction Result Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NotifictionResultEnum[] VALUES_ARRAY =
		new NotifictionResultEnum[] {
			ERROR,
			SUCCESS,
			PROGRESS_UNKNOWN,
			PROGRESS_PERCENTAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Notifiction Result Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NotifictionResultEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Notifiction Result Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NotifictionResultEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotifictionResultEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notifiction Result Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NotifictionResultEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotifictionResultEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notifiction Result Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NotifictionResultEnum get(int value) {
		switch (value) {
			case ERROR_VALUE: return ERROR;
			case SUCCESS_VALUE: return SUCCESS;
			case PROGRESS_UNKNOWN_VALUE: return PROGRESS_UNKNOWN;
			case PROGRESS_PERCENTAGE_VALUE: return PROGRESS_PERCENTAGE;
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
	private NotifictionResultEnum(int value, String name, String literal) {
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
	
} //NotifictionResultEnum
