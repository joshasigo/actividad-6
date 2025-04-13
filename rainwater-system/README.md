# Intelligent Rainwater Collection and Purification System

This project implements an intelligent rainwater collection and purification system using microservices architecture. The system is built with Java and Spring Boot, and it utilizes Docker for deployment.

## Project Structure

The project is organized into several microservices:

- **Collection Service**: Responsible for collecting rainwater data and managing the collection process.
- **Purification Service**: Handles the purification of collected rainwater and ensures it meets quality standards.
- **Gateway Service**: Acts as a single entry point for the client, routing requests to the appropriate microservice.

## Technologies Used

- Java
- Spring Boot
- Docker
- Maven

## Setup Instructions

1. **Clone the Repository**:
   ```
   git clone <repository-url>
   cd rainwater-system
   ```

2. **Build the Services**:
   Navigate to each service directory and run:
   ```
   mvn clean install
   ```

3. **Run the Services with Docker**:
   Use Docker Compose to start all services:
   ```
   docker-compose up
   ```

4. **Access the Services**:
   - Collection Service: `http://localhost:<collection-service-port>`
   - Purification Service: `http://localhost:<purification-service-port>`
   - Gateway Service: `http://localhost:<gateway-service-port>`

## Usage Guidelines

- Use the Gateway Service to interact with the Collection and Purification Services.
- Refer to the individual service documentation for specific API endpoints and request/response formats.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.