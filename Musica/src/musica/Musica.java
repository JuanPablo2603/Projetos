
package musica;
import  java.io.*;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Musica {

        public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException {
        // TODO code application logic here
         File filePath = new File("src/musica/rumo-ao-sol-13162.wav"); // Caminho relativo do arquivo
         Scanner scanner = new Scanner(System.in);
         
         
         if(!filePath.exists()){
             System.out.println("esse arquivo nao existe");
         }


        try( 
                AudioInputStream audiostream = AudioSystem.getAudioInputStream(filePath)){
          Clip clip = AudioSystem.getClip();
          clip.open(audiostream);
          
          
          boolean running = true; 
          System.out.println("🎶 Controle de música:");
          System.out.println("Digite 'play' para tocar");
          System.out.println("Digite 'pause' para pausar");
          System.out.println("Digite 'restart' para reiniciar");
          System.out.println("Digite 'exit' para sair");
          
          while(running){
              System.out.println("Comando : ");
              String comando = scanner.nextLine().toLowerCase();
              switch(comando){
                  case "Play" -> {
                      clip.start();
                      System.out.println("A musica está tocando...");
                  }
                  
                  case "pause" -> {
                      clip.stop();
                      System.out.println("Musica pausada");
                  }
                  case "restart" -> {
                      clip.setFramePosition(0);
                      clip.start();
                  }
                  case "exit" -> {
                      clip.stop();
                      clip.close();
                      running= false;
                      System.out.println("Encerrando player... tchauzinho!!!!");
                  }
                  default -> System.out.println("comando inválido");
                      
                              
              }
              
          }


        }
        catch(FileNotFoundException e){
            System.out.println("arquivo nao encontrado");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio nao suportado ");
            
        }
        catch(LineUnavailableException e){
            System.out.println("Impossivel de abrir o arquivo");
        }
        catch(IOException e){
            System.out.println("Algo deu errado");
            
        }
    }
    
}
