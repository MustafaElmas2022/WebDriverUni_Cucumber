package com.WebUni.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickButtons extends CommenPage{

    @FindBy(xpath = "//h2[normalize-space()='WebElement Click']")
    public WebElement WebElementClick;

    @FindBy(xpath = "//span[@id='button1']")
    public WebElement ClickMe ;

    @FindBy(xpath = "//h4[text()='Congratulations!']")
    public WebElement Congratulations ;

    @FindBy(xpath = "//div[@id='myModalClick']//button[@type='button'][normalize-space()='Close']")
    public WebElement closeButton ;

    @FindBy(xpath = "//h2[normalize-space()='JavaScript Click']")
    public WebElement javaScriptClick ;

    @FindBy(xpath = "//span[@id='button2']")
    public WebElement clickMeButton2 ;

    @FindBy(xpath = "//h4[contains(text(),'s that Easy!!')]")
    public WebElement popUpMessage ;

    @FindBy(xpath = "//div[@class='modal-dialog modal-md']//button[@type='button'][normalize-space()='Close']")
    public WebElement closeButton2 ;

    @FindBy(xpath = "//h2[normalize-space()='Action Move & Click']")
    public WebElement actionClickText ;

    @FindBy(xpath = "//span[@id='button3']")
    public WebElement clickMeButton3 ;

    @FindBy(xpath = "//h4[contains(text(),'Well done! the')]")
    public WebElement actionPopUpMessage ;

    @FindBy(xpath = "//div[@id='myModalMoveClick']//button[@type='button'][normalize-space()='Close']")
    public WebElement closeButton3 ;

}
