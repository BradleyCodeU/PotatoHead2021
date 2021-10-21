/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private int eyeNumber;

	
	// add one instance variable HERE
	private String PotatoType;
	
  
	/*  the no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
		eyeNumber = 2;
    // initialize your instance variable HERE
		PotatoType = "White Potatoes";
		
	}
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  // Add an accessor method AND a mutator method for your instance variable HERE
	/**
	String getPotatoType()
	accessor method for potatoType
	@return String of the type of potato
	*/
	public String getPotatoType(){
		return potatoType;
	}
	/**
	void setPotatoType(_potatoType)
	mutator method for potatoType
	@param _potatoType for the type of potato 
	*/
	public void setPotatoType(_potatoType){
		potatoType = _potatoType
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
		output += "Number Of Eyes: " + eyeNumber + ". ";
    // Add your instance variable to the toString() method using += HERE
		output += "Potato Type: " + potatoType + ". ";
		
		return output;
	}
}
