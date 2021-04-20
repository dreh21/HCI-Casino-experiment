import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Card {
	 private String faceValue;
	 private String suit;
	 private BufferedImage image;
	 private BufferedImage backOfCardImage;
	 
	    public Card(String faceValue, String suit) throws IOException {
	        this.faceValue=faceValue;
	        this.suit=suit;
	        this.backOfCardImage = ImageIO.read(new File("./images/backOfCard.png"));
	        String fileName = faceValue + "_of_"+suit+".png";
	        this.image = ImageIO.read(new File("./images/"+fileName));
	    }

	    public String getFaceName() {
	        return faceValue;
	    }


	    public Image getImage() {
	        return image;
	    }


	    public String getSuit() {
	        return suit;
	    }

}
