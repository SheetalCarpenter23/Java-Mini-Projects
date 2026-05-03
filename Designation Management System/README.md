\# 🚀 Designation Management System (CLI-Based)



A \*\*command-line based Java application\*\* designed to manage designation records efficiently using \*\*file handling instead of a traditional database system\*\*.

This project focuses on \*\*core backend fundamentals\*\*, including data management, clean architecture, and custom data structures.



\---



\## 📌 Overview



The Designation Management System allows users to perform complete \*\*CRUD operations\*\* (Create, Read, Update, Delete) on designation data.

It is built using \*\*Core Java\*\* and follows industry-standard design principles such as \*\*DAO (Data Access Object)\*\* and \*\*DTO (Data Transfer Object)\*\*.



\---



\## 🧠 Key Features



\* Add new designation with \*\*auto-generated unique code\*\*

\* Update existing designation records

\* Delete designation safely using \*\*file replacement strategy\*\*

\* Fetch all records in \*\*sorted order\*\*

\* Search designation by \*\*code or title\*\*

\* Validate duplicate entries

\* Get total record count



\---



\## ⚙️ Technology Stack



\* \*\*Language:\*\* Java (Core Java)

\* \*\*Application Type:\*\* Command-Line Interface (CLI)

\* \*\*Storage:\*\* File Handling (`RandomAccessFile`)

\* \*\*Architecture:\*\* DAO + DTO Design Pattern

\* \*\*Custom Utilities:\*\* User-defined Collection Framework



\---



\## 📂 Data Storage Design



All records are stored in a file:



📁 \*\*File:\*\* `designation.data`



\### Structure:



```id="l8f3s2"

lastGeneratedCode

recordCount

code

title

code

title

...

```



\* `lastGeneratedCode` → Maintains unique ID generation

\* `recordCount` → Tracks total records

\* Remaining entries → Actual data



\---



\## 🏗️ Project Architecture



The project follows a \*\*layered design approach\*\*:



```id="z3h7x9"

DTO Layer        → Holds data (DesignationDTO)

DAO Layer        → Handles file operations (DesignationDAO)

Interface Layer  → Defines contracts

Exception Layer  → Custom error handling (DAOException)

Utility Layer    → Custom collections (TMArrayList, TMIterator)

```



\---



\## 🧩 Core Components



\### 🔹 DesignationDTO



\* Stores data fields: `code`, `title`

\* Implements comparison for sorting



\### 🔹 DesignationDAO



\* Handles all file operations

\* Implements business logic and validations



\### 🔹 DAOException



\* Custom exception for meaningful error handling



\### 🔹 Custom Collection Framework



\* `TMArrayList` (dynamic array implementation)

\* `TMIterator` (custom iterator)

\* Demonstrates internal working of Java collections



\---



\## 🔄 Functional Modules



| Operation    | Description                         |

| ------------ | ----------------------------------- |

| Add          | Inserts new record with unique code |

| Update       | Modifies existing record            |

| Delete       | Removes record safely               |

| Get All      | Fetches all records                 |

| Get By Code  | Search using ID                     |

| Get By Title | Search using name                   |

| Exists Check | Prevents duplicates                 |

| Count        | Returns total records               |



\---



\## 🧪 Testing



Each functionality is validated using \*\*independent test cases\*\*, ensuring modular and reliable execution.



\---



\## ▶️ How to Run



\### Compile all files:



```id="q7m2x8"

javac \*.java

```



\### Run example:



```id="p4s9k1"

java DesignationAddTestCase Manager

```



\---



\## ⭐ Key Highlights



\* Designed a \*\*data management system without database\*\*

\* Efficient file operations using \*\*RandomAccessFile\*\*

\* Applied \*\*clean architecture principles\*\*

\* Built \*\*custom collection framework from scratch\*\*

\* Demonstrates strong understanding of \*\*low-level data handling\*\*



\---



\## 🚀 Future Enhancements



\* Integrate \*\*relational database (MySQL)\*\*

\* Develop \*\*GUI using Java Swing / JavaFX\*\*

\* Convert into \*\*web application (Spring Boot)\*\*

\* Implement \*\*authentication \& role-based access\*\*

\* Add \*\*multi-user support\*\*



\---



\## 🎯 Learning Outcomes



\* Deep understanding of \*\*file-based data management\*\*

\* Practical implementation of \*\*DAO \& DTO patterns\*\*

\* Hands-on experience with \*\*custom data structures\*\*

\* Improved skills in \*\*problem-solving and system design\*\*



\---



\## 🏁 Conclusion



This project demonstrates how a complete backend system can be built using \*\*core Java concepts without relying on external frameworks\*\*, making it a strong foundation for scalable application development.



\---



⭐ \*Feel free to explore, fork, and contribute!\*



