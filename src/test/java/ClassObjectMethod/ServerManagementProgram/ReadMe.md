# Project: Server Management System


## **Project Expectations**

1. **Three-Class Structure**:
    - The project will consist of three separate classes:
        1. `Server` Class: Represents individual server objects with specific properties.
        2. `ServerManager` Class: Manages the list of servers and provides functionality to add, remove, and display servers.
        3. `Runner` Class: Demonstrates the use of the `ServerManager` class and interacts with the user.

2. **Core Functionalities**:
    - **Server Class**:
        - Define a server object with the following attributes:
            - `name`: The name of the server.
            - `ipAddress`: The IP address of the server.
            - `status`: The status of the server (e.g., "Running", "Stopped").
        - Use a constructor to initialize these attributes.

    - **ServerManager Class**:
        - Manage all the server information using a `List<Server>`.
        - Provide methods to:
            - Add a new server.
            - Remove an existing server by its name.
            - Display the details of all servers.

    - **Runner Class**:
        - Create an instance of the `ServerManager` class.
        - Demonstrate how to add servers, remove servers, and display the current server list.

3. **Implementation Notes**:
    - Use **constructors** in the `Server` class to initialize server objects.
    - Use **methods** in the `ServerManager` class to encapsulate server-related operations.
    - Use the `List` data type to dynamically store and manage server objects.


#