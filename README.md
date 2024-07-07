# Mini-Java Compiler

The Mini-Java Compiler project aims to create a simplified compiler for a subset of the Java programming language called \"MiniJava.\" This subset includes a limited set of features from Java, making it an excellent starting point for learning about compiler design and implementation.

## Project Overview

The main objectives of the project are as follows:

1. **ANTLR Grammar Design**:
   - Design an ANTLR grammar (using ANTLR3) for MiniJava that captures its syntax rules.
   - Define production rules for class declarations, method definitions, variable declarations, expressions, and control structures.
   - Ensure that the grammar produces a parse tree for valid MiniJava programs.

2. **AST Generation**:
   - Extend the grammar to generate an Abstract Syntax Tree (AST) during parsing.
   - Construct AST nodes for class declarations, method definitions, expressions, and other relevant language constructs.

3. **GUI Application**:
   - Create a simple GUI application that allows users to input MiniJava code.
   - Parse the input code using the ANTLR-generated parser.
   - Display the resulting AST graphically, highlighting nodes and their relationships.
   - If the input code contains errors, show an error message indicating the issue.

## Project Link

[Mini-Java Compiler](https://www.cambridge.org/resources/052182060X/MCIIJ2e/)

## Testing

A set of sample MiniJava programs is provided for testing:

- [Factorial.java](https://www.cambridge.org/resources/052182060X/MCIIJ2e/programs/Factorial.java)
- [BinarySearch.java](https://www.cambridge.org/resources/052182060X/MCIIJ2e/programs/BinarySearch.java)
- [BubbleSort.java](https://www.cambridge.org/resources/052182060X/MCIIJ2e/programs/BubbleSort.java)
- [TreeVisitor.java](https://www.cambridge.org/resources/052182060X/MCIIJ2e/programs/TreeVisitor.java)
- [QuickSort.java](https://www.cambridge.org/resources/052182060X/MCIIJ2e/programs/QuickSort.java)
- [LinearSearch.java](https://www.cambridge.org/resources/052182060X/MCIIJ2e/programs/LinearSearch.java)
- [LinkedList.java](https://www.cambridge.org/resources/052182060X/MCIIJ2e/programs/LinkedList.java)
- [BinaryTree.java](https://www.cambridge.org/resources/052182060X/MCIIJ2e/programs/BinaryTree.java)

## How to Use

1. Clone the repository:
   ```bash
   git clonen https://github.com/ALiyASSER0/mini-java-compiler.git
2. Open the project in your preferred IDE.

3. Run the GUI application.

4. Input your MiniJava code.

5. View the generated AST.

## Contributors

- [Ali yasser](https://github.com/ALiyASSER0)
- [Ali nasser](https://github.com/alinasser2)
- [Mounir maged](https://github.com/MounirMagedMounir)
