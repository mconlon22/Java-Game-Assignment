package util;

public class FloorObject {
	
	private Point3f centre= new Point3f(0,0,0);			// Centre of object, using 3D as objects may be scaled  
	private int width=10;
	private int height=10;
	private boolean hasTextured=false;
	private String textureLocation="D:/Downloads/gameassignment1/game/res/Block_Box_2_Light.png"; 
	private String blanktexture="res/blankSprite.png";
	private int numBlocks;
	public FloorObject() {  
		
	}
	
    public FloorObject(int numBlocks,Point3f centre) { 
    	 hasTextured=true;
         this.centre =centre;
         this.numBlocks = numBlocks;
	}

	public Point3f getCentre() {
		return centre;
	}

	public void setCentre(Point3f centre) {
		this.centre = centre;
		
		//make sure to put boundaries on the FloorObject 
	 
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

    public int getNumBlocks() {
        return numBlocks;
    }

    public void setNumBlocks(int numBlocks) {
        this.numBlocks = numBlocks;
    }
  
}
