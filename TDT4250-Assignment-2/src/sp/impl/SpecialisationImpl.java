/**
 */
package sp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import sp.SpPackage;
import sp.Specialisation;
import sp.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.SpecialisationImpl#getSecondSpesialisations <em>Second Spesialisations</em>}</li>
 *   <li>{@link sp.impl.SpecialisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link sp.impl.SpecialisationImpl#getYears <em>Years</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialisationImpl extends MinimalEObjectImpl.Container implements Specialisation {
	/**
	 * The cached value of the '{@link #getSecondSpesialisations() <em>Second Spesialisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondSpesialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> secondSpesialisations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getYears() <em>Years</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYears()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> years;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.SPECIALISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialisation> getSecondSpesialisations() {
		if (secondSpesialisations == null) {
			secondSpesialisations = new EObjectResolvingEList<Specialisation>(Specialisation.class, this, SpPackage.SPECIALISATION__SECOND_SPESIALISATIONS);
		}
		return secondSpesialisations;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.SPECIALISATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Year> getYears() {
		if (years == null) {
			years = new EObjectContainmentWithInverseEList<Year>(Year.class, this, SpPackage.SPECIALISATION__YEARS, SpPackage.YEAR__YEAR_IN_SPECIALISATION);
		}
		return years;
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
			case SpPackage.SPECIALISATION__YEARS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getYears()).basicAdd(otherEnd, msgs);
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
			case SpPackage.SPECIALISATION__YEARS:
				return ((InternalEList<?>)getYears()).basicRemove(otherEnd, msgs);
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
			case SpPackage.SPECIALISATION__SECOND_SPESIALISATIONS:
				return getSecondSpesialisations();
			case SpPackage.SPECIALISATION__NAME:
				return getName();
			case SpPackage.SPECIALISATION__YEARS:
				return getYears();
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
			case SpPackage.SPECIALISATION__SECOND_SPESIALISATIONS:
				getSecondSpesialisations().clear();
				getSecondSpesialisations().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case SpPackage.SPECIALISATION__NAME:
				setName((String)newValue);
				return;
			case SpPackage.SPECIALISATION__YEARS:
				getYears().clear();
				getYears().addAll((Collection<? extends Year>)newValue);
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
			case SpPackage.SPECIALISATION__SECOND_SPESIALISATIONS:
				getSecondSpesialisations().clear();
				return;
			case SpPackage.SPECIALISATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpPackage.SPECIALISATION__YEARS:
				getYears().clear();
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
			case SpPackage.SPECIALISATION__SECOND_SPESIALISATIONS:
				return secondSpesialisations != null && !secondSpesialisations.isEmpty();
			case SpPackage.SPECIALISATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpPackage.SPECIALISATION__YEARS:
				return years != null && !years.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecialisationImpl
