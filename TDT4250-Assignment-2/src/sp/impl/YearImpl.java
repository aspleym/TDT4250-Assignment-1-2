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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import sp.Programme;
import sp.Semester;
import sp.SpPackage;
import sp.Specialisation;
import sp.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.YearImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link sp.impl.YearImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link sp.impl.YearImpl#getYearInProgramme <em>Year In Programme</em>}</li>
 *   <li>{@link sp.impl.YearImpl#getYearInSpecialisation <em>Year In Specialisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YearImpl extends MinimalEObjectImpl.Container implements Year {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.YEAR__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this, SpPackage.YEAR__SEMESTERS, SpPackage.SEMESTER__SEMESTER_IN_YEAR);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme getYearInProgramme() {
		if (eContainerFeatureID() != SpPackage.YEAR__YEAR_IN_PROGRAMME) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYearInProgramme(Programme newYearInProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newYearInProgramme, SpPackage.YEAR__YEAR_IN_PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearInProgramme(Programme newYearInProgramme) {
		if (newYearInProgramme != eInternalContainer() || (eContainerFeatureID() != SpPackage.YEAR__YEAR_IN_PROGRAMME && newYearInProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newYearInProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newYearInProgramme != null)
				msgs = ((InternalEObject)newYearInProgramme).eInverseAdd(this, SpPackage.PROGRAMME__YEARS, Programme.class, msgs);
			msgs = basicSetYearInProgramme(newYearInProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.YEAR__YEAR_IN_PROGRAMME, newYearInProgramme, newYearInProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation getYearInSpecialisation() {
		if (eContainerFeatureID() != SpPackage.YEAR__YEAR_IN_SPECIALISATION) return null;
		return (Specialisation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYearInSpecialisation(Specialisation newYearInSpecialisation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newYearInSpecialisation, SpPackage.YEAR__YEAR_IN_SPECIALISATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearInSpecialisation(Specialisation newYearInSpecialisation) {
		if (newYearInSpecialisation != eInternalContainer() || (eContainerFeatureID() != SpPackage.YEAR__YEAR_IN_SPECIALISATION && newYearInSpecialisation != null)) {
			if (EcoreUtil.isAncestor(this, newYearInSpecialisation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newYearInSpecialisation != null)
				msgs = ((InternalEObject)newYearInSpecialisation).eInverseAdd(this, SpPackage.SPECIALISATION__YEARS, Specialisation.class, msgs);
			msgs = basicSetYearInSpecialisation(newYearInSpecialisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.YEAR__YEAR_IN_SPECIALISATION, newYearInSpecialisation, newYearInSpecialisation));
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
			case SpPackage.YEAR__SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
			case SpPackage.YEAR__YEAR_IN_PROGRAMME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetYearInProgramme((Programme)otherEnd, msgs);
			case SpPackage.YEAR__YEAR_IN_SPECIALISATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetYearInSpecialisation((Specialisation)otherEnd, msgs);
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
			case SpPackage.YEAR__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case SpPackage.YEAR__YEAR_IN_PROGRAMME:
				return basicSetYearInProgramme(null, msgs);
			case SpPackage.YEAR__YEAR_IN_SPECIALISATION:
				return basicSetYearInSpecialisation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SpPackage.YEAR__YEAR_IN_PROGRAMME:
				return eInternalContainer().eInverseRemove(this, SpPackage.PROGRAMME__YEARS, Programme.class, msgs);
			case SpPackage.YEAR__YEAR_IN_SPECIALISATION:
				return eInternalContainer().eInverseRemove(this, SpPackage.SPECIALISATION__YEARS, Specialisation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpPackage.YEAR__NUMBER:
				return getNumber();
			case SpPackage.YEAR__SEMESTERS:
				return getSemesters();
			case SpPackage.YEAR__YEAR_IN_PROGRAMME:
				return getYearInProgramme();
			case SpPackage.YEAR__YEAR_IN_SPECIALISATION:
				return getYearInSpecialisation();
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
			case SpPackage.YEAR__NUMBER:
				setNumber((Integer)newValue);
				return;
			case SpPackage.YEAR__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case SpPackage.YEAR__YEAR_IN_PROGRAMME:
				setYearInProgramme((Programme)newValue);
				return;
			case SpPackage.YEAR__YEAR_IN_SPECIALISATION:
				setYearInSpecialisation((Specialisation)newValue);
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
			case SpPackage.YEAR__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case SpPackage.YEAR__SEMESTERS:
				getSemesters().clear();
				return;
			case SpPackage.YEAR__YEAR_IN_PROGRAMME:
				setYearInProgramme((Programme)null);
				return;
			case SpPackage.YEAR__YEAR_IN_SPECIALISATION:
				setYearInSpecialisation((Specialisation)null);
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
			case SpPackage.YEAR__NUMBER:
				return number != NUMBER_EDEFAULT;
			case SpPackage.YEAR__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case SpPackage.YEAR__YEAR_IN_PROGRAMME:
				return getYearInProgramme() != null;
			case SpPackage.YEAR__YEAR_IN_SPECIALISATION:
				return getYearInSpecialisation() != null;
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //YearImpl
