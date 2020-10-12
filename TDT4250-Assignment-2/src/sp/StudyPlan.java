/**
 */
package sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.StudyPlan#getDepartments <em>Departments</em>}</li>
 *   <li>{@link sp.StudyPlan#getStudentNr <em>Student Nr</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Departments</b></em>' containment reference list.
	 * The list contents are of type {@link sp.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' containment reference list.
	 * @see sp.SpPackage#getStudyPlan_Departments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Department> getDepartments();

	/**
	 * Returns the value of the '<em><b>Student Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student Nr</em>' attribute.
	 * @see #setStudentNr(int)
	 * @see sp.SpPackage#getStudyPlan_StudentNr()
	 * @model
	 * @generated
	 */
	int getStudentNr();

	/**
	 * Sets the value of the '{@link sp.StudyPlan#getStudentNr <em>Student Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student Nr</em>' attribute.
	 * @see #getStudentNr()
	 * @generated
	 */
	void setStudentNr(int value);

} // StudyPlan
