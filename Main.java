/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private int eyeNumber;
	
	// add one instance variable HERE
	private String color;
  
	/*  the no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
		eyeNumber = 2;
		
    // initialize your instance variable HERE
		color = "brown";
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
	

	
	public String toString()
	{
		String output = "PotatoHead object. ";
		output += "Number Of Eyes: " + eyeNumber;
		output += ". Color of potato: " + color + ". ";
    // Add your instance variable to the toString() method using += HERE
		output += "Potato Type: " + potatoType + ". ";
		
		return output;
	}
}
