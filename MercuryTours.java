import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours 
{

	public static void main(String[] args) throws InterruptedException 
	{
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kprabhul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		
		wd.get(httpdemo.guru99.comtestnewtoursindex.php);
		wd.manage().window().maximize();
		
		//REGISTER
		wd.findElement(By.linkText(REGISTER)).click();
		wd.findElement(By.name(firstName)).sendKeys(Ketan);
		wd.findElement(By.name(lastName)).sendKeys(Prabhulkar);
		wd.findElement(By.name(phone)).sendKeys(8655046766);
		wd.findElement(By.id(userName)).sendKeys(abc123);
		wd.findElement(By.name(address1)).sendKeys(Motha Mhasoba Maidan);
		wd.findElement(By.name(city)).sendKeys(Kalyan);
		wd.findElement(By.name(state)).sendKeys(Maharashtra);
		wd.findElement(By.name(postalCode)).sendKeys(421301);
		Select s8=new Select(wd.findElement(By.name(country)));
		s8.selectByVisibleText(ANTARCTICA);
		wd.findElement(By.name(email)).sendKeys(Ketan);
		wd.findElement(By.name(password)).sendKeys(12345);
		wd.findElement(By.name(confirmPassword)).sendKeys(12345);
		wd.findElement(By.name(submit)).click();
		wd.findElement(By.linkText(SIGN-OFF)).click();
		System.out.println("Registration was successful");
		Thread.sleep(2000);
		
		//LOGIN
		wd.findElement(By.name(userName)).sendKeys("Ketan");
		wd.findElement(By.name(password)).sendKeys("12345");
		wd.findElement(By.name(submit)).click();
		System.out.println("Login Successful");
		wd.navigate().back();
		
		

		wd.findElement(By.linkText(SUPPORT)).click();
		System.out.println("SUPPORT page is under construction");
		Thread.sleep(2000);
		
		wd.findElement(By.linkText(CONTACT)).click();
		System.out.println("CONTACT page is under construction");
		Thread.sleep(2000);
		
		wd.findElement(By.linkText(Home)).click();
		System.out.println("HOME page is displayed");
		Thread.sleep(2000);
		
		wd.findElement(By.linkText(Flights)).click();
		System.out.println("Flights page is successfully displayed");
		wd.findElement(By.xpath(tbodytr[2]td[2]b[1]font[1]input[2])).click();
		Select s0=new Select(wd.findElement(By.name(passCount)));
		s0.selectByValue(3);
		Select s1=new Select(wd.findElement(By.name(fromPort)));
		s1.selectByVisibleText(Acapulco);
		Select s2=new Select(wd.findElement(By.name(fromMonth)));
		s2.selectByValue(4);
		Select s3=new Select(wd.findElement(By.name(fromDay)));
		s3.selectByValue(3);
		Select s4=new Select(wd.findElement(By.name(toPort)));
		s4.selectByVisibleText(London);
		Select s5=new Select(wd.findElement(By.name(toMonth)));
		s5.selectByValue(2);
		Select s6=new Select(wd.findElement(By.name(toDay)));
		s6.selectByVisibleText(15);
		wd.findElement(By.xpath(tbodytr[9]td[2]font[1]font[1]input[1])).click();
		Select s7=new Select(wd.findElement(By.name(airline)));
		s7.selectByVisibleText(Unified Airlines);
		wd.findElement(By.name(findFlights)).click();
		System.out.println(FIND FLIGHTSNo seats available);
		
		wd.findElement(By.linkText(Hotels)).click();
		System.out.println(HOTELS page is under construction);
		
		wd.findElement(By.linkText(Car Rentals)).click();
		System.out.println(CAR RENTALS page is under construction);
		
		wd.findElement(By.linkText(Cruises)).click();
		System.out.println(CRUISES page is not available);
		
		wd.findElement( By.linkText(Destinations)).click();
		System.out.println(DESTINATIONS page is under construction);
		
		wd.findElement(By.linkText(Vacations)).click();
		System.out.println(VACATIONS page is under constrution);
		Thread.sleep(2000);
		wd.navigate().back();

		wd.findElement(By.xpath(a[contains(text(),'Travel @ About.com')])).click();
		System.out.println(BUSINESS TRAVEL page is not available);
		wd.navigate().back();
		
		wd.findElement(By.linkText(Salon Travel)).click();
		System.out.println(SALON TRAVEL page opens successfully);
		wd.navigate().back();

		SELENIUM 
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click(); 
		wd.findElement(By.linkText(Flash Movie Demo)).click();
		wd.findElement(By.xpath(bodyform[1]center[1]input[1])).click();
		wd.findElement(By.xpath(bodyform[1]center[1]input[2])).click();
		wd.findElement(By.xpath(bodyform[1]center[1]input[3])).click();
		wd.findElement(By.xpath(bodyform[1]center[1]input[4])).click();
		wd.navigate().back();
		Thread.sleep(1000);
		
		RADIO AND CHECKbOX DEMO
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click(); 
		wd.findElement(By.linkText(Radio & Checkbox Demo)).click();
		wd.findElement(By.xpath(input[@id='vfb-7-1'])).click();
		wd.findElement(By.xpath(input[@id='vfb-6-1'])).click();
		Thread.sleep(1000);
		wd.navigate().back();
		
		TAbLE DEMO
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click(); 
		wd.findElement(By.linkText(Table Demo)).click();
		wd.navigate().back();
		
		ACCESSING LINK
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click(); 
		wd.findElement(By.linkText(Accessing Link)).click();
		wd.findElement(By.linkText(click here)).click();
		wd.navigate().back();
		Thread.sleep(1000);
		wd.findElement(By.linkText(click here)).click();
		wd.navigate().back();
		wd.navigate().back();
		Thread.sleep(1000);
		
		AJAX DEMO
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click(); 
		wd.findElement(By.linkText(Ajax Demo)).click();
		wd.findElement(By.xpath(input[@id='yes'])).click();
		wd.findElement(By.xpath(input[@id='buttoncheck'])).click();
		wd.navigate().back();
		
		INSIDE AND OUTSIDE bLOCK LEVEL TAG
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click(); 
		wd.findElement(By.linkText(Inside & Outside Block Level Tag)).click();
		wd.findElement(By.xpath(a[contains(text(),'Inside a block-level tag.')])).click();
		wd.navigate().back();
		Thread.sleep(1000);
		wd.findElement(By.xpath(html[1]body[1]a[1]div[1]span[1])).click();
		wd.navigate().back();
		wd.navigate().back();
		
		DELETE CUSTOMER FROM
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Delete Customer Form)).click();
		wd.findElement(By.xpath(tbodytr[2]td[2]input[1])).sendKeys(1234);
		wd.findElement(By.xpath(tbodytr[3]td[2]input[1])).click();
		Alert a=wd.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(a.getText());
		a.accept();
		Alert a1=wd.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(a1.getText());
		a1.accept();
		wd.navigate().back();
		wd.navigate().back();
		
		YAHOO
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Yahoo)).click();
		wd.findElement(By.xpath(a[@id='pager2'])).click();
		wd.navigate().back();
		
		TOOLTIP
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		Thread.sleep(1000);
		wd.findElement(By.linkText(Tooltip)).click();
		Actions a11=new Actions(wd);
		a11.moveToElement(wd.findElement(By.xpath(a[@id='download_now']))).perform();
		wd.navigate().back();
		
		FILE UPLOAD
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(File Upload)).click();
		wd.findElement(By.xpath(input[@id='uploadfile_0'])).sendKeys(CUsersAkshayDesktop);
		Thread.sleep(2000);
		wd.findElement(By.xpath(input[@id='terms'])).click();
		wd.findElement(By.xpath(button[@id='submitbutton'])).click();
		wd.navigate().back();
		
		LOGIN
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Login)).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath(input[@id='email'])).sendKeys(Ketan@gmail.com);
		wd.findElement(By.xpath(input[@id='passwd'])).sendKeys(12345);
		wd.findElement(By.xpath(bodydiv[@id='page']div[1]div[1]div[2]div[1]div[1]div[1]form[1]div[1]p[2]button[1]span[1])).click();
		wd.navigate().back();
		wd.navigate().back();
		
		SOCIAL ICON
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Social Icon)).click();
		wd.navigate().back();
	
		SELENIUM AUTO IT
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Selenium Auto IT)).click();
		wd.findElement(By.xpath(html[1]body[1]div[3]section[2]div[1]div[1]div[2]div[1]nav[1]ul[1]li[2]a[1]span[1]span[1])).click();
		wd.navigate().back();
		wd.navigate().back();
		
		SELENIUM IDE TEST
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Selenium IDE Test)).click();
		wd.findElement(By.xpath(input[@id='email'])).sendKeys(Ketan@gmail.com);
		wd.findElement(By.xpath(input[@id='pass'])).sendKeys(12345);
		wd.findElement(By.xpath(input[@id='u_0_b'])).click();
		wd.navigate().back();
		wd.navigate().back();
		
		GURU99 DEMO PAGE
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Guru99 Demo Page)).click();
		wd.navigate().back();
		
		SCROLLbAR DEMO
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Scrollbar Demo)).click();
		WebElement Element= wd.findElement(By.linkText(VBScript));
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript(arguments[0].scrollIntoView();, Element);
		wd.navigate().back();
	
		FILE UPLOAD USING SIKULI DEMO
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(File Upload using Sikuli Demo)).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath(input[@id='photoimg'])).sendKeys(GKetanImportant Documents);
		System.out.println(File upload successful);
		wd.navigate().back();
	
		COOKIE HANDLING DEMO
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Cookie Handling Demo)).click();
		wd.findElement(By.xpath(bodydiv[2]form[1]input[1])).sendKeys(Ketan@gmail.com);
		wd.findElement(By.xpath(bodydiv[2]form[1]input[2])).sendKeys(12345);
		wd.findElement(By.xpath(button[contains(text(),'Login')])).click();
		Thread.sleep(1000);
		System.out.println(Cookie Data);
		Cookie NameSelenium
		Cookie Valueabc123
		wd.navigate().back();
		wd.navigate().back();
		
		DRAG AND DROP
		DEbIT SIDE
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Drag and Drop Action)).click();
		WebElement drag=wd.findElement(By.xpath(a[contains(text(),'BANK')]));
		WebElement drop=wd.findElement(By.xpath(body[1]section[1]div[1]div[1]main[1]div[1]div[1]div[1]div[1]div[1]div[1]table[1]tbody[1]tr[1]td[1]table[1]tbody[1]tr[1]td[1]div[1]div[1]ol[1]li[1]));
		Actions D=new Actions(wd);
		D.dragAndDrop(drag, drop).build().perform();
		
		WebElement drag1=wd.findElement(By.xpath(bodysection[@id='g-container-main']div[1]div[1]main[1]div[1]div[1]div[1]div[1]div[1]div[1]div[1]div[1]ul[1]li[2]a[1]));
		WebElement drop1=wd.findElement(By.xpath(body[1]section[1]div[1]div[1]main[1]div[1]div[1]div[1]div[1]div[1]div[1]table[1]tbody[1]tr[1]td[1]table[1]tbody[1]tr[1]td[2]div[1]div[1]ol[1]li[1]));
		Actions d=new Actions(wd);
		d.dragAndDrop(drag1, drop1).build().perform();
		
		CREDIT SIDE
		WebElement drag2=wd.findElement(By.xpath(a[contains(text(),'SALES')]));
		WebElement drop2=wd.findElement(By.xpath(body[1]section[1]div[1]div[1]main[1]div[1]div[1]div[1]div[1]div[1]div[1]table[1]tbody[1]tr[1]td[2]table[1]tbody[1]tr[1]td[1]div[1]div[1]ol[1]li[1]));
		Actions d1=new Actions(wd);
		d1.dragAndDrop(drag2, drop2).build().perform();
		
		WebElement drag3=wd.findElement(By.xpath(bodysection[@id='g-container-main']div[1]div[1]main[1]div[1]div[1]div[1]div[1]div[1]div[1]div[1]div[1]ul[1]li[4]a[1]));
		WebElement drop3=wd.findElement(By.xpath(body[1]section[1]div[1]div[1]main[1]div[1]div[1]div[1]div[1]div[1]div[1]table[1]tbody[1]tr[1]td[2]table[1]tbody[1]tr[1]td[2]div[1]div[1]ol[1]li[1]));
		Actions d2=new Actions(wd);
		d2.dragAndDrop(drag3, drop3).build().perform();
		
		wd.findElement(By.xpath(a[contains(text(),'Perfect!')])).click();
		wd.navigate().back();
		
		SELENIUM DATEPICKER DEMO
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Selenium DatePicker Demo)).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath(bodyform[1]input[1])).sendKeys(21-09-2023);
		wd.findElement(By.xpath(bodyform[1]input[1])).sendKeys(0220 PM);
		wd.findElement(By.xpath(bodyform[1]input[2])).click();
		wd.navigate().back();
		
		
		INSURANCE PROJECT
		wd.findElement(By.linkText(Insurance Project)).click();
		wd.findElement(By.linkText(Register)).click();
		Select s9=new Select(wd.findElement(By.xpath(html[1]body[1]div[3]form[1]div[2]select[1])));
		s9.selectByVisibleText(Ms);
		wd.findElement(By.name(firstname)).sendKeys(Ketan);
		wd.findElement(By.name(lastname)).sendKeys(Prabhulkar);
		wd.findElement(By.name(phone)).sendKeys(8655046766);
		Select s10=new Select(wd.findElement(By.name(year)));
		s10.selectByVisibleText(1995);
		Select s11=new Select(wd.findElement(By.name(month)));
		s11.selectByVisibleText(September);
		Select s12=new Select(wd.findElement(By.name(date)));
		s12.selectByVisibleText(21);
		wd.findElement(By.xpath(html[1]body[1]div[3]form[1]div[2]div[4]input[2])).click();
		Select s13=new Select(wd.findElement(By.name(licenceperiod)));
		s13.selectByVisibleText(12);
		Select s14=new Select(wd.findElement(By.name(occupation)));
		s14.selectByVisibleText(Doctor);
		wd.findElement(By.name(street)).sendKeys(Kalyan);
		wd.findElement(By.name(city)).sendKeys(Kalyan);
		wd.findElement(By.name(county)).sendKeys(India);
		wd.findElement(By.name(post_code)).sendKeys(421301);
		wd.findElement(By.name(email)).sendKeys(Ketan@gmail.com);
		wd.findElement(By.name(password)).sendKeys(12345);
		wd.findElement(By.name(c_password)).sendKeys(12345);
		wd.findElement(By.name(submit)).click();
		wd.navigate().back();
		wd.navigate().back();
		wd.findElement(By.name(email)).sendKeys(Ketan@gmail.com);
		wd.findElement(By.name(password)).sendKeys(12345);
		wd.findElement(By.name(submit)).click();
		wd.findElement(By.linkText(Home)).click();
		System.out.println(Broker Insurance WebPage is displayed);
		wd.findElement(By.linkText(Request Quotation)).click();
		System.out.println(Request a quotation page is displayed);
		Select s16=new Select(wd.findElement(By.xpath(select[@id='quotation_breakdowncover'])));
		s16.selectByVisibleText(At home);
		wd.findElement(By.xpath(input[@id='quotation_windscreenrepair_t'])).click();
		wd.findElement(By.name(incidents)).sendKeys(Accident);
		wd.findElement(By.xpath(input[@id='quotation_vehicle_attributes_registration'])).sendKeys(514HJK);
		wd.findElement(By.name(mileage)).sendKeys(13500);
		wd.findElement(By.name(value)).sendKeys(57000);
		Select s17=new Select(wd.findElement(By.name(parkinglocation)));
		s17.selectByVisibleText(Locked Garage);
		Select s20=new Select(wd.findElement(By.name(date)));
		s20.selectByVisibleText(19);
		Select s18=new Select(wd.findElement(By.name(year)));
		s18.selectByVisibleText(2019);
		Select s19=new Select(wd.findElement(By.name(month)));
		s19.selectByVisibleText(June);
		Thread.sleep(2000);
		wd.findElement(By.xpath(bodydiv[3]div[1]div[2]form[1]div[8]input[1])).click();
		wd.findElement(By.name(submit)).click();
		wd.navigate().back();
		Thread.sleep(2000);
		wd.findElement(By.linkText(Retrieve Quotation)).click();
		Thread.sleep(2000);
		wd.findElement(By.linkText(Profile)).click();
		wd.findElement(By.linkText(Edit Profile)).click();
		Select s21=new Select(wd.findElement(By.name(user[title])));
		s21.selectByVisibleText(Mr);
		wd.findElement(By.name(user[surname])).sendKeys(Prabhulkar);
		wd.findElement(By.name(user[firstname])).sendKeys(Ketan);
		wd.findElement(By.name(user[phone])).sendKeys(7977473504);
		Select s22=new Select(wd.findElement(By.name(user[dateofbirth(1i)])));
		s22.selectByVisibleText(1995);
		Select s23=new Select(wd.findElement(By.name(user[dateofbirth(2i)])));
		s23.selectByVisibleText(April);
		Select s24=new Select(wd.findElement(By.name(user[dateofbirth(3i)])));
		s24.selectByVisibleText(9);
		wd.findElement(By.name(user[licencetype])).click();
		Select s25=new Select(wd.findElement(By.name(user[licenceperiod])));
		s25.selectByVisibleText(8);
		Select s27=new Select(wd.findElement(By.name(user[occupation_id])));
		s27.selectByVisibleText(Doctor);
		wd.findElement(By.name(user[address_attributes][street])).sendKeys(Kalyan);
		wd.findElement(By.name(user[address_attributes][city])).sendKeys(Kalyan);
		wd.findElement(By.name(user[address_attributes][county])).sendKeys(India);
		wd.findElement(By.name(user[address_attributes][postcode])).sendKeys(421301);
		wd.findElement(By.name(commit)).click();
		wd.findElement(By.xpath(html[1]body[1]div[3]form[1]input[1])).click();
		
		AGILE PROJECT
		wd.findElement(By.linkText(Agile Project)).click();
		wd.findElement(By.name(uid)).sendKeys(1303);
		wd.findElement(By.name(password)).sendKeys(Guru99);
		wd.findElement(By.name(btnLogin)).click();
		System.out.println(Agile Project page is displayed );
		wd.findElement(By.linkText(Customer)).click();
		System.out.println(Customer page is displayed);
		wd.findElement(By.linkText(Mini Statement)).click();
		System.out.println(Mini statement form is displayed);
		Select s15=new Select(wd.findElement(By.name(accountno)));
		s15.selectByVisibleText(3309);
		wd.findElement(By.name(AccSubmit)).click();
		System.out.println(Last Three Transaction Details for Account No 3309);
		wd.navigate().back();
		wd.findElement(By.linkText(Log out)).click();
		Alert a111=wd.switchTo().alert();
		System.out.println(a111.getText());
		Thread.sleep(1000);
		a111.accept();
		wd.navigate().back();
		wd.navigate().back();
		
		BANK PROJECT
		wd.findElement(By.linkText(Bank Project)).click();
		wd.findElement(By.linkText(here)).click();
		wd.findElement(By.xpath(tbodytr[5]td[2]input[1])).sendKeys(Ketan@gmail.com);
		wd.findElement(By.name(btnLogin)).click();
		System.out.println(Access details to demo site page is displayed);
		wd.navigate().back();
		wd.navigate().back();
		wd.findElement(By.name(uid)).sendKeys(mngr322984);
		wd.findElement(By.name(password)).sendKeys(YmymUgy);
		wd.findElement(By.name(btnLogin)).click();
		System.out.println(GTPL bank page is displayed);
		wd.findElement(By.xpath(a[contains(text(),'Manager')])).click();
		System.out.println(Welcome To Manager's Page of GTPL Bank);
		wd.findElement(By.linkText(New Customer)).click();
		wd.findElement(By.name(name)).sendKeys(Ketan);
		wd.findElement(By.xpath(tbodytr[5]td[2]input[2])).click();
		wd.findElement(By.name(dob)).sendKeys(21-09-2023);
		wd.findElement(By.name(addr)).sendKeys(Kalyan);
		wd.findElement(By.name(city)).sendKeys(Kalyan);
		wd.findElement(By.name(state)).sendKeys(Maharashtra);
		wd.findElement(By.name(pinno)).sendKeys(421301);
		wd.findElement(By.name(telephoneno)).sendKeys(9819798427);
		wd.findElement(By.name(emailid)).sendKeys(Ketan@gmail.com);
		wd.findElement(By.name(sub)).click();
		Thread.sleep(2000);
		wd.navigate().back();
		wd.findElement(By.linkText(Edit Customer)).click();
		wd.findElement(By.xpath(tbodytr[6]td[2]input[1])).sendKeys(335931);
		wd.findElement(By.xpath(tbodytr[11]td[2]input[1])).click();
		wd.findElement(By.linkText(Delete Customer)).click();
		wd.findElement(By.xpath(tbodytr[2]td[2]input[1])).sendKeys(335931);
		wd.findElement(By.xpath(tbodytr[7]td[2]input[1])).click();
		wd.findElement(By.linkText(New Account)).click();
		wd.findElement(By.xpath(tbodytr[2]td[2]input[1])).sendKeys(335931);
		Select s35=new Select(wd.findElement(By.xpath(tbodytr[2]td[2]input[1])));
		s35.selectByVisibleText(savings);
		wd.findElement(By.xpath(tbodytr[4]td[2]input[1])).sendKeys(20000);
		wd.findElement(By.xpath(tbodytr[5]td[2]input[1])).click();
		wd.findElement(By.linkText(Edit Account)).click();
		wd.findElement(By.xpath(tbodytr[6]td[2]input[1])).sendKeys(2549);
		wd.findElement(By.xpath(tbodytr[11]td[2]input[1])).click();
		wd.findElement(By.linkText(Delete Account)).click();
		wd.findElement(By.xpath(tbodytr[6]td[2]input[1])).sendKeys(2549);
		wd.findElement(By.xpath(tbodytr[11]td[2]input[1])).click();
		wd.findElement(By.linkText(Mini Statement)).click();
		wd.findElement(By.xpath(tbodytr[6]td[2]input[1])).sendKeys(2541);
		wd.findElement(By.xpath(tbodytr[11]td[2]input[1])).click();
		wd.findElement(By.linkText(Customised Statement)).click();
		wd.findElement(By.xpath(a[contains(text(),'Log out')])).click();
		wd.navigate().back();
		wd.navigate().back();
		wd.navigate().back();
		Alert m=wd.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(m.getText());
		Thread.sleep(2000);
		
		SECURITY PROJECT
		wd.findElement(By.linkText(Security Project)).click();
		wd.findElement(By.name(uid)).sendKeys(1303);
		wd.findElement(By.name(password)).sendKeys(Guru99);
		wd.findElement(By.name(btnLogin)).click();
		wd.findElement(By.linkText(Customer)).click();
		System.out.println(Welcome To Customer's Page of Guru99 Bank);
		wd.findElement(By.linkText(Balance Enquiry)).click();
		Select s28=new Select(wd.findElement(By.xpath(tbodytr[6]td[2]select[1])));
		s28.selectByVisibleText(3309);
		System.out.println(Balance Details for Account 3309);
		Thread.sleep(1000);
		wd.findElement(By.linkText(Mini Statement)).click();
		Select s29=new Select(wd.findElement(By.name(accountno)));
		s29.selectByVisibleText(3309);
		wd.findElement(By.linkText(Contact Us)).click();
		wd.findElement(By.name(name)).sendKeys(Ketan);
		wd.findElement(By.name(emailid)).sendKeys(Ketan@gmail.com);
		wd.findElement(By.name(telephoneno)).sendKeys(9819798427);
		wd.findElement(By.name(addr)).sendKeys(Kalyan);
		wd.findElement(By.name(fileToUpload)).click();
		wd.findElement(By.name(sub)).click();
		wd.findElement(By.linkText(Log out)).click();
		Alert A=wd.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(a111.getText());
		a111.accept();
		
		TELECOM PROJECT
		wd.findElement(By.linkText(Telecom Project)).click();
		wd.findElement(By.linkText(Add Customer)).click();
		wd.findElement(By.xpath(label[contains(text(),'Done')])).click();
		wd.findElement(By.name(fname)).sendKeys(Ketan);
		wd.findElement(By.name(lname)).sendKeys(Prabhulkar);
		wd.findElement(By.name(emailid)).sendKeys(Ketan@gmail.com);
		wd.findElement(By.name(addr)).sendKeys(Kalyan);
		wd.findElement(By.name(telephoneno)).sendKeys(8655046766);
		wd.findElement(By.name(submit)).click();
		System.out.println(Access Details to Guru99 Telecom);
		wd.findElement(By.xpath(bodysection[@id='main']div[1]div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Add Tariff Plan)).click();
		wd.findElement(By.name(rental)).sendKeys(20000);
		wd.findElement(By.name(local_minutes)).sendKeys(30);
		wd.findElement(By.name(inter_minutes)).sendKeys(20);
		wd.findElement(By.name(sms_pack)).sendKeys(30);
		wd.findElement(By.name(minutes_charges)).sendKeys(100);
		wd.findElement(By.name(inter_charges)).sendKeys(200);
		wd.findElement(By.name(sms_charges)).sendKeys(20);
		wd.findElement(By.name(submit)).click();
		System.out.println(Congratulation you add Tariff Plan);
		Thread.sleep(1000);
		wd.findElement(By.xpath(htmlbodysectiondivullia)).click();
		wd.findElement(By.linkText(Add Tariff Plan to Customer)).click();
		wd.findElement(By.name(customer_id)).sendKeys(335931);
		wd.findElement(By.name(submit)).click();
		System.out.println(Welcome to add customer tariff plan Ketan);
		Thread.sleep(1000);
		wd.findElement(By.xpath(tbodytr[1]td[1]label[1])).click();
		wd.findElement(By.name(submit)).click();
		System.out.println(Congratulation Tariff Plan assigned);
		wd.findElement(By.xpath(bodysection[@id='main']div[1]ul[1]li[1]a[1])).click();
		wd.findElement(By.linkText(Pay Billing)).click();
		wd.findElement(By.name(customer_id)).sendKeys(335931);
		wd.findElement(By.name(submit)).click();
		System.out.println(Pay billing page is displayed);
		wd.findElement(By.xpath(bodyspan[@id='header']nav[1]a[1])).click();
		wd.findElement(By.xpath(bodynav[@id='menu']ul[1]li[1]a[1])).click();
		
		PAYMENT GATEWAY PROJECT
		wd.findElement(By.linkText(Payment Gateway Project)).click();
		wd.findElement(By.linkText(Generate Card Number)).click();
		System.out.println(Here is your new card);
		Set String win=wd.getWindowHandles();  
		Iterator String it=win.iterator();   
		String pw=it.next();          
		String cw=it.next();          
		wd.switchTo().window(cw);
		Thread.sleep(3000);
		wd.switchTo().window(pw);
		Thread.sleep(1000);
		Select s30=new Select(wd.findElement(By.name(quantity)));
		s30.selectByVisibleText(2);
		wd.findElement(By.xpath(bodysection[@id='three']div[1]form[1]div[1]div[8]ul[1]li[1]input[1])).click();
		wd.findElement(By.name(card_nmuber)).sendKeys(4403449074556923);
		Select s31=new Select(wd.findElement(By.name(month)));
		s31.selectByVisibleText(03);
		Select s32=new Select(wd.findElement(By.name(year)));
		s32.selectByVisibleText(2023);
		wd.findElement(By.name(cvv_code)).sendKeys(208);
		wd.findElement(By.name(submit)).click();
		System.out.println(Payment Successful);
		Order ID-085224
		wd.findElement(By.xpath(a[contains(text(),'Home')])).click();
		wd.findElement(By.linkText(Check Credit Card Limit)).click();
		wd.findElement(By.name(card_nmuber)).sendKeys(4403449074556923);
		wd.findElement(By.name(submit)).click();
		System.out.println(Credit card balance is displayed);
		
		SEO
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[11]a[1])).click();
		wd.findElement(By.linkText(Page-1)).click();
		wd.navigate().back();
		
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[11]a[1])).click();
		wd.findElement(By.xpath(a[contains(text(),'Page-2')])).click();
		wd.navigate().back();
		
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[11]a[1])).click();
		wd.findElement(By.xpath(a[contains(text(),'Page-3')])).click();
		wd.navigate().back();
		
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[11]a[1])).click();
		wd.findElement(By.linkText(Page-4)).click();
		wd.navigate().back();
		
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[11]a[1])).click();
		wd.findElement(By.linkText(Page-5)).click();
		wd.navigate().back();
		
		wd.findElement(By.xpath(bodydiv[1]div[2]nav[1]div[1]div[1]ul[1]li[11]a[1])).click();
		wd.findElement(By.linkText(Page-6)).click();
		wd.navigate().back();		
		
	}

}