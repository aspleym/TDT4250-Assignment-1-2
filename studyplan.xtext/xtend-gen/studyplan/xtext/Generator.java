package studyplan.xtext;

import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import sp.Course;
import sp.CourseInSemester;
import sp.Department;
import sp.Programme;
import sp.Semester;
import sp.Specialisation;
import sp.Year;

@SuppressWarnings("all")
public class Generator {
  public String generateHtml(final Department dep) {
    StringBuilder _stringBuilder = new StringBuilder();
    return this.generateHtml(dep, _stringBuilder).toString();
  }
  
  public CharSequence generateHtml(final Department dep, final StringBuilder stringbuilder) {
    StringBuilder _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<!DOCTYPE html>");
      _builder.newLine();
      _builder.append("<html lang=\"en\">");
      _builder.newLine();
      _builder.append("<head>");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("<meta charset=\"UTF-8\">");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("<link rel=\"stylesheet\" href=\"main.css\">");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("<title>Studyplan</title");
      _builder.newLine();
      _builder.append("</head>");
      _builder.newLine();
      _builder.append("<body>");
      _builder.newLine();
      this.operator_doubleLessThan(stringbuilder, _builder);
      this.generateOutput(dep, stringbuilder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.newLine();
      _builder_1.append("</body>");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("<script src=\"script.js\"></script>");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("</html>");
      _xblockexpression = this.operator_doubleLessThan(stringbuilder, _builder_1);
    }
    return _xblockexpression;
  }
  
  protected void _generateOutput(final Department dep, final StringBuilder stringbuilder) {
    this.operator_doubleLessThan(stringbuilder, "<div class=\'content\'>\n");
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div class=\'department\'>");
    String _name = dep.getName();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _name);
    this.operator_doubleLessThan(_doubleLessThan_1, "</div>\n");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div style=\"padding-top: 40px\">");
    _builder.newLine();
    _builder.append("<div class=\"dropdown\" id=\"dropdownButton\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<button onclick=\"myFunction()\" class=\"dropbtn\">Study plans</button>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<div id=\"myDropdown\" class=\"dropdown-content\">");
    _builder.newLine();
    this.operator_doubleLessThan(stringbuilder, _builder);
    final Consumer<Programme> _function = (Programme it) -> {
      this.generateDropdown(it, stringbuilder);
    };
    dep.getProgrammes().forEach(_function);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("  ");
    _builder_1.append("</div>");
    _builder_1.newLine();
    _builder_1.append("</div>");
    _builder_1.newLine();
    _builder_1.append("</div>");
    _builder_1.newLine();
    this.operator_doubleLessThan(stringbuilder, _builder_1);
    final Consumer<Programme> _function_1 = (Programme it) -> {
      this.generateOutput(it, stringbuilder);
    };
    dep.getProgrammes().forEach(_function_1);
    this.operator_doubleLessThan(stringbuilder, "</div>\n");
  }
  
  public void generateDropdown(final Programme pro, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<input type=\'button\' name=\'answer\' value=\'");
    String _name = pro.getName();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _name);
    this.operator_doubleLessThan(_doubleLessThan_1, "\' onclick=\'showDiv(value)\' />\n");
  }
  
  protected void _generateOutput(final Programme pro, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div id=\'");
    String _name = pro.getName();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _name);
    this.operator_doubleLessThan(_doubleLessThan_1, "\' class=\'programDiv\' style=\'display: none;\'>\n");
    StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(stringbuilder, "<div class=\'programme\'>");
    String _name_1 = pro.getName();
    StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, _name_1);
    this.operator_doubleLessThan(_doubleLessThan_3, "</div>\n");
    final Consumer<Year> _function = (Year it) -> {
      this.generateOutput(it, stringbuilder);
    };
    pro.getYears().forEach(_function);
    final Consumer<Specialisation> _function_1 = (Specialisation it) -> {
      this.generateOutput(it, Boolean.valueOf(false), stringbuilder);
    };
    pro.getSpecialisations().forEach(_function_1);
    this.operator_doubleLessThan(stringbuilder, "<br>\n<br>\n");
    this.operator_doubleLessThan(stringbuilder, "</div>\n");
  }
  
  public void generateOutput(final Specialisation spec, final Boolean secondary, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div class=\'specialisation");
    String _xifexpression = null;
    if ((secondary).booleanValue()) {
      _xifexpression = "-secondary\'";
    } else {
      _xifexpression = "\'";
    }
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _xifexpression);
    StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(_doubleLessThan_1, ">Specialisation: ");
    String _name = spec.getName();
    StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, _name);
    this.operator_doubleLessThan(_doubleLessThan_3, "</div>\n");
    final Consumer<Year> _function = (Year it) -> {
      this.generateOutput(it, stringbuilder);
    };
    spec.getYears().forEach(_function);
    final Consumer<Specialisation> _function_1 = (Specialisation it) -> {
      this.generateOutput(it, Boolean.valueOf(true), stringbuilder);
    };
    spec.getSecondSpesialisations().forEach(_function_1);
  }
  
  protected void _generateOutput(final Year yr, final StringBuilder stringbuilder) {
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div class=\'year\'>");
    int _number = yr.getNumber();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, Integer.valueOf(_number));
    this.operator_doubleLessThan(_doubleLessThan_1, ". Year </div>\n");
    final Consumer<Semester> _function = (Semester it) -> {
      this.generateOutput(it, stringbuilder);
    };
    yr.getSemesters().forEach(_function);
  }
  
  protected void _generateOutput(final Semester sm, final StringBuilder stringbuilder) {
    this.operator_doubleLessThan(stringbuilder, "<div class=\'box\'>\n");
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div class=\'semester\'>");
    int _number = sm.getNumber();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, Integer.valueOf(_number));
    this.operator_doubleLessThan(_doubleLessThan_1, ". Semester</div>\n");
    this.operator_doubleLessThan(stringbuilder, "<div class=\'header\'>\n");
    this.operator_doubleLessThan(stringbuilder, "<div class=\'code\'>Code</div>\n");
    this.operator_doubleLessThan(stringbuilder, "<div class=\'name\'>Name</div>\n");
    this.operator_doubleLessThan(stringbuilder, "<div class=\'credits\'>SP</div>\n");
    this.operator_doubleLessThan(stringbuilder, "<div class=\'status\'>Status</div>\n");
    this.operator_doubleLessThan(stringbuilder, "</div>\n");
    final Consumer<CourseInSemester> _function = (CourseInSemester it) -> {
      this.generateOutput(it.getCourse(), Boolean.valueOf(it.isMandatory()), stringbuilder);
    };
    sm.getCourses().forEach(_function);
    this.operator_doubleLessThan(stringbuilder, "</div>\n");
  }
  
  public void generateOutput(final Course crs, final Boolean mandatory, final StringBuilder stringbuilder) {
    this.operator_doubleLessThan(stringbuilder, "<div class=\'course\'>\n");
    StringBuilder _doubleLessThan = this.operator_doubleLessThan(stringbuilder, "<div class=\'code\'>");
    String _code = crs.getCode();
    StringBuilder _doubleLessThan_1 = this.operator_doubleLessThan(_doubleLessThan, _code);
    this.operator_doubleLessThan(_doubleLessThan_1, "</div>\n");
    StringBuilder _doubleLessThan_2 = this.operator_doubleLessThan(stringbuilder, "<div class=\'name\'>");
    String _name = crs.getName();
    StringBuilder _doubleLessThan_3 = this.operator_doubleLessThan(_doubleLessThan_2, _name);
    this.operator_doubleLessThan(_doubleLessThan_3, "</div>\n");
    StringBuilder _doubleLessThan_4 = this.operator_doubleLessThan(stringbuilder, "<div class=\'credits\'>");
    float _credit = crs.getCredit();
    StringBuilder _doubleLessThan_5 = this.operator_doubleLessThan(_doubleLessThan_4, Float.valueOf(_credit));
    this.operator_doubleLessThan(_doubleLessThan_5, "</div>\n");
    StringBuilder _doubleLessThan_6 = this.operator_doubleLessThan(stringbuilder, "<div class=\'status\'>");
    String _xifexpression = null;
    if ((mandatory).booleanValue()) {
      _xifexpression = "O";
    } else {
      _xifexpression = "VA";
    }
    StringBuilder _doubleLessThan_7 = this.operator_doubleLessThan(_doubleLessThan_6, _xifexpression);
    this.operator_doubleLessThan(_doubleLessThan_7, "</div>\n");
    this.operator_doubleLessThan(stringbuilder, "</div>\n");
  }
  
  public StringBuilder operator_doubleLessThan(final StringBuilder stringbuilder, final Object o) {
    return stringbuilder.append(o);
  }
  
  public void generateOutput(final EObject dep, final StringBuilder stringbuilder) {
    if (dep instanceof Department) {
      _generateOutput((Department)dep, stringbuilder);
      return;
    } else if (dep instanceof Programme) {
      _generateOutput((Programme)dep, stringbuilder);
      return;
    } else if (dep instanceof Semester) {
      _generateOutput((Semester)dep, stringbuilder);
      return;
    } else if (dep instanceof Year) {
      _generateOutput((Year)dep, stringbuilder);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(dep, stringbuilder).toString());
    }
  }
}
