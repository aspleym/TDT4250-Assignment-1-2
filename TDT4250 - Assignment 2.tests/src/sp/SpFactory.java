/**
 */
package sp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sp.SpPackage
 * @generated
 */
public interface SpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpFactory eINSTANCE = sp.impl.SpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semester</em>'.
	 * @generated
	 */
	Semester createSemester();

	/**
	 * Returns a new object of class '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme</em>'.
	 * @generated
	 */
	Programme createProgramme();

	/**
	 * Returns a new object of class '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Year</em>'.
	 * @generated
	 */
	Year createYear();

	/**
	 * Returns a new object of class '<em>Specialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialisation</em>'.
	 * @generated
	 */
	Specialisation createSpecialisation();

	/**
	 * Returns a new object of class '<em>Course In Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course In Semester</em>'.
	 * @generated
	 */
	CourseInSemester createCourseInSemester();

	/**
	 * Returns a new object of class '<em>Study Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Study Plan</em>'.
	 * @generated
	 */
	StudyPlan createStudyPlan();

	/**
	 * Returns a new object of class '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department</em>'.
	 * @generated
	 */
	Department createDepartment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpPackage getSpPackage();

} //SpFactory
