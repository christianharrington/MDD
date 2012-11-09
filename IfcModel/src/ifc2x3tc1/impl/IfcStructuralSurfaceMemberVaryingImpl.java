/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcShapeAspect;
import ifc2x3tc1.IfcStructuralSurfaceMemberVarying;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Surface Member Varying</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSurfaceMemberVaryingImpl#getSubsequentThickness <em>Subsequent Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSurfaceMemberVaryingImpl#getSubsequentThicknessAsString <em>Subsequent Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSurfaceMemberVaryingImpl#getVaryingThicknessLocation <em>Varying Thickness Location</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSurfaceMemberVaryingImpl#getVaryingThickness <em>Varying Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSurfaceMemberVaryingImpl#getVaryingThicknessAsString <em>Varying Thickness As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralSurfaceMemberVaryingImpl extends IfcStructuralSurfaceMemberImpl implements IfcStructuralSurfaceMemberVarying {
	/**
	 * The cached value of the '{@link #getSubsequentThickness() <em>Subsequent Thickness</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentThickness()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> subsequentThickness;

	/**
	 * The cached value of the '{@link #getSubsequentThicknessAsString() <em>Subsequent Thickness As String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subsequentThicknessAsString;

	/**
	 * The cached value of the '{@link #getVaryingThicknessLocation() <em>Varying Thickness Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaryingThicknessLocation()
	 * @generated
	 * @ordered
	 */
	protected IfcShapeAspect varyingThicknessLocation;

	/**
	 * The default value of the '{@link #getVaryingThickness() <em>Varying Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaryingThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double VARYING_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVaryingThickness() <em>Varying Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaryingThickness()
	 * @generated
	 * @ordered
	 */
	protected double varyingThickness = VARYING_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Varying Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean varyingThicknessESet;

	/**
	 * The default value of the '{@link #getVaryingThicknessAsString() <em>Varying Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaryingThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String VARYING_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVaryingThicknessAsString() <em>Varying Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaryingThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String varyingThicknessAsString = VARYING_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Varying Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean varyingThicknessAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralSurfaceMemberVaryingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getSubsequentThickness() {
		if (subsequentThickness == null) {
			subsequentThickness = new EDataTypeEList<Double>(Double.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS);
		}
		return subsequentThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubsequentThicknessAsString() {
		if (subsequentThicknessAsString == null) {
			subsequentThicknessAsString = new EDataTypeEList<String>(String.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS_AS_STRING);
		}
		return subsequentThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getVaryingThicknessLocation() {
		if (varyingThicknessLocation != null && varyingThicknessLocation.eIsProxy()) {
			InternalEObject oldVaryingThicknessLocation = (InternalEObject)varyingThicknessLocation;
			varyingThicknessLocation = (IfcShapeAspect)eResolveProxy(oldVaryingThicknessLocation);
			if (varyingThicknessLocation != oldVaryingThicknessLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION, oldVaryingThicknessLocation, varyingThicknessLocation));
			}
		}
		return varyingThicknessLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect basicGetVaryingThicknessLocation() {
		return varyingThicknessLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaryingThicknessLocation(IfcShapeAspect newVaryingThicknessLocation) {
		IfcShapeAspect oldVaryingThicknessLocation = varyingThicknessLocation;
		varyingThicknessLocation = newVaryingThicknessLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION, oldVaryingThicknessLocation, varyingThicknessLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVaryingThickness() {
		return varyingThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaryingThickness(double newVaryingThickness) {
		double oldVaryingThickness = varyingThickness;
		varyingThickness = newVaryingThickness;
		boolean oldVaryingThicknessESet = varyingThicknessESet;
		varyingThicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS, oldVaryingThickness, varyingThickness, !oldVaryingThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVaryingThickness() {
		double oldVaryingThickness = varyingThickness;
		boolean oldVaryingThicknessESet = varyingThicknessESet;
		varyingThickness = VARYING_THICKNESS_EDEFAULT;
		varyingThicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS, oldVaryingThickness, VARYING_THICKNESS_EDEFAULT, oldVaryingThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVaryingThickness() {
		return varyingThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVaryingThicknessAsString() {
		return varyingThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaryingThicknessAsString(String newVaryingThicknessAsString) {
		String oldVaryingThicknessAsString = varyingThicknessAsString;
		varyingThicknessAsString = newVaryingThicknessAsString;
		boolean oldVaryingThicknessAsStringESet = varyingThicknessAsStringESet;
		varyingThicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_AS_STRING, oldVaryingThicknessAsString, varyingThicknessAsString, !oldVaryingThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVaryingThicknessAsString() {
		String oldVaryingThicknessAsString = varyingThicknessAsString;
		boolean oldVaryingThicknessAsStringESet = varyingThicknessAsStringESet;
		varyingThicknessAsString = VARYING_THICKNESS_AS_STRING_EDEFAULT;
		varyingThicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_AS_STRING, oldVaryingThicknessAsString, VARYING_THICKNESS_AS_STRING_EDEFAULT, oldVaryingThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVaryingThicknessAsString() {
		return varyingThicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS:
				return getSubsequentThickness();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS_AS_STRING:
				return getSubsequentThicknessAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION:
				if (resolve) return getVaryingThicknessLocation();
				return basicGetVaryingThicknessLocation();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS:
				return getVaryingThickness();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_AS_STRING:
				return getVaryingThicknessAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS:
				getSubsequentThickness().clear();
				getSubsequentThickness().addAll((Collection<? extends Double>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS_AS_STRING:
				getSubsequentThicknessAsString().clear();
				getSubsequentThicknessAsString().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION:
				setVaryingThicknessLocation((IfcShapeAspect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS:
				setVaryingThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_AS_STRING:
				setVaryingThicknessAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS:
				getSubsequentThickness().clear();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS_AS_STRING:
				getSubsequentThicknessAsString().clear();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION:
				setVaryingThicknessLocation((IfcShapeAspect)null);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS:
				unsetVaryingThickness();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_AS_STRING:
				unsetVaryingThicknessAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS:
				return subsequentThickness != null && !subsequentThickness.isEmpty();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS_AS_STRING:
				return subsequentThicknessAsString != null && !subsequentThicknessAsString.isEmpty();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION:
				return varyingThicknessLocation != null;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS:
				return isSetVaryingThickness();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_AS_STRING:
				return isSetVaryingThicknessAsString();
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
		result.append(" (SubsequentThickness: ");
		result.append(subsequentThickness);
		result.append(", SubsequentThicknessAsString: ");
		result.append(subsequentThicknessAsString);
		result.append(", VaryingThickness: ");
		if (varyingThicknessESet) result.append(varyingThickness); else result.append("<unset>");
		result.append(", VaryingThicknessAsString: ");
		if (varyingThicknessAsStringESet) result.append(varyingThicknessAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralSurfaceMemberVaryingImpl
