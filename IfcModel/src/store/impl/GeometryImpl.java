/**
 */
package store.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import store.Bounds;
import store.Geometry;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.GeometryImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link store.impl.GeometryImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link store.impl.GeometryImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link store.impl.GeometryImpl#getNormals <em>Normals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeometryImpl extends EObjectImpl implements Geometry {
	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Bounds bounds;

	/**
	 * The cached value of the '{@link #getIndices() <em>Indices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndices()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> indices;

	/**
	 * The cached value of the '{@link #getVertices() <em>Vertices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> vertices;

	/**
	 * The cached value of the '{@link #getNormals() <em>Normals</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormals()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> normals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bounds getBounds() {
		if (bounds != null && bounds.eIsProxy()) {
			InternalEObject oldBounds = (InternalEObject)bounds;
			bounds = (Bounds)eResolveProxy(oldBounds);
			if (bounds != oldBounds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.GEOMETRY__BOUNDS, oldBounds, bounds));
			}
		}
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bounds basicGetBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(Bounds newBounds) {
		Bounds oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEOMETRY__BOUNDS, oldBounds, bounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIndices() {
		if (indices == null) {
			indices = new EDataTypeEList<Integer>(Integer.class, this, StorePackage.GEOMETRY__INDICES);
		}
		return indices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getVertices() {
		if (vertices == null) {
			vertices = new EDataTypeEList<Float>(Float.class, this, StorePackage.GEOMETRY__VERTICES);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getNormals() {
		if (normals == null) {
			normals = new EDataTypeEList<Float>(Float.class, this, StorePackage.GEOMETRY__NORMALS);
		}
		return normals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.GEOMETRY__BOUNDS:
				if (resolve) return getBounds();
				return basicGetBounds();
			case StorePackage.GEOMETRY__INDICES:
				return getIndices();
			case StorePackage.GEOMETRY__VERTICES:
				return getVertices();
			case StorePackage.GEOMETRY__NORMALS:
				return getNormals();
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
			case StorePackage.GEOMETRY__BOUNDS:
				setBounds((Bounds)newValue);
				return;
			case StorePackage.GEOMETRY__INDICES:
				getIndices().clear();
				getIndices().addAll((Collection<? extends Integer>)newValue);
				return;
			case StorePackage.GEOMETRY__VERTICES:
				getVertices().clear();
				getVertices().addAll((Collection<? extends Float>)newValue);
				return;
			case StorePackage.GEOMETRY__NORMALS:
				getNormals().clear();
				getNormals().addAll((Collection<? extends Float>)newValue);
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
			case StorePackage.GEOMETRY__BOUNDS:
				setBounds((Bounds)null);
				return;
			case StorePackage.GEOMETRY__INDICES:
				getIndices().clear();
				return;
			case StorePackage.GEOMETRY__VERTICES:
				getVertices().clear();
				return;
			case StorePackage.GEOMETRY__NORMALS:
				getNormals().clear();
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
			case StorePackage.GEOMETRY__BOUNDS:
				return bounds != null;
			case StorePackage.GEOMETRY__INDICES:
				return indices != null && !indices.isEmpty();
			case StorePackage.GEOMETRY__VERTICES:
				return vertices != null && !vertices.isEmpty();
			case StorePackage.GEOMETRY__NORMALS:
				return normals != null && !normals.isEmpty();
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
		result.append(" (indices: ");
		result.append(indices);
		result.append(", vertices: ");
		result.append(vertices);
		result.append(", normals: ");
		result.append(normals);
		result.append(')');
		return result.toString();
	}

} //GeometryImpl
