/**
 */
package sp.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;

import sp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see sp.SpPackage
 * @generated
 */
public class SpValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SpValidator INSTANCE = new SpValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "sp";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SpPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SpPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case SpPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case SpPackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case SpPackage.YEAR:
				return validateYear((Year)value, diagnostics, context);
			case SpPackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case SpPackage.COURSE_IN_SEMESTER:
				return validateCourseInSemester((CourseInSemester)value, diagnostics, context);
			case SpPackage.STUDY_PLAN:
				return validateStudyPlan((StudyPlan)value, diagnostics, context);
			case SpPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case SpPackage.COURSE_CODE:
				return validateCourseCode((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(year, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(year, diagnostics, context);
		if (result || diagnostics != null) result &= validateYear_needsEnoughCredits(year, diagnostics, context);
		return result;
	}

	/**
	 * Validates the needsEnoughCredits constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateYear_needsEnoughCredits(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		float creditSum = 0.0f;
		
		for (Semester semester : year.getSemesters()) {
			for (CourseInSemester cis : semester.getCourses()) {
				if (cis.isPicked()) {
					creditSum += cis.getCourse().getCredit();
				}
			}
		}
		
		// Year consists of less than 60 student points.
		if (creditSum < 60.0f) {
			
			// TODO Write a diagnostic detail, including severity, code and message here!
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseInSemester(CourseInSemester courseInSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseInSemester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(courseInSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(courseInSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(courseInSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(courseInSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(courseInSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(courseInSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(courseInSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(courseInSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseInSemester_courseIsPickedIfMandatory(courseInSemester, diagnostics, context);
		return result;
	}

	/**
	 * Validates the courseIsPickedIfMandatory constraint of '<em>Course In Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourseInSemester_courseIsPickedIfMandatory(CourseInSemester courseInSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (courseInSemester.isMandatory()) {
			courseInSemester.setPicked(true);
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlan(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCourseCode_Pattern(courseCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCourseCode_Pattern
	 */
	public static final  PatternMatcher [][] COURSE_CODE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\p{L}+\\d+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Course Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode_Pattern(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpPackage.Literals.COURSE_CODE, courseCode, COURSE_CODE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SpValidator
