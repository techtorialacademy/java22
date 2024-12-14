package ClassObjectMethod.ServerManagementProgram;

public class Runner {
    public static void main(String[] args) {
        ServerManager serverManager = new ServerManager();
        System.out.println(serverManager.listOfServers.size()); // 0

        Server server1 = new Server("Jenkins","32.170.45.60","Running");

        System.out.println(serverManager.listOfServers.size()); // 0

        serverManager.addServer(server1);

        System.out.println(serverManager.listOfServers.size()); // 1

        Server server2 = new Server("Terraform","48.101.175.128","Pending");

        serverManager.addServer(server2);

        Server server3 = new Server("StagingTP","81.96.144.52", "Hybernating");

        serverManager.addServer(server3);

        // How could I display all the server information?
        serverManager.displayAllServerInfo();
        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("=========================Terraform server removed.==========================");

        // Let's remove the server with name Terraform
        serverManager.removeServer("Terraform");

        System.out.println(serverManager.listOfServers.size()); // 2

        serverManager.displayAllServerInfo();






    }

}
