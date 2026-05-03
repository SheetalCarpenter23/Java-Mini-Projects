\# ⚙️ Setter Getter Generator (Java Reflection Based)



A lightweight \*\*Java-based utility tool\*\* that automatically generates \*\*getter and setter methods\*\* for any given class using the \*\*Reflection API\*\*.

This project demonstrates automation of repetitive code and understanding of \*\*Java runtime behavior\*\*.



\---



\## 📌 Overview



The Setter Getter Generator reduces manual coding effort by dynamically analyzing a class at runtime and generating corresponding getter and setter methods.

It helps eliminate boilerplate code and improves development efficiency.



\---



\## 🧠 Key Features



\* Automatically generates \*\*getter and setter methods\*\*

\* Uses \*\*Java Reflection API\*\* to analyze class structure

\* Supports multiple data types (primitive \& object types)

\* Generates \*\*default constructor (optional)\*\*

\* Writes output to a file for easy integration

\* Reduces repetitive manual coding



\---



\## ⚙️ Technology Stack



\* \*\*Language:\*\* Java (Core Java)

\* \*\*Concepts Used:\*\*



&#x20; \* Reflection API

&#x20; \* File Handling

&#x20; \* Custom Collections (TMArrayList, TMIterator)

\* \*\*Application Type:\*\* Command-Line Utility



\---



\## 🧩 Working Principle



1\. Accepts \*\*class name as input\*\*

2\. Loads class dynamically using Reflection

3\. Extracts all declared fields

4\. Generates getter and setter methods using naming conventions

5\. Stores generated code using custom collection

6\. Writes output into a file



\---



\## 📂 Output



📁 \*\*Output File:\*\* `generated\_methods.txt`



This file contains all getter and setter methods which can be copied into the original class.



\---



\## 🧪 Example Output



```java

public String getName() {

&#x20;   return this.name;

}



public void setName(String name) {

&#x20;   this.name = name;

}

```



\---



\## ▶️ How to Use



\### Step 1: Compile class



```

javac Employee.java

```



\### Step 2: Run Generator



```

java com.thinking.machines.util.SetterGetterGenerator Employee

```



\### Step 3: (Optional Constructor Generation)



```

java com.thinking.machines.util.SetterGetterGenerator Employee constructor=true

```



\---



\## 🏗️ Core Components



\### 🔹 SetterGetterGenerator



\* Main class handling reflection and code generation logic



\### 🔹 Custom Collection Framework



\* `TMArrayList` – dynamic data storage

\* `TMIterator` – traversal mechanism

\* Demonstrates internal working of collections



\### 🔹 Reflection API



\* Used to inspect class fields at runtime



\---



\## ⭐ Key Highlights



\* Automates repetitive \*\*boilerplate code generation\*\*

\* Demonstrates concept similar to tools like \*\*Lombok\*\*

\* Uses \*\*Reflection API\*\* for dynamic behavior

\* Implements \*\*custom collection framework\*\*

\* Improves developer productivity



\---



\## 🚀 Future Enhancements



\* Develop \*\*IDE plugin (IntelliJ / Eclipse integration)\*\*

\* Add support for \*\*annotations (@Getter, @Setter)\*\*

\* Enable \*\*direct code injection into source file\*\*

\* Provide \*\*GUI interface for better usability\*\*

\* Support \*\*advanced class structures (inheritance, nested objects)\*\*



\---



\## 🎯 Learning Outcomes



\* Understanding of \*\*Reflection API\*\*

\* Insight into \*\*code generation techniques\*\*

\* Practical use of \*\*automation in development\*\*

\* Experience with \*\*custom data structures\*\*



\---



\## 🏁 Conclusion



This project demonstrates how repetitive coding tasks can be automated using \*\*Java Reflection\*\*, providing insight into how modern frameworks simplify development and reduce boilerplate code.



\---



\## 🙋‍♀️ Author



\*\*Sheetal Carpenter\*\*



