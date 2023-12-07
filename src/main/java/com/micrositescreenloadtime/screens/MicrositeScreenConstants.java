package com.micrositescreenloadtime.screens;

import com.micrositescreenloadtime.testbase.MicrositeScreenBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class MicrositeScreenConstants extends MicrositeScreenBase {
    public MicrositeScreenConstants() throws FileNotFoundException {
        super();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//img[@title='Embibe']")
    public static WebElement AllStudentBanner;
    @FindBy(xpath = "//img[@title='Embibe']")
    public static WebElement AllTeacherBanner;

    @FindBy(xpath = "//body[@class='page-template page-template-template-press_release page-template-template-press_release-php page page-id-40414 langis-en']")
    public static WebElement PressPage;
}
