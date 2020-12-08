import java.util.ArrayList;
public class MessagingService {
    private ArrayList<Message> messages;
  
    public MessagingService (){
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message){
        String content = message.getContent();
        if (content.length() <= 280){
            messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return this.messages;
    }
    
    
}
