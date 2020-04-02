package libraryActivity;

public class RareManuscripts implements Media {
    private final boolean IS_AVAILABLE = true;
    private String title;
    private String author;

    public RareManuscripts(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public boolean checkOut(){
        return !IS_AVAILABLE;
    }
    public boolean checkIn(){
        return !IS_AVAILABLE;
    }
    public String toString() {
        return this.title + " by " + this.author + "\nAvailable: " + IS_AVAILABLE;
    }
}
