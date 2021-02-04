package util;


public class PlayerObject {
	
	private Point3f centre= new Point3f(0,0,0);			// Centre of object, using 3D as objects may be scaled  
	private int lives=2;

	private int width=10;
	private int height=10;
	private boolean hasTextured=false;
	private String textureLocation="D:/Downloads/gameassignment1/game/res/mexicanWithKids.png"; 
	private String blanktexture="res/blankSprite.png";
	private boolean isGrounded;
	float  velocityY= (float) -.3;
	float gravity=(float) -.5;
	public PlayerObject() {  
		
	}
	
    public PlayerObject(int width,int height,Point3f centre) { 
    	 hasTextured=true;
    	 this.width=width;
		 this.height=height;
		 this.centre =centre;
	}
   
    public float getVelocity() {
    	return velocityY;
    }
    public boolean isGrounded() {
    	return isGrounded;
    }
    public void setYVelocity(float velocity) {
    	velocityY=velocity;
    }

	public Point3f getCentre() {
		return centre;
	}

	public void setCentre(Point3f centre) {
		this.centre = centre;
		
		//make sure to put boundaries on the gameObject 
	 
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getTexture() {
		if(hasTextured) 
			{
			return textureLocation;
			}
		 
		return blanktexture; 
	}

	public void setGrounded(boolean isGrounded) {
		this.isGrounded = isGrounded;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		if (lives==2){
			textureLocation="D:/Downloads/gameassignment1/game/res/mexicanWithKids.png";
		}
		if (lives==1){
			textureLocation="D:/Downloads/gameassignment1/game/res/mexican.png";
		}
		this.lives = lives;
	}
  
}
