/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDirection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDirectionImpl#getDirectionRatios <em>Direction Ratios</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDirectionImpl#getDirectionRatiosAsString <em>Direction Ratios As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDirectionImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDirectionImpl extends IfcGeometricRepresentationItemImpl implements IfcDirection {
	/**
	 * The cached value of the '{@link #getDirectionRatios() <em>Direction Ratios</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionRatios()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> directionRatios;

	/**
	 * The cached value of the '{@link #getDirectionRatiosAsString() <em>Direction Ratios As String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionRatiosAsString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> directionRatiosAsString;

	/**
	 * The default value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected static final int DIM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected int dim = DIM_EDEFAULT;

	/**
	 * This is true if the Dim attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dimESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDirectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDirection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getDirectionRatios() {
		if (directionRatios == null) {
			directionRatios = new EDataTypeEList<Double>(Double.class, this, Ifc2x3tc1Package.IFC_DIRECTION__DIRECTION_RATIOS);
		}
		return directionRatios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDirectionRatiosAsString() {
		if (directionRatiosAsString == null) {
			directionRatiosAsString = new EDataTypeEList<String>(String.class, this, Ifc2x3tc1Package.IFC_DIRECTION__DIRECTION_RATIOS_AS_STRING);
		}
		return directionRatiosAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDim() {
		return dim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDim(int newDim) {
		int oldDim = dim;
		dim = newDim;
		boolean oldDimESet = dimESet;
		dimESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DIRECTION__DIM, oldDim, dim, !oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDim() {
		int oldDim = dim;
		boolean oldDimESet = dimESet;
		dim = DIM_EDEFAULT;
		dimESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DIRECTION__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDim() {
		return dimESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DIRECTION__DIRECTION_RATIOS:
				return getDirectionRatios();
			case Ifc2x3tc1Package.IFC_DIRECTION__DIRECTION_RATIOS_AS_STRING:
				return getDirectionRatiosAsString();
			case Ifc2x3tc1Package.IFC_DIRECTION__DIM:
				return getDim();
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
			case Ifc2x3tc1Package.IFC_DIRECTION__DIRECTION_RATIOS:
				getDirectionRatios().clear();
				getDirectionRatios().addAll((Collection<? extends Double>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DIRECTION__DIRECTION_RATIOS_AS_STRING:
				getDirectionRatiosAsString().clear();
				getDirectionRatiosAsString().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DIRECTION__DIM:
				setDim((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_DIRECTION__DIRECTION_RATIOS:
				getDirectionRatios().clear();
				return;
			case Ifc2x3tc1Package.IFC_DIRECTION__DIRECTION_RATIOS_AS_STRING:
				getDirectionRatiosAsString().clear();
				return;
			case Ifc2x3tc1Package.IFC_DIRECTION__DIM:
				unsetDim();
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
			case Ifc2x3tc1Package.IFC_DIRECTION__DIRECTION_RATIOS:
				return directionRatios != null && !directionRatios.isEmpty();
			case Ifc2x3tc1Package.IFC_DIRECTION__DIRECTION_RATIOS_AS_STRING:
				return directionRatiosAsString != null && !directionRatiosAsString.isEmpty();
			case Ifc2x3tc1Package.IFC_DIRECTION__DIM:
				return isSetDim();
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
		result.append(" (DirectionRatios: ");
		result.append(directionRatios);
		result.append(", DirectionRatiosAsString: ");
		result.append(directionRatiosAsString);
		result.append(", Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcDirectionImpl
