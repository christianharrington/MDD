/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage
 * @generated
 */
public class CommonAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommonPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonSwitch<Adapter> modelSwitch =
		new CommonSwitch<Adapter>() {
			@Override
			public Adapter caseBase64Binary(Base64Binary object) {
				return createBase64BinaryAdapter();
			}
			@Override
			public Adapter caseBase64BinaryWrapperType(Base64BinaryWrapperType object) {
				return createBase64BinaryWrapperTypeAdapter();
			}
			@Override
			public Adapter caseBooleanWrapperType(BooleanWrapperType object) {
				return createBooleanWrapperTypeAdapter();
			}
			@Override
			public Adapter caseDecimalWrapperType(DecimalWrapperType object) {
				return createDecimalWrapperTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDoubleWrapperType(DoubleWrapperType object) {
				return createDoubleWrapperTypeAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseHexBinary(HexBinary object) {
				return createHexBinaryAdapter();
			}
			@Override
			public Adapter caseHexBinaryWrapperType(HexBinaryWrapperType object) {
				return createHexBinaryWrapperTypeAdapter();
			}
			@Override
			public Adapter caseIntegerWrapperType(IntegerWrapperType object) {
				return createIntegerWrapperTypeAdapter();
			}
			@Override
			public Adapter caseIso1030328HeaderType(Iso1030328HeaderType object) {
				return createIso1030328HeaderTypeAdapter();
			}
			@Override
			public Adapter caseIso1030328Type(Iso1030328Type object) {
				return createIso1030328TypeAdapter();
			}
			@Override
			public Adapter caseLogicalWrapperType(LogicalWrapperType object) {
				return createLogicalWrapperTypeAdapter();
			}
			@Override
			public Adapter caseLongWrapperType(LongWrapperType object) {
				return createLongWrapperTypeAdapter();
			}
			@Override
			public Adapter caseStringWrapperType(StringWrapperType object) {
				return createStringWrapperTypeAdapter();
			}
			@Override
			public Adapter caseUos(Uos object) {
				return createUosAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64Binary <em>Base64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64Binary
	 * @generated
	 */
	public Adapter createBase64BinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType <em>Base64 Binary Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType
	 * @generated
	 */
	public Adapter createBase64BinaryWrapperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType <em>Boolean Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType
	 * @generated
	 */
	public Adapter createBooleanWrapperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType <em>Decimal Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType
	 * @generated
	 */
	public Adapter createDecimalWrapperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType <em>Double Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType
	 * @generated
	 */
	public Adapter createDoubleWrapperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinary <em>Hex Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinary
	 * @generated
	 */
	public Adapter createHexBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType <em>Hex Binary Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType
	 * @generated
	 */
	public Adapter createHexBinaryWrapperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType <em>Integer Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType
	 * @generated
	 */
	public Adapter createIntegerWrapperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType <em>Iso1030328 Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType
	 * @generated
	 */
	public Adapter createIso1030328HeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type <em>Iso1030328 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type
	 * @generated
	 */
	public Adapter createIso1030328TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType <em>Logical Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType
	 * @generated
	 */
	public Adapter createLogicalWrapperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType <em>Long Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType
	 * @generated
	 */
	public Adapter createLongWrapperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType <em>String Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType
	 * @generated
	 */
	public Adapter createStringWrapperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos <em>Uos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos
	 * @generated
	 */
	public Adapter createUosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CommonAdapterFactory
