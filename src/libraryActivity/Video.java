package libraryActivity;

public class Video implements Media {

    private boolean isAvailable;
    private String title;
    private String director;
    private int originalNumCopies;
    private int currentNumCopies;

    public Video(String title, String director, int numCopies){
        this.title = title;
        this.director = director;
        this.originalNumCopies = numCopies;
        this.currentNumCopies = numCopies;
    }

    public String getTitle(){
        return title;
    }

    public boolean checkOut(){
        if(currentNumCopies != 0){
            currentNumCopies --;
            return true;
        }
        return false;
    }
    public boolean checkIn(){
        if(currentNumCopies < originalNumCopies){
            currentNumCopies ++;
            return true;
        }
        return false;
    }

    public String toString(){
        return this.title + " dir. by " + this.director + "\nAvailable Copies: " + currentNumCopies;
    }
}
