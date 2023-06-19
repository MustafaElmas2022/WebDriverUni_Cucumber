package com.WebUni.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends CommenPage{

    @FindBy(xpath = "(//div[@class='section-title'])[1]")
    public WebElement contact_Us;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@placeholder='Email Address']")
    public WebElement emailAddress;
    @FindBy(xpath = "//textarea[@placeholder='Comments']")
    public WebElement comments;
    @FindBy(xpath = "//input[@value='RESET']")
    public WebElement resetButton;
    @FindBy(xpath = "//input[@value='SUBMIT']")
    public WebElement submitButton;
    @FindBy(xpath = "//div[@id='contact_reply']/h1")
    public WebElement contactUsSubmissionMessage;
}
