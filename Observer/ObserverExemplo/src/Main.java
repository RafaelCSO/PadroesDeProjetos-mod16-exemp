public class Main {
    public static void main(String[] args) {

        Journalist jour = new Journalist();
        jour.registerObserver(new Newspaper());
        jour.registerObserver(new TV());

        jour.publish("Título","Sumário","Imagem","Texto");
    }
}