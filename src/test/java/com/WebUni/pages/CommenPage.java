package com.WebUni.pages;

import com.WebUni.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class CommenPage {

    public CommenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
