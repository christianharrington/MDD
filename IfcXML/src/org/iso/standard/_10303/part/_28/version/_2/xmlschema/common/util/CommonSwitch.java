/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage
 * @generated
 */
public class CommonSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonSwitch() {
		if (modelPackage == null) {
			modelPackage = CommonPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CommonPackage.BASE64_BINARY: {
				Base64Binary base64Binary = (Base64Binary)theEObject;
				T result = caseBase64Binary(base64Binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.BASE64_BINARY_WRAPPER_TYPE: {
				Base64BinaryWrapperType base64BinaryWrapperType = (Base64BinaryWrapperType)theEObject;
				T result = caseBase64BinaryWrapperType(base64BinaryWrapperType);
				if (result == null) result = caseBase64Binary(base64BinaryWrapperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.BOOLEAN_WRAPPER_TYPE: {
				BooleanWrapperType booleanWrapperType = (BooleanWrapperType)theEObject;
				T result = caseBooleanWrapperType(booleanWrapperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.DECIMAL_WRAPPER_TYPE: {
				DecimalWrapperType decimalWrapperType = (DecimalWrapperType)theEObject;
				T result = caseDecimalWrapperType(decimalWrapperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.DOUBLE_WRAPPER_TYPE: {
				DoubleWrapperType doubleWrapperType = (DoubleWrapperType)theEObject;
				T result = caseDoubleWrapperType(doubleWrapperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.HEX_BINARY: {
				HexBinary hexBinary = (HexBinary)theEObject;
				T result = caseHexBinary(hexBinary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.HEX_BINARY_WRAPPER_TYPE: {
				HexBinaryWrapperType hexBinaryWrapperType = (HexBinaryWrapperType)theEObject;
				T result = caseHexBinaryWrapperType(hexBinaryWrapperType);
				if (result == null) result = caseHexBinary(hexBinaryWrapperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.INTEGER_WRAPPER_TYPE: {
				IntegerWrapperType integerWrapperType = (IntegerWrapperType)theEObject;
				T result = caseIntegerWrapperType(integerWrapperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ISO1030328_HEADER_TYPE: {
				Iso1030328HeaderType iso1030328HeaderType = (Iso1030328HeaderType)theEObject;
				T result = caseIso1030328HeaderType(iso1030328HeaderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ISO1030328_TYPE: {
				Iso1030328Type iso1030328Type = (Iso1030328Type)theEObject;
				T result = caseIso1030328Type(iso1030328Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.LOGICAL_WRAPPER_TYPE: {
				LogicalWrapperType logicalWrapperType = (LogicalWrapperType)theEObject;
				T result = caseLogicalWrapperType(logicalWrapperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.LONG_WRAPPER_TYPE: {
				LongWrapperType longWrapperType = (LongWrapperType)theEObject;
				T result = caseLongWrapperType(longWrapperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.STRING_WRAPPER_TYPE: {
				StringWrapperType stringWrapperType = (StringWrapperType)theEObject;
				T result = caseStringWrapperType(stringWrapperType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.UOS: {
				Uos uos = (Uos)theEObject;
				T result = caseUos(uos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64Binary(Base64Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64 Binary Wrapper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64 Binary Wrapper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64BinaryWrapperType(Base64BinaryWrapperType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Wrapper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Wrapper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanWrapperType(BooleanWrapperType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Wrapper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Wrapper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalWrapperType(DecimalWrapperType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Wrapper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Wrapper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleWrapperType(DoubleWrapperType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hex Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hex Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHexBinary(HexBinary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hex Binary Wrapper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hex Binary Wrapper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHexBinaryWrapperType(HexBinaryWrapperType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Wrapper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Wrapper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerWrapperType(IntegerWrapperType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iso1030328 Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iso1030328 Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIso1030328HeaderType(Iso1030328HeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iso1030328 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iso1030328 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIso1030328Type(Iso1030328Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Wrapper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Wrapper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalWrapperType(LogicalWrapperType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Wrapper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Wrapper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongWrapperType(LongWrapperType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Wrapper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Wrapper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringWrapperType(StringWrapperType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUos(Uos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CommonSwitch
