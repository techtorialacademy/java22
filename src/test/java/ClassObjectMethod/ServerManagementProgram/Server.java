package ClassObjectMethod.ServerManagementProgram;

public class Server {
    String name;
    String ipAddress;
    String status;
    // How do I initialize all the attributes above using a constructor?

    public Server(String name, String ipAddress, String status) {
        this.name = name;
        this.ipAddress = ipAddress;
        this.status = status;
    }


    public void displayInfo(){
        System.out.println("Server Name: " + name);
        System.out.println("Ip Address: " + ipAddress);
        System.out.println("Status: " + status);
    }

}
