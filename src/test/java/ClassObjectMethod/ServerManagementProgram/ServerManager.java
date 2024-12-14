package ClassObjectMethod.ServerManagementProgram;

import java.util.ArrayList;
import java.util.List;

public class ServerManager {
    // Create a list for storing server objects.
    List<Server> listOfServers = new ArrayList<>();

    public void addServer(Server server){
        listOfServers.add(server);
    }
    // Remove an existing server by its name.
    public void removeServer(String name){
        for (int i = 0; i < listOfServers.size() ; i++) {
            Server currentServer = listOfServers.get(i);
            if(currentServer.name.equalsIgnoreCase(name)){
                listOfServers.remove(i);
            }
        }
    }

    // Display the details off all server
    public void displayAllServerInfo(){
        for(Server server: listOfServers){
            server.displayInfo();
        }
    }




}
