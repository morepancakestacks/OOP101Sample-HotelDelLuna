<h1 align = "center">𝓗𝓸𝓽𝓮𝓵 𝓓𝓮𝓵 𝓛𝓾𝓷𝓪</h1>
<p align = "center">OOP 101: 0bject-oriented Programming
<br/><i>Agdon, Fatima Marie P.</i>
</p>
<h2>About this Project</h2>
A simple Java-based Hotel Management System developed to demonstrate fundamental Object-Oriented Programming (OOP) concepts.

<h2>Overview</h2>
This project models different types of hotel rooms and demonstrates how Java OOP principles can be applied in a practical scenario.

<h3>OOP Concepts Demonstrated</h3>
<ul type = "circle">
	<li>Encapsulation. Protecting object data using access modifiers.</li>
	<li>Inheritance. Creating specialized room classes from a common parent class.</li>
	<li>Polymorphism. Overriding methods to provide different implementations.</li>
	<li>Abstraction. Using abstract classes and methods to define common structures and required behaviors.</li>
	<li>Interfaces. Defining contracts that can be implemented by different classes.</li>
</ul>

<h2>Project Structure</h2>
```
📂HotelManagementSystem/
├── 📂src/
│   ├── 📄Main.java
│   ├── 📄HotelRoom.java
│   ├── 📄StandardRoom.java
│   ├── 📄DeluxeRoom.java
│   ├── 📄SuiteRoom.java
│   ├── 📄Bookable.java
│   ├── 📄ConferenceHall.java
│   ├── 📄RoomType.java
│   └── 📄RoomStatus.java
├── 📂docs/
│   ├── 🖼️HotelManagementSystem-UML.png
│   └── 📄HotelManagementSystem-UML.mmd
├── 📜README.md
└── 📜.gitignore
```

<h2>Requirements</h2>
<ul type = "cicle">
	<li>Java Development Kit (JDK)</li>
	<li>A text editor (e.g., Sublime Text)</li>
	<li>Command-line terminal</li>
</ul>

<h2>How to Run</h2>
<ol type = "1">
<li>Clone or download this repository.</li>
<li>Open the project folder in your terminal.</li>
<li>Compile the Java source files:</li>
`javac -d out src/*.java`
<li>Run the program:</li>
`java -cp out Main`
</ol>

<h2>UML Class Diagram</h2>
See the docs folder for the UML class diagram and its Mermaid source code.

<h2>Learning Purpose</h2>
This project is intended for educational purposes and serves as an example of applying Java OOP concepts through a simple hotel management scenario.