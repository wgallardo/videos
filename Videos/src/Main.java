import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {


        Video video1 = new Video();
        video1.setTitol("MasterClass");
        video1.setUrl(new URL("https://cibernarium.barcelonactiva.cat"));

        String tags = new String("HTML, CCS, PHP");
        video1.addTags(tags);



        Usuari user1 = new Usuari();
        user1.setNom("Trump");
        user1.addVideo(video1);


        for (Video v : user1.getVideos()) {
            System.out.println("El usuario: " + user1.getNom()
                                            + " Publico los videos de: "  + v.getTitol()
                                            + ",  con la URL " + v.getUrl()
                                            + ", Tags:" + v.getTags());
        }
    }
}