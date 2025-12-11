### Assignment 1: *Java Stream API for processing list of integers*
**Objective:** Practice with basic Sream API

**Task Description:** Using Java Streams write a Java program that calculates the square of each number in given list.

**To-Do:**
- Create a list of integers Convert the list into a stream
- Using stream compute the square of each number in the list
- Collect all squared values into a new list
- Print the result list containing the squared values.
  
### Assignment 2: *Filtering a List of Names Using Java Stream*
**Objective:** Use arrays to store numbers and process them using loops.

**Task Description:** Using Java Streams write a Java program that from a given name list selects only the names with length greater than 6.

**To-Do:**
- Create a list of names
- Using Stream API process by converting the list into stream
- Apply a filter to select only the names whose length is greater than 6 characters
- Collect the filtered results into a new list
- Print each name from the filtered list

**Expected Output:** The program should display only the names that have more than 6 characters.
  
### Assignment 3: *Similar like 2.....*
**Objective:** Use arrays to store numbers and process them using loops.

**Task Description:** You are in charge of managing a vault that stores secret numbers. These numbers hold the key to opening the vault, and you need to process them correctly to retrieve the vault’s treasure.

**To-Do:**
- Create a list of names
- Using Stream API process by converting the list into stream
- Apply a filter to select only the names whose length is greater than 6 characters
- Collect the filtered results into a new list
- Print each name from the filtered list

**Expected Output:** The program should display only the names that have more than 6 characters.

### Assignment 4: *Filtering a List of Names Using Java Streams*
**Objective:** Work with `for`, `while`, and `do-while` loops, and `break` and `continue` statements.

**Task Description:** From a given list of strings filter only those that are not null and display the result.

**To-Do:**
- Create a list of strings
- Using Stream API process the list by first converting the list into stream
- Apply a filter to select only the strings that are not null
- Collect the filtered results into a new list
- Print each string from the filtered list

**Expected Output:** The program should display the strings that are not null.

### Assignment 7: *Filtering Entries From a HashMap using Java Streams*
**Objective:** Work with Stream API on hashmap.

**Task Description::** Write a Java program that from a given hashmap filter the entries which key value is less than or equal to 22.

**To-Do:**
- Create a HashMap<Integer, String> to store a list of fruit names, where each fruit has an associated integer key. 
- Add the following key-value pairs to the HashMap: - 11 -> "Apple" - 22 -> "Orange" - 33 -> "Kiwi" - 44 -> "Banana". 
- Convert the entrySet() of the HashMap into a stream
- Filter the entries to include only those where the key value is less than or equal to 22
- Collect the filtered entries back into a new Map 4.
- Prints the resulting filtered map.

**Expected Output:** The program should display the filtered map containing only the entries whose keys are less than or equal to 22.

### Assignment 8: *Filtering Entries From a HashMap using Java Streams*
**Objective:** Work with Stream API on hashmap.

**Task Description::** Write a Java program that for a given hashMap select the entries with key value less than or equal to 2 and which value starts with "A"

**To-Do:**
- Creates a HashMap<Integer, String> to store a list of strings, where each string has an associated integer key. 
- Adds the following key-value pairs to the HashMap: - 1 -> "ABC" - 2 -> "XCB"
- Convert the entrySet() of the HashMap into a stream
- Select the entries where the key value is less than or equal to 2 and which value starts with "A" 
- Collect the filtered entries back into a new Map
- Prints the resulting filtered map.

**Expected Output:** The program should display the filtered map containing only the entries whose keys are less than or equal to 2 and which have values that starts with "A"


### Assignment 9: *Filtering Entries From a HashMap using Java Streams*
**Objective:** Introduce methods with arrays and loops.

**Task Description::** Write a Java program that for a given hashMap select the entries with value "Orange"

**To-Do:**
- Create a HashMap<Integer, String> to store a list of strings, where each string has an associated integer key.
- Adds the following key-value pairs to the HashMap: - 11 -> "Apple" - 22 -> "Orange" - 33 -> "Kiwi" - 44 -> "Banana" 
- Use the Stream API to: - Convert the entrySet() of the HashMap into a stream
- Filter the entries to include only those with value "Orange"
- Collect the filtered entries back into a new Map
- Prints the resulting filtered map

**Expected Output:** The program should display the filtered map containing only the entries with value "Orange"


### Assignment 10: *Mapping a List of Integers, Converting Strings to Uppercase, Filtering Strings Based on a Condition, Sorting a List of Strings, Mapping to a Set, using forEach(), allMatch(), anyMatch()*
**Objective:** The purpose of this assignment is to demonstrate understanding and practical use of the Java Stream API, including the operations map(), filter(), sorted(), collect(), forEach(), anyMatch and AllMatch(). You will work with lists, sets and lambda expressions to transform and process data.
 - 

**Task Description::** Task 1 (Mapping a List of Integers): For a given list of integers calculate square of each list elementFollow to-do steps for the subtasks
**Task Description::** Task 2 (Converting Strings to Uppercase): For a given list of strings convert each string to uppercase
**Task Description::** Task 3 (Filtering Strings Based on a Condition): For a given list of strings select the elements with starting letter "S"
**Task Description::** Task 4 (Sorting a List of Strings): For a given list of names, sort the same list of names in alphabetical order
**Task Description::** Task 5 (Mapping to a Set): Map initial integer list to a new set where each element is doubled
**Task Description::** Task 6 (Using forEach()): For a given integer list print each element using forEach()
**Task Description::** Task 7 (Using allMatch()): Check if all the elements in integer list are greater than a given value
**Task Description::** Task 8 (Using anyMatch()): Check if any element in given integer list is smaller than a given value
): For a given list of strings convert each string to uppercase
**Task Description::** Task 9: For a given list of strings convert each string to uppercase


**To-Do:**
- Task 1: Create an initial list of integers: {2, 3, 4, 5}. Then using the map() function square each number, collect the results into a new list and print it
- Task 2: Create a list of strings: {"a", "b", "c"}, then convert each string to uppercase using map{String::toUpperCase} and finally collect and print the resulting list 
- Task 3: Create a list of words: {"Reflection", "Collection", "Stream", "Java", "Sorting"}, then filter the list to include only the elements taht start with the letter "S", and then collect and print the filtered list
- Task 4: Create a list of names, sort the same list in alphabetical order using sorted(), and then print the sorted list
- Task 5: Create an initial list of integers, then map the initial integer list to a new set where each element is doubled. Use Collectors.toSet() to remove duplicated, and print the resulting set.
- Task 6: Create initial list of integers. Then use forEach() to print each element of the mapped integer list individually
- Task 7: For given list of integers, check if all the elements in the list are greater than a given value (e.g., x > 1). Then print the result as a boolean value.
- Task 8: For given list of integers, check if any element in the list is smaller than a given value (e.g., x < 1). Then print the result as a boolean value.


Use the Stream API to: - Convert the entrySet() of the HashMap into a stream
- Filter the entries to include only those with value "Orange"
- Collect the filtered entries back into a new Map
- Prints the resulting filtered map

**Expected Output:** Your program should display:
- A list of squared numbers
- A list of uppercase strings
- FIltered list (words starting with "S")
- Alphabetically sorted list
- A set of doubled integers
- Individual printed values from forEach()
- Boolean results from allMatch() and anyMatch()



//////
11. Assignment: Advanced Java Stream API Opearations Objective - This assignment focuses on practicing advanced operations of the Java Stream API, including filtering, counting, mapping, collecting, joining, generating statistics, creating random numbers, and working with parallel streams. You will apply functional-style programming concepts to process collections of strings and integers.

Part 1: Working With Streams of Strings 1. Display initial list - Print the initial list of strings 2. Count Empty Strings - Use stream().filter() to: 1. Count how many strings in the list are empty 2. Print the result 3. Count Strings of Length Three - Use a filter to count strings whose length is exactly 3, then print the count 4. Filter Out Empty Strings - Create a new list containing only non-empty strings

Collect this into a list and print it 5. Merge Non-Empty Strings Into a Single String - Filter out empty strings - Merge remaining strings into one string separated by commas using: Collectors.joining(", ") - Print the merged result
Part 2: Working With Integer Streams 6. Create a Distinct Square List - Map each integer to its square using map(i -> i * i) - Apply distinct() to remove duplicate values - Collect the squares into a list

Print the resulting list
Part 3: Statistical Operations 7. Print Summary Statistics - Using "integers.stream().mapToInt( x -> x).summaryStatistics()" extract and print individually with descriptive labels: 1. Maximum value 2. Minimum value 3. Sum 4. Average

Part 4: Generating Random Numbers 8. Generate Sorted Random Integers - Using "random.ints().limit(10).sorted()" print ten random sorted integers to the console

Part 5: Using Parallel Streams 9. Count Empty Strings Using parallelStreams() - Using "strings.parallelStream()" print the count prefixed with an appropriate label such as "Empty str:"

Expected Output Highlights Your program should display: 1. Number of empty strings 2. Number of strings with length 3 3. List of non-empty strings 4. A merged string of non-empty values 5. A list of distinct squared integers 6. Statistical results (max, min, sum, average) 7. Ten sorted random integers 8. Empty string count using parallel processing

/////////////////////////////

12. Assignment: Working With Streams of Strings 1. Set initial list of names 2. Use a filter to count names with length less than 6, then print the count

13. Rework the same exercise 12 using Java 7

14. Assignment: Combining Streams in Java Objective The purpose of this assignment is to practice creating and manipulating streams in Java. We need to work with list of strings, convert them into streams, and merge two separate streams into one using Stream.concat() method. Finally, we will iterate through the combined stream and print the elements.

Tasks 1. Create List of Strings - Create a list named alphabets containing: "A", "B", "C" - Create another list named names containing: "Sansa", "Jon", "Arya" 2. Convert Lists Into Streams

Convert both the alphabets lists and the names list into streams 3. Merge Two Streams - Using "Stream.concat(alphabets.stream(), names.stream())" create a single combined stream named opstream that contains all elements from both lists 4. Print Combined Stream Elements
Iterate through the merged stream using forEach() - Print each element followed by a space in the same line
Example output format: A B C Sansa Jon Arya

Expected Output Your program should display all elements from both lists printed in sequence, demonstrating that the two streams have been successfully combined.

15. Assignment: Using Java Streams to Generate a Sequence of Numbers Objective Write a Java program that demonstrate the use of the Stream API, specifically the Stream.iterate() method, along with filtering limiting and printing elements in a stream.

Task Description: - You are required to create a Java program that performs the following operations using streams: 1. Generate an infinite stream of integers, starting from 1, where each subsequent number increments by 1. - Use Stream.iterate(initialValue, unaryOperator) 2. Filter the stream so that only numbers divisible by 3 are included 3. Limit hte stream to the first 6 numbers that satisfy the condition 4. Print each number using forEach

Expected Output: The program should print the first six numbers divisible by 3:

3 6 9 12 15 18

///////////////////////
///////


### Assignment 7: *"The Game of Shadows"*
**Objective:** Combine everything—arrays, loops, methods, and conditions—to create a more complex program.

**Story:** The Game of Shadows is an ancient game played on a 3x3 grid. The game decides the fate of two players, 'X' and 'O'. You must create a program that simulates the game and determines the winner.

**To-Do:**
- Create a method `generateMatrix(char[][] matrix)` that fills a 3x3 matrix with randomly placed 'X' and 'O' values.
- Create a method `printMatrix(char[][] matrix)` to output the matrix.
- Create a method `countLines(char[][] matrix, char symbol)` that counts how many rows, columns, and diagonals are filled with the given symbol.
- Create a method `announceWinner(int countX, int countO)` that compares the counts and prints whether 'X' or 'O' wins, or if there is no winner.
- In `main`, generate the matrix, print it, count the lines for 'X' and 'O', and announce the winner.
