# TDT4250-Assignment-1&2
## Table of Contents
* [About The Project](#about-the-project)
    * [Built With](#built-with)
* [Getting Started](#getting-started)
    * [Prerequisites](#prerequisites)
    * [Installation](#installation)
* [Content](#content)
    * [Assignment 1](#assignment-1)
    * [Assignment 2](#assignment-2)

## About The Project
This project is part of the evaluation for the course *TDT4250* *-* *Advanced* *Software* *Design*. In this project we are supposed to use functions from the EMF framework to generate code based on a model. By using this model you should be able to create a "legal" study plan. Further we are supposed to do a model transformation to generate a corresponding web page.

### Built With
This section consists of all the major frameworks I used to build this project:
* [EMF](https://www.eclipse.org/modeling/emf/)
* [Xtext](https://www.eclipse.org/Xtext/)
* [Xtend](https://www.eclipse.org/xtend/)

## Getting Started
1. Clone the project to a desired directory.
```sh
git clone https://github.com/aspleym/TDT4250-Assignment-1-2.git
```
2. Open your IDE (preferably Eclipse) and add the projects folder to your workspace.
3. Navigate to the following directory:
(`/studyplan.xtext/src-gen/studyplan/xtext/`)
4. Open the file `Department.xmi` to edit data.
5. For generating a html-file run `GeneratorMain.java`.

  a. PS! Remember to re-run `GeneratorMain.java` after changes to the data.

## Content
### Assignment 1
#### Model:
Assignment 1 is the first version of the study plan model.

Study plan is the root for the model and can be distinguish by the student number. Study plan has programmes which are containment and opposites for that year's class, and has a reference to the specialisation class. Specialisation has a reference to itself for when there are a second specialisation in that programme.

Further a year consists for semester classes, that references to relations class, "CourseInSemester". This is for knowing if it is mandatory that semester, or elected in that study plan. This naturally references to a course to get the name, code and credits.

The model has a data type class that which knows the pattern for the course codes.

#### Generated files:
In the validation file there are "handwritten" constraints for the model. E.g. if the course is mandatory for the programme/specialisation, it is also elected. Also it checks if the the year at least contains courses with a credit sum of 60 points.

### Assignment 2
#### Changes to the model
* There are now a reference from department to course to be able to create multiple courses that can be shared between models "further down" the  model hierarchy.
* A reference between specialisation and year to add years/semesters to a specific
specialisation.

#### New files added
I have added a test project, `TDT4250 - Assignment 2.tests` to automatically generate test files from EMF and manually write tests for the constraints. This also have some of the previous files and some example data.
The manually written tests are:
* `CourseInSemesterTest.java`, function: `testIsPicked()`
* `CourseInSemesterTest.java`, function: `testSetPicked()`

These files can be ran as JUnit tests.

There is also created a separate Xtext project for generating web pages, `studyplan.xtext`. The manually written files are in the following directory:
`/studyplan.xtext/src-gen/studyplan/xtext/`

The folder consist of these files:
* GeneratorMain.java, this file is the main file for generating a web page based on the information from the model (Department.xmi).
* Generator.xtend creates a string for printing it to a html-file (named `index.html`)
* There is also a main.css file for styling the web page, and a script.js for adding some javascript.
