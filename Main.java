/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private int eyeNumber;
	
	// add one instance variable HERE
	private String color;
	private String hat;
	private double feetLength;
  
	/*  the no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
		eyeNumber = 2;
		feetLength = 10.5;
		
    // initialize your instance variable HERE
		color = "brown";
		hat = "Top-hat";
	}
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  // Add an accessor method AND a mutator method for your instance variable HERE
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
         sets the Feet Size on the Potatohead
         @param double feetLength - value for the feetlength in millimeters
        */
          public void setFeetLength(double _feetLength){
		feetLength = _feetLength;
	  }
	/**
          returns the Feet Size on the Potatohead
          @return FeetLength - Returns the full length of the Potatohead's FeetLength
        */
	   public double getFeetLength(){
		return feetLength;
           }
}


	

	
	public String toString()
	{
		String output = "PotatoHead object. ";
		output += "Number Of Eyes: " + eyeNumber;
		output += ". Color of potato: " + color + ". ";
		output += "Hat the potato is wearing: " + hat + ". ";
    // Add your instance variable to the toString() method using += HERE
		output += "Potato Type: " + potatoType + ". ";
		output += "Potato Feet Length: " + feetLength + "mm.";
		
		return output;
	}
}
