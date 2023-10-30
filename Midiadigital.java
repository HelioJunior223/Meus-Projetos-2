public class Midiadigital extends Midia {
    private String album;

    public Midiadigital(String titulo, String album) {
        super(titulo);
        this.album = album;
    }

    public String obterAlbum() {
        return album;
    }
} 
    
