public class Message {

    private String recipient, sender, message;

    //Mutator Method

    public void setRecipient(String recipient){

        this.recipient = recipient;
    }

    public void setSender(String sender){

        this.sender = sender;
    }

    public void setMessage(String message){

        this.message = message;
    }

    //Accessor method

    public String getRecipient() {

        return recipient;
    }

    public String getSender() {

        return sender;
    }

    public String getMessage() {

        return message;
    }

    public String toString() {

        return "From: " + getSender() + "\nTo: " + getRecipient() +
                "\nMessage: " + getMessage();
    }

    public Message(String recipient, String sender)
    {

        setRecipient(recipient);
        setSender(sender);
        setMessage(message);
    }




}
