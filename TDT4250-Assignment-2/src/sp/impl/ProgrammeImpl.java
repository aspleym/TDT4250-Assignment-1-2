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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sp.Programme;
import sp.SpPackage;
import sp.Specialisation;
import sp.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link sp.impl.ProgrammeImpl#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link sp.impl.ProgrammeImpl#getNumberOfYears <em>Number Of Years</em>}</li>
 *   <li>{@link sp.impl.ProgrammeImpl#getYears <em>Years</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
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
	 * The cached value of the '{@link #getSpecialisations() <em>Specialisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> specialisations;

	/**
	 * The default value of the '{@link #getNumberOfYears() <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfYears()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_YEARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfYears() <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfYears()
	 * @generated
	 * @ordered
	 */
	protected int numberOfYears = NUMBER_OF_YEARS_EDEFAULT;

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
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.PROGRAMME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialisation> getSpecialisations() {
		if (specialisations == null) {
			specialisations = new EObjectContainmentEList<Specialisation>(Specialisation.class, this, SpPackage.PROGRAMME__SPECIALISATIONS);
		}
		return specialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfYears(int newNumberOfYears) {
		int oldNumberOfYears = numberOfYears;
		numberOfYears = newNumberOfYears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.PROGRAMME__NUMBER_OF_YEARS, oldNumberOfYears, numberOfYears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Year> getYears() {
		if (years == null) {
			years = new EObjectContainmentWithInverseEList<Year>(Year.class, this, SpPackage.PROGRAMME__YEARS, SpPackage.YEAR__YEAR_IN_PROGRAMME);
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
			case SpPackage.PROGRAMME__YEARS:
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
			case SpPackage.PROGRAMME__SPECIALISATIONS:
				return ((InternalEList<?>)getSpecialisations()).basicRemove(otherEnd, msgs);
			case SpPackage.PROGRAMME__YEARS:
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
			case SpPackage.PROGRAMME__NAME:
				return getName();
			case SpPackage.PROGRAMME__SPECIALISATIONS:
				return getSpecialisations();
			case SpPackage.PROGRAMME__NUMBER_OF_YEARS:
				return getNumberOfYears();
			case SpPackage.PROGRAMME__YEARS:
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
			case SpPackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case SpPackage.PROGRAMME__SPECIALISATIONS:
				getSpecialisations().clear();
				getSpecialisations().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case SpPackage.PROGRAMME__NUMBER_OF_YEARS:
				setNumberOfYears((Integer)newValue);
				return;
			case SpPackage.PROGRAMME__YEARS:
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
			case SpPackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpPackage.PROGRAMME__SPECIALISATIONS:
				getSpecialisations().clear();
				return;
			case SpPackage.PROGRAMME__NUMBER_OF_YEARS:
				setNumberOfYears(NUMBER_OF_YEARS_EDEFAULT);
				return;
			case SpPackage.PROGRAMME__YEARS:
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
			case SpPackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpPackage.PROGRAMME__SPECIALISATIONS:
				return specialisations != null && !specialisations.isEmpty();
			case SpPackage.PROGRAMME__NUMBER_OF_YEARS:
				return numberOfYears != NUMBER_OF_YEARS_EDEFAULT;
			case SpPackage.PROGRAMME__YEARS:
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
		result.append(", numberOfYears: ");
		result.append(numberOfYears);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
