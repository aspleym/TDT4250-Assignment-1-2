/**
 */
package sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.Programme#getName <em>Name</em>}</li>
 *   <li>{@link sp.Programme#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link sp.Programme#getNumberOfYears <em>Number Of Years</em>}</li>
 *   <li>{@link sp.Programme#getYears <em>Years</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sp.SpPackage#getProgramme_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sp.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link sp.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' containment reference list.
	 * @see sp.SpPackage#getProgramme_Specialisations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisations();

	/**
	 * Returns the value of the '<em><b>Number Of Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Years</em>' attribute.
	 * @see #setNumberOfYears(int)
	 * @see sp.SpPackage#getProgramme_NumberOfYears()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfYears();

	/**
	 * Sets the value of the '{@link sp.Programme#getNumberOfYears <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Years</em>' attribute.
	 * @see #getNumberOfYears()
	 * @generated
	 */
	void setNumberOfYears(int value);

	/**
	 * Returns the value of the '<em><b>Years</b></em>' containment reference list.
	 * The list contents are of type {@link sp.Year}.
	 * It is bidirectional and its opposite is '{@link sp.Year#getYearInProgramme <em>Year In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years</em>' containment reference list.
	 * @see sp.SpPackage#getProgramme_Years()
	 * @see sp.Year#getYearInProgramme
	 * @model opposite="yearInProgramme" containment="true" required="true"
	 * @generated
	 */
	EList<Year> getYears();

} // Programme
