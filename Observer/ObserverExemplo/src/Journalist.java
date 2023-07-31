import java.util.ArrayList;

public class Journalist implements Subject{
    private ArrayList<Observer> observers = new ArrayList<>();
    private String title, summary, image, text;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getSummary(){
        return summary;
    }
    public void setSummary(String summary){
        this.summary = summary;
    }
    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }

    public void publish(String title, String summary, String image, String text) {
        this.title = title;
        this.summary = summary;
        this.image = image;
        this.text = text;
        notifyObserver();
    }
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObserver(){
        observers.forEach(observer -> observer.update(this));
    }
    public String toString(){
        return "Journalist {" +
                "observers= '" + observers +
                ", title= '" + title + '\'' +
                ", image= '" + image + '\'' +
                ", text= '" + text + '\'' +
                '}';
    }
}
