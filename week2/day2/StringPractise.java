package week2.day2;

public class StringPractise {

	public static void main(String[] args) {
		String z = "Basics of Java";
		String zh = new String("Basics of Java");
		//checking string values
		boolean strcomp = z.equals(zh);
		System.out.println(strcomp);// Compares string z and zh where comparision of value. 
		
		//checking values
		System.out.println(z==zh);
		
		//Length of string
		String str = "The beest days of my life : hell yeah";	
		
		//Length of string
		int strlen = str.length();
		System.out.println(strlen);		
		
		//index
		int indexOf = str.indexOf("days");
		System.out.println(indexOf);
		
		//split string
		String[] splitstring = str.split("of");
		System.out.println(splitstring[1]);
		
		//charAt
		char charfound = str.charAt(5);
		System.out.println(charfound);
		
		String str2 = "Billie murphy are good boys,arent they?";
		char[] charrstr = str2.toCharArray();
		for(int i=0;i<charrstr.length;i++)
		{
		  System.out.print(charrstr[i]);
		}
	}
}

//for Xpath index starts with 1
//
//tagname[@attribute='attributevalue'];
//tagname[text()='textvalue'];
//tagname[contains(@attribute,'attributevalue')]

//for similar xpath retrieving many results

// (//tagname[@class='value'])[2]


/*

xPath - xml Path (index starts with 1)
1. Absolute xPath
    - it starts with '/'
    - tagName is mandatory
    - It starts from the root tagName

/html/body/div[2]/div/div/form/p/input
2. Relative xPath
    - it starts with '//'
    - tagName is mandatory
    - directly start from element tagName

//tagName
Ex: //input
Basic xPaths:
1. Attribute based xPath:
//tagName[@attributeName='attributeValue']
using multiple attributes
//tagName[@attributeName='attributeValue'][@attributeName='attributeValue']
//tagName[@attributeName='attributeValue'][text()='textValue']
ex: //input[@id='username']
//input[@id='username'][@name='USERNAME']
2. Text based xPath
//tagName[text()='textValue']
ex: //label[text()='Username']
3. Partial attribute based xPath:
//tagName[contains(@attributeName,'partialAttributeValue')]
ex: //input[contains(@id,'user')]
    //input[contains(@name,'USER')]
4. Partial text based xPath:
//tagName[contains(text(),'textValue')]
ex:
//parent xpath/childtagname

//chilfxpath/parent:: parenttagneame
 */
