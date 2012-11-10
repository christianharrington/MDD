/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBlobTexture;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Blob Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBlobTextureImpl#getRasterFormat <em>Raster Format</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBlobTextureImpl#getRasterCode <em>Raster Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBlobTextureImpl extends IfcSurfaceTextureImpl implements IfcBlobTexture {
	/**
	 * The default value of the '{@link #getRasterFormat() <em>Raster Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRasterFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String RASTER_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRasterFormat() <em>Raster Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRasterFormat()
	 * @generated
	 * @ordered
	 */
	protected String rasterFormat = RASTER_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRasterCode() <em>Raster Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRasterCode()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate RASTER_CODE_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getRasterCode() <em>Raster Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRasterCode()
	 * @generated
	 * @ordered
	 */
	protected Tristate rasterCode = RASTER_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBlobTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcBlobTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRasterFormat() {
		return rasterFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRasterFormat(String newRasterFormat) {
		String oldRasterFormat = rasterFormat;
		rasterFormat = newRasterFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BLOB_TEXTURE__RASTER_FORMAT, oldRasterFormat, rasterFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getRasterCode() {
		return rasterCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRasterCode(Tristate newRasterCode) {
		Tristate oldRasterCode = rasterCode;
		rasterCode = newRasterCode == null ? RASTER_CODE_EDEFAULT : newRasterCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BLOB_TEXTURE__RASTER_CODE, oldRasterCode, rasterCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BLOB_TEXTURE__RASTER_FORMAT:
				return getRasterFormat();
			case Ifc2x3tc1Package.IFC_BLOB_TEXTURE__RASTER_CODE:
				return getRasterCode();
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
			case Ifc2x3tc1Package.IFC_BLOB_TEXTURE__RASTER_FORMAT:
				setRasterFormat((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BLOB_TEXTURE__RASTER_CODE:
				setRasterCode((Tristate)newValue);
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
			case Ifc2x3tc1Package.IFC_BLOB_TEXTURE__RASTER_FORMAT:
				setRasterFormat(RASTER_FORMAT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BLOB_TEXTURE__RASTER_CODE:
				setRasterCode(RASTER_CODE_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_BLOB_TEXTURE__RASTER_FORMAT:
				return RASTER_FORMAT_EDEFAULT == null ? rasterFormat != null : !RASTER_FORMAT_EDEFAULT.equals(rasterFormat);
			case Ifc2x3tc1Package.IFC_BLOB_TEXTURE__RASTER_CODE:
				return rasterCode != RASTER_CODE_EDEFAULT;
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
		result.append(" (RasterFormat: ");
		result.append(rasterFormat);
		result.append(", RasterCode: ");
		result.append(rasterCode);
		result.append(')');
		return result.toString();
	}

} //IfcBlobTextureImpl
