package util;



public class EnemyObject {
	
	private Point3f centre= new Point3f(0,0,0);			// Centre of object, using 3D as objects may be scaled  
	private int width=10;
	private int height=10;
	private boolean hasTextured=false;
	private String textureLocation="D:/Downloads/gameassignment1/game/res/police.png"; 
	private String blanktexture="res/blankSprite.png";
	private boolean isGrounded;
	
	public EnemyObject() {  
		
	}
	
    public EnemyObject(int width,int height,Point3f centre) { 
    	 hasTextured=true;
    	 this.width=width;
		 this.height=height;
		 this.centre =centre;
	}
   
   
    public boolean isGrounded() {
    	return isGrounded;
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
  
}
