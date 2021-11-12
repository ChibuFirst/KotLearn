package com.chibufirst.kotlearn.util

import com.chibufirst.kotlearn.R
import com.chibufirst.kotlearn.models.Lessons

object KotlinLessonData {

    fun topicsList(): List<Lessons> {
        return listOf(
            Lessons(
                "Introduction",
                "<h2>What is Kotlin?</h2>\nKotlin is an open-source statically typed programming language that targets the JVM, Android, JavaScript and Native. It’s developed by JetBrains. The project started in 2010 and was open source from very early on. The first official 1.0 release was in February 2016.<br><br><h3>What is the current version of Kotlin?</h3>\nThe currently released version is 1.5.31, published on September 20, 2021. <br><br><h3>Overview</h3>\nKotlin can be used for any kind of development, be it server-side, client-side web and Android. With Kotlin/Native currently in the works, support for other platforms such as embedded systems, macOS and iOS is coming. People are using Kotlin for mobile and server-side applications, client-side with JavaScript or JavaFX, and data science, just to name a few possibilities. <br><br><h3>What IDEs support Kotlin?</h3>\nKotlin is supported by all major Java IDEs including IntelliJ IDEA, Android Studio, and Eclipse. In addition, a command line compiler is available and provides straightforward support for compiling and running applications. <br><br><h3>What build tools support Kotlin?</h3>\n On the JVM side, the main build tools include Gradle, Maven, Ant, and Kobalt. There are also some build tools available that target client-side JavaScript. <br><br><h3>What does Kotlin compile down to?</h3>\nWhen targeting the JVM, Kotlin produces Java compatible bytecode. When targeting JavaScript, Kotlin transpiles to ES5.1 and generates code which is compatible with module systems including AMD and CommonJS. When targeting native, Kotlin will produce platform-specific code (via LLVM).",
                R.drawable.kotlin_resize
            ),
            Lessons(
                "Variables",
                "<h2>Kotlin Variable</h2>\nVariable refers to a memory location. It is used to store data. The data of variable can be changed and reused depending on condition or on information passed to the program. <br><br><h3>Variable declaration</h3>\nKotlin uses two different keywords to declare variables: val and var. <br>- Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val (Immutable variable). <br>- Use var for a variable whose value can change (Mutable variable).",
                R.drawable.variable
            ),
            Lessons(
                "Data types",
                "<h2>Basic types</h2>\nIn Kotlin, everything is an object in the sense that we can call member functions and properties on any variable. Some types can have a special internal representation - for example, numbers, characters and booleans can be represented as primitive values at runtime - but to the user they look like ordinary classes. In this section we describe the basic types used in Kotlin: numbers, booleans, characters, strings, and arrays.",
                R.drawable.datatype
            ),
            Lessons(
                "Functions",
                "<h3>Kotlin functions</h3>\nA function is a unit of code that performs a special task. In programming, function is used to break the code into smaller modules which makes the program more manageable. <br>In Kotlin, there are two types of function: <br>- Standard library function <br>- User defined function. <br><br><h2>Kotlin standard library function</h2>\nIn Kotlin, there are different number of built-in functions already defined in standard library and available for use. We can call them by passing arguments according to requirement. Some standard library function includes: sqrt(), print(), rem(), toInt(), readline(), compareTo(), etc. <br><br><h2>Kotlin user-defined function</h2>\nA function which is defined by the user is called user-defined function. As we know, to divide a large program in small modules we need to define function. Each defined function has its own properties like name of function, return type of a function, number of parameters passed to the function etc.",
                R.drawable.function
            ),
            Lessons(
                "if Expressions",
                "<h3>if statement</h3>\nIt is used to specify a block of statements to be executed or not i.e if a certain condition is true then the statement or block of statements to be executed otherwise fails to execute.",
                R.drawable.if_exp
            ),
            Lessons(
                "when Expressions",
                "<h2>Kotlin when expression</h2> \nIn Kotlin, when replaces the switch operator of other languages like Java. A certain block of code needs to be executed when some condition is fulfilled. The argument of when expression compares with all the branches one by one until some match is found. After the first match found, it reaches to end of the when block and execute the code next to when block. Unlike switch case in java or any other programming language, we do not require break statement at the end of each case.",
                R.drawable.when_exp
            ),
            Lessons(
                "Strings",
                "<h2>Kotlin String</h2> \nAn array of characters is called a string. Kotlin strings are mostly similar to Java strings but has some new added functionalities. Kotlin strings are also immutable in nature means we can not change elements and length of the String. <br><br>To declare a string in Kotlin, we need to use double quotes, single quotes are not allowed to define Strings.",
                R.drawable.string
            ),
            Lessons(
                "Loops",
                "<h2>Kotlin Loops</h2>\nLoops are mainly used to repeat the specific task. For example, if we want to print the number from 1 to 10, instead of writing a print statement 10 times, we can implement it through loops. <br>Loops reduce the number of lines in the program and improve reliability. Loops are control flow structures that controls the flow of the program within loops. <br>There are three types of loops in kotlin, for loop, while loop, and do-while loop.",
                R.drawable.loop
            ),
            Lessons(
                "Classes",
                "<h2>Class</h2>\nA class is a blue print for the objects having similar properties. We need to define a class before creating object and class keyword is used to define a class. The class declaration consist of class name, class header and class body enclosed with curly braces.",
                R.drawable.class_image
            ),
            Lessons(
                "Constructors",
                "<h2>Constructors</h2> \nA class in Kotlin can have a primary constructor and one or more secondary constructors. The primary constructor is a part of the class header, and it goes after the class name and optional type parameters. If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted.",
                R.drawable.constructor
            ),
            Lessons(
                "Visibility Modifiers",
                "<h2>Visibility modifiers</h2> \nClasses, objects, interfaces, constructors, and functions, as well as properties and their setters, can have visibility modifiers. Getters always have the same visibility as their properties. <br>There are four visibility modifiers in Kotlin: private, protected, internal, and public. The default visibility is public."
            ),
            Lessons("Inheritance"),
            Lessons("Interfaces"),
            Lessons("Nested and Inner Classes"),
            Lessons("Sealed Classes"),
            Lessons("Annotations"),
            Lessons("Type Checks and Cast"),
            Lessons("Generics"),
            Lessons("Class Delegation"),
            Lessons("Object Declarations"),
            Lessons("Collections"),
            Lessons("Null Safety"),
            Lessons("Lambdas and Higher-order Functions"),
            Lessons("Sequences"),
            Lessons("Exceptions"),
            Lessons("Scope Functions"),
            Lessons("Operator Overloading"),
            Lessons("Using Operators"),
            Lessons("Property Delegation"),
            Lessons("Reflection"),
            Lessons("Coroutines Basics"),
            Lessons("Multiplatform Programming"),
            Lessons("Java Interoperability"),
            Lessons("Testing")
        )
    }
}