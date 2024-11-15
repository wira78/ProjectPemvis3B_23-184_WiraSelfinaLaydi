
package projekakhir;

public class querynya {
    private int id;
    private String judul;
    private String judul_kedua;
    private String author;
    private String deskripsi;
    private String kategori;
    private byte[] Image;
    
    public querynya(){}
    
    public querynya(int Id, String judul, String judul_kedua, String author, String deskripsi, String kategori, byte[] image){
    
        this.id = Id;
        this.judul = judul;
        this.judul_kedua = judul_kedua;
        this.author = author;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.Image = image;
       
    }
        
    public int getid(){
      return id;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public String getjudul(){
        return judul;
    }
    
    public void setjudul(String judul){
        this.judul = judul;
    }
    
    public String getjudul_kedua(){
        return judul_kedua;
    }
    
    public void setjudul_kedua(String judul_kedua){
        this.judul_kedua = judul_kedua;
    }
    
    public String getauthor(){
        return author;
    }
    
    public void setauthor(String author){
        this.author= author;
    }
    
    public String getdeskripsi(){
        return deskripsi;
    }
    
    public void setdeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
    
    public String getkategori(){
        return kategori;
    }
    
    public void setkategori(String kategori){
        this.kategori=kategori;
    }
    public byte[] getMyImage(){
        return Image;
    }
}
