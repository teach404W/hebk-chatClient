/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatClient;

/**
 *
 * @author Felix
 */
public class ClientProtokoll {
    
    public static void anmelden(ChatClient pChatClient, String pNachricht){  
        pChatClient.send("Anmelden:"+pNachricht);
    }
    
    public static void abmelden(ChatClient pChatClient, String pNachricht){  
        //TODO
    }

    public static void senden(ChatClient pChatClient, String pNachricht){  
        //TODO
    }
    
     public static void fluestern(ChatClient pChatClient, String pNachricht){  
        //TODO
    }
     
      public static void list(ChatClient pChatClient){  
        //TODO
    }
    
    public static void trennen(ChatClient pChatClient){  
        pChatClient.send("Trennen");
    }
}
