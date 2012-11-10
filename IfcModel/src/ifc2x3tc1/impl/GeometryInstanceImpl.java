/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.GeometryInstance;
import ifc2x3tc1.Ifc2x3tc1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import store.Bounds;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.GeometryInstanceImpl#getStartVertex <em>Start Vertex</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.GeometryInstanceImpl#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.GeometryInstanceImpl#getPrimitiveCount <em>Primitive Count</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.GeometryInstanceImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.GeometryInstanceImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.GeometryInstanceImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.GeometryInstanceImpl#getNormals <em>Normals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeometryInstanceImpl extends EObjectImpl implements GeometryInstance {
	/**
	 * The default value of the '{@link #getStartVertex() <em>Start Vertex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartVertex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_VERTEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartVertex() <em>Start Vertex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartVertex()
	 * @generated
	 * @ordered
	 */
	protected Integer startVertex = START_VERTEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer startIndex = START_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimitiveCount() <em>Primitive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIMITIVE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimitiveCount() <em>Primitive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveCount()
	 * @generated
	 * @ordered
	 */
	protected Integer primitiveCount = PRIMITIVE_COUNT_EDEFAULT;

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
	 * The default value of the '{@link #getIndices() <em>Indices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndices()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] INDICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndices() <em>Indices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndices()
	 * @generated
	 * @ordered
	 */
	protected byte[] indices = INDICES_EDEFAULT;

	/**
	 * The default value of the '{@link #getVertices() <em>Vertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] VERTICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVertices() <em>Vertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected byte[] vertices = VERTICES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormals() <em>Normals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormals()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] NORMALS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormals() <em>Normals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormals()
	 * @generated
	 * @ordered
	 */
	protected byte[] normals = NORMALS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getGeometryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartVertex() {
		return startVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartVertex(Integer newStartVertex) {
		Integer oldStartVertex = startVertex;
		startVertex = newStartVertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.GEOMETRY_INSTANCE__START_VERTEX, oldStartVertex, startVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartIndex() {
		return startIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIndex(Integer newStartIndex) {
		Integer oldStartIndex = startIndex;
		startIndex = newStartIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.GEOMETRY_INSTANCE__START_INDEX, oldStartIndex, startIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPrimitiveCount() {
		return primitiveCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveCount(Integer newPrimitiveCount) {
		Integer oldPrimitiveCount = primitiveCount;
		primitiveCount = newPrimitiveCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.GEOMETRY_INSTANCE__PRIMITIVE_COUNT, oldPrimitiveCount, primitiveCount));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.GEOMETRY_INSTANCE__BOUNDS, oldBounds, bounds));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.GEOMETRY_INSTANCE__BOUNDS, oldBounds, bounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getIndices() {
		return indices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndices(byte[] newIndices) {
		byte[] oldIndices = indices;
		indices = newIndices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.GEOMETRY_INSTANCE__INDICES, oldIndices, indices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getVertices() {
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertices(byte[] newVertices) {
		byte[] oldVertices = vertices;
		vertices = newVertices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.GEOMETRY_INSTANCE__VERTICES, oldVertices, vertices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getNormals() {
		return normals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormals(byte[] newNormals) {
		byte[] oldNormals = normals;
		normals = newNormals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.GEOMETRY_INSTANCE__NORMALS, oldNormals, normals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__START_VERTEX:
				return getStartVertex();
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__START_INDEX:
				return getStartIndex();
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__PRIMITIVE_COUNT:
				return getPrimitiveCount();
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__BOUNDS:
				if (resolve) return getBounds();
				return basicGetBounds();
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__INDICES:
				return getIndices();
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__VERTICES:
				return getVertices();
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__NORMALS:
				return getNormals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__START_VERTEX:
				setStartVertex((Integer)newValue);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__START_INDEX:
				setStartIndex((Integer)newValue);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__PRIMITIVE_COUNT:
				setPrimitiveCount((Integer)newValue);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__BOUNDS:
				setBounds((Bounds)newValue);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__INDICES:
				setIndices((byte[])newValue);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__VERTICES:
				setVertices((byte[])newValue);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__NORMALS:
				setNormals((byte[])newValue);
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
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__START_VERTEX:
				setStartVertex(START_VERTEX_EDEFAULT);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__START_INDEX:
				setStartIndex(START_INDEX_EDEFAULT);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__PRIMITIVE_COUNT:
				setPrimitiveCount(PRIMITIVE_COUNT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__BOUNDS:
				setBounds((Bounds)null);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__INDICES:
				setIndices(INDICES_EDEFAULT);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__VERTICES:
				setVertices(VERTICES_EDEFAULT);
				return;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__NORMALS:
				setNormals(NORMALS_EDEFAULT);
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
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__START_VERTEX:
				return START_VERTEX_EDEFAULT == null ? startVertex != null : !START_VERTEX_EDEFAULT.equals(startVertex);
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__START_INDEX:
				return START_INDEX_EDEFAULT == null ? startIndex != null : !START_INDEX_EDEFAULT.equals(startIndex);
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__PRIMITIVE_COUNT:
				return PRIMITIVE_COUNT_EDEFAULT == null ? primitiveCount != null : !PRIMITIVE_COUNT_EDEFAULT.equals(primitiveCount);
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__BOUNDS:
				return bounds != null;
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__INDICES:
				return INDICES_EDEFAULT == null ? indices != null : !INDICES_EDEFAULT.equals(indices);
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__VERTICES:
				return VERTICES_EDEFAULT == null ? vertices != null : !VERTICES_EDEFAULT.equals(vertices);
			case Ifc2x3tc1Package.GEOMETRY_INSTANCE__NORMALS:
				return NORMALS_EDEFAULT == null ? normals != null : !NORMALS_EDEFAULT.equals(normals);
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
		result.append(" (startVertex: ");
		result.append(startVertex);
		result.append(", startIndex: ");
		result.append(startIndex);
		result.append(", primitiveCount: ");
		result.append(primitiveCount);
		result.append(", indices: ");
		result.append(indices);
		result.append(", vertices: ");
		result.append(vertices);
		result.append(", normals: ");
		result.append(normals);
		result.append(')');
		return result.toString();
	}

} //GeometryInstanceImpl
