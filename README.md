# JAVA-QUEENS-COLLEGE-PROJECTS
Queens College
Computer Science Department
CS 212 – Fall 2016 – Project 1
Assigned: 28 September 2016
Due: 7 October 2016
Cutoff: 13 October 2016
Sorting an Array of Dates/ Displaying in a GUI
Given an input file of dates represented as Strings, read the dates from the file and display them in a GUI. The dates will be in the form yyyymmdd (such as 20161001 for October 1, 2016). The GUI should have a GridLayout with one row and two columns. The left column should display the dates in the order read from the file, and the right column should display the dates in sorted order (using Selection Sort).
The Strings representing the dates may be compared using the compareTo method in class String. As you are reading the dates you should check that the value read in is legal (8 digits), and if it is not, print it to the console and do not put it in the array of dates.
The input file
Each line of the input file may contain several dates separated by commas. You will need to use a StringTokenizer to separate out the individual dates. So, an example of the input file would be:
20161001
20080912,20131120,19980927
20020202,hello
20120104
Submitting the Project.
You should have two files to submit for this project:
Project1.java
DateGUI.java
Upload your project to BlackBoard by the due date for full credit.
