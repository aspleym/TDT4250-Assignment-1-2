package studyplan.xtext

import sp.Department;
import sp.Course;
import sp.Programme;
import sp.Year;
import sp.Semester;
import sp.Specialisation;

class Generator {
		def String generateHtml(Department dep) {
		generateHtml(dep, new StringBuilder).toString
	}

	def CharSequence generateHtml(Department dep, StringBuilder stringbuilder) {
		stringbuilder << '''
<!DOCTYPE html>
<html lang="en">
<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <link rel="stylesheet" href="main.css">
	    <title>Studyplan</title
</head>
<body>
'''	
		generateOutput(dep, stringbuilder) // Start generating content from the model here

// Adding the javascript file and the end of the html file here
		stringbuilder << '''

</body>



<script src="script.js"></script>

</html>'''
	}
	
	// Generates html from data in the department model 
	def dispatch void generateOutput(Department dep, StringBuilder stringbuilder) { 
		stringbuilder << "<div class='content'>\n"
    	stringbuilder << "<div class='department'>" << dep.name << "</div>\n"
    	stringbuilder << '''
    	<div style="padding-top: 40px">
    	<div class="dropdown" id="dropdownButton">
    	  <button onclick="myFunction()" class="dropbtn">Study plans</button>
    	  <div id="myDropdown" class="dropdown-content">
    	'''
    	dep.programmes.forEach[generateDropdown(it, stringbuilder)]
    	stringbuilder << '''
    	  </div>
    	</div>
    	</div>
    	'''
    	dep.programmes.forEach[generateOutput(it, stringbuilder)]
    	stringbuilder << "</div>\n"
	}
	
	def void generateDropdown(Programme pro, StringBuilder stringbuilder) {
		stringbuilder << "<input type='button' name='answer' value='" << pro.name <<"' onclick='showDiv(value)' />\n"
	}
	
	// Generate html from data in Programme
	def dispatch void generateOutput(Programme pro, StringBuilder stringbuilder) { 
		stringbuilder << "<div id='" << pro.name << "' class='programDiv' style='display: none;'>\n"
		stringbuilder << "<div class='programme'>" << pro.name << "</div>\n"
		pro.years.forEach[generateOutput(it, stringbuilder)]
		pro.specialisations.forEach[generateOutput(it, false, stringbuilder)]
		stringbuilder << "<br>\n<br>\n"
		stringbuilder << "</div>\n"
	}
	
	// Generates html from data in Specialization
	def void generateOutput(Specialisation spec, Boolean secondary, StringBuilder stringbuilder) { 
		stringbuilder << "<div class='specialisation" << (secondary ? "-secondary'" : "'") << ">Specialisation: " << spec.name << "</div>\n"
		spec.years.forEach[generateOutput(it, stringbuilder)]
		spec.secondSpesialisations.forEach[generateOutput(it, true, stringbuilder)]
	}
	
	// Generate html from data in Year
	def dispatch void generateOutput(Year yr, StringBuilder stringbuilder) { 
		stringbuilder << "<div class='year'>" << yr.number << ". Year </div>\n"
		yr.semesters.forEach[generateOutput(it, stringbuilder)]
	}
	
	// Generate html from data in Semester
	def dispatch void generateOutput(Semester sm, StringBuilder stringbuilder) { 
		stringbuilder << "<div class='box'>\n"
		stringbuilder << "<div class='semester'>" << sm.number << ". Semester</div>\n"
		stringbuilder << "<div class='header'>\n"
		stringbuilder << "<div class='code'>Code</div>\n"
        stringbuilder << "<div class='name'>Name</div>\n"
        stringbuilder << "<div class='credits'>SP</div>\n"
        stringbuilder << "<div class='status'>Status</div>\n"
        stringbuilder << "</div>\n"
		sm.courses.forEach[generateOutput(it.course, it.mandatory, stringbuilder)]
		stringbuilder << "</div>\n"
	}
	
	// Generate html from data in Course
	def void generateOutput(Course crs, Boolean mandatory, StringBuilder stringbuilder) { 
		stringbuilder << "<div class='course'>\n"
		stringbuilder << "<div class='code'>" << crs.code << "</div>\n"
		stringbuilder << "<div class='name'>" << crs.name << "</div>\n"
		stringbuilder << "<div class='credits'>" << crs.credit << "</div>\n"
		
		// Check if course is mandatory and sign it with an O = Obligatorisk.
		stringbuilder << "<div class='status'>" << (mandatory ? "O" : "VA") << "</div>\n" 
		stringbuilder << "</div>\n"
	}
	

	// << operator
	def StringBuilder operator_doubleLessThan(StringBuilder stringbuilder, Object o) {
		return stringbuilder.append(o);
	}
}