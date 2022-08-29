package Lab3Task2;

import java.util.*;  
public class Playlist{
  
  //Instance variable
  private List<Song> songs;  //arraylist of songs
  private String name; //Playlist name
  
  
  public Playlist(String name){ 
    songs = new ArrayList<Song>();  //initalize Arraylist to hold Song type
    this.name = name;
  }
  
  
  //Methods:
  public boolean removeSong(Song s) {
      return songs.remove(s);
      
  }
  
  public int totalSongs() {
      return songs.size();
      
  }
  
  double playlistTime(){
      double totalTime = 0;
      for(Song s:songs){
          totalTime += s.getPlayTime();
      }
      return totalTime;
      
  }
  
  public boolean isSongInPlaylist(String name) {
      boolean isInPlaylist = false;
      int i = 0;
      while (!isInPlaylist & i < songs.size()) {
          isInPlaylist = name.equals(songs.get(i).getSongName())? true: false;
          i++;
      }
      return isInPlaylist;
  }
  
  public void songsByArtist(String name) {
      for (Song s : songs){
          System.out.print((s.getArtist().equals(name)) ? s.toString() + "\n" : "");
      }
  }
  
  public boolean addSongsFrom(Playlist p) {
      boolean isAdded = false;
      for (Song s : p.getList()){
          isAdded = this.isSongInPlaylist(s.getSongName()) ? false: this.addSong(s);
      }
      
      return isAdded;
  }

 //Returns the playlist name
  public String playlistName(){
   return name; 
    
  }

  //adds Song s to Playlist
  public boolean addSong(Song s){
    return songs.add(s); 
  }
  
  //return list. Note return is List<Song>.
  public List<Song> getList(){
    return songs;
  }
  
}//end of class Playlist