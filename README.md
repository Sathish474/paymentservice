# Payment Service

This project implements a payment gateway to create payment links using third-party gateway libraries. It uses the Adapter and Strategy design patterns to ensure flexible and reusable code.

## Features

- Create payment links using third-party payment gateways.
- Flexible and reusable code architecture.
- Uses Adapter and Strategy design patterns.

## Technologies Used

- Java
- Spring Boot
- Maven
- Stripe Java SDK

## Design Patterns

### Adapter Pattern

The Adapter pattern is used to integrate different payment gateways into the system. Each payment gateway has its own adapter that implements a common interface.

### Strategy Pattern

The Strategy pattern is used to select the appropriate payment gateway at runtime based on a specific strategy.

## Project Structure

- `controllers`: Contains the REST controllers for handling HTTP requests.
- `dtos`: Contains the Data Transfer Objects (DTOs) for request and response payloads.
- `services`: Contains the service layer for business logic.
- `adaptors/paymentgatewaysadaptors`: Contains the adapters for different payment gateways.
- `factory`: Contains the factory for creating payment gateway adapters.

## Getting Started

### Prerequisites

- Java 21
- Maven

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/Sathish474/paymentservice.git
    ```
2. Navigate to the project directory:
    ```sh
    cd paymentservice
    ```
3. Build the project:
    ```sh
    mvn clean install
    ```

### Running the Application

1. Run the Spring Boot application:
    ```sh
    mvn spring-boot:run
    ```

### Usage

- The application exposes a REST endpoint to create payment links:
    - `POST /payments/`: Creates a payment link using the provided order details.

### Example Request

```json
POST /payments/
{
    "orderId": 12345
}