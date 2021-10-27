/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private int eyeNumber;
	
	// add one instance variable HERE
	private String nose;
	private String color;
	private String hat;
	private String shoes;
	private String glasses;
  
	/*  the no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
		eyeNumber = 2;
		
    // initialize your instance variable HERE
		nose = "red";
		color = "brown";
		hat = "Top-hat";
		shoes = "White Sneakers"
	        glasses="green goggles";
	}
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  // Add an accessor method AND a mutator method for your instance variable HERE
	/**
		void setNoseColor(String noseColor)
		mutator method for nose
		@param noseColor for what color the user wants for the nose.
	*/
	public void setNoseColor(String noseColor){
		nose = noseColor;
	}
	/**
		String getNoseColor()
		accessor method for getNoseColor
		@return nose a String describing the color of the nose of the potato.
	*/
	public String getNoseColor(){
		return nose;
	}
	/**
		void setColor(String _color)
		mutator method for color
		@param _color for what the user desires.  
	*/	
	public void setColor(String _color){
		color = _color;
	}
	/**
		String getColor()
		accessor method for getColor
		@return color a String describing the color of the potato.
	*/
	public String getColor(){
		return color;
	}
	/**
		void setNumOfEyes(int _numOfEyes)
		mutator method for eyeNumber
		@param _numOfEyes for what the user desires.  
	*/	
	}
	public void setNumOfEyes(int _numOfEyes)
  {
		eyeNumber = _numOfEyes;
	}
		
	/**
		String getNumOfEyes()
		accessor method for eyeNumber
		@return eyeNumber an int describing the number of eyes.
	*/
	public int getNumOfEyes()
  {
		return eyeNumber;
	}

	/**
	* returns string hat 
	*
	* @return String hat
	*
	*
	*/
         public String getHat(){
	    return hat; 
	  }

	/**
	*
	*@param - newHat is a new string that replaces String stored in hat
	*
	*changes hat to a new String "newHat"
	*
	*/
	  public void setHat(String newHat){
	    hat = newHat;
	  }


	/**
	* returns string shoes 
	*
	* @return String shoes
	*
	*
	*/
         public String getShoes(){
	    return shoes; 
	  }

	/**
	*
	*@param - newShoes is a new string that replaces String stored in shoe
	*
	*changes shoes to a new String "newShoes"
	*
	*/
	  public void setHat(String newShoes){
	    shoes = newShoes;
        /**
	*
	*@param-setGlassesColor is a string that will replace the color stored in glassses with the givin parameter.
	*
	*turns glasses into glassesColor 
        **/
          public void setGlassesColor (String glassColor) 
	  {
		  glasses=glassColor;

	  }
          /**
	  *@param-getGlassesColor is a String that finds and returns the color of the glasses based on what was set in the setGlassesColor method.
          public String getGlassesColor() 
	  *
	  *@return glasses color
	  *
	  **/
		  public String getGlassesColor()
	  {
		  return glasses;
		  
	  }
	

	
	public String toString()
	{
		String output = "PotatoHead object. ";
		output += "Number Of Eyes: " + eyeNumber;
		output += "Current shoes: " + shoes;
		output += "Nose Color: " + nose;
		output += ". Color of potato: " + color + ". ";
		output += "Hat the potato is wearing: " + hat + ". ";
    // Add your instance variable to the toString() method using += HERE
		output += "Potato Type: " + potatoType + ". ";
		output +- "Color of Glasses: " + glasses + "";
		
		return output;
	}
}
