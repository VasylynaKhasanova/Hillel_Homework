package com.homework16;

import com.codeborne.selenide.SelenideElement;

public class ProgramingLanguage {
    private SelenideElement programingLanguage;

    public ProgramingLanguage(SelenideElement programingLanguage) {
        this.programingLanguage = programingLanguage.$(".btn-subcategory");
    }

    public String getLanguageName() {
        return programingLanguage.getText();
    }

}
