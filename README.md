<h1 align = "center">🏨 𝓗𝓸𝓽𝓮𝓵 𝓓𝓮𝓵 𝓛𝓾𝓷𝓪 🌙✨</h1>
<p align = "center">OOP 101: Object-oriented Programming
<br/><i>Agdon, Fatima Marie P.</i><br/><br/>
A simple Java-based Hotel Management System developed to demonstrate fundamental Object-Oriented Programming (OOP) concepts.
</p>

<h2>‧₊˚ ┊ Overview</h2>
This project models different types of hotel rooms and demonstrates how Java OOP principles can be applied in a practical scenario.

<h2>‧₊˚ ┊ OOP Concepts Demonstrated</h2>
<table>
	<tr>
		<th>OOP Concept</th>
		<th>How it was demonstrated</th>
	</tr>
	<tr>
		<td>𝐄𝐧𝐜𝐚𝐩𝐬𝐮𝐥𝐚𝐭𝐢𝐨𝐧</td>
		<td>The attributes of <code>HotelRoom</code> (<code>roomNumber</code>, <code>roomType</code>, <code>pricePerStay</code>, and <code>status</code>) are declared as <code>private</code> to restrict direct access. Constructors initialize these attributes, while methods such as <code>bookRoom()</code> and <code>cancelBooking()</code> control changes to the room's status.</td>
	</tr>
	<tr>
		<td>𝐈𝐧𝐡𝐞𝐫𝐢𝐭𝐚𝐧𝐜𝐞</td>
		<td><code>StandardRoom</code>, <code>DeluxeRoom</code>, and <code>SuiteRoom</code> extend the abstract <code>HotelRoom</code> class. They reuse its common attributes and methods through inheritance while providing their own room-specific features. The <code>super()</code> keyword is used to invoke the parent constructor.</td>
	</tr>
	<tr>
		<td>𝐏𝐨𝐥𝐲𝐦𝐨𝐫𝐩𝐡𝐢𝐬𝐦</td>
		<td>Each room subclass overrides the <code>displayFeatures()</code> method to provide its own implementation. A <code>HotelRoom</code> reference can hold different room objects, and the appropriate overridden method is executed at runtime. The <code>Bookable</code> interface also allows different classes to be referenced using a common interface type.</td>
	</tr>
	<tr>
		<td>𝐀𝐛𝐬𝐭𝐫𝐚𝐜𝐭𝐢𝐨𝐧</td>
		<td>The abstract <code>HotelRoom</code> class defines common room characteristics and declares <code>displayFeatures()</code> as an abstract method, requiring subclasses to implement it. The <code>Bookable</code> interface defines the <code>bookRoom()</code> and <code>cancelBooking()</code> methods, which are implemented by both <code>HotelRoom</code> and <code>ConferenceHall</code>.</td>
	</tr>
</table>

<h2>‧₊˚ ┊ Project Structure</h2>

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

<h2>‧₊˚ ┊ Requirements</h2>
<ul type = "circle">
	<li>Java Development Kit (JDK)</li>
	<li>A text editor (e.g., Sublime Text)</li>
	<li>Command-line terminal</li>
</ul>

<h2>‧₊˚ ┊ How to Run the Program</h2>
<ol type = "1">
<li>Clone or download this repository.</li>
<li>Open the project folder in your terminal.</li>
<li>Compile the Java source files:</li>

```
javac -d out src/*.java
```
<li>Run the program:</li>

```
java -cp out Main
```
</ol>

<h2>‧₊˚ ┊ UML Class Diagram</h2>
<img src = "docs\UMLDiagram.png">

<h2>‧₊˚ ┊ Learning Purpose</h2>
This project is intended for educational purposes and serves as an example of applying Java OOP concepts through a simple hotel management scenario.

<h2>‧₊˚ ┊ Team Members</h2>
<table>
<tr>
	<td>
		<img src = "assets\fmpa-heart.png">
	</td>
	<td>
		<b><i>Fatima Marie P. Agdon</i></b> is a <b>Master of Science in Computer Science</b> graduate from Batangas State University – The National Engineering University, Alangilan Campus. She is a faculty member of the College of Informatics and Computing Sciences at the same university, where she has been teaching Computer Science courses (including Computer Programming, Object-oriented Programming (Basic and Advanced), Data Structures and Algorithms, Web Systems and Technologies, Software Engineering) since 2019. Her interests include art, multimedia, and computer technologies, with a passion for integrating creativity and technology in education and research.
	</td>
</tr>
</table>