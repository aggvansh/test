package Locators_Techniques;

public class Locators_Notes {

	/*
	 * 1. What is Interface in Java? An interface is a group of related methods with
	 * empty bodies.
	 * 
	 * Its class responsibility to implement the methods declared in the Interface
	 * When class agreed to implement the interface, they must need to provide
	 * implementation/bodies to all the defined methods in Interface
	 * 
	 * In simple terms, Interface enforces the Contract to class to follow.
	 * 
	 * 2. WebDriver is an Interface which provides Set of Browser Automation methods
	 * with empty bodies (Abstract methods)
	 * 
	 * Classes like ChromeDriver, FirefoxDriver, MicrosoftEdgeDriver , SafariDriver
	 * etc implement the WebDriver Interface and provide their own implementation to
	 * the WebDriver methods
	 * 
	 * 3. We need to create the object of the class to access the methods present in
	 * the class.
	 * 
	 * ChromeDriver driver = new ChromeDriver (); driver object here has access to
	 * all the methods of Chrome driver
	 * 
	 * WebDriver driver = new ChromeDriver (); driver object here has access to the
	 * methods of Chrome driver which are defined in web Driver Interface
	 * 
	 * Selenium Web Driver Locators
	 * 
	 * • As part of Automation, Selenium Performs actions (such as click, typing) on
	 * the Page HTML Elements.
	 * 
	 * • The Locators are the way to identify an HTML element on a web page.
	 * Selenium WebDriver uses any of the below locators to identify the element on
	 * the page and performs the Action
	 * 
	 * ID Xpath CSS Selector name Class Name Tag Name Link Text Partial Link Text
	 * 
	 * <input type="text" placeholder="Username" id= “inputUsername” value=" "> //
	 * HTML CODE
	 * 
	 * Input -> tag name Red-> attribute Green-> attribute associated value.
	 * 
	 * 
	 * Css Selector-
	 * 
	 * <button class="submit signInBtn" type="submit" fdprocessedid="ccirl5">Sign
	 * In</button> // HTML CODE
	 * 
	 * <p class="error">* Incorrect username or password </p> // HTML CODE
	 * 
	 * • Class name -> tagname.classname -> Button.signInBtn -> p.error
	 * 
	 * • Id -> tagname#id -> input#inputUsername
	 * 
	 * • Tagname[attribute=’value’] // tagname is optional
	 * 
	 * <input type="text" placeholder="Username” value=" ">
	 * 
	 * Input [placeholder=’ Username’]
	 * 
	 * • Tagname[attribute=’value’]:nth-child(index). - Child items
	 * 
	 * • Parenttagname childtagname--->form p
	 * 
	 * • input[type*='pass'] – CSS • tagname
	 * 
	 * 
	 * 
	 * 
	 * Xpath –
	 * 
	 * • //Tagname[@attribute=’value’] //input[@placeholder=’ Username’’]
	 * 
	 * <input type="text" placeholder="Name"> // html code
	 * 
	 * //input[@placeholder=’ Name’]
	 * 
	 * • //Tagname[@attribute=’value’][index]
	 * 
	 * <div class="form-container sign-up-container"> //html code <form action="#">
	 * <h2>Forgot password</h2> <input type="text" placeholder="Name"
	 * fdprocessedid="44h11p"> <input type="text" placeholder="Email"
	 * fdprocessedid="rviwi"> <input type="text" placeholder="Phone Number"
	 * fdprocessedid="d8kum"> <br>
	 * 
	 * • //parentTagname/childTagname---->//form/input[3] to select phone no field
	 * 
	 * • //button[contains(@class,'submit')]. – Regular expression • //tagname •
	 * //header/div/button[1]/following-sibling::button[1] •
	 * //header/div/button[1]/parent::div
	 * 
	 * 
	 */

	// How to check the element is unique or not in console window

	// how to check element is unique or not

	// for CSS Selector: $ css selector
	// -->$('p.error')--->$('Tagname[attribute=’value’]')
	// for X path:$x xpath--->//$x('Tagname[@attribute=’value’]')

}
