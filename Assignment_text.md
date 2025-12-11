1\. Write a Java program that performs the following steps:  1. Create a
list of integers 2. Process the list using streams:  - Convert the list
into a stream  - Using stream compute the square of each number in the
list  - Collect all squared values into a new list 3. Output the
results:  - Print the list containing the squared values.

2\. Filtering a List of Names Using Java Streams  1. Create a list of
names 2. Using Stream API process the list:  - Convert the list into
stream  - Apply a filter to select only the names whose length is
greater than 6 characters  - Collect the filtered results into a new
list 3. Print each name from the filtered list

Expected Output  - The program should display only the names that have
more than 6 characters

3\. Similar like 2

4\. Filtering a List of Names Using Java Streams  1. Create a list of
strings 2. Using Stream API process the list:  - Convert the list into
stream  - Apply a filter to select only the strings that are not null  -
Collect the filtered results into a new list 3. Print each string from
the filtered list

Expected Output  - The program should display the strings that are not
null

5,6. Nothing

7\. Assignment: Filtering Entries From a HashMap using Java Streams
Write a Java program that:  1. Creates a HashMap\<Integer, String\> to
store a list of fruit names, where each fruit has an associated integer
key. 2. Adds the following key-value pairs to the HashMap:  - 11 -\>
\"Apple\"  - 22 -\> \"Orange\"  - 33 -\> \"Kiwi\"  - 44 -\> \"Banana\"
3. Use the Stream API to:  - Convert the entrySet() of the HashMap into
a stream  - Filter the entries to include only those where the key value
is less than or equal to 22  - Collect the filtered entries back into a
new Map 4. Prints the resulting filtered map

Expected Output  - The program should display the filtered map
containing only the entries whose keys are less than or equal to 22

8\. Assignment: Filtering Entries From a HashMap using Java Streams
Write a Java program that:  1. Creates a HashMap\<Integer, String\> to
store a list of strings, where each string has an associated integer
key. 2. Adds the following key-value pairs to the HashMap:  - 1 -\>
\"ABC\"  - 2 -\> \"XCB\" 3. Use the Stream API to:  - Convert the
entrySet() of the HashMap into a stream  - Filter the entries to include
only those where the key value is less than or equal to 2 and which
value starts with \"A\"  - Collect the filtered entries back into a new
Map 4. Prints the resulting filtered map

Expected Output  - The program should display the filtered map
containing only the entries whose keys are less than or equal to 2 and
which have values that starts with \"A\".

9\. Assignment: Filtering Entries From a HashMap using Java Streams
Write a Java program that:  1. Creates a HashMap\<Integer, String\> to
store a list of strings, where each string has an associated integer
key. 2. Adds the following key-value pairs to the HashMap:  - 11 -\>
\"Apple\"  - 22 -\> \"Orange\"  - 33 -\> \"Kiwi\"  - 44 -\> \"Banana\"
3. Use the Stream API to:  - Convert the entrySet() of the HashMap into
a stream  - Filter the entries to include only those with value
\"Orange\"  - Collect the filtered entries back into a new Map 4. Prints
the resulting filtered map

Expected Output  - The program should display the filtered map
containing only the entries with value \"Orange\".

10\. JAva Streams Assignment The purpose of this assignment is to
demonstrate understanding and practical use of the Java Stream API,
including the operations map(), filter(), sorted(), collect(),
forEach(), anyMatch and AllMatch(). You will work with lists, sets and
lambda expressions to transform and process data.

Tasks 1. Mapping a List of Integers  1. Create an initial list of
integers: {2, 3, 4, 5} 2. Use the map() function to square each number
3. Collect the results into a new list and print it

2\. Converting Strings to Uppercase  - Create a list of strings: {\"a\",
\"b\", \"c\"}  - COnvert each string to uppercase using
map{String::toUpperCase}  - Collect and print the resulting list

3\. Filtering Strings Based on a Condition  - Create a list of words:
{\"Reflection\", \"Collection\", \"Stream\", \"Java\", \"Sorting\"}  -
Filter the list to include only the elements taht start with the letter
\"S\"  - Collect and print the filtered list

4\. Sorting a List of Strings  - SOrt the same list of names in
alphabetical order using sorted()  - Print the sorted list

5\. Mapping to a Set  - Map the initial integer list to a new set where
each element is doubled  - Use Collectors.toSet() to remove duplicated
 - Print the resulting set

6\. Using forEach()  - Use forEach() to print each element of the mapped
integer list individually

7\. Using allMatch()  - Check if all the elements in the list are
greater than a given value (e.g., x \> 1)  - Print the result as a
boolean value

7\. Using anyMatch()  - Check if any element in the list is smaller than
a given value (e.g., x \< 1)  - Print the result as a boolean value

Expected Output Your program should display:  - A list of squared
numbers  - A list of uppercase strings  - FIltered list (words starting
with \"S\")  - Alphabetically sorted list  - A set of doubled integers
 - Individual printed values from forEach()  - Boolean results from
allMatch() and anyMatch()

/////////////////////

11\. Assignment: Advanced Java Stream API Opearations Objective - This
assignment focuses on practicing advanced operations of the Java Stream
API, including filtering, counting, mapping, collecting, joining,
generating statistics, creating random numbers, and working with
parallel streams. You will apply functional-style programming concepts
to process collections of strings and integers.

Part 1: Working With Streams of Strings  1. Display initial list  -
Print the initial list of strings 2. Count Empty Strings  - Use
stream().filter() to:  1. Count how many strings in the list are empty
2. Print the result 3. Count Strings of Length Three  - Use a filter to
count strings whose length is exactly 3, then print the count 4. Filter
Out Empty Strings  - Create a new list containing only non-empty strings
 - Collect this into a list and print it 5. Merge Non-Empty Strings Into
a Single String  - Filter out empty strings  - Merge remaining strings
into one string separated by commas using: Collectors.joining(\", \")  -
Print the merged result

Part 2: Working With Integer Streams 6. Create a Distinct Square List  -
Map each integer to its square using map(i -\> i \* i)  - Apply
distinct() to remove duplicate values  - Collect the squares into a list
 - Print the resulting list

Part 3: Statistical Operations 7. Print Summary Statistics  - Using
\"integers.stream().mapToInt( x -\> x).summaryStatistics()\" extract and
print individually with descriptive labels:  1. Maximum value 2. Minimum
value 3. Sum 4. Average

Part 4: Generating Random Numbers 8. Generate Sorted Random Integers  -
Using \"random.ints().limit(10).sorted()\" print ten random sorted
integers to the console

Part 5: Using Parallel Streams 9. Count Empty Strings Using
parallelStreams()  - Using \"strings.parallelStream()\" print the count
prefixed with an appropriate label such as \"Empty str:\"

Expected Output Highlights Your program should display:  1. Number of
empty strings 2. Number of strings with length 3 3. List of non-empty
strings 4. A merged string of non-empty values 5. A list of distinct
squared integers 6. Statistical results (max, min, sum, average) 7. Ten
sorted random integers 8. Empty string count using parallel processing

/////////////////////////////

12\. Assignment: Working With Streams of Strings  1. Set initial list of
names 2. Use a filter to count names with length less than 6, then print
the count

13\. Rework the same exercise 12 using Java 7

14\. Assignment: Combining Streams in Java Objective The purpose of this
assignment is to practice creating and manipulating streams in Java. We
need to work with list of strings, convert them into streams, and merge
two separate streams into one using Stream.concat() method. Finally, we
will iterate through the combined stream and print the elements.

Tasks  1. Create List of Strings  - Create a list named alphabets
containing: \"A\", \"B\", \"C\"  - Create another list named names
containing: \"Sansa\", \"Jon\", \"Arya\" 2. Convert Lists Into Streams
 - Convert both the alphabets lists and the names list into streams 3.
Merge Two Streams  - Using \"Stream.concat(alphabets.stream(),
names.stream())\" create a single combined stream named opstream that
contains all elements from both lists 4. Print Combined Stream Elements
 - Iterate through the merged stream using forEach()  - Print each
element followed by a space in the same line

Example output format: A B C Sansa Jon Arya

Expected Output Your program should display all elements from both lists
printed in sequence, demonstrating that the two streams have been
successfully combined.

15\. Assignment: Using Java Streams to Generate a Sequence of Numbers
Objective Write a Java program that demonstrate the use of the Stream
API, specifically the Stream.iterate() method, along with filtering
limiting and printing elements in a stream.

Task Description:  - You are required to create a Java program that
performs the following operations using streams:  1. Generate an
infinite stream of integers, starting from 1, where each subsequent
number increments by 1.  - Use Stream.iterate(initialValue,
unaryOperator) 2. Filter the stream so that only numbers divisible by 3
are included 3. Limit hte stream to the first 6 numbers that satisfy the
condition 4. Print each number using forEach

Expected Output: The program should print the first six numbers
divisible by 3:

3 6 9 12 15 18

///////////////////////

16\. Assignment: Working with Predicates and Stream API in Java
Objective This assignment focuses on using Java Streams, Predicates and
the noneMatch() terminal operation to evaluate conditions on a
collection of custom objects. You will learn how to define predicate
conditions, and test them using Stream operations

Task Description You are required to create a Java program with the
following steps:  1. Define a Student class with following:  - Fields:
 1. stuId(int) 2. stuAde (int) 3. stuName (String)  - Constructor to
initialize all fields  - Getter methods  - A static method getStudents()
that returns a list of predefined Student objects

Example student records include:  - (11, 28, \"Lucy\")  - (28, 27,
\"Kiku\")  - (32, 30, \"Dani\")  - (49, 27, \"Steve\")

2. Create Predicates to Test Student Properties Inside of the main
method define:  - Predicate p1, that checks whether the student\'s name
starts with the letter \"L\"  - Predicate p2, that checks whether the
student\'s age is less than 28, AND name starts with the letter \"P\" 3.
Use the nonmatch() Stream Operation You must retrieve the student list
using Student.getStudents() and then apply the noneMatch() method with
both predicates

Expected Behavior in This Code  1. Test with p1 (Name starts with \"L\")
 - One student (\"Lucy\") matches the condition  - noneMatch(p1) should
return false 2. Test with p2 (Name starts with \"P\" AND age \< 28)  -
No student matches the condition  - noneMatch(p2) should return true

Expected Output Format The output of your program should display the
results of both tests. Example: list.stream().noneMatch(p1): false
list.stream().noneMatch(p2): true

/////////////////////////////////////////////////

17\. Assignment: Java Streams, Predicates and Custom Class Manipulation
Objective The purpose of this assignment is to help practice working
with Java Streams API, Lambda expressions and predicates, filtering,
matching and collecting stream results

Task Description You are required to implement a Java program that
manages a list of students using the Java Stream API. The program must
perform several filtering and matching operations using predicates and
display results on the console.

Part 1 - Create a Student class with the following:  1. Fields:  -
String name  - int indexNo  - int age 2. Constructor to initialize all
fields 3. Getter methods Part 2 - Implement the Main Program  1.
Implement a static method for student creation -\> createStudent(String
name, int indexNo, int age) -\> This method should return a new Student
object 2. Create a method printValues(Student s) that should display
Student Details 3. Create a method List\<Student\> getStudents() that
will return a list containing at least five predefined Student objects
4. Inside main, create list of example names and use Random to
automatically generate students with random index numbers and ages, and
than print all autogenerated students 5. Define following predicates:  -
p1: selects students whose name starts with \"A\"  - p2: selects
students whose names starts with \"S\" and age is less than 28  - p3:
selects students older than 25 Then using Streams and the predefined
predicates filter the students, and collect and print the filtered
results 6. Perform checks such as:  - Whether all students are younger
than 25  - Whether at least one student is older than 25  - Whether no
student has a name starting with \"A\" Print the result on each check

Expected Output Your program should display:  - Autogenerated students
with their details  - Predefined student list  - Filtered results for
predicate conditions  - Boolean results from allMatch(), noneMatch() and
anyMatch() checks

///////////////////////////////////////////////////////////////////////

18\. Assignment: Calculating Average Age of Students Using Java Streams
Objective The purpose of this assignment is to demonstrate the use of
the Stream API by creating a list of student objects and calculate the
average age using Collectors. averagingInt() method.

Task Description Write a Java program that defines a Student class with
attributes id, name and age. Create a list of students, store multiple
students in it and compute the average age of all students using Java
Stream operations.

 1. Student Class  - Contains 3 fields: id (integer), name(String) and
age(integer)  - Includes a constructor to initialize these fields 2.
Main Class  - Create an ArrayList\<Student\> to store student
information  - Add multiple student objects with different details  -
Use Stream API to calculate the average age  - Print the calculated
average age.

//////////////////////////////////////////////////////// 19. Assignment:
Counting the frequency of Names Using Java Streams Objective The purpose
of this assignment is to demonstrate the use of Java Streams, Collectors
and groupingBy() to count the frequency of repeated elements in a list.
Task Description Write a Java program that takes a list of names and
counts how many times each name appears. Use \"Collectors.groupingBy()\"
and \"Collectors.counting()\" methods to generate a frequency map of the
names.  - Main Steps:  1. Create a list of names containing duplicates
2. Convert the list into a stream 3. Use
\"groupingBy(Function.identity(), counting())\" to:  - Group identical
names together  - Count the occurences of each name 4. Store the result
in a Map\<String, Long\> 5. Print the resulting map to display the
frequency of each name

Expected Output The program should print a map showing how many times
each name appears (E.g. {Jon=2, Ajeet=3, Steve=1})
////////////////////////////////////////////////////////

20\. Assignment: Filtering Student Records and Storing Results in a Set
Using Java Streams Objective The purpose of this assignment is ti
demonstrate how to work with Stream API, focusing on filtering student
records based on a condition and storing the filtered results in a Set
using Collectors.toSet().

Task Description Using the same Student class definition from previous
assignment write a Java program that stores student information in a
list, filters students based on their ID value using Java Streams, and
collects the filtered student inti a Set. Finally, iterate through the
Set and print the each student\'s details

Main Class:  - Create an ArrayList\<Student\> to hold multiple student
records.  - Add several student objects to the list  - Use Stream API
to:  1. Filter students whose ID is greater than 20 2. Collect the
filtered results into a Set using Collectors.toSet() 3. Iterate over the
Set and print each student\'s ID, name and age.

Expected Output The output will display only those students whose IDs
are greater than 20

////////////////////////////////////////////////////////

21\. Assignment: Extracting Student Names Using Java Streams Objective
The purpose of this assignment is to demonstrate the use of Stream API
to process object data. In particular, the program extracts only the
names of students from a list of Student objects using the map()
operation.

Task Description Using the same Student class definition from previous
assignments, create a Java program that stores student information (ID,
name, age) inside a list. Using Java Stream operations, retrieve only
the student names and collect them into a new list. Finally, print the
list of names.

////////////////////////////////////////////////////////

22\. Assignment: Filter Long Names Using Java Streams

Task Description From given list of names, filter the names with more
than 6 characters. After storing the result print the filtered list.
