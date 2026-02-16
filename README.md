🚀 Student Management System (REST API)
A lightweight RESTful API built with Spring Boot to manage student records. This project demonstrates the implementation of a layered architecture using DTOs, Mappers, and Service logic with Java Stream API.
🛠 Technologies Used
Java 21
Maven (Dependency Management)
In-memory Storage: ArrayList (Simulating a database)
🏗 Project Architecture
The application follows a clean, layered architecture to separate concerns:
Model (Entity): The core Student class representing the data structure.
DTO (Data Transfer Object): Separates Request (StudentRequest) and Response (StudentResponse) payloads.
Mapper: Handles the conversion between Entities and DTOs.
Service Layer: Contains the business logic, using Java Streams and forEach for data processing.
Controller: Manages REST API endpoints and HTTP communication.
🚀 Getting Started
1. Prerequisites
   JDK 21 or later installed.
   Maven installed.
2. Clone the Repository
   code
   Bash
   git clone  https://github.com/AydanBayramova/StudentProject
   cd student-management-api
3. Build the Project
   code
   Bash
   mvn clean install
4. Run the Application
   code
   Bash
   mvn spring-boot:run
   The server will start at: http://localhost:8080
   📡 API Endpoints
   Method	Endpoint	Description
   GET	/students	Retrieve all students
   GET	/students/{id}	Retrieve a specific student by ID
   POST	/students	Add a new student
   PUT	/students/{id}	Update an existing student
   DELETE	/students/{id}	Remove a student from the list
   🧪 Data Examples
   📥 Create/Update Student (POST / PUT)
   Payload (JSON):
   code
   JSON
   {
   "name": "John Doe",
   "age": 21,
   "email": "john.doe@example.com"
   }
   📤 Student Response (GET)
   Payload (JSON):
   code
   JSON
   {
   "id": 1,
   "name": "John Doe",
   "email": "john.doe@example.com"
   }
   Note: For security/privacy reasons, the age field is excluded from the response DTO.
   🛠 How to Test
   You can test the API using tools like:
   Postman or Insomnia.
   cURL via terminal:
   code
   Bash
# Get all students
curl -X GET http://localhost:8080/students
📝 Features Implemented
✅ In-memory Database: Initialized with 2 default students upon startup.
✅ Layered Logic: Decoupled Controller and Service layers.
✅ Modern Java: Utilizes Streams, Lambda expressions, and Method References.
✅ Data Mapping: Clean conversion between internal entities and external API models.
👤 Author