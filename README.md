# Restaurant Management Application

 

The Restaurant Management Application is a Spring Boot-based web application designed to help manage restaurant information. It allows users to perform various operations related to restaurant management, including adding new restaurants, updating specialties, and deleting restaurants from the system.

 

## Features

 

- **Restaurant Model:** The application defines a `Restaurant` model with attributes such as name, address, phone number, specialty, staff count, and type.

 

- **RESTful API Endpoints:** The application provides RESTful API endpoints for performing various operations on restaurants:

 

  - `GET /restaurants`: Retrieve a list of all registered restaurants.
  - `GET /restaurant/{id}`: Get detailed information about a specific restaurant by its ID.
  - `POST /restaurant`: Add a new restaurant to the system.
  - `POST /restaurants`: Add multiple restaurants to the system.
  - `PUT /restaurant/id/{id}/specialty`: Update the specialty of a restaurant by its ID.
  - `DELETE /restaurant/{id}`: Delete a restaurant by its ID.

 

- **Validation:** The application enforces validation rules on restaurant data to ensure data integrity, including checks for valid names, phone numbers, email addresses, and more.

 

- **In-Memory Storage:** The application uses an in-memory data store (Java List) for simplicity. You can extend this to use a database for persistence.

 

## Getting Started

 

1. Clone this repository to your local machine.

 

2. Make sure you have Java and Maven installed.

 

3. Build the project using Maven:

 

   ```bash
   mvn clean install
   ```

 

4. Run the application:

 

   ```bash
   java -jar target/restaurant-management-application-0.0.1-SNAPSHOT.jar
   ```

 

   Replace `0.0.1-SNAPSHOT` with the actual version of the JAR file.

 

5. The application will be accessible at `http://localhost:8080`.

 

## Usage

 

- Use a tool like Postman to interact with the RESTful API endpoints to manage restaurants.

 

- Create, retrieve, update, and delete restaurants as needed.

 

## Configuration

 

- The application uses an in-memory list for data storage by default. You can configure it to use a database for persistent storage.

 

## Contributing

 

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

 

1. Fork the repository.

2. Create a new branch for your feature or bug fix.

3. Make your changes and commit them with descriptive commit messages.

4. Push your changes to your fork.

5. Submit a pull request to the main repository.


 

## Contact

 

For any inquiries or feedback, please contact [Manisha Biswal] at [manishabiswal0227@gmail.com].
