public class TV implements Observer{
    public void update(Subject subject){
        if (subject instanceof Journalist){
            Journalist journalist = (Journalist) subject;
            System.out.println("Notificando mensagens pela TV: " + journalist.toString());
        }
    }
}
