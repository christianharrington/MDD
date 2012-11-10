/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPlanarExtent;
import ifc2x3tc1.IfcTextLiteralWithExtent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Literal With Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTextLiteralWithExtentImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTextLiteralWithExtentImpl#getBoxAlignment <em>Box Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextLiteralWithExtentImpl extends IfcTextLiteralImpl implements IfcTextLiteralWithExtent {
	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected IfcPlanarExtent extent;

	/**
	 * The default value of the '{@link #getBoxAlignment() <em>Box Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final String BOX_ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxAlignment() <em>Box Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxAlignment()
	 * @generated
	 * @ordered
	 */
	protected String boxAlignment = BOX_ALIGNMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextLiteralWithExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTextLiteralWithExtent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlanarExtent getExtent() {
		if (extent != null && extent.eIsProxy()) {
			InternalEObject oldExtent = (InternalEObject)extent;
			extent = (IfcPlanarExtent)eResolveProxy(oldExtent);
			if (extent != oldExtent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TEXT_LITERAL_WITH_EXTENT__EXTENT, oldExtent, extent));
			}
		}
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlanarExtent basicGetExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(IfcPlanarExtent newExtent) {
		IfcPlanarExtent oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_LITERAL_WITH_EXTENT__EXTENT, oldExtent, extent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoxAlignment() {
		return boxAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxAlignment(String newBoxAlignment) {
		String oldBoxAlignment = boxAlignment;
		boxAlignment = newBoxAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TEXT_LITERAL_WITH_EXTENT__BOX_ALIGNMENT, oldBoxAlignment, boxAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TEXT_LITERAL_WITH_EXTENT__EXTENT:
				if (resolve) return getExtent();
				return basicGetExtent();
			case Ifc2x3tc1Package.IFC_TEXT_LITERAL_WITH_EXTENT__BOX_ALIGNMENT:
				return getBoxAlignment();
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
			case Ifc2x3tc1Package.IFC_TEXT_LITERAL_WITH_EXTENT__EXTENT:
				setExtent((IfcPlanarExtent)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_LITERAL_WITH_EXTENT__BOX_ALIGNMENT:
				setBoxAlignment((String)newValue);
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
			case Ifc2x3tc1Package.IFC_TEXT_LITERAL_WITH_EXTENT__EXTENT:
				setExtent((IfcPlanarExtent)null);
				return;
			case Ifc2x3tc1Package.IFC_TEXT_LITERAL_WITH_EXTENT__BOX_ALIGNMENT:
				setBoxAlignment(BOX_ALIGNMENT_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_TEXT_LITERAL_WITH_EXTENT__EXTENT:
				return extent != null;
			case Ifc2x3tc1Package.IFC_TEXT_LITERAL_WITH_EXTENT__BOX_ALIGNMENT:
				return BOX_ALIGNMENT_EDEFAULT == null ? boxAlignment != null : !BOX_ALIGNMENT_EDEFAULT.equals(boxAlignment);
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
		result.append(" (BoxAlignment: ");
		result.append(boxAlignment);
		result.append(')');
		return result.toString();
	}

} //IfcTextLiteralWithExtentImpl
