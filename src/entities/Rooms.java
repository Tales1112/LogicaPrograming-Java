package entities;

public class Rooms {
       private String nome;
       private String email;
       private int room;
       
       public Rooms(String nome, String email, int room) {
    	    this.email = email;
    	    this.nome = nome;
    	    this.room = room;
       }
       public String getNome() {
    	   return nome;
       }
       public String getEmail() {
    	   return email;
       }
       public int getRoom() {
    	   return room;
       }
       
}
