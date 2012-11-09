/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAnnotationSurface;
import ifc2x3tc1.IfcTextureCoordinate;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Texture Coordinate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTextureCoordinateImpl#getAnnotatedSurface <em>Annotated Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextureCoordinateImpl extends EObjectImpl implements IfcTextureCoordinate {
	/**
	 * The cached value of the '{@link #getAnnotatedSurface() <em>Annotated Surface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedSurface()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcAnnotationSurface> annotatedSurface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextureCoordinateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTextureCoordinate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAnnotationSurface> getAnnotatedSurface() {
		if (annotatedSurface == null) {
			annotatedSurface = new EObjectWithInverseResolvingEList.Unsettable<IfcAnnotationSurface>(IfcAnnotationSurface.class, this, Ifc2x3tc1Package.IFC_TEXTURE_COORDINATE__ANNOTATED_SURFACE, Ifc2x3tc1Package.IFC_ANNOTATION_SURFACE__TEXTURE_COORDINATES);
		}
		return annotatedSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnnotatedSurface() {
		if (annotatedSurface != null) ((InternalEList.Unsettable<?>)annotatedSurface).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnnotatedSurface() {
		return annotatedSurface != null && ((InternalEList.Unsettable<?>)annotatedSurface).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXTURE_COORDINATE__ANNOTATED_SURFACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotatedSurface()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXTURE_COORDINATE__ANNOTATED_SURFACE:
				return ((InternalEList<?>)getAnnotatedSurface()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXTURE_COORDINATE__ANNOTATED_SURFACE:
				return getAnnotatedSurface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXTURE_COORDINATE__ANNOTATED_SURFACE:
				getAnnotatedSurface().clear();
				getAnnotatedSurface().addAll((Collection<? extends IfcAnnotationSurface>)newValue);
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
			case Ifc2x3tc1Package.IFC_TEXTURE_COORDINATE__ANNOTATED_SURFACE:
				unsetAnnotatedSurface();
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
			case Ifc2x3tc1Package.IFC_TEXTURE_COORDINATE__ANNOTATED_SURFACE:
				return isSetAnnotatedSurface();
		}
		return super.eIsSet(featureID);
	}

} //IfcTextureCoordinateImpl
