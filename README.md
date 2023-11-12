Books Management Application

This is a basic Java application for managing books. It utilizes the Spring Framework and JPA (Java Persistence API) for data storage and retrieval.
Project Structure

The project is divided into three main packages:

    com.example.books.entity: Contains the Book entity class, representing the structure of a book.

    com.example.books.repository: Includes the BookRepository interface, extending JpaRepository for database operations.

    com.example.books.service: Implements the serviceInterface with the serviceMethods class, providing methods for interacting with the BookRepository.

Entity Class (Book)

The Book class defines the structure of a book with attributes such as id, author, publisher, ISBN, copies, pages, and subject. It includes getters, setters, constructors, and a toString method for easy representation.
Repository Interface (BookRepository)

The BookRepository interface extends the Spring Data JPA JpaRepository, providing out-of-the-box CRUD (Create, Read, Update, Delete) operations for the Book entity.
Service Class (serviceMethods)

The serviceMethods class implements the serviceInterface and interacts with the BookRepository. It provides methods for saving, retrieving by ID, editing, deleting, and fetching all books.
How to Use

    Clone the repository:

    bash

git clone <repository-url>

Build the project:

bash

cd <project-directory>
./gradlew build

Run the application:

bash

    ./gradlew bootRun

    Access the application:

    The application will be accessible at http://localhost:8080. You can use tools like Postman or a web browser to interact with the API.

API Endpoints

    POST /api/books: Create a new book.
    GET /api/books/{id}: Retrieve a book by ID.
    PUT /api/books/{id}: Update a book.
    DELETE /api/books/{id}: Delete a book.
    GET /api/books: Retrieve all books.

Dependencies

    Spring Boot
    Spring Data JPA
    H2 Database (default for simplicity, can be changed in application.properties)

Contributing

Feel free to contribute to the development of this project by submitting issues or pull requests.
License

This project is licensed under the MIT License.
